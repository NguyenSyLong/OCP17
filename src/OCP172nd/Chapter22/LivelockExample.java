package OCP172nd.Chapter22;

 class Customer {
    private boolean paymentMade = false;

    public void makePaymentTo(Seller seller) {
        while (!seller.hasShipped()) {
            System.out.println("Customer: waiting for shipment from seller");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Customer: payment made");
        this.paymentMade = true;
    }

    public boolean hasPaid() {
        return this.paymentMade;
    }
}

 class Seller {
    private boolean itemShipped = false;

    public void shipTo(Customer customer) {
        while (!customer.hasPaid()) {
            System.out.println("Seller: waiting for payment from customer");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Seller: item shipped");
        this.itemShipped = true;
    }

    public boolean hasShipped() {
        return this.itemShipped;
    }
}

public class LivelockExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Seller seller = new Seller();

        new Thread(() -> customer.makePaymentTo(seller)).start();
        new Thread(() -> seller.shipTo(customer)).start();
    }
}

package OCP17.chapter4;

public class ArrayEx {
    public static void main(String[] args) {
//        int[] numbers = new int[3];
//        int[] moreNumbers = new int [] {1,2,3,123};
//        int[] moreArray = {42, 55, 99};
//
//        int aa[]  = {1,2,3};
//
//        int a[], abc;
        int i =3;
        var bugs = new int[i=4];
        int[] alias = bugs.clone();
        System.out.println(bugs.equals(alias));
//        Object[] a =bugs;
//        String[] c = (String[]) a;


//        for (int i =0; i<bugs.length; i++) {
//            System.out.println(bugs[i]);
//        }

    }
}

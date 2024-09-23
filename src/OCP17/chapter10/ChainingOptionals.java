package OCP17.chapter10;

import java.util.Optional;

public class ChainingOptionals {
    public static Optional<Integer> calculator(Integer number) {
        // Đây là nơi thực hiện logic tính toán và trả về một Optional<Integer>
        // Ví dụ: tính bình phương của số và trả về Optional
        if (number != null) {
            return Optional.of(number * number);
        } else {
            return Optional.empty();
        }
    }
}

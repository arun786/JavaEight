package Interview;

import javax.validation.constraints.NotNull;

public class NotNullCheck {

    public static String check(@NotNull Employee employee) {
        return employee.getId();
    }

    public static void main(String[] args) {
        check(null);
    }
}

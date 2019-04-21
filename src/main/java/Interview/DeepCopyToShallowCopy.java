package Interview;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DeepCopyToShallowCopy {
    public static void main(String[] args) {

        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("1", new Employee("1", "Arun"));
        employeeMap.put("2", new Employee("2", "Pushpa"));
        employeeMap.put("3", new Employee("3", "Adwiti"));
        employeeMap.put("4", new Employee("4", "Arav"));

        System.out.println(employeeMap);

        Map<String, Employee> shallowCopyMap = employeeMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(shallowCopyMap);

        employeeMap.put("5", new Employee("5", "Sachin"));
        System.out.println(shallowCopyMap);
        System.out.println(employeeMap);

        if (employeeMap.get("1").equals(shallowCopyMap.get("1"))) {
            System.out.println("Equal");
        } else {
            System.out.println("NotEqual");
        }
    }
}


@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee implements Serializable {
    private String id;
    private String name;
}
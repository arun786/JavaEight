package Interview;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang.SerializationUtils;

import java.lang.reflect.Type;
import java.util.HashMap;

public class CloningAHashMap {

    public static void main(String[] args) {
        //Shallow Copy

        HashMap<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("1", new Employee("1", "Arun"));
        employeeMap.put("2", new Employee("2", "Pushpa"));
        employeeMap.put("3", new Employee("3", "Adwiti"));
        employeeMap.put("4", new Employee("4", "Arav"));

        System.out.println(employeeMap);

        HashMap<String, Employee> clone = (HashMap<String, Employee>) employeeMap.clone();
        System.out.println(clone);

        clone.get("1").setName("Aruns");

        System.out.println("Shallow clone");

        /**
         * Both will see the changes
         */
        System.out.println(employeeMap);
        System.out.println(clone);

        /**
         * When we do SerializationUtils.clone from Apache common, then
         */
        HashMap<String, Employee> deepCopy = (HashMap<String, Employee>) SerializationUtils.clone(employeeMap);
        deepCopy.get("2").setName("Pushpas");

        System.out.println("Deep clone using SerializationUtils of apache common");
        System.out.println(employeeMap);
        System.out.println(deepCopy);

        System.out.println("Deep clone using Gson of Google");
        /**
         * Deep clone using gson
         */

        Gson gson = new Gson();
        String employeeString = gson.toJson(employeeMap);
        Type type = new TypeToken<HashMap<String, Employee>>() {
        }.getType();

        HashMap<String, Employee> deepClonedMap = gson.fromJson(employeeString, type);
        employeeMap.get("1").setName("Arun");

        /**
         * deep clone will not get affected
         */
        System.out.println(deepClonedMap);

    }
}

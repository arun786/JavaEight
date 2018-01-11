package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class UseOfComparableInterfaceForLambda {
    public static void main(String[] args) {

        Employee emp1 = new Employee("arun", 10, new Address("16631", "N 56th Street", "Scottsdale", "85254"));
        Employee emp2 = new Employee("brun", 11, new Address("16631", "N 56th Street", "Scottsdale", "85255"));
        Employee emp3 = new Employee("crun", 12, new Address("16631", "N 56th Street", "Scottsdale", "85256"));
        Employee emp4 = new Employee("drun", 13, new Address("16631", "N 56th Street", "Scottsdale", "85257"));
        List<Employee> lst = new ArrayList<Employee>();
        lst.add(emp1);
        lst.add(emp2);
        lst.add(emp3);
        lst.add(emp4);

        Comparable<Employee> c = (Employee a) -> 

    }
}

class Employee {
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}


class Address {
    private String add1;
    private String add2;
    private String city;
    private String zip;

    public Address(String add1, String add2, String city, String zip) {
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.zip = zip;
    }

    public String getAdd1() {
        return add1;
    }

    public String getAdd2() {
        return add2;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}

package Homework.Task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map employeeMap = new HashMap<Integer, String>();

        employeeMap.put(1,"Ivan");
        employeeMap.put(2,"Roman");
        employeeMap.put(3,"Michael");
        employeeMap.put(4,"Vasul");
        employeeMap.put(5,"Vitaliy");
        employeeMap.put(6,"Andrew");
        employeeMap.put(7,"Jeremy");

        System.out.println(employeeMap);

        System.out.println("Input ID of employee");
        int ID = sc.nextInt();
        if (employeeMap.containsKey(ID)){
            System.out.println("This is " + employeeMap.get(ID));
        }
        System.out.println("Input name of employee");
        String name = sc.nextLine();
        if (employeeMap.containsValue(name)){
            System.out.println("This is " + employeeMap.get(name) + " emploee id");
        }
    }
}

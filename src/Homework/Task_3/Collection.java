package Homework.Task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Map personMap = new HashMap<String, String>();

    personMap.put("Ivan","Sheketa");
    personMap.put("Roman","Drabchuk");
    personMap.put("Michael","Danulyk");
    personMap.put("Vasul","Zelinskuy");
    personMap.put("Vitaliy","Korshuk");
    personMap.put("Andrew","Malitchuk");
    personMap.put("Jeremy","Targarien");
    personMap.put("Orest","Swatuk");
    personMap.put("Jamey","Lanister");
    personMap.put("Mukola","Bartkiv");

    System.out.println(personMap);
    if (personMap.containsKey("Orest")){
        personMap.remove("Orest");
    }
        System.out.println(personMap);

    }
}

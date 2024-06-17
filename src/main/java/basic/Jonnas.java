package basic;

import java.util.Scanner;


/**
 *
 */

public class Jonnas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        String getName =getName(name);
        System.out.println(getName);
    }
    public static String getName(String n){
        String name = n ;

            if(name.equals("joonas")){
                return (name + "??!");
            } else {
                return name;
            }
}
}

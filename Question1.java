/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3_2;

/**
 *
 * @author Ikhlas Kamel
 */
public class Question1 {
        public static void main(String[] args) {

    myOperation ACC = (value) -> System.out.printf("%d \n", value);
        ACC.operation(5);
      
         myOperation2 operation2 = String::toUpperCase;
        System.out.println(operation2.operation("abd"));
        
         myOperation3 print = () -> {
            return "Welcome to lambdas!";
        };       
        System.out.println(print.operation());

         myOperation4 operation4 = Math::sqrt;
        System.out.println(operation4.operation(9));

         myOperation5 cube = (num) -> num * num * num;
        System.out.println(cube.operation(2));
    }

    interface myOperation {

        void operation(int value);
    }

    interface myOperation2 {

        String operation(String text);
    }

    interface myOperation3 {

        String operation();
    }

    interface myOperation4 {

        double operation(double num);
    }

    interface myOperation5 {

        double operation(double num);
    }


}
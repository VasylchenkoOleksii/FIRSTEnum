package ua.oa.org.foxdesert1;

import java.util.Scanner;

/**
 * Created by vasylchenko on 21.04.2015.
 */
public class Enums {
    String monthName;

    public void inputMonth() {
        Month mon = null;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i > 0; i--) { //цикл для проверки правильности ввода данных, если данные не верны то повторный ввод

            System.out.println("Input month: ");
            monthName = sc.nextLine();// ввод данных с консоли

            if (monthName.equals("JANUARY") || monthName.equals("January")
                    || monthName.equals("january") || monthName.equals("JAN")
                    || monthName.equals("Jan") || monthName.equals("jan")
                    || monthName.equals("1") || monthName.equals("01")) {
                mon = Month.JANUARY;
                System.out.println("The month is " + mon);

            } else if (monthName.equals("FEBRUARY") || monthName.equals("February")
                    || monthName.equals("february") || monthName.equals("FEB")
                    || monthName.equals("Feb") || monthName.equals("feb")
                    || monthName.equals("2") || monthName.equals("02")){
                mon = Month.FEBRUARY;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("MARCH") || monthName.equals("March")
                    || monthName.equals("march") || monthName.equals("MAR")
                    || monthName.equals("Mar") || monthName.equals("mar")
                    || monthName.equals("3") || monthName.equals("03")){
                mon = Month.MARCH;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("APRIL") || monthName.equals("April")
                    || monthName.equals("april") || monthName.equals("APR")
                    || monthName.equals("Apr") || monthName.equals("apr")
                    || monthName.equals("4") || monthName.equals("04")){
                mon = Month.APRIL;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("MAY") || monthName.equals("May")
                    || monthName.equals("may") || monthName.equals("5") || monthName.equals("05")){
                mon = Month.MARCH;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("JUNE") || monthName.equals("June")
                    || monthName.equals("june") || monthName.equals("JU")
                    || monthName.equals("Ju") || monthName.equals("ju")
                    || monthName.equals("6") || monthName.equals("06")){
                mon = Month.JUNE;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("JULY") || monthName.equals("July")
                    || monthName.equals("july") || monthName.equals("JUL")
                    || monthName.equals("Jul") || monthName.equals("jul")
                    || monthName.equals("7") || monthName.equals("07")){
                mon = Month.JULY;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("AUGUST") || monthName.equals("August")
                    || monthName.equals("august") || monthName.equals("AUG")
                    || monthName.equals("Aug") || monthName.equals("aug")
                    || monthName.equals("8") || monthName.equals("08")){
                mon = Month.AUGUST;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("SEPTEMBER") || monthName.equals("September")
                    || monthName.equals("september") || monthName.equals("SEP")
                    || monthName.equals("Sep") || monthName.equals("sep")
                    || monthName.equals("SEPT")
                    || monthName.equals("Sept") || monthName.equals("sept")
                    || monthName.equals("9") || monthName.equals("09")){
                mon = Month.SEPTEMBER;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("OCTOBER") || monthName.equals("October")
                    || monthName.equals("october") || monthName.equals("OCT")
                    || monthName.equals("Oct") || monthName.equals("oct")
                    || monthName.equals("10")){
                mon = Month.OCTOBER;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("NOVEMBER") || monthName.equals("November")
                    || monthName.equals("november") || monthName.equals("NOV")
                    || monthName.equals("Nov") || monthName.equals("nov")
                    || monthName.equals("11")){
                mon = Month.NOVEMBER;
                System.out.println("The month is " + mon);
            }
            else if (monthName.equals("DECEMBER") || monthName.equals("December")
                    || monthName.equals("december") || monthName.equals("DEC")
                    || monthName.equals("Dec") || monthName.equals("dec")
                    || monthName.equals("12")){
                mon = Month.DECEMBER;
                System.out.println("The month is " + mon);
            }
            else {
                System.out
                        .println("You entered an incorrect value of the month - retype");
                i++;
            }
        }
        sc.close();

    }
}

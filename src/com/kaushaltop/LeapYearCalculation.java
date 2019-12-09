package com.kaushaltop;

public class LeapYearCalculation {

    public static boolean isLeapYear(int year) {

        if (year >=1 && year<=9999) {

            int remainder = year%4;

            if (remainder == 0) {

                int remainder2 = year%100;

                if (remainder2 != 0) {

                    return true;

                } else {

                    int remainder3 = year%400;

                    if (remainder3 == 0) {

                        return true;

                    } else {

                        System.out.println("Year "+year+" is not a leap year");

                        return false;
                    }
                }

            } else {

                System.out.println("Year "+year+" is not a leap year");

                return false;
            }

        } else {

            System.out.println("Year not in range");

            return false;
        }
    }

    public static int displayLeapYears(int start, int end) {

        for (int i=start; i<=end; i++) {

            if (isLeapYear(i)) {

                System.out.println("Year "+i+" is a leap year");
            }
        }
        return -1;
    }
}

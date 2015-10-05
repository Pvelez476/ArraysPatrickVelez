package com.example;

public class Array {

    public static void main(String[] args) {

        String[] [] states = new String[3] [2];
        states[0][0] = "Points Average ";
        states [0] [1] = "33";

        states[1][0] = "Top 3 Rebound Average";
        states [1] [1] = "19";

        states[2][0] = "Better Player Between Derrick Rose and Jimmy Butler ";
        states [2] [1] = "Derrick Rose";

        for (int i = 0; i< states.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < states[i].length; j++){
                if(j==0){
                    sb.append("The Chicago Bulls ");
                }
                else {
                    sb.append(" is ");
                }
                sb.append(states[i] [j]);

            }
            System.out.println(sb);
        }
        }
    }




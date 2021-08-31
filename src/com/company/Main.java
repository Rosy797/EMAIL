package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args)
    {

        // Get the regex to be checked
        String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";

        List<String> emails = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        // Create a pattern from regex
        Pattern pattern
                = Pattern.compile(regex);

        // Get the String to be matched




        Matcher matcher
                = pattern
                .matcher(s);

        // Get the current matcher state
        MatchResult result
                = matcher.toMatchResult();
        System.out.println("Current Matcher: "
                + result);

        while (matcher.find()) {
            // Get the group matched using group() method
            System.out.println(matcher.group());
        }
    }
}


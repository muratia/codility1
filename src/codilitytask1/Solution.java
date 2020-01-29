/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitytask1;

import java.util.ArrayList;
import java.util.List;

/**
 * This task was given in Codility test
 *
 * @author ahmet
 */
public class Solution {

    /**
     * This method accepts a list of names divided by colon and
     *
     * @param names
     * @param domain
     * @return String as required
     */
    public String solution(String names, String domain) {
        String res = "";
        List<Person> namesList = new ArrayList<>();
        List<String> accounts = new ArrayList<>();
        String[] namesArr = names.split(";");
        List<Multiple> oR = new ArrayList<>();

        Multiple multiple = null;
        for (String name : namesArr) {
            // Now we replace hyphens on the name
            name = name.replaceAll("-", " ").trim();

            Person person = prepareName(name, domain);
            if (!namesList.contains(person)) {
                boolean add = namesList.add(person);
            } else {

                // Here we get the account and append a number according to the email accounts with the unique username
                String account = person.getAccount();
                final String acc = account;
// Here we try to find the multiple factor according the to account otherwise it returns null
                multiple = oR.stream()
                        .filter(m -> acc.equals(m.getName()))
                        .findAny()
                        .orElse(null);
                if (multiple == null) { // Initialization of the multiple 
                    multiple = new Multiple(account, 0);
                }
                multiple.setValue(multiple.getValue() + 1);

                int value = multiple.getValue();
                account = account + value;

                person.setAccount(account);
                person.setEmail("" + person.getAccount() + "@" + domain.toLowerCase() + ".com");
                namesList.add(person);
                if (oR.add(multiple)) {

                } 
            } 
        }

        StringBuilder sb = new StringBuilder();
        namesList.forEach((person) -> {
            sb.append(person.toString()).append("; ");
        });
        res = sb.toString();
        
        int last =  res.lastIndexOf("; ");
        res = res.substring(0, last);
        return res;
    }

    /**
     * This method prepares the name and the given the domain
     *
     * @param name Name of the employee
     * @param domain The domain of the companz
     * @return Person (@see Person)
     */
    private Person prepareName(String name, String domain) {
        Person res = null;
        int spaces = (int) name.chars().filter(c -> c == ' ').count();
        String first = "";
        String last = "";
        String[] fullName = name.split(" ");
        switch (spaces) {
            case 1: {
                first = fullName[0];
                last = fullName[1];
            }
            break;

            case 2: {
                first = fullName[0];
                last = fullName[2];
            }
            break;
            case 3: {
                first = fullName[0];
                last = fullName[3];
            }
            break;
            case 4: {
                first = fullName[0];
                last = fullName[4];
            }
            break;
        }
        res = new Person(first, last, prepareAccount(first, last), prepareAccount(first, last) + "@" + domain + ".com");
        return res;
    }

    /**
     * This method prepeares the account from given first name and last name
     *
     * @param first String
     * @param last String
     * @return String
     */
    private String prepareAccount(String first, String last) {
        return (first + "." + (last.length() > 3 ? last.substring(0, 3) : last)).toLowerCase();
    }
}

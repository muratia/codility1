/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitytask1;

import java.util.Objects;

/**
 *
 * @author ahmet
 */
public 
class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private String account;
    private String email;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.account = "";
        this.email = "";
    }

    public Person(String firstName, String lastName, String account, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        hash = 97 * hash + Objects.hashCode(this.account);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "" + firstName + " " + lastName + " <" + email + '>';
    }

    @Override
    public int compareTo(Person o) {
        return this.email.compareTo(o.email);
    }

}

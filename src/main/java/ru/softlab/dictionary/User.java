package ru.softlab.dictionary;

public class User {
    private Long id;
    private String login;
    private String password;
    private String surname;
    private String firstName;

    public Long getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin() {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword() {
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname() {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName() {
        this.firstName = firstName;
    }
}
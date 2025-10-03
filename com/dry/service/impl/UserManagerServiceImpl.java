package com.dry.service.impl;

public class UserManagerServiceImpl {

    private boolean isInvalid(String value, String type) {
        if (value == null || value.isEmpty()) {
            System.out.println("Invalid " + type);
            return true;
        }
        return false;
    }

    private void processUser(String name, String email, String action) {
        if (isInvalid(name, "name") || isInvalid(email, "email")) return;

        System.out.println("User " + action + ": " + name + " - " + email);
    }

    public void addUser(String name, String email) {
        processUser(name, email, "added");
    }

    public void updateUser(String name, String email) {
        processUser(name, email, "updated");
    }
}
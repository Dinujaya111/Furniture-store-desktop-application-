/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.furniturestore;

import com.furniturestore.ui.LoginUI;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lakin
 */
public class FurnitureStore {

     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of the LoginForm
                LoginUI loginUi = new LoginUI();
                // Set the default close operation so the application exits when the form is closed
                loginUi.setDefaultCloseOperation(LoginUI.EXIT_ON_CLOSE);
                // Set the title of the form
                loginUi.setTitle("Login");
                // Set the size of the form
                loginUi.setSize(1000, 400); // width, height
                // Position the form in the center of the screen
                loginUi.setLocationRelativeTo(null);
                // Make the form visible
                loginUi.setVisible(true);
            }
        });
    }
}

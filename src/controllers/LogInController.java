package controllers;

import javax.swing.JTextArea;

import java.awt.Dimension;

import views.swingComponents.JFramePopUp;
import views.swingComponents.WrongPassword;
import views.useCaseFrames.TestListView;

public class LogInController{
    private static LogInController instance;

    private LogInController(){
    }

    public static boolean validateUser(String email, String password){

        if(JSONReader.getInstance().readUser(email, password)){
            JSONReader.getInstance().readCourses();
            return true;
        } else {
            return false;
        }
    }

    public static LogInController getInstance(){
        if(instance == null){
            instance = new LogInController();
        }
        return instance;
    }
}

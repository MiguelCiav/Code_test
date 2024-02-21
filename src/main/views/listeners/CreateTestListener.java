package main.views.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.controllers.CreateTestController;
import main.views.components.createTestViewComponents.QuestionDataPanel;
import main.views.components.genericComponents.BlueButton;
import main.views.frames.AddQuestionsFrame;
import main.views.frames.UserListView;

public class CreateTestListener implements ActionListener{
    
    private static CreateTestListener instance;

    private CreateTestListener(){
    }

    public static CreateTestListener getInstance(){
        if(instance == null){
            instance = new CreateTestListener();
        }

        return instance;
    }

    @Override public void actionPerformed(ActionEvent e){

        CreateTestController.getInstance().createTest();
        AddQuestionsFrame.getInstance().disposeFrame();
        for(int i = 0; i < QuestionDataPanel.getInstance().getQuestionList().size(); i++){
            QuestionDataPanel.getInstance().remove(i);
        }
        UserListView.getInstance();
    }

}

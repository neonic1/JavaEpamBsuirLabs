package com.bsuir.lab2.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import com.bsuir.lab2.object.*;

public class Controller {
    private View view = new View();
    private Model model = new Model();
    private Pane pane = new Pane();

    EventHandler<ActionEvent> programmerChangeNameActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setProgrammerNewNamePane(pane);
        }
    };
    EventHandler<ActionEvent> cookChangeNameActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setCookNewNamePane(pane);
        }
    };
    EventHandler<ActionEvent> programmerEatActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setProgrammerEatPane(pane);
            view.setSelectDishComboBoxList(model.getDishMenu());
        }
    };
    EventHandler<ActionEvent> cookEatActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setCookEatPane(pane);
            view.setSelectDishComboBoxList(model.getDishMenu());
        }
    };
    EventHandler<ActionEvent> programmerWriteCodeActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setWriteCodePane(pane);
        }
    };
    EventHandler<ActionEvent> cookMakeFoodActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMakeDishPane(pane);
        }
    };
    EventHandler<ActionEvent> BackToMainSceneButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
            view.setProgrammerName(model.getProgrammerName());
            view.setCookName(model.getCookName());
        }
    };
    EventHandler<ActionEvent> SaveNewProgrammerNameActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.isNewProgrammerTextFieldEmpty()) { view.setWarningNewNameLabel(true); }
            else {
                view.setWarningNewNameLabel(false);
                model.setProgrammerName(view.getNewProgrammerName());
                view.setMainPane(pane);
                view.setProgrammerName(model.getProgrammerName());
                view.setCookName(model.getCookName());
            }
        }
    };
    EventHandler<ActionEvent> SaveNewCookNameActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.isNewCookTextFieldEmpty()) { view.setWarningNewNameLabel(true); }
            else {
                view.setWarningNewNameLabel(false);
                model.setCookName(view.getNewCookName());
                view.setMainPane(pane);
                view.setProgrammerName(model.getProgrammerName());
                view.setCookName(model.getCookName());
            }
        }
    };
    EventHandler<ActionEvent> BackToMainSceneFormEatButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    EventHandler<ActionEvent> ProgrammerEatFoodActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getChosenDish() != null) {
                model.programmerEat(view.getChosenDish());
                view.setMainPane(pane);
            }
        }
    };
    EventHandler<ActionEvent> CookEatFoodActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getChosenDish() != null) {
                model.cookEat(view.getChosenDish());
                view.setMainPane(pane);
            }
        }
    };
    EventHandler<ActionEvent> WriteCodeToTextAreaActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setNewCode(model.getNewCode());
        }
    };
    EventHandler<ActionEvent> BackToMainSceneFormWritingCodeActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    EventHandler<ActionEvent> BackToMainSceneFormCookingActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    EventHandler<ActionEvent> MakeDishButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.isMakeNewDishFieldsEmpty()) {view.setCookingWarningLabel(true); }
            else {
                view.setCookingWarningLabel(false);
                if(view.getPortionNumber() > 0) {
                    model.cookMakeFood(view.getNewDishName(), view.getPortionNumber(), view.getNewDishFlavour());
                    view.setMainPane(pane);
                }
            }
        }
    };

    public Controller() {
        view.setProgrammerChangeNameButtonHandler(programmerChangeNameActionEvent);
        view.setCookChangeNameButtonHandler(cookChangeNameActionEvent);
        view.setProgrammerEatButtonHandler(programmerEatActionEvent);
        view.setCookEatButtonHandler(cookEatActionEvent);
        view.setProgrammerWriteCodeButtonHandler(programmerWriteCodeActionEvent);
        view.setCookMakeFoodButtonHandler(cookMakeFoodActionEvent);
        view.setBackToMainSceneButtonHandler(BackToMainSceneButtonActionEvent);
        view.setSaveNewProgrammerNameButtonHandler(SaveNewProgrammerNameActionEvent);
        view.setSaveNewCookNameButtonHandler(SaveNewCookNameActionEvent);
        view.setBackToMainSceneFormEatButtonHandler(BackToMainSceneFormEatButtonActionEvent);
        view.setProgrammerEatFoodButtonHandler(ProgrammerEatFoodActionEvent);
        view.setCookEatFoodButtonHandler(CookEatFoodActionEvent);
        view.setWriteCodeToTextAreaButtonHandler(WriteCodeToTextAreaActionEvent);
        view.setBackToMainSceneFormWritingCodeButtonHandler(BackToMainSceneFormWritingCodeActionEvent);
        view.setBackToMainSceneFormCookingButtonHandler(BackToMainSceneFormCookingActionEvent);
        view.setMakeDishButtonHandler(MakeDishButtonActionEvent);

        view.setMainPane(pane);
        view.setProgrammerName(model.getProgrammerName());
        view.setCookName(model.getCookName());
    }

    public Pane getPane() { return pane; }
}

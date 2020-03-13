package com.bsuir.lab3.application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;

public class Controller {
    private View view = new View();
    private Model model = new Model();
    private Pane pane = new Pane();

    private EventHandler<ActionEvent> programmerChangeNameButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setOldName("programmer", model.getProgrammerName());
            view.setProgrammerNewNamePane(pane);
        }
    };
    private EventHandler<ActionEvent> cookChangeNameButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setOldName("cook", model.getCookName());
            view.setCookNewNamePane(pane);
        }
    };
    private EventHandler<ActionEvent> farmerChangeNameButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setOldName("farmer", model.getFarmerName());
            view.setFarmerNewNamePane(pane);
        }
    };
    private EventHandler<ActionEvent> programmerEatFoodButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setProgrammerEatPane(pane);
            view.setSelectDishComboBoxList(model.getDishMenu());
        }
    };
    private EventHandler<ActionEvent> cookEatFoodButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setCookEatPane(pane);
            view.setSelectDishComboBoxList(model.getDishMenu());
        }
    };
    private EventHandler<ActionEvent> farmerEatFoodButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setFarmerEatPane(pane);
            view.setSelectDishComboBoxList(model.getDishMenu());
        }
    };
    private EventHandler<ActionEvent> programmerWriteCodeButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setWriteCodePane(pane);
        }
    };
    private EventHandler<ActionEvent> cookMakeFoodButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMakeDishPane(pane);
            view.setChooseVegetablesComboBox(model.getBoughtVegetablesList());
        }
    };
    private EventHandler<ActionEvent> cookToVegetableShopButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setBuyVegetablesPane(pane);
            view.setSelectVegetableComboBox(model.getVegetableList());
        }
    };
    private EventHandler<ActionEvent> farmerToGardenButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setGrowNewVegetablesPane(pane);
        }
    };
    private EventHandler<ActionEvent> backToMainSceneFromNameSceneButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
            view.setProgrammerName(model.getProgrammerName());
            view.setCookName(model.getCookName());
            view.setFarmerName(model.getFarmerName());
        }
    };
    private EventHandler<ActionEvent> saveNewProgrammerNameButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getNewProgrammerName() != null) {
                model.setProgrammerName(view.getNewProgrammerName());
                view.setMainPane(pane);
                view.setProgrammerName(model.getProgrammerName());
                view.setCookName(model.getCookName());
                view.setFarmerName(model.getFarmerName());
            }
        }
    };
    private EventHandler<ActionEvent> saveNewCookNameButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getNewCookName() != null) {
                model.setCookName(view.getNewCookName());
                view.setMainPane(pane);
                view.setProgrammerName(model.getProgrammerName());
                view.setCookName(model.getCookName());
                view.setFarmerName(model.getFarmerName());
            }
        }
    };
    private EventHandler<ActionEvent> saveNewFarmerNameButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getNewFarmerName() != null) {
                model.setFarmerName(view.getNewFarmerName());
                view.setMainPane(pane);
                view.setProgrammerName(model.getProgrammerName());
                view.setCookName(model.getCookName());
                view.setFarmerName(model.getFarmerName());
            }
        }
    };
    private EventHandler<ActionEvent> backToMainSceneFromEatButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    private EventHandler<ActionEvent> programmerEatButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getChosenDish() != null) {
                model.programmerEat(view.getChosenDish());
                view.setMainPane(pane);
            }
        }
    };
    private EventHandler<ActionEvent> cookEatButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getChosenDish() != null) {
                model.cookEat(view.getChosenDish());
                view.setMainPane(pane);
            }
        }
    };
    private EventHandler<ActionEvent> farmerEatButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getChosenDish() != null) {
                model.farmerEat(view.getChosenDish());
                view.setMainPane(pane);
            }
        }
    };
    private EventHandler<ActionEvent> writeCodeToTextAreaButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setNewCode(model.getNewCode());
        }
    };
    private EventHandler<ActionEvent> backToMainSceneFromWritingCodeButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    private EventHandler<ActionEvent> backToMainSceneFromCookingButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    private EventHandler<ActionEvent> makeDishButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
           if(view.getChosenVegetableForNewDish() != null && view.getNewDishName() != null && view.getPortionNumber() > 0 && view.getNewDishFlavour() != null) {
               model.cookMakeFood(view.getChosenVegetableForNewDish(), view.getNewDishName(), view.getPortionNumber(), view.getNewDishFlavour());
               view.setMainPane(pane);
           }
        }
    };
    private EventHandler<ActionEvent> backToMainSceneFromShopButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    private EventHandler<ActionEvent> buyVegetablesButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getChosenVegetable() != null) {
                int quantity = view.getVegetablesAmount(view.getChosenVegetable());
                if(quantity > 0) {
                    model.cookBuyVegetables(view.getChosenVegetable(), quantity);
                    view.setBuyVegetablesPane(pane);
                    view.setSelectVegetableComboBox(model.getVegetableList());
                }
            }
        }
    };
    private EventHandler<ActionEvent> backToMainSceneFromGardenButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.setMainPane(pane);
        }
    };
    private EventHandler<ActionEvent> growNewVegetablesButtonActionEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(view.getNewVegetableName() != null &&
            view.getNewVegetableAmount() != 0 &&
            view.getNewVegetableShape() != null &&
            view.getNewVegetableColor() != null) {
                model.farmerGrowVegetable(
                        view.getNewVegetableName(),
                        view.getNewVegetableAmount(),
                        view.getNewVegetableShape(),
                        view.getNewVegetableColor()
                );
                view.setMainPane(pane);
            }
        }
    };

    public Controller() {
        view.setProgrammerChangeNameButtonHandler(programmerChangeNameButtonActionEvent);
        view.setCookChangeNameButtonHandler(cookChangeNameButtonActionEvent);
        view.setFarmerChangeNameButtonHandler(farmerChangeNameButtonActionEvent);
        view.setProgrammerEatButtonHandler(programmerEatFoodButtonActionEvent);
        view.setCookEatButtonHandler(cookEatFoodButtonActionEvent);
        view.setFarmerEatButtonHandler(farmerEatFoodButtonActionEvent);
        view.setProgrammerWriteCodeButtonHandler(programmerWriteCodeButtonActionEvent);
        view.setCookMakeFoodButtonHandler(cookMakeFoodButtonActionEvent);
        view.setCookToVegetableShopButtonHandler(cookToVegetableShopButtonActionEvent);
        view.setFarmerToGardenButtonHandler(farmerToGardenButtonActionEvent);
        view.setBackToMainSceneFromNameSceneButtonHandler(backToMainSceneFromNameSceneButtonActionEvent);
        view.setSaveNewProgrammerNameButtonHandler(saveNewProgrammerNameButtonActionEvent);
        view.setSaveNewCookNameButtonHandler(saveNewCookNameButtonActionEvent);
        view.setSaveNewFarmerNameButtonHandler(saveNewFarmerNameButtonActionEvent);
        view.setBackToMainSceneFromEatButtonHandler(backToMainSceneFromEatButtonActionEvent);
        view.setProgrammerEatFoodButtonHandler(programmerEatButtonActionEvent);
        view.setCookEatFoodButtonHandler(cookEatButtonActionEvent);
        view.setFarmerEatFoodButtonHandler(farmerEatButtonActionEvent);
        view.setWriteCodeToTextAreaButtonHandler(writeCodeToTextAreaButtonActionEvent);
        view.setBackToMainSceneFromWritingCodeButtonHandler(backToMainSceneFromWritingCodeButtonActionEvent);
        view.setMakeDishButtonHandler(makeDishButtonActionEvent);
        view.setBackToMainSceneFromCookingButtonHandler(backToMainSceneFromCookingButtonActionEvent);
        view.setBackToMainSceneFromShopButtonHandler(backToMainSceneFromShopButtonActionEvent);
        view.setBuyVegetablesButtonHandler(buyVegetablesButtonActionEvent);
        view.setBackToMainSceneFromGardenButtonHandler(backToMainSceneFromGardenButtonActionEvent);
        view.setGrowNewVegetablesButtonHandler(growNewVegetablesButtonActionEvent);

        view.setMainPane(pane);
        view.setProgrammerName(model.getProgrammerName());
        view.setCookName(model.getCookName());
        view.setFarmerName(model.getFarmerName());
    }

    public Pane getPane() { return pane; }
}

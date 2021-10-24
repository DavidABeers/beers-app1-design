package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ToDoController {

/*
* Declare all the button variables
* Declare text area and field
* Declare file menu*/

    private void saveClicked(ActionEvent event){
        // saves the current list of to do lists with the name given by user
    }

    private void openClicked(ActionEvent event){
        // allow the user to open a previously saved to do list
    }

    private void newListClicked(ActionEvent event){
        // create a new list item in the list view
    }
    private void editListClicked(ActionEvent event){
        // will allow the name of a selected list to be changed
    }
    private void deleteListClicked(ActionEvent event){
        // deletes selected list
    }
    private void newItemClicked(ActionEvent event){
        // creates a new item in a to-do list
    }
    private void deleteItemClicked(ActionEvent event){
        // removes selected item from the to-do list
    }
    private void completeCheckboxClicked(ActionEvent event){
        // set the complete field for the item to true
    }
    private void radioButtonClicked(ActionEvent event){
        // toggle a filter by the field tied to the clicked radio button
        // deselect any previously selected radiobuttons
    }
}

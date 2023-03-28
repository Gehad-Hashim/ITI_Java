package gui.lab2;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public  class myNotePadBase extends BorderPane {

    protected final MenuBar menuBar;
    protected final Menu fileMenu;
    protected final MenuItem newMenuItem;
    protected final MenuItem openMenuItem;
    protected final MenuItem saveMenuItem;
    protected final MenuItem exitMenuItem;
    protected final Menu editMenu;
    protected final MenuItem cutMenuItem;
    protected final MenuItem copyMenuItem;
    protected final MenuItem pasteMenuItem;
    protected final MenuItem deleteMenuItem;
    protected final MenuItem selectAllMenuItem;
    protected final Menu helpMenu;
    protected final MenuItem aboutMenuItem;
    protected final TextArea textArea;

    public myNotePadBase(Stage mainStage) {

        menuBar = new MenuBar();
        fileMenu = new Menu();
        newMenuItem = new MenuItem();
        openMenuItem = new MenuItem();
        saveMenuItem = new MenuItem();
        exitMenuItem = new MenuItem();
        editMenu = new Menu();
        cutMenuItem = new MenuItem();
        copyMenuItem = new MenuItem();
        pasteMenuItem = new MenuItem();
        deleteMenuItem = new MenuItem();
        selectAllMenuItem = new MenuItem();
        helpMenu = new Menu();
        aboutMenuItem = new MenuItem();
        textArea = new TextArea();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(menuBar, javafx.geometry.Pos.CENTER);

        fileMenu.setMnemonicParsing(false);
        fileMenu.setText("File");
                /*----------------------------File  Menu-----------------------*/
        /*-----------------------------------------------------------------------------------New-----------*/
        newMenuItem.setMnemonicParsing(false);
        newMenuItem.setText("New");
        newMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
       
        /*-----------------------------------------------------------------------------------Open-----------*/
        openMenuItem.setMnemonicParsing(false);
        openMenuItem.setText("Open...");
        openMenuItem.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            
                FileChooser fc=new FileChooser();
               File file= fc.showOpenDialog(mainStage);
               if(file!=null){
                   textArea.appendText(file.getName());
                     
               }
            }
        });
        
        /*-----------------------------------------------------------------------------------Save-----------*/
        
        saveMenuItem.setMnemonicParsing(false);
        saveMenuItem.setText("Save");

        exitMenuItem.setMnemonicParsing(false);
        exitMenuItem.setText("Exit");

        editMenu.setMnemonicParsing(false);
        editMenu.setText("Edit");

        cutMenuItem.setMnemonicParsing(false);
        cutMenuItem.setText("Cut");

        copyMenuItem.setMnemonicParsing(false);
        copyMenuItem.setText("Copy");

        pasteMenuItem.setMnemonicParsing(false);
        pasteMenuItem.setText("Paste");

        deleteMenuItem.setMnemonicParsing(false);
        deleteMenuItem.setText("Delete");

        selectAllMenuItem.setMnemonicParsing(false);
        selectAllMenuItem.setText("Select All");

        helpMenu.setMnemonicParsing(false);
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonicParsing(false);
        aboutMenuItem.setText("About NotePad");
        setTop(menuBar);

        BorderPane.setAlignment(textArea, javafx.geometry.Pos.CENTER);
        textArea.setPrefHeight(200.0);
        textArea.setPrefWidth(200.0);
        setCenter(textArea);

        fileMenu.getItems().add(newMenuItem);
        fileMenu.getItems().add(openMenuItem);
        fileMenu.getItems().add(saveMenuItem);
        fileMenu.getItems().add(exitMenuItem);
        menuBar.getMenus().add(fileMenu);
        editMenu.getItems().add(cutMenuItem);
        editMenu.getItems().add(copyMenuItem);
        editMenu.getItems().add(pasteMenuItem);
        editMenu.getItems().add(deleteMenuItem);
        editMenu.getItems().add(selectAllMenuItem);
        menuBar.getMenus().add(editMenu);
        helpMenu.getItems().add(aboutMenuItem);
        menuBar.getMenus().add(helpMenu);

    }
}

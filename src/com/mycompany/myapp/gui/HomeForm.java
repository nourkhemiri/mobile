/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;


/**
 *
 * @author bhk
 */
public class HomeForm extends BaseForm {
    

    Form current;
    /*Garder traçe de la Form en cours pour la passer en paramètres 
    aux interfaces suivantes pour pouvoir y revenir plus tard en utilisant
    la méthode showBack*/
    
    public HomeForm(Resources res) {
         super("Newsfeed",BoxLayout.y());
    //    Toolbar tb=new Toolbar(true);
        current =this;
    //    setToolbar(tb);
       super.addSideMenu(res);
        getTitleArea().setUIID("Container");
      //  setTitle("Ajouter Publication");
        getContentPane().setScrollVisible(false);
     
        setTitle("Acceuil");
        setLayout(BoxLayout.y());

        this.add(new Label("Choisir une option"));
        Button btnAddTask = new Button("Ajouter vaccin");
        Button btnListTasks = new Button("Voir la liste des vaccins");

        btnAddTask.addActionListener(e -> new AddVaccinForm(res).show());
        btnListTasks.addActionListener(e -> new ListVaccin(res).show());
        addAll(btnAddTask, btnListTasks);

    }

}

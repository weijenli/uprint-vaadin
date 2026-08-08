package com.uprint.ui;

import com.uprint.ui.components.TeamGrid;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

    public AboutView() {
        Image background = new Image("./static/images/bk-2.png", "background");
        add(background);
        add(new TeamGrid());
    }
}
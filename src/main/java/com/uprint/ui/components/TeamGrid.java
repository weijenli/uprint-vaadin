package com.uprint.ui.components;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;

public class TeamGrid extends Div {
    public TeamGrid() {
        addClassName("team-grid");

        add(new Html("<br/>"));
        add(new Html("<br/>"));
        add(new H2("Our Team"));
        Image team1 = new Image("./static/images/products/team/1805.JPG", "team1");
        team1.addClassName("team-image");
        add(team1);

        Image team2 = new Image("./static/images/products/team/1809.PNG", "team2");
        team2.addClassName("team-image");
        add(team2);
    }
}

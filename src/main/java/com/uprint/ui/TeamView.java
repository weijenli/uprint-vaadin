package com.uprint.ui;

import com.uprint.ui.components.BagsGrid;
import com.uprint.ui.components.TeamGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "teamview", layout = MainLayout.class)
public class TeamView extends AboutView {

    public TeamView() {
        super();
        add(new TeamGrid());
    }
}

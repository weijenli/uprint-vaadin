package com.uprint.ui;

import com.uprint.ui.components.FactoryGrid;
import com.uprint.ui.components.TeamGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "factoryview", layout = MainLayout.class)
public class FactoryView extends AboutView {

    public FactoryView() {
        super();
        add(new FactoryGrid());
    }
}

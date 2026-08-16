package com.uprint.ui;

import com.uprint.ui.components.BagsGrid;
import com.uprint.ui.components.BooksGrid;
import com.uprint.ui.components.BrochuresGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "brochuresview", layout = MainLayout.class)
public class BrochuresView extends VerticalLayout {

    public BrochuresView() {
        add(new BrochuresGrid());
    }
}

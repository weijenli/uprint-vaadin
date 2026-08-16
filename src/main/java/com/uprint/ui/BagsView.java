package com.uprint.ui;

import com.uprint.ui.components.BagsGrid;
import com.uprint.ui.components.BooksGrid;
import com.uprint.ui.components.BrochuresGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "bagsview", layout = MainLayout.class)
public class BagsView extends VerticalLayout {

    public BagsView() {
        add(new BagsGrid());
    }
}

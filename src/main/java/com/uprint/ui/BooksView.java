package com.uprint.ui;

import com.uprint.ui.components.BagsGrid;
import com.uprint.ui.components.BooksGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "booksview", layout = MainLayout.class)
public class BooksView extends VerticalLayout {

    public BooksView() {
        add(new BooksGrid());
    }
}

package com.uprint.ui;

import com.uprint.ui.components.ProductsGrid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "products", layout = MainLayout.class)
public class ProductsView extends VerticalLayout {

    public ProductsView() {
        addClassName("productGrids");
        add(new ProductsGrid());
    }
}

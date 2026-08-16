package com.uprint.ui.components;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;

import static com.uprint.utils.Constants.PRODUCTS_IMAGE_RELATIVE_PATH;

public class TeamGrid extends ProductsGrid {
    public TeamGrid() {
        super("Our Team", "products/team", "team-grid", "product-image-wide");
    }
}

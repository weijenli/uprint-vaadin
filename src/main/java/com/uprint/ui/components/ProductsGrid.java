package com.uprint.ui.components;

import com.uprint.utils.ResourcesUtil;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import org.springframework.core.io.Resource;

public class ProductsGrid extends Div {

    public ProductsGrid(String title, String folder) {
        this(title, folder, "product-grid", "product-image");
    }

    public ProductsGrid(String title, String folder, String gridStyle, String imageStyle) {
        add(new Html("<br/>"));
        add(new Html("<br/>"));
        add(new H2(title));
        Div container = new Div();
        container.addClassName(gridStyle);
        Resource[] images = ResourcesUtil.getImageCountInResources(folder);
        if (images != null) renderImagesFromFolder(container, images.length, folder, imageStyle);
        add(container);
    }

    private void renderImagesFromFolder(Div container, int length, String filepath, String style) {
        try {
            for (int i = 0; i < length; i++) {
                Image img = new Image("./static/images/" + filepath + "/" + i + ".jpg", "Image " + i);
                img.addClassName(style);
                container.add(img);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

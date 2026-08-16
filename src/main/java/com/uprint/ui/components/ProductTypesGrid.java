package com.uprint.ui.components;

import com.uprint.utils.ResourcesUtil;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

import static com.uprint.utils.Constants.PRODUCTS_IMAGE_RELATIVE_PATH;
import static com.uprint.utils.Constants.RESOURCE_PATH;

public class ProductTypesGrid extends Div {
    public ProductTypesGrid() {

        add(new Html("<br/>"));
        add(new Html("<br/>"));
        add(new H2("Books / Catalogs / Magazines"));
        Div booksDiv = new Div();
        booksDiv.addClassName("product-grid");
        String booksFolder = "products/books";
        Resource[] bookImages = ResourcesUtil.getImageCountInResources(booksFolder);
        if (bookImages != null) renderImagesFromFolder(booksDiv, bookImages.length, booksFolder);
        add(booksDiv);
    }

    private void renderImagesFromFolder(Div container, int length, String filepath) {
        try {
            for (int i = 0; i < length; i++) {
                Image img = new Image("./static/images/" + filepath + "/" + i + ".jpg", "Image " + i);
                img.addClassName("product-image");
                container.add(img);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

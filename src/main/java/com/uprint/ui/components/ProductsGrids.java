package com.uprint.ui.components;

import com.uprint.utils.ResourcesUtil;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import org.springframework.core.io.Resource;

import static com.uprint.utils.Constants.BOOK_IMAGE_RELATIVE_PATH;
import static com.uprint.utils.Constants.RESOURCE_PATH;

public class ProductsGrids extends Div {
    public ProductsGrids() {
        addClassName("product-grids");
        Resource[] bookImages = ResourcesUtil.getImageCountInResources(RESOURCE_PATH + BOOK_IMAGE_RELATIVE_PATH);
        if (bookImages != null) renderImages(bookImages);
    }

    private void renderImages(Resource[] bookImages) {
        try {
            for (int i = 0; i < bookImages.length; i++) {
                Image img = new Image(BOOK_IMAGE_RELATIVE_PATH + i + ".jpg", "Image " + i);
                img.addClassName("product-image");
                add(img);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

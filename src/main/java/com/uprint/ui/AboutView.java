package com.uprint.ui;

import com.uprint.ui.components.TeamGrid;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import static com.uprint.utils.Constants.PRODUCTS_IMAGE_RELATIVE_PATH;

@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

    public AboutView() {
        add(new Html("<br/>"));

        FlexLayout layout = new FlexLayout();
        layout.getStyle().set("gap", "12px");
        layout.add(new H2("Follow us on "));

        layout.add(
            setupLinkIcon("https://www.facebook.com/salesuprint",
                    "./static/images/icons/fb.png",
                    "Facebook")
        );
        layout.add(
            setupLinkIcon("https://www.instagram.com/uprintpress/",
                    "./static/images/icons/ig.png",
                    "Instagram")
        );

        add(layout);
    }

    private Anchor setupLinkIcon(String url, String filepath, String name) {
        Image fbImg = new Image(filepath, this.getClassName() + name);
        fbImg.setWidth("30px");
        fbImg.setHeight("30px");
        Anchor anchor = new Anchor(url, fbImg);
        anchor.setTarget("_blank");

        return anchor;
    }
}
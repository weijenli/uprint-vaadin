package com.uprint.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Layout;
import com.vaadin.flow.router.RouterLink;
import org.jspecify.annotations.NonNull;

@Layout
public final class MainLayout extends AppLayout {

    public MainLayout() {

        Image logoImg = new Image("./static/images/logo1.png", "Company Logo");
        logoImg.setMaxWidth("100px");
        logoImg.setMaxHeight("100px");
        logoImg.setWidth("100%");
        logoImg.getStyle().set("margin-right", "100px");
        H1 logo = new H1(logoImg);

        HorizontalLayout menu = getHorizontalLayout();
        menu.addClassName("top-menu");
        addToNavbar(logo, menu);
    }

    private static HorizontalLayout getHorizontalLayout() {
        RouterLink homeLink = new RouterLink("Home", HomeView.class);
        homeLink.addClassName("top-link");
        RouterLink projectsLink = new RouterLink("Products", ProductsView.class);
        projectsLink.addClassName("top-link");
        RouterLink aboutLink = new RouterLink("About Us", AboutView.class);
        aboutLink.addClassName("top-link");
        RouterLink contactLink = new RouterLink("Contact Us", ContactView.class);
        contactLink.addClassName("top-link");

        HorizontalLayout menu = new HorizontalLayout(
          homeLink, projectsLink, aboutLink, contactLink
        );
        return menu;
    }
}


/*

 "#5B3625"
 */
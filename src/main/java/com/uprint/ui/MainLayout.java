package com.uprint.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Layout;
import com.vaadin.flow.router.RouterLink;

@Layout
public final class MainLayout extends AppLayout {

    public MainLayout() {

        VerticalLayout navbarContainer = new VerticalLayout(setIconRow(), setMenuRow());
        navbarContainer.setWidthFull();
        navbarContainer.getStyle().set("padding-top", "10px");

        getStyle().set("background-color", "white");
        addToNavbar(navbarContainer);
    }

    private HorizontalLayout setMenuRow() {
        HorizontalLayout menu = getHorizontalLayout();
        menu.addClassName("top-menu");

        return menu;
    }

    private HorizontalLayout setIconRow() {
        Image logoImg = new Image("./static/images/icons/uprint-logo2.png", "Company Logo");
        logoImg.setMaxWidth("100px");
        logoImg.setMaxHeight("100px");
        logoImg.setWidth("100%");
        logoImg.getStyle().set("margin-right", "20px");

        Image emailIcon = new Image("./static/images/icons/email.jpeg", "Email Icon");
        emailIcon.setWidth("18px");
        emailIcon.setHeight("14px");
        Span emailText = new Span("sales@uprintpress.com");
        emailText.getStyle().set("margin-right", "20px");

        Image fbImg = new Image("./static/images/icons/fb.png", "Facebook Icon");
        fbImg.setWidth("20px");
        fbImg.setHeight("20px");
        Anchor fbLink = new Anchor("https://www.facebook.com/salesuprint", fbImg);
        fbLink.setTarget("_blank");

        Image igImg = new Image("./static/images/icons/ig.png", "Instagram Icon");
        igImg.setWidth("20px");
        igImg.setHeight("20px");
        Anchor igLink = new Anchor("https://www.instagram.com/uprintpress/", igImg);
        igLink.setTarget("_blank");

        HorizontalLayout row = new HorizontalLayout(logoImg, emailIcon, emailText, fbLink, igLink);
        row.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        row.setWidthFull();
        row.setWidth("100%");
        row.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        return row;
    }

    private static HorizontalLayout getHorizontalLayout() {
        RouterLink homeLink = new RouterLink("Home", HomeView.class);
        homeLink.addClassName("top-link");

        Div productsMenu = new Div("Products");
        Div productsDropdown = new Div();
        productsDropdown.add(
                new RouterLink("Books", BooksView.class),
                new RouterLink("Bags", BagsView.class),
                new RouterLink("Brochures", BrochuresView.class)
                // new RouterLink("Signs", SignsView.class)
        );
        productsMenu.add(productsDropdown);
        productsMenu.addClassName("top-dropdown-menu");

        Div teamMenu = new Div("About Us");
        Div teamDropdown = new Div();
        teamDropdown.add(
                new RouterLink("Our Team", TeamView.class),
                new RouterLink("Our Factories", FactoryView.class)
        );
        teamMenu.add(teamDropdown);
        teamMenu.addClassName("top-dropdown-menu");

        RouterLink contactLink = new RouterLink("Contact Us", ContactView.class);
        contactLink.addClassName("top-link");

        HorizontalLayout row = new HorizontalLayout();
        row.add(homeLink);
        row.add(productsMenu);
        row.add(teamMenu);
        row.add(contactLink);

        row.setWidth("100%");
        row.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        return row;
    }
}

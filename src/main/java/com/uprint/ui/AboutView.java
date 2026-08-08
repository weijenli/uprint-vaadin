package com.uprint.ui;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

    public AboutView() {

        Image background = new Image("./static/images/bk-2.png", "background");
        setClassName("homeView");
        add(background);
        /*
        // 1. Configure layout dimensions and alignment
        setWidthFull();
        setMinHeight("800px"); // Give the layout height so the background is visible
//        setJustifyContentMode(JustifyContentMode.CENTER);
//        setAlignItems(Alignment.CENTER);

        // --- ALIGNMENT CHANGES ---
        setJustifyContentMode(JustifyContentMode.START); // Aligns content to the TOP
        setAlignItems(Alignment.START);                  // Aligns content to the LEFT

        // 2. Set the background image via inline styles (or custom class)
        getStyle()
                .set("background-image", "url('./static/images/image1.JPG')")
                .set("background-size", "cover")
                .set("background-position", "left")
                .set("background-repeat", "no-repeat")
                .set("color", "#8A030E"); // White text for visibility on dark backgrounds

        // Optional: Add a semi-transparent dark overlay for better text readability
        // getStyle().set("background-blend-mode", "darken")
        //           .set("background-color", "rgba(0, 0, 0, 0.4)");

        // 3. Create text content
        Paragraph title = new Paragraph("Global Footprint: Factories in Shenzhen, China | " +
                "Customer Service in California, USA ");
        title.getStyle()
                .set("font-size", "1.2rem")
                .set("font-weight", "bold")
                .set("margin-top", "30")
                .set("margin-bottom", "0.5rem");

        Paragraph description = new Paragraph(
                "UPrint connects authors, publishers, and businesses with trusted, premium printing solutions."
        );
        description.getStyle()
                .set("font-size", "1.2rem")
                .set("max-width", "600px")
                .set("text-align", "left");

        Paragraph description2 = new Paragraph(
                "Backed by over 20 years of experience and a team of 200+ skilled professionals, we " +
                        "deliver high-quality books, catalogs, brochures, packaging, and custom print products—all " +
                        "with factory-direct pricing and reliable worldwide shipping."
        );
        description2.getStyle()
                .set("font-size", "1.2rem")
                .set("max-width", "600px")
                .set("text-align", "left");

        // 4. Add components to the VerticalLayout
        add(title, description, description2);

//        VerticalLayout panel = new VerticalLayout();
//
//        panel.setWidth("700px");
//        panel.setHeight("850px");
//        panel.getElement().getStyle().set("flex-shrink", "0");
//        panel.getElement().getStyle().set("flex-grow", "0");
//
//// 3. Add styling to make it look like a panel
//        panel.getStyle().set("border", "1px solid var(--lumo-contrast-20pct)");
//        panel.getStyle().set("border-radius", "var(--lumo-size-s)");
//        panel.setPadding(true);
//
//        panel.add(new H3("Global Footprint: Factories in Shenzhen, China | Customer Service in California, USA"));
//        panel.add(new Paragraph("UPrint connects authors, publishers, and businesses with trusted, premium printing solutions."));
//        panel.add(new Paragraph("Backed by over 20 years of experience and a team of 200+ skilled professionals, we deliver high-quality books, catalogs, brochures, packaging, and custom print products—all with factory-direct pricing and reliable worldwide shipping."));
//        add(panel);


//        add(new Html("<br/>"));
//        TextField textField = new TextField();
//        textField.setLabel("AboutUS");

        // Use standard CSS units like px, rem, or em
//        textField.setWidth("300px");
//        add(textField);

         */
    }
}


/*

Factories based in Shenzhen, China.
Costumer Service Office based in California, US

UPrint connects authors, publishers, and business with trusted premium printing

With over 20 years of experience and 200+ skilled professionals, we provide
high-quality book printing, catalogs, brochures, packaging, and custom prunt solutions at factory-direct pricing, and worldwide shipping.

Global Footprint: Factories in Shenzhen, China | Customer Service in California, USA


 */
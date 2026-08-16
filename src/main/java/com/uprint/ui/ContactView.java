package com.uprint.ui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route(value = "contact", layout = MainLayout.class)
public class ContactView extends VerticalLayout {

    public ContactView() {
        Div imageContainer = new Div();
        imageContainer.addClassName("contact-container");
        imageContainer.add(setupBannerImage(), setupBannerText());
        add(imageContainer);
    }

    private Div setupBannerText() {
        Div textArea = new Div();

        textArea.add(new H2("Email"));
        Anchor mailTo = new Anchor("mailto:sales@uprintpress.com", "sales@uprintpress.com");
        mailTo.setTarget("_self");
        textArea.add(mailTo);
        textArea.add(new Html("<br/>"));
        textArea.add(new Html("<br/>"));

        textArea.add(new H2("Phone"));
        textArea.add(new Span("+1 626-697-7950"));
        textArea.add(new Html("<br/>"));
        textArea.add(new Span("+1 917-270-2215"));

        textArea.add(new Html("<br/>"));
        textArea.add(new Html("<br/>"));
        textArea.add(new H2("Address"));
        textArea.add(new Span("2108 N St Ste N, Sacramento, CA 95816 US"));

        textArea.addClassName("contact-us");
        return textArea;
    }

    private Image setupBannerImage() {
        Image headerImg = new Image("./static/images/home/contact-us.jpeg", "Contact Us");
        headerImg.addClassName(".product-image-wide");
        headerImg.setWidthFull();

        return  headerImg;
    }
}

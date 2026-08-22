package com.uprint.ui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "contactus", layout = MainLayout.class)
public class ContactView extends VerticalLayout {

    public ContactView() {
        Div container = new Div();
        container.add(setupBannerText());
        add(container);
    }

    private Div setupBannerText() {
        Div textArea = new Div();

        Span emailTitle = new Span("Email");
        emailTitle.addClassName("contact-title");
        Span phoneTitle = new Span("Phone");
        phoneTitle.addClassName("contact-title");
        Span addressTitle = new Span("Address");
        addressTitle.addClassName("contact-title");

        Span phone1 = new Span("+1 626-697-7950");
        phone1.addClassName("contact-text");
        Span phone2 = new Span("+1 917-270-2215");
        phone2.addClassName("contact-text");
        Span address = new Span("2108 N St Ste N, Sacramento, CA 95816 US");
        address.addClassName("contact-text");
        textArea.add(emailTitle);
        textArea.add(new Html("<br/>"));
        Anchor mailTo = new Anchor("mailto:sales@uprintpress.com", "sales@uprintpress.com");
        mailTo.addClassName("contact-text");
        mailTo.setTarget("_self");
        textArea.add(mailTo);
        textArea.add(new Html("<br/>"));

        textArea.add(phoneTitle);
        textArea.add(new Html("<br/>"));
        textArea.add(phone1);
        textArea.add(new Html("<br/>"));
        textArea.add(phone2);
        textArea.add(new Html("<br/>"));

        textArea.add(addressTitle);
        textArea.add(new Html("<br/>"));
        textArea.add(address);

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

package com.uprint.ui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "contact", layout = MainLayout.class)
public class ContactView extends VerticalLayout {

    public ContactView() {

        add(new H2("Email"));
        Anchor mailTo = new Anchor("mailto:sales@uprintpress.com", "sales@uprintpress.com");
        mailTo.setTarget("_self");
        add(mailTo);

        add(new Html("<br/>"));
        add(new H2("Phone"));
        add(new Span("1-917-270-2215"));

        add(new Html("<br/>"));
        add(new H2("Address"));
        add(new Span("2108 N St Ste N, Sacramento, CA 95816 US"));
    }
}

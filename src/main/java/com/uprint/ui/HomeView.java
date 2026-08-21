package com.uprint.ui;

import com.uprint.ui.components.ProductsGrid;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("UPrintPress | Printing & Manufacturing")
@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout {

    public HomeView() {
        Div imageContainer = new Div();
        imageContainer.addClassName("banner-container");
        imageContainer.add(setupBannerImage(), setupBannerText());
        add(imageContainer);
    }

    private Div setupBannerText() {
        Div textArea = new Div();

        Paragraph overlayText = new Paragraph("Bringing Your Vision to Life with Global Efficiency");
        overlayText.addClassName("banner-title");
        textArea.add(overlayText);

        Paragraph description = new Paragraph("Powered by 20+ years of industry experience and 200+ dedicated professionals, we deliver end-to-end solutions designed around your bottom line.");
        description.addClassName("banner-desc");
        textArea.add(description);

        Span prefix1 = new Span("Premium Printing, Precision Manufacturing: ");
        prefix1.getStyle().set("font-weight", "bold");
        Span text1 = new Span("High-volume, state-of-the-art production facilities in Shenzhen, China.");
        Span prefix2 = new Span("US-Based Service: ");
        prefix2.getStyle().set("font-weight", "bold");
        Span text2 = new Span("Dedicated customer support headquartered in California, USA.");
        Span prefix3 = new Span("Unbeatable Value: ");
        prefix3.getStyle().set("font-weight", "bold");
        Span text3 = new Span("Factory-direct pricing backed by fast, reliable global shipping.");
        Paragraph bullet = new Paragraph(prefix1, text1, new Html("<br/>"), new Html("<br/>"),
                prefix2, text2, new Html("<br/>"), new Html("<br/>"), prefix3, text3);
        bullet.addClassName("banner-bullet");
        textArea.add(bullet);

        return textArea;
    }

    private Image setupBannerImage() {
        Image headerImg = new Image("./static/images/home/1.png", "Home Background");
        headerImg.addClassName(".product-image-wide");
        headerImg.setId("slideshow-image");
        headerImg.setWidthFull();

        String[] imageUrls = {
                "./static/images/home/2.png",
                "./static/images/home/5.png",
                "./static/images/home/7.png",
                "./static/images/home/6.png",
                "./static/images/home/1.png"
        };

        headerImg.addAttachListener(event -> {
            String jsCode = """
                (function(elementId, urls) {
                    let index = 0;
                    // Store interval ID on element to prevent duplicate timers if re-attached
                    const img = document.getElementById(elementId);
                    if (!img) return;

                    if (img._slideshowInterval) {
                        clearInterval(img._slideshowInterval);
                    }

                    img._slideshowInterval = setInterval(() => {
                        index = (index + 1) % urls.length;
                        img.src = urls[index];
                    }, 5000);
                })($0, $1);
            """;

            // Pass the element ID and the Java array of URLs as parameters ($0, $1)
            getUI().ifPresent(ui -> ui.getPage().executeJs(jsCode, headerImg.getId().orElse(""), imageUrls));
        });

        // Clean up interval when the component is detached
        headerImg.addDetachListener(event -> {
            getUI().ifPresent(ui -> ui.getPage().executeJs(
                    "const img = document.getElementById($0); if(img && img._slideshowInterval) clearInterval(img._slideshowInterval);",
                    headerImg.getId().orElse("")
            ));
        });

        return headerImg;
    }

}

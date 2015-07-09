package com.realdolmen;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

import java.util.Locale;

/**
 *
 */
@Theme("mytheme")
@Widgetset("com.realdolmen.MyAppWidgetset")
public class MyUI extends UI {
    MyContacts myContacts = new MyContacts();
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        final HorizontalLayout toplayout= new HorizontalLayout();
        final HorizontalLayout bottomlayout= new HorizontalLayout();

        toplayout.setWidth("100%");
        Label emptyLabel=new Label("");
        Button button=new Button("contacts");
        button.setDescription("This is the tooltip");
        Button button2=new Button("registration");
        Button button3=new Button("login");
        toplayout.addComponent(button);
        toplayout.addComponent(emptyLabel);
        toplayout.addComponent(button2);
        toplayout.addComponent(button3);
        toplayout.setExpandRatio(emptyLabel, 1);

        final Panel panelLinks= new Panel("MENU");
        Panel panelRechts= new Panel("content");

        VerticalLayout layoutLeft=new VerticalLayout();
        final VerticalLayout layoutRight=new VerticalLayout();
        panelLinks.setContent(layoutLeft);
        panelRechts.setContent(layoutRight);


        InlineDateField date = new InlineDateField("Datum");
        date.setLocale(new Locale("nl", "NL"));
        date.setResolution(Resolution.DAY);
        layoutLeft.addComponent(date);


        bottomlayout.addComponent(panelLinks);
        bottomlayout.addComponent(panelRechts);
        bottomlayout.setExpandRatio(panelLinks, 0.15f);
        bottomlayout.setExpandRatio(panelRechts, 0.85f);
        bottomlayout.setSizeFull();
        final Label label=new Label("contacts");
        final Label label2=new Label("registreer");
        final Label label3=new Label("LOG IN");






        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent clickEvent) {
                layoutRight.addComponent(label);

            }
        });

        button2.addClickListener(new Button.ClickListener(){

            @Override
            public void buttonClick(ClickEvent clickEvent) {
                layoutRight.addComponent(new MyContacts());

            }
        });

        button3.addClickListener((new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent clickEvent) {
                layoutRight.addComponent(label3);
            }
        }));

        layout.addComponent(toplayout);
        layout.addComponent(bottomlayout);
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
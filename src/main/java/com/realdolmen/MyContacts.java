package com.realdolmen;


import com.vaadin.client.ValueMap;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.validator.BeanValidator;
import com.vaadin.ui.*;
import domain.Contact;


public class MyContacts extends CustomComponent{
    final FormLayout layout = new FormLayout();

    Panel panel= new Panel("nieuw contact");

    public MyContacts() {
        layout.setMargin(true);
        Label emptyLabel=new Label("");
        final BeanFieldGroup<Contact> binder=new BeanFieldGroup<Contact>(Contact.class);
        binder.setItemDataSource(new Contact());
        layout.addComponent(binder.buildAndBind("First name","firstName"));
        layout.addComponent(binder.buildAndBind("Last Name","lastName"));
        layout.addComponent(binder.buildAndBind("Gender","gender",ComboBox.class));
        layout.addComponent(binder.buildAndBind("Group","group"));
        layout.addComponent(binder.buildAndBind("Adress","adress"));
        layout.addComponent(binder.buildAndBind("Birthdate","birthdate"));
        layout.addComponent(new Button("save contact", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Notification.show("save");
            }
        }));

        layout.addComponent(new Button("Reset Input", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                binder.clear();
            }
        }));

        layout.forEach(c->{
            if(c instanceof AbstractTextField){
                AbstractTextField abstractTextField= (AbstractTextField) c;
                abstractTextField.setNullRepresentation("");
            }
        });
        panel.setContent(layout);
        setCompositionRoot(panel);
    }

}

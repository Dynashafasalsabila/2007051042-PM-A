package com.example.recyclerview;
import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{
            {"Rx-King", "https://i.pinimg.com/originals/60/9d/8b/609d8b9f2306cde188ebc4851318dc1c.jpg"},
            {"Mio Sporty", "https://i.pinimg.com/originals/81/12/14/811214351bb519a23f6ec567297d5995.jpg"},
            {"Honda CBR", "https://i.pinimg.com/originals/42/5a/c6/425ac61b84d93c861797ec60d229ad67.jpg"},
            {"Aerox", "https://i.pinimg.com/originals/39/27/ed/3927ed218557cf6e300db8f86206f641.jpg"},
            {"Honda CGL", "https://i.pinimg.com/originals/3d/07/0e/3d070e85adc2ceaf1f04ecfe41232aa6.jpg"},
            {"Vespa Matic", "https://i.pinimg.com/originals/40/5c/e5/405ce53fdf8bb277218b3d2c4b6f7d47.jpg"},
            {"KLX", "https://i.pinimg.com/originals/07/7a/a9/077aa9327fbb744b75452d8f11f0b089.jpg"},
            {"Scoopy", "https://i.pinimg.com/originals/39/27/ed/3927ed218557cf6e300db8f86206f641.jpg"},
            {"Honda Beat", "https://i.pinimg.com/originals/0a/4b/0d/0a4b0dd5892bce92e0f2f351062f6647.jpg"},
            {"CBR", "https://i.pinimg.com/originals/dc/62/5c/dc625c9594fdb9b82a381e335f657fc6.jpg"}
};
    public static ArrayList<Contact> getListData(){
        Contact contact = null;
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
        contact = new Contact();
        contact.setName(data[i][0]);
        contact.setPhoto(data[i][1]);
        list.add(contact);
        }
        return list;
        }

}

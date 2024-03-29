package academits.coverter;

import academits.model.Contact;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class ContactConverter {
    private Gson gson = new GsonBuilder().create();

    public String convertToJson(List<Contact> contactList) {
        return gson.toJson(contactList);
    }

    public Contact convertFormJson(String contactJson) {
        return gson.fromJson(contactJson, Contact.class);
    }
}

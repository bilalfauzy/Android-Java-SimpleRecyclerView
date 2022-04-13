package com.bilalfauzi.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Mason Mount", "masonmount@gmail.com", "https://media.vivagoal.com/2021/11/Mason-Mount-Sudah-Tak-Betah-di-Chelsea-Siapa-Minat.jpeg"));
        contacts.add(new Contact("Lionel Messi","messi@gmail.com", "https://cdns.klimg.com/bola.net/library/upload/21/2021/04/645x430/lionel-messi-1_ff8e452.jpg"));
        contacts.add(new Contact("Timo Werner","timowerner@gmail.com", "https://img.okezone.com/content/2022/03/28/51/2569219/ketimbang-di-chelsea-timo-werner-lebih-nyaman-bersama-timnas-jerman-GDBcgDw2SM.jpg"));
        contacts.add(new Contact("Robert Lewandowski","lewandowski@gmail.com", "https://cdns.klimg.com/bola.net/library/upload/21/2021/11/645x430/robert-lewandowski_9c2e2fa.jpg"));
        contacts.add(new Contact("Cristiano Ronaldo","cr7@gmail.com", "https://img.okezone.com/content/2022/04/10/45/2576390/handphone-anak-kecil-dibanting-cristiano-ronaldo-usai-manchester-united-kalah-cr7-saya-minta-maaf-EdnQ4OMZXb.JPG"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new LinearLayoutManager(this));

    }
}
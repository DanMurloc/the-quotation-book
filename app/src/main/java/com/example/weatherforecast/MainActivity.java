package com.example.weatherforecast;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addCitat();
        addMem();
    }

    HashMap<Integer, String> citats = new HashMap<>();
    public void addCitat(){
        citats.put(1, "Если ты Лысый, то ты должен выпить");
        citats.put(2, "Всегда прыгает вверх, головой вниз");
        citats.put(3, "Когда ты думаешь что работа не волк");
        citats.put(4, "Отнюдь не правда, а правда правда");
        citats.put(5, "Я мужииииииииик");
        citats.put(6, "Че ты? плаки плаки?");
        citats.put(7, "Я ожидаю");
        citats.put(8, "Я Умераю");
        citats.put(9, "Сегодня гулял на улице и уведел такое!!!");
        citats.put(10, "Мы с тобой уже встречались?");
        citats.put(11, "Конечно я пойду за тобой, в то время я");
        citats.put(12, "Ты кто? ты он что ли?");
        citats.put(13, "Как дела?");
        citats.put(14, "Алкаш");
        citats.put(15, "Когда уже не можешь придумать цитату");
        citats.put(16, "ДЖОООООООН СИНА ");
        citats.put(17, "Ля какой");
        citats.put(18, "Ты кто? Никто");
        citats.put(19, "День первый");
        citats.put(20, "День последний");
        citats.put(21, "Что ты делал? Спал");
    }
    private HashMap<Integer, Integer> imageMap = new HashMap<>();
    public void addMem(){
        imageMap.put(1, R.drawable.mem);
        imageMap.put(2, R.drawable.mem2);
        imageMap.put(3, R.drawable.mem3);
        imageMap.put(4, R.drawable.mem4);
        imageMap.put(5, R.drawable.mem5);
        imageMap.put(6, R.drawable.mem6);
        imageMap.put(7, R.drawable.mem7);
        imageMap.put(8, R.drawable.mem8);
        imageMap.put(9, R.drawable.mem9);
        imageMap.put(10, R.drawable.mem10);
        imageMap.put(11, R.drawable.mem11);
        imageMap.put(12, R.drawable.mem12);
        imageMap.put(13, R.drawable.mem14);
        imageMap.put(15, R.drawable.mem15);
        imageMap.put(16, R.drawable.mem16);
        imageMap.put(17, R.drawable.mem17);
        imageMap.put(18, R.drawable.mem18);
        imageMap.put(19, R.drawable.mem19);
        imageMap.put(20, R.drawable.mem20);
        imageMap.put(21, R.drawable.mem21);
    }
    private Random random = new Random();

    public void onClick(View view){
        int randomKey = random.nextInt(citats.size()) + 1; // Если ключи в `citats` начинаются с 1
        Log.d("DEBUG", "Random key for citats: " + randomKey);
        String randomQuote = citats.get(randomKey);
        TextView contetn = findViewById(R.id.tvQuote);
        contetn.setText(randomQuote);
        ImageView imageView = findViewById(R.id.imageView);

        randomKey = random.nextInt(imageMap.size()) + 1; // Если ключи в `imageMap` начинаются с 1
        // Получение ресурса изображения по ключу
        Integer imageRes = imageMap.get(randomKey);
        // Установка изображения в ImageView
        imageView.setImageResource(imageRes);
    }

}
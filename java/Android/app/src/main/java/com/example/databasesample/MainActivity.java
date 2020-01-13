package com.example.databasesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 選択されたカクテルの主キーIDを表すフィールド。
     */
    int _cocktailID = -1;

    /**
     * 選択されたカクテル名を表すフィールド。
     */
    String _cocktailName = "";

    /**
     * カクテル名を表示するTextViewフィールド。
     */
    TextView _tvCocktailName;

    /**
     * [保存] ボタンフィールド。
     */
    Button _btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

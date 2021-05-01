package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edInicial, edFinal;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInicial = findViewById(R.id.TextNumberValorInicial);
        edFinal = findViewById(R.id.TextNumberValorFinal);
        textView = findViewById(R.id.textViewNumSorteado);
    }

    public void sortearNumero(View view) {
        int valorInicial, valorFinal;
        valorInicial = Integer.parseInt(edInicial.getText().toString());
        valorFinal = Integer.parseInt(edFinal.getText().toString());
        int numSorteado = new Random().nextInt(valorFinal - valorInicial + 1) + valorInicial;
        textView.setText(String.format(Integer.toString(numSorteado), "%d"));
    }
}
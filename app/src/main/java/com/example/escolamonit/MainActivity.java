package com.example.escolamonit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNome, edtDisc, edtNuma, edtNumf, edtN1, edtN2;
    Button btnResul, btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        edtDisc = findViewById(R.id.edtDisc);
        edtNuma = findViewById(R.id.edtNuma);
        edtNumf = findViewById(R.id.edtNumf);
        edtN1 = findViewById(R.id.edtNota1);
        edtN2 = findViewById(R.id.edtNota2);
        btnResul = findViewById(R.id.btnResul);
        btnLimpar = findViewById(R.id.btnLimpar);

        btnResul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1, n2, media, numF, numA, freq;
                n1 = Double.parseDouble(
                        edtN1.getText().toString());
                n2 = Double.parseDouble(
                        edtN2.getText().toString());
                media = (n1 * 2 + n2 * 4) / 6;
                numA = Double.parseDouble(
                        edtNuma.getText().toString());
                numF = Double.parseDouble(
                        edtNumf.getText().toString());
                freq = ((numA - numF) / numA) * 100;
                if (media >= 7 && freq >= 75) {
                    Toast.makeText(MainActivity.this,
                            "A nota média do aluno " + edtNome.getText().toString() + " foi " + media
                                    + " E sua frequencia foi de " + freq + "% Aprovado",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            " Resultado: " + edtNome.getText().toString()
                                    + " Nota: " + media + " Freq: " + freq + " Reprovado",
                            Toast.LENGTH_LONG).show();
                }

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNome.setText(null);
                edtDisc.setText(null);
                edtNuma.setText(null);
                edtNumf.setText(null);
                edtN1.setText(null);
                edtN2.setText(null);
            }

        });

    }
}
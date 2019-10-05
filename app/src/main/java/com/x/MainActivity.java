package com.x;
/**
 *            .,,       .,:;;iiiiiiiii;;:,,.     .,,
 *          rGB##HS,.;iirrrrriiiiiiiiiirrrrri;,s&##MAS,
 *         r5s;:r3AH5iiiii;;;;;;;;;;;;;;;;iiirXHGSsiih1,
 *            .;i;;s91;;;;;;::::::::::::;;;;iS5;;;ii:
 *          :rsriii;;r::::::::::::::::::::::;;,;;iiirsi,
 *       .,iri;;::::;;;;;;::,,,,,,,,,,,,,..,,;;;;;;;;iiri,,.
 *    ,9BM&,            .,:;;:,,,,,,,,,,,hXA8:            ..,,,.
 *   ,;&@@#r:;;;;;::::,,.   ,r,,,,,,,,,,iA@@@s,,:::;;;::,,.   .;.
 *    :ih1iii;;;;;::::;;;;;;;:,,,,,,,,,,;i55r;;;;;;;;;iiirrrr,..
 *   .ir;;iiiiiiiiii;;;;::::::,,,,,,,:::::,,:;;;iiiiiiiiiiiiri
 *   iriiiiiiiiiiiiiiii;;;::::::::::::::::;;;iiiiiiiiiiiiiiiir;
 *  ,riii;;;;;;;;;;;;;:::::::::::::::::::::::;;;;;;;;;;;;;;iiir.
 *  iri;;;::::,,,,,,,,,,:::::::::::::::::::::::::,::,,::::;;iir:
 * .rii;;::::,,,,,,,,,,,,:::::::::::::::::,,,,,,,,,,,,,::::;;iri
 * ,rii;;;::,,,,,,,,,,,,,:::::::::::,:::::,,,,,,,,,,,,,:::;;;iir.
 * ,rii;;i::,,,,,,,,,,,,,:::::::::::::::::,,,,,,,,,,,,,,::i;;iir.
 * ,rii;;r::,,,,,,,,,,,,,:,:::::,:,:::::::,,,,,,,,,,,,,::;r;;iir.
 * .rii;;rr,:,,,,,,,,,,,,,,:::::::::::::::,,,,,,,,,,,,,:,si;;iri
 *  ;rii;:1i,,,,,,,,,,,,,,,,,,:::::::::,,,,,,,,,,,,,,,:,ss:;iir:
 *  .rii;;;5r,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,sh:;;iri
 *   ;rii;:;51,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.:hh:;;iir,
 *    irii;::hSr,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,sSs:;;iir:
 *     irii;;:iSSs:.,,,,,,,,,,,,,,,,,,,,,,,,,,,..:135;:;;iir:
 *      ;rii;;:,r535r:...,,,,,,,,,,,,,,,,,,..,;sS35i,;;iirr:
 *       :rrii;;:,;1S3Shs;:,............,:is533Ss:,;;;iiri,
 *        .;rrii;;;:,;rhS393S55hh11hh5S3393Shr:,:;;;iirr:
 *          .;rriii;;;::,:;is1h555555h1si;:,::;;;iirri:.
 *            .:irrrii;;;;;:::,,,,,,,,:::;;;;iiirrr;,
 *               .:irrrriiiiii;;;;;;;;iiiiiirrrr;,.
 *                  .,:;iirrrrrrrrrrrrrrrrri;:.
 *                        ..,:::;;;;:::,,.
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    UserEntering[] enterings = new UserEntering[128];
    short i = 0;
    UserEntering temp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt0 = findViewById(R.id.BT0);
        Button bt1 = findViewById(R.id.BT1);
        Button bt2 = findViewById(R.id.BT2);
        Button bt3 = findViewById(R.id.BT3);
        Button bt4 = findViewById(R.id.BT4);
        Button bt5 = findViewById(R.id.BT5);
        Button bt6 = findViewById(R.id.BT6);
        Button bt7 = findViewById(R.id.BT7);
        Button bt8 = findViewById(R.id.BT8);
        Button bt9 = findViewById(R.id.BT9);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("0");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("1");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("2");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("3");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("4");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("5");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("6");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("7");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("8");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("9");
                temp = UserEntering.getObj(UserEntering.part);
                if (temp != null) {
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });


        Button bt_add = findViewById(R.id.BT_add);
        Button bt_reduce = findViewById(R.id.BT_reduce);
        Button bt_times = findViewById(R.id.BT_times);
        Button bt_divide = findViewById(R.id.BT_divide);
        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("+");
                temp = UserEntering.getObj(UserEntering.part);
                enterings[i]=temp;
                i++;
            }
        });
        bt_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("-");
                temp = UserEntering.getObj(UserEntering.part);
                enterings[i]=temp;
                i++;
            }
        });
        bt_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("*");
                temp = UserEntering.getObj(UserEntering.part);
                enterings[i]=temp;
                i++;
            }
        });
        bt_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("/");
                temp = UserEntering.getObj(UserEntering.part);
                enterings[i]=temp;
                i++;
            }
        });
    }

    static double[] getResult(double a11, double a12, double b1,
                              double a21, double a22, double b2) {
        double m, ai22, bi2, x, y;
        m = a21 / a21;
        ai22 = a22 - m * a12;
        bi2 = b2 - m * b1;
        y = bi2 / ai22;
        x = (b1 - a12 * y) / a11;
        double[] result = new double[2];
        result[0] = x;
        result[1] = y;
        return result;
    }
}

class UserEntering {
    private String body;
    static String part = "";

    private UserEntering(String this_part) {
        this.body = this_part;
        this_part = "";
    }

    static String getEntering(String string) {
        if (string.equals("+") | string.equals("-")
                | string.equals("*") | string.equals("/")) {
            part = part.concat(string);
            part = part.concat("^");
        } else {
            part = part.concat(string);
        }
        return part;
    }

    static UserEntering getObj(String inner) {
        if (inner.charAt(inner.length() - 1) == '^') {
            return new UserEntering(inner);
        }
        return null;
    }
}
package com.x;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    UserEntering[] enterings = new UserEntering[128];
    short i = 0;
    UserEntering temp = null;

    static void displayAllEnters(UserEntering[] enterings, TextView textView) {
        String str = "";
        for (UserEntering entering : enterings) {
            if (entering != null) {
                str = str.concat(entering.body).concat("");
            }
        }
        textView.setText(str);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt0 = findViewById(R.id.BT0);
        final Button bt1 = findViewById(R.id.BT1);
        final Button bt2 = findViewById(R.id.BT2);
        final Button bt3 = findViewById(R.id.BT3);
        final Button bt4 = findViewById(R.id.BT4);
        final Button bt5 = findViewById(R.id.BT5);
        final Button bt6 = findViewById(R.id.BT6);
        final Button bt7 = findViewById(R.id.BT7);
        final Button bt8 = findViewById(R.id.BT8);
        final Button bt9 = findViewById(R.id.BT9);

        final Button btx = findViewById(R.id.BT_x);
        final Button bty = findViewById(R.id.BT_y);

        final TextView textX = findViewById(R.id.text_x);
        final TextView textY = findViewById(R.id.text_y);


        final Button bt_add = findViewById(R.id.BT_add);
        final Button bt_reduce = findViewById(R.id.BT_reduce);
        final Button bt_times = findViewById(R.id.BT_times);
        final Button bt_divide = findViewById(R.id.BT_divide);
        final Button bt_equals = findViewById(R.id.BT_equals);


        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("0");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("1");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("2");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("3");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("4");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("5");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("6");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("7");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("8");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("9");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });


        bt_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer,bt_add,bt_reduce,
                        bt_times,bt_divide);
                    enterings[i] = temp;
                    i++;
                    UserEntering.computer = "";
                }
                if (UserEntering.part != null){
                    UserEntering temp_last = new UserEntering(UserEntering.part);
                    enterings[i] = temp_last;
                    i++;
                }
                displayAllEnters(enterings, textX);
            }
        });
        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("+");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer,bt_add,bt_reduce,
                        bt_times,bt_divide);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("-");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer,bt_add,bt_reduce,
                        bt_times,bt_divide);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("*");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer,bt_add,bt_reduce,
                        bt_times,bt_divide);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("/");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer,bt_add,bt_reduce,
                        bt_times,bt_divide);
                    enterings[i] = temp;
                    i++;
                }
            }
        });

        btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("x");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("y");
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce,
                        bt_times,bt_divide);
                if (temp != null) {
                    enterings[i] = temp;
                    i++;
                }
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
    String body;
    static String computer = "";
    static String part = "";
    UserEntering(String this_part) {
        this.body = this_part;
    }

    static String getEntering(String string) {
        if (string.equals("+") | string.equals("-")
                | string.equals("*") | string.equals("/")) {
            part = part.concat("^");
            computer = computer.concat(string).concat(" ");
        } else {
            part = part.concat(string);
        }
        return part;
    }

    static UserEntering getObj(String inner,Button bt_add,
                               Button bt_reduce,Button bt_times,Button bt_divide) {
        if (inner.charAt(inner.length() - 1) == '^') {
            UserEntering temp = new UserEntering(inner.substring(0, inner.length() - 1));
            UserEntering.part = "";
            return temp;
        } else if (inner.trim().equalsIgnoreCase("+") |
                inner.trim().equalsIgnoreCase("-") |
                inner.trim().equalsIgnoreCase("*") |
                inner.trim().equalsIgnoreCase("/")) {
            UserEntering temp_com = new UserEntering(inner);
            UserEntering.computer = "";
            bt_add.setEnabled(false);
            bt_reduce.setEnabled(false);
            bt_times.setEnabled(false);
            bt_divide.setEnabled(false);
            return temp_com;
        }else {
            bt_add.setEnabled(true);
            bt_reduce.setEnabled(true);
            bt_times.setEnabled(true);
            bt_divide.setEnabled(true);
        }

        return null;
    }
}


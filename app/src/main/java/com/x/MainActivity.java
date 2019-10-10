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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    UserEntering[] enterings = new UserEntering[128];
    short i = 0;
    UserEntering temp = null;
    UserEntering[] enterings0;

    static void displayAllEnters(UserEntering[] enterings, TextView textView) {
        UserEntering[] enterings1 = UserEntering.groupByOperator(enterings, true);
        String temp = "";
        for (UserEntering enterings2 : enterings1) {
            if (enterings2 != null) {
                temp = temp.concat(enterings2.body);
            }
        }
        textView.setText(temp);
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
        final Button bt_clean = findViewById(R.id.BT_clean);
        final Button bt_is = findViewById(R.id.BT_is);
        final Button bt_ch = findViewById(R.id.BT_change);


        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("0");
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
                if (temp != null) {
                    UserEntering.part = "";
                    enterings[i] = temp;
                    i += 1;
                }
            }
        });

        bt_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!UserEntering.part.trim().equalsIgnoreCase("")){
                    enterings[i]=UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                            bt_times, bt_divide,true);
                    i++;
                }
                enterings[i] = new UserEntering("^");
                i++;
            }
        });
        bt_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = UserEntering.getObj(UserEntering.part,bt_add,bt_reduce
                        ,bt_times,bt_divide,true);
                if (temp != null){enterings[i] = temp;
                i++;}
                temp = new UserEntering("=");
                enterings[i]=temp;
                i++;
            }
        });
        bt_is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!UserEntering.part.trim().equalsIgnoreCase("")){
                    enterings[i]=UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                            bt_times, bt_divide,true);
                    i++;
                }
                int a11,a12,a21,a22,b1,b2;
                String whole="";
                for(UserEntering enter:enterings){
                    if(enter!=null){
                        whole=whole.concat(enter.body.trim());
                    }
                }
                String whole1 = whole.substring(0,whole.indexOf('^'));
                String whole2 = whole.substring(whole.indexOf('^')+1);
                a11 = Integer.parseInt(whole1.substring(0,whole1.indexOf('x')));
                a12 = Integer.parseInt(whole1.substring(whole1.indexOf('x')+2,whole1.indexOf('y')));
                b1 = Integer.parseInt(whole1.substring(whole1.indexOf('=')+1));
                a21 = Integer.parseInt(whole2.substring(0,whole2.indexOf('x')));
                a22 = Integer.parseInt(whole2.substring(whole2.indexOf('x')+2,whole2.indexOf('y')));
                b2 = Integer.parseInt(whole1.substring(whole2.indexOf('=')+1));
            }
        });

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("+");
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer, bt_add, bt_reduce,
                            bt_times, bt_divide,false);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("-");
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer, bt_add, bt_reduce,
                            bt_times, bt_divide,false);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("*");
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer, bt_add, bt_reduce,
                            bt_times, bt_divide,false);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("/");
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
                enterings[i] = temp;
                i++;
                if (!UserEntering.computer.equalsIgnoreCase("")) {
                    temp = UserEntering.getObj(UserEntering.computer, bt_add, bt_reduce,
                            bt_times, bt_divide,false);
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (UserEntering temp : enterings) {
                    temp = null;
                }
                UserEntering.part = "";
                UserEntering.computer = "";
            }
        });

        btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserEntering.part = UserEntering.getEntering("x");
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
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
                temp = UserEntering.getObj(UserEntering.part, bt_add, bt_reduce,
                        bt_times, bt_divide,false);
                if (temp != null) {
                    enterings[i] = temp;
                    i++;
                }
            }
        });
        bt_add.setEnabled(false);
        bt_reduce.setEnabled(false);
        bt_times.setEnabled(false);
        bt_divide.setEnabled(false);
    }


    static int[] getResult(int a11, int a12, int b1,
                           int a21, int a22, int b2) {
        int m, ai22, bi2, x, y;
        m = a21 / a11;
        ai22 = a22 - m * a12;
        bi2 = b2 - m * b1;
        y = bi2 / ai22;
        x = (b1 - a12 * y) / a11;
        int[] result = new int[2];
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

    static UserEntering getObj(String inner, Button bt_add,
                               Button bt_reduce, Button bt_times, Button bt_divide,boolean force) {
        if(force){
            UserEntering temp = new UserEntering(UserEntering.part);
            UserEntering.part="";
            return temp;
        }
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
        } else if(inner.trim().equalsIgnoreCase("=")){
            return new UserEntering(inner.trim());
        }
        else {
            bt_add.setEnabled(true);
            bt_reduce.setEnabled(true);
            bt_times.setEnabled(true);
            bt_divide.setEnabled(true);
        }

        return null;
    }

    static UserEntering[] groupByOperator(UserEntering[] args, boolean forced) {
        UserEntering[] groupedEnter = new UserEntering[128];
        String temp = "";
        int i = 0;
        for (UserEntering enter : args) {
            if (enter != null) {
                if (enter.body.trim().equalsIgnoreCase("+")
                        | enter.body.trim().equalsIgnoreCase("-")) {
                    groupedEnter[i] = new UserEntering(temp);
                    i++;
                    temp = enter.body.trim();
                } else {
                    temp = temp.concat(enter.body);
                }
            }
        }
        if (forced) {
            groupedEnter[i] = new UserEntering(temp);
        }
        return groupedEnter;
    }

}


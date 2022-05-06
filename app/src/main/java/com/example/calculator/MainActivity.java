package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private TextView screen;
    private Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0;
    private Button ac, c, percentage, prentLift, prentRight, equal, dot, n,tenX,
            sin, cos, tan, in, log, x, x2, correct, x1, addition, subtraction, multiplication, division;
    private boolean mPrecentage,mdot,mPrentLift,mPrentRight, mSin, mCos, mTan, mCorrect, mX, mIn, mLog, mX2, mX1, mN, mAddition,
            mSubtraction, mMulti, mDivision;
    private double valueOne;
    private double valueTwo;
    private int total;
    private String pi = "3.14159265";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = findViewById(R.id.tvmain);

        ac = findViewById(R.id.bAC);
        c = findViewById(R.id.delete);
        percentage = findViewById(R.id.percentage);
        prentRight = findViewById(R.id.parenthesisR);
        prentLift = findViewById(R.id.parenthesisL);
        sin = findViewById(R.id.sinbt);
        cos = findViewById(R.id.cosbt);
        tan = findViewById(R.id.tanbt);
        in = findViewById(R.id.inbt);
        x = findViewById(R.id.xbt);
        x2 = findViewById(R.id.x2bt);
        correct = findViewById(R.id.correctbt);
        x1 = findViewById(R.id.x1bt);
        log = findViewById(R.id.logbt);
        division = findViewById(R.id.div);
        multiplication = findViewById(R.id.multip);
        subtraction = findViewById(R.id.subt);
        addition = findViewById(R.id.add);
        n = findViewById(R.id.nBt);
        equal = findViewById(R.id.equalBt);
        dot = findViewById(R.id.dotBt);
        tenX=findViewById(R.id.tenXbt);


        n0 = findViewById(R.id.zero);
        n1 = findViewById(R.id.one);
        n2 = findViewById(R.id.two);
        n3 = findViewById(R.id.three);
        n4 = findViewById(R.id.four);
        n5 = findViewById(R.id.five);
        n6 = findViewById(R.id.six);
        n7 = findViewById(R.id.seven);
        n8 = findViewById(R.id.eight);
        n9 = findViewById(R.id.nine);
//=================================================================================================

        //This method onClickListener numbers,dot,(,)
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String de= screen.getText()+"";
                int len = de.length();
                if (len>0){
                    de =de.substring(0,len-1);
                }
                screen.setText(de);
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"1");
             //   n1.setBackground(getResources().getDrawable(R.drawable.value_shape2));
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("5");

            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("6");

            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("0");
            }
        });

        prentLift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+")");
            }
        });
        prentRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"(");
            }
        });
        //========================================================================================
//this Method execute button equal implement operation Mathematical(+,_,*,/...etc)
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo =Integer.parseInt(screen.getText()+"");
                if (mAddition==true){
                    screen.setText(AdditionValue(valueOne,valueTwo)+"");
                    mAddition=false;
                }

                if (mSubtraction==true){
                    screen.setText(SubtractionValue(valueOne,valueTwo)+"");
                    mSubtraction=false;
                }
                if (mMulti==true){
                    screen.setText(MutiplicationValue( valueOne,valueTwo)+"");
                    mDivision=false;
                }
                if (mDivision==true){
                    screen.setText(DivisionValue(valueOne,valueTwo)+"");
                    mDivision=false;
                }
            }

        });

        //======================================================================================
        //this method execute operation System.
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen==null){
                    screen.setText("");
                }else {
                    valueOne =Double.parseDouble(screen.getText().toString());
                    mAddition=true;
                    screen.setText(null);
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText()+"");
                mSubtraction=true;
                screen.setText(null);
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText().toString());
                mMulti=true;
                screen.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText().toString());
                mDivision=true;
                screen.setText(null);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(PersentageValue(valueOne));
                screen.setText(text);

            }
        });
//this method execute append dot in calculator.
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText().toString());
                mdot=true;
                screen.setText(screen.getText()+".");
//                Button dot ;
                String text = screen.getText().toString();
                if (text.subSequence(0,1).equals("."))
                    text="0" + text;
                screen.setText(text);
            }
        });
//This method execute button n in calculator is pi=3.14159265
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+pi);
            }
        });
//this method execute button sin in calculator
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne= Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(sinValue((int) valueOne));
                screen.setText(text);
            }
        });
 //this method execute button cos in calculator
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne= Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(cosValue((int) valueOne));
                screen.setText(text);
            }
        });
 //this method execute button tan in calculator
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne= Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(sinValue((int) valueOne));
                screen.setText(text);
            }
        });
//This Method execute button x in calculator this factorial.
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne= Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(factorial((int) valueOne));
                screen.setText(text);

            }
        });
//this method execute x2 in calculator
        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne= Double.parseDouble(screen.getText().toString());
                String text=String.valueOf(squareValue((int) valueOne));
                screen.setText(text);
            }
        });
        //this is square in calculator.
        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(Math.sqrt(valueOne));
                screen.setText(text);
            }
        });
    //This method execute Math.log in calculator
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(Math.log(valueOne));
                screen.setText(text);
            }
        });
    //this method in execute 1/number
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result= 1/valueOne;
                valueOne = Double.parseDouble(screen.getText().toString());
                String text = String.valueOf(result);
                screen.setText(text);
            }
        });
    //This Method execute button 10X by Math.pow
        tenX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = 0;
                valueOne = Double.parseDouble(screen.getText().toString());
                String text=String.valueOf(multiTen((int) valueOne));
                screen.setText(text);
            }
        });


    }

// ==============================================================================================
        //this method addition between two numbers  then recall in method equal to execute addition.
        public double AdditionValue ( double numOne, double numTwo){
            return  numOne+numTwo;
    }

        public double SubtractionValue(double numOne, double numTwo) {
        if (numTwo==0)
            return numOne;
        else
            return SubtractionValue(numOne-1,numTwo-1);
        }

        public int MutiplicationValue(double numOne ,double numTwo){
            return (int) (numOne * numTwo);
        }

        public double DivisionValue(double numOne,double numTwo){
        return numOne / numTwo;
        }

        //this method implement persentage number, then recall in method equal to execute %
        public double PersentageValue ( double numOne){

            return numOne/100;
        }

        public void dotValue(){
        Button dot;
        String text = screen.getText().toString();
        if (text.subSequence(0,1).equals("."))
            text="0" + text;
        screen.setText(text);
        }
//this method execute sin
        public double sinValue(int num){
        double x = num;
            double radians=Math.toRadians(x);
            double sin = Math.sin(radians);
        return sin;
        }
    //this method execute cos
         public double cosValue(int num){
        double x = num;
        double radians=Math.toRadians(x);
        double sin = Math.cos(radians);
        return sin;
    }
    //this method execute tan
         public double tanValue(int num){
        double x = num;
        double radians=Math.toRadians(x);
        double sin = Math.tan(radians);
        return sin;
    }

    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    public double squareValue(int num){
        double result =num*num;
        return result;
    }

    public int multiTen(int num){
        return (int) Math.pow(10,num);
    }





}

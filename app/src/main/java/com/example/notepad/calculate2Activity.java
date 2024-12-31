package com.example.notepad;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class calculate2Activity extends AppCompatActivity {
    private TextView input;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_calculate);
        input = this.findViewById(R.id.input);
        result = this.findViewById(R.id.result);
    }
    String input1 = "";
    String oper = "";
    String input2 = "";
    boolean flag = false;
    boolean input1_flag = false;
    public void oneOnClick(View view){
        if(view instanceof TextView){
            String oneText = ((TextView)view).getText().toString();
            if(flag){
                switch (oneText){
                    case "C":
                        input.setText("");
                        result.setText("");
                        input1 = "";
                        input2 = "";
                        oper ="";
                        input1_flag=false;
                        flag=false;
                        break;
                }
            }else{
                switch (oneText){
                    case "+/-":
                        break;
                    case "%":
                        break;
                    case "1":
                        if(!input1_flag){
                            input1 += "1";
                            input.setText(input1);
                        }else{
                            input2 += "1";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "2":
                        if(!input1_flag){
                            input1 += "2";
                            input.setText(input1);
                        }else{
                            input2 += "2";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "3":
                        if(!input1_flag){
                            input1 += "3";
                            input.setText(input1);
                        }else{
                            input2 += "3";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "4":
                        if(!input1_flag){
                            input1 += "4";
                            input.setText(input1);
                        }else{
                            input2 += "4";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "5":
                        if(!input1_flag){
                            input1 += "5";
                            input.setText(input1);
                        }else{
                            input2 += "5";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "6":
                        if(!input1_flag){
                            input1 += "6";
                            input.setText(input1);
                        }else{
                            input2 += "6";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "7":
                        if(!input1_flag){
                            input1 += "7";
                            input.setText(input1);
                        }else{
                            input2 += "7";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "8":
                        if(!input1_flag){
                            input1 += "8";
                            input.setText(input1);
                        }else{
                            input2 += "8";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "9":
                        if(!input1_flag){
                            input1 += "9";
                            input.setText(input1);
                        }else{
                            input2 += "9";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "0":
                        if(!input1_flag){
                            input1 += "0";
                            input.setText(input1);
                        }else{
                            input2 += "0";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case ".":
                        if(!input1_flag){
                            input1 += ".";
                            input.setText(input1);
                        }else{
                            input2 += ".";
                            input.setText(input1+oper+input2);
                        }
                        break;
                    case "÷":
                        oper = "÷";
                        input1_flag = true;
                        input.setText(input1+oper+input2);
                        break;
                    case "*":
                        oper = "*";
                        input1_flag = true;
                        input.setText(input1+oper+input2);
                        break;
                    case "-":
                        oper = "-";
                        input1_flag = true;
                        input.setText(input1+oper+input2);
                        break;
                    case "+":
                        oper = "+";
                        input1_flag = true;
                        input.setText(input1+oper+input2);
                        break;
                    case "=":
                        float num1 = Float.valueOf(input1).floatValue();
                        float num2 = Float.valueOf(input2).floatValue();
                        if(oper.equals("+")){
                            flag = true;
                            result.setText(String.valueOf(num1+num2));
                        }
                        else if(oper.equals("-")){
                            flag = true;
                            result.setText(String.valueOf(num1-num2));
                        }
                        else if(oper.equals("*")){
                            flag = true;
                            result.setText(String.valueOf(num1*num2));
                        }
                        if(oper.equals("÷")){
                            if (num2 == 0) {
                                Toast.makeText(calculate2Activity.this, "除数不能为0", Toast.LENGTH_LONG).show();
                            }else{
                                flag = true;
                                result.setText(String.valueOf(num1/num2));
                            }
                        }
                        break;
                }
            }

        }
    }
}

package com.example.user.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DollarActivity extends AppCompatActivity {

    float a;

    Spinner spinner;
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar);

        spinner = (Spinner) findViewById(R.id.spinner_dollar);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Angolan Kwanza
                if(position==0){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/318.52;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                    // Reversing It
                    button = (Button) findViewById(R.id.btn_reverse_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            editText = (EditText) findViewById(R.id.edit_text_dollar);
                            editText.setText("");
                            double reverse_result = result*318.52;
                            textView.setText(String.valueOf(reverse_result));
                        }
                    });
                        }
                    });
                }


                // Argentine Peso
                if(position==1){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/43.7;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*43.7;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Australian Dollar
                if(position==2){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/1.4;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*1.4;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Bitcoin Cash
                if(position==3){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/0.0032;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*0.0032;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Brazilean Real
                if(position==4){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/3.85;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*3.85;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Chinese Yuan
                if(position==5){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/6.72;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*6.72;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Egyptian Pound
                if(position==6){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/17.32;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*17.32;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Ghanian Cedi
                if(position==7){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/5.22;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*5.22;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Indian Rupee
                if(position==8){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/69.91;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*69.91;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Liberian Dollar
                if(position==9){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/164;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*164;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Mauritian Rupee
                if(position==10){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/34.82;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*34.82;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // NIGERIAN NAIRA
                if(position==11){
                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_dollar);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/360;
                            textView = (TextView) findViewById(R.id.text_view_dollar);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_dollar);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_dollar);
                                    editText.setText("");
                                    double reverse_result = result*360;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


        // Reseting the textview
        button = (Button) findViewById(R.id.btn_reset_dollar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = (EditText) findViewById(R.id.edit_text_dollar);
                editText.setText("");
                textView = (TextView) findViewById(R.id.text_view_dollar);
                textView.setText("");
            }
        });
    }
}

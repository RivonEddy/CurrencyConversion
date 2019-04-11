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

public class BritishPoundActivity extends AppCompatActivity {

    float a;

    Spinner spinner;
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_british_pound);

        spinner = (Spinner) findViewById(R.id.spinner_pound_sterling);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Angolan Kwanza
                if (position == 0) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/415.76;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*415.76;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Argentine Peso
                if (position == 1) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/56.63;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*56.63;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Australian Dollar
                if (position == 2) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/1.83;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*1.83;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Bitcoin Cash
                if (position == 3) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/0.0044;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*0.0044;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Brazilean Real
                if (position == 4) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/5.03;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*5.03;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Chinese Yuan
                if (position == 5) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/8.76;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*8.76;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Egyptian Pound
                if (position == 6) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/22.62;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*22.62;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Ghanian Cedi
                if (position == 7) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/6.81;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*6.81;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Indian Rupee
                if (position == 8) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/90.41;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*90.41;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Liberian Dollar
                if (position == 9) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/214.09;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*214.09;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Mauritian Rupee
                if (position == 10) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/45.49;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*45.49;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // NIGERIAN NAIRA
                if (position == 11) {
                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_pound_sterling);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/469.94;
                            textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_pound_sterling);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                                    editText.setText("");
                                    double reverse_result = result*469.94;
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
        button = (Button) findViewById(R.id.btn_reset_pound_sterling);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = (EditText) findViewById(R.id.edit_text_pound_sterling);
                editText.setText("");
                textView = (TextView) findViewById(R.id.text_view_pound_sterling);
                textView.setText("");
            }
        });
    }
}

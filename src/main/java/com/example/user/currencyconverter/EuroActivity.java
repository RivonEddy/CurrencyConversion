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

public class EuroActivity extends AppCompatActivity {

    float a;

    Spinner spinner;
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        spinner = (Spinner) findViewById(R.id.spinner_euro);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Angolan Kwanza
                if (position == 0) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/358.73;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*358.73;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Argentine Peso
                if (position == 1) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/48.86;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*48.86;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Australian Dollar
                if (position == 2) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/1.58;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*1.58;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Bitcoin Cash
                if (position == 3) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/0.0037;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*0.0037;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Brazilean Real
                if (position == 4) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/4.34;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*4.34;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Chinese Yuan
                if (position == 5) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/7.56;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*7.56;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Egyptian Pound
                if (position == 6) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/19.52;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*19.52;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Ghanian Cedi
                if (position == 7) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/5.88;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*5.88;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Indian Rupee
                if (position == 8) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/78.03;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*78.03;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Liberian Dollar
                if (position == 9) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/184.72;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*184.72;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // Mauritian Rupee
                if (position == 10) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/39.25;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*39.25;
                                    textView.setText(String.valueOf(reverse_result));
                                }
                            });
                        }
                    });
                }


                // NIGERIAN NAIRA
                if (position == 11) {
                    editText = (EditText) findViewById(R.id.edit_text_euro);
                    editText.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
                    button = (Button) findViewById(R.id.btn_convert_euro);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            double a = Double.parseDouble(editText.getText().toString());
                            final double result = a/405.49;
                            textView = (TextView) findViewById(R.id.text_view_euro);
                            textView.setText(String.valueOf(result));

                            // Reversing It
                            button = (Button) findViewById(R.id.btn_reverse_euro);
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    editText = (EditText) findViewById(R.id.edit_text_euro);
                                    editText.setText("");
                                    double reverse_result = result*405.49;
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
        button = (Button) findViewById(R.id.btn_reset_euro);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = (EditText) findViewById(R.id.edit_text_euro);
                editText.setText("");
                textView = (TextView) findViewById(R.id.text_view_euro);
                textView.setText("");
            }
        });
    }
}

//package com.example.daybuddyai;
//
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageButton;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.daybuddyai.R;
//
//import java.io.BufferedInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class ChatGPTActivity extends AppCompatActivity {
//
//    private EditText inputEditText;
//    private TextView outputTextView;
//    private ImageButton generateButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        inputEditText = findViewById(R.id.input_text);
//        outputTextView = findViewById(R.id.output_text);
//        generateButton = findViewById(R.id.generate_button);
//
//        generateButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String prompt = inputEditText.getText().toString().trim();
//                if (!prompt.isEmpty()) {
//                    new GPTRequestTask().execute(prompt);
//                }
//            }
//        });
//    }
//
//    private class GPTRequestTask extends AsyncTask<String, Void, String> {
//
//        @Override
//        protected String doInBackground(String... prompts) {
//            try {
//                URL url = new URL("https://api.openai.com/v1/engines/gpt-3.5-turbo/completions");
//                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//                urlConnection.setRequestMethod("POST");
//                urlConnection.setRequestProperty("Content-Type", "application/json");
//                urlConnection.setRequestProperty("Authorization", "Bearer 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");
//
//                // Set up the input data
//                String inputData = "{\"prompt\": \"" + prompts[0] + "\"}";
//
//                // Enable input and output streams for the connection
//                urlConnection.setDoOutput(true);
//                DataOutputStream os = new DataOutputStream(urlConnection.getOutputStream());
//                os.writeBytes(inputData);
//                os.flush();
//                os.close();
//
//                // Read the response from the OpenAI API
//                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
//                // Parse and return the response as needed
//                // For simplicity, we are converting the InputStream to String here.
//                return convertInputStreamToString(in);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//                return "Error: " + e.getMessage();
//            }
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            outputTextView.setText(result);
//        }
//    }
//
//    private String convertInputStreamToString(InputStream inputStream) {
//        // Convert InputStream to String
//        // This is a simple conversion, and in a real app, you may need to use a more robust method.
//        java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
//        return s.hasNext() ? s.next() : "";
//    }
//}

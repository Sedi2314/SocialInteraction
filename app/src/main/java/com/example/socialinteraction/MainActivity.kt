package com.example.socialinteraction

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var socialInput: EditText
    lateinit var socialOutput: TextView
    lateinit var btnReset: Button
    lateinit var btnSubmit:Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        socialInput =findViewById(R.id.socialInput)
        socialOutput=findViewById(R.id.socialOutput)
        btnReset=findViewById(R.id.btnReset)
        btnSubmit=findViewById(R.id.btnSubmit)


        btnReset.setOnClickListener {
            socialInput.text.clear()
            socialOutput.setText("")

        }






            btnSubmit.setOnClickListener{


                val socialInput = socialInput.text.toString().lowercase().trim()

                if (socialInput == "morning") {
                    socialOutput.setText("Good morning text to family member");

                } else if (socialInput == "mid morning"){
                    socialOutput.setText("Reach out to a colleague with a quick 'Thank you' ");
                }
                else if(socialInput == "afternoon"){
                    socialOutput.setText("Share a funny meme or interesting link with a friend");
                }
                else if(socialInput == "afternoon snack time"){
                    socialOutput.setText("Send a quick 'Thinking of you' messege");

                } else if(socialInput == "dinner"){
                    socialOutput.setText("Call a friend or relative for a 5 minute catchup");
                }
                else if(socialInput == "night"){
                    socialOutput.setText(" Leave a thoughtful comment on a friends post");

                }else if(socialInput == "afternoon dinner") {
                    socialOutput.setText(" Leave a thoughtful comment on a friends post");

                }else{
                    socialOutput.setText("Please enter correct time of day")
                }


            }













        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtmain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
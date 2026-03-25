package com.example.socialinteraction

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //this part of my code is where I declared my variables
    lateinit var socialInput: EditText
    lateinit var socialOutput: TextView
    lateinit var btnReset: Button
    lateinit var btnSubmit:Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        /*//Now that I have declared my variables I have typed a code for the variables to
         now actually display on the actual phone.*/
        setContentView(R.layout.activity_main)
        socialInput =findViewById(R.id.socialInput)
        socialOutput=findViewById(R.id.socialOutput)
        btnReset=findViewById(R.id.btnReset)
        btnSubmit=findViewById(R.id.btnSubmit)


// Reset button logic
        btnReset.setOnClickListener {
            socialInput.text.clear()
            socialOutput.setText("")

        }
/*//Submit button logic including the logic of the assignment where I used if
// statement conditions to create an app where if you type in a specific day of
// time it shows you what you are supposed yo to at that specific day of time
including my lase else statement which indicates what will happen if the user does
not type the right day of time it will tell them to input the correct day of time */
            btnSubmit.setOnClickListener{

                val socialInput = socialInput.text.toString().lowercase().trim()

                if (socialInput == "morning") {
                    Log.d("App debug","morning executed")
                    socialOutput.setText("Good morning text to family member");

                } else if (socialInput == "mid morning"){
                    Log.d("App debug","mid morning executed")
                    socialOutput.setText("Reach out to a colleague with a quick 'Thank you' ");
                }
                else if(socialInput == "afternoon"){
                    Log.d("App debug","afternoon executed")
                    socialOutput.setText("Share a funny meme or interesting link with a friend");
                }
                else if(socialInput == "afternoon snack time"){
                    Log.d("App debug","afternoon snack time executed")
                    socialOutput.setText("Send a quick 'Thinking of you' message");

                } else if(socialInput == "dinner"){
                    Log.d("App debug","dinner executed")
                    socialOutput.setText("Call a friend or relative for a 5 minute catchup");
                }
                else if(socialInput == "night"){
                    Log.d("App debug"," night executed")
                    socialOutput.setText(" Leave a thoughtful comment on a friend's post");

                }else if(socialInput == "afternoon dinner") {
                    Log.d("App debug","afternoon dinner executed")
                    socialOutput.setText(" Leave a thoughtful comment on a friends post");

                }else {
                    Log.d("App debug", "Invalid input received")
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
package com.vnpay.hungtd1traning

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.lang.Exception
import java.nio.charset.Charset
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validateUserPassword()
    }


    private fun validateUserPassword() {
        val edUsername = findViewById<EditText>(R.id.edUsername)
        val edPassword = findViewById<EditText>(R.id.edPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener {


              if (edUsername.text.trim().isEmpty()) {
                Toast.makeText(this, "Quý khách vui lòng nhập Tên đăng nhập", Toast.LENGTH_SHORT)
                    .show()
            } else if (edPassword.text.trim().isEmpty()) {
                Toast.makeText(this, "Quý khách vui lòng nhập Mật khẩu", Toast.LENGTH_SHORT).show()
            }
            else if (edPassword.text.toString().length < 6){
                Toast.makeText(this,"Mật khẩu không phù hợp: Quý khách vui lòng nhập lại\n",Toast.LENGTH_SHORT).show()
            }
            else {
                  val intent = Intent(this, OtpvrfActivity::class.java)
                  startActivity(intent)
            }
        }
    }

}








//            try {
//                val obj = JSONArray(loadJSONFromAsset())
//                //   val useArray= obj.getJSONArray()
//                println(obj);
//
//            } catch (e: Exception) {
//
//            }
//        }
//    }
//
//    private fun loadJSONFromAsset(): String {
//    val json: String?
//    val inputStream = assets.open("Userpassword.json")
//        val size = inputStream.available()
//        val buffer = ByteArray(size)
//        val charset: Charset = Charsets.UTF_8
//        inputStream.read(buffer)
//        inputStream.close()
//        json = String(buffer, charset)
//    return ""

//private fun validateInfor(): Boolean {
//    val VpassWord = findViewById<EditText>(R.id.edPassword)
//    val textPassword = VpassWord.text.toString().trim()
//    val VuserName = findViewById<EditText>(R.id.edUsername)
//    val textUsername = VuserName.text.toString().trim()
//
//    if (VuserName.text.toString().isEmpty()) {
//        Toast.makeText(this, "Quý khách vui lòng nhập Tên đăng nhập", Toast.LENGTH_SHORT).show()
//    }
//    return true;
//    {
//        if ()
//    }
//}
package hr.ferit.mmfabing.inspiring_people.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import hr.ferit.mmfabing.inspiring_people.R
import hr.ferit.mmfabing.inspiring_people.R.layout.activity_new_person

class NewPersonActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_new_person)

        pickImage();



    }

    private fun pickImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_PICK_CODE)
    }

    companion object{
        private val IMAGE_PICK_CODE = 1000;
        private val PERMISION_CODE = 1001;
    }
}
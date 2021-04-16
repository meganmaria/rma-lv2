package hr.ferit.mmfabing.inspiring_people.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.mmfabing.inspiring_people.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var personBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


       personBinding = ActivityMainBinding.inflate(layoutInflater)
       personBinding.addPerson.setOnClickListener{addNewPerson()}
       setContentView(personBinding.root)



    }

    private fun addNewPerson() {
        val newPeopleIntent = Intent(this, NewPersonActivity::class.java)
        startActivity(newPeopleIntent)
    }
}
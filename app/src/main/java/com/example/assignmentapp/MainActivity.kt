package com.example.assignmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentapp.fragments.*
import com.google.android.material.navigation.NavigationBarView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cardsapp.Adapter1

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val searchFragment = SearchFragment()
    private val addFragment = AddFragment()
    private val chatFragment = ChatFragment()
    private val profileFragment = ProfileFragment()
//    private val settingsFragment = SettingsFragment()
//
//    private lateinit var layoutManager: RecyclerView.LayoutManager
//    private lateinit var adapter: RecyclerView.Adapter<Adapter1.ViewHolder>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)

//oldMethodDeprecated->nav.setOnNavigationItemSelectedListener
        NavigationBarView.OnItemSelectedListener{
            when (it.itemId){
                R.id.add -> replaceFragment(addFragment)
                R.id.home -> replaceFragment(homeFragment)
                R.id.chats -> replaceFragment(chatFragment)
                R.id.profile -> replaceFragment(profileFragment)
                R.id.search -> replaceFragment(searchFragment)
            }
            true
        }



//        layoutManager = LinearLayoutManager(this)
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.layoutManager = layoutManager
//
//        adapter = Adapter1()
//        recyclerView.adapter = adapter

    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment!=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, fragment)
            transaction.commit()
        }
    }


}

package com.example.uielements2

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.AdapterContextMenuInfo
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.uielementpart2.R
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var songsQueueArray: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        songsQueueArray = arrayOf("House of Balloons/Glass table girls", "High for this", "What you need", "Loft Music", "The Morning",
            "After Hours", "Blinding Lights", "Snowchild", "Alone again", "Too Late", "Dark Times", "Shameless", "Real Life", "Can't feel my face", "As you are")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsQueueArray)
        val songsQueueListView = findViewById<ListView>(R.id.songsQueueListView)
        songsQueueListView.adapter = adapter

        registerForContextMenu(songsQueueListView)
        songsQueueListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->  }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.songs_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.add_to_queue -> {
                val selectedItemOrder = item!!.order
                val selectedItemTitle = item.title

                val info = item.menuInfo as AdapterContextMenuInfo
                val listPosition = info.position
                if(listPosition == 0) {
                    val songname = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname", songname)
                    editor.commit()
                }
                else if(listPosition == 1){
                    val songname2 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname2", songname2)
                    editor.commit()
                }
                else if(listPosition == 2){
                    val songname3 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname3", songname3)
                    editor.commit()
                }
                else if(listPosition == 3){
                    val songname4 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname4", songname4)
                    editor.commit()
                }
                else if(listPosition == 4){
                    val songname5 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname5", songname5)
                    editor.commit()
                }
                else if(listPosition == 5){
                    val songname6 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname6", songname6)
                    editor.commit()
                }
                else if(listPosition == 6){
                    val songname7 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname7", songname7)
                    editor.commit()
                }
                else if(listPosition == 7){
                    val songname8 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname8", songname8)
                    editor.commit()
                }
                else if(listPosition == 8){
                    val songname9 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname9", songname9)
                    editor.commit()
                }
                else if(listPosition == 9){
                    val songname10 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname10", songname10)
                    editor.commit()
                }
                else if(listPosition == 10){
                    val songname11 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname11", songname11)
                    editor.commit()
                }
                else if(listPosition == 11){
                    val songname12 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname12", songname12)
                    editor.commit()
                }
                else if(listPosition == 12){
                    val songname13 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname13", songname13)
                    editor.commit()
                }
                else if(listPosition == 13){
                    val songname14 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname14", songname14)
                    editor.commit()
                }
                else if(listPosition == 14){
                    val songname15 = songsQueueArray[listPosition]
                    val preferences = getSharedPreferences("sharedPrefs", 0)
                    val editor = preferences.edit()
                    editor.putString("songname15", songname15)
                    editor.commit()
                }
                val snackbar = Snackbar.make(this.findViewById(R.id.songsQueueListView), "Navigate To Queue", Snackbar.LENGTH_LONG)
                snackbar.setAction("Go", View.OnClickListener {
                    startActivity(Intent(this, QueueActivity::class.java))
                })
                snackbar.show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.go_to_songs -> {
                true
            }
            R.id.go_to_albums -> {
                startActivity(Intent(this, AlbumActivity::class.java))
                true
            }
            R.id.go_to_queues -> {
                startActivity(Intent(this, QueueActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
package jn.menu

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.aplicacion.*
import kotlinx.android.synthetic.main.content.*
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {

    private lateinit var config: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        setSupportActionBar(toolbar)



        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        config = AppBarConfiguration(
            setOf(
                R.id.nav_principal, R.id.nav_pagina1, R.id.nav_pagina2
            ), drawer_layout
        )
        setupActionBarWithNavController(navController, config)
        nav_view.setupWithNavController(navController)
    }



    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(config) || super.onSupportNavigateUp()
    }
}

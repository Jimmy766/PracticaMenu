package jn.menu.vistas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import jn.menu.R

class Pagina2 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.pagina2, container, false)
        val textView: TextView = root.findViewById(R.id.texto3)
        textView.text="pagina 2"
        return root
    }
}
package edu.temple.adapterviewapp

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class NumberAdapter(_context: Context, _n: Int) : BaseAdapter (){

    val context = _context
    val n = _n

    override fun getCount(): Int {
        return n
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val textView = TextView(context)

        textView.text = p0.toString()

        return textView
    }
}
package com.emrealtunbilek.layoutinflationkonuanlatimi

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inflate methoduna erişmek için farklı methodlar mevcuttur, istediğinizi kullanabilirsiniz.
        var inflater=layoutInflater
       // var inflater2=LayoutInflater.from(this)
        //var inflater3=getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        //dönüştürme işlemi yapılır ama bir root'a atanmaz, bunu kendimiz addview diyerek yapmamız gerekiyor.
        var view=inflater.inflate(R.layout.layout_text_view, null)
        //view nesnesinde textview var
        //root null
        //layoutparams null

        //dönüştürdüğümüz view'ı bir viewgroupa eklediğimizde, eklenilen view layoutparams olarak yani genişlik yükseklik orientation gibi
        //değerleri root layoutundan yani eklendiği parenttan alır
       // rootLayout.addView(view)

        //Log.e("INFLATION", ""+view.parent) //rootlayout
        //Log.e("INFLATION", ""+view.layoutParams) //framelayoutun genişlik yükseklik değerlerine göre yerleştirilir

    }
}

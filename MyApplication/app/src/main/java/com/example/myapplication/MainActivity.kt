package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.main_toolbar.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(main_layout_toolbar) // 툴바를 액티비티의 앱바로 지정
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_dehaze_black_24dp)// 드로어를 꺼낼 홈 버튼 활성화
        supportActionBar?.setDisplayShowTitleEnabled(false) // 툴바에 타이틀 안보이게
        main_navigationView.setNavigationItemSelectedListener(this) //navigation 리스너

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{ // 메뉴 버튼
                main_layout.openDrawer(GravityCompat.START)    // 네비게이션 드로어 열기
            }
        }
        return super.onOptionsItemSelected(item)
}

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1-> { val item1Intent = Intent(this, FastActivity::class.java)
                startActivity(item1Intent)}
            R.id.item2-> { val item2Intent = Intent(this, Sub2Activity::class.java)
                startActivity(item2Intent)}
            R.id.item3-> { val item3Intent = Intent(this, Sub3Activity::class.java)
                startActivity(item3Intent)}
            R.id.item4-> { val item4Intent = Intent(this, Sub4Activity::class.java)
                startActivity(item4Intent)}
            R.id.item5-> { val item5Intent = Intent(this, Sub5Activity::class.java)
                startActivity(item5Intent)}
            R.id.item6-> { val item6Intent = Intent(this, Sub6Activity::class.java)
                startActivity(item6Intent)}
        }
        return false
    }


}

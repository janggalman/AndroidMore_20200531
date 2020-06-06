package kr.tjoeun.androidmore_20200531

import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        Log.d("메인화면" , "onCreate실행")
    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume실행")
    }

    override fun onPause() {
        super.onPause()

        Log.d("메인화면" , "onPause 실행")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("메인화면" , "onDestroy 실행")
    }

    override fun onStop() {
        super.onStop()

        Log.d("메인화면" , "onStop 실행")
    }

    override fun setupEvents() {

        moveBtn.setOnClickListener {
            val myIntent = Intent(mContext, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

        val users = ArrayList<String>()
        users.add("조경진")
        users.add("아이유")
        users.add("박보검")
        users.add("차은우")
        users.add("박보영")

        for (u in users) {
            Log.d("사용자이름", u)
        }

        for (i in 0..5) {
            Log.d ("숫자반복" ,"${i}")
        }


    }


}

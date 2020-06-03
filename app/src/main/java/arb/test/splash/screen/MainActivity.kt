package arb.test.splash.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img.animation = AnimationUtils.loadAnimation(this , R.anim.anim_top)
        txt_1.animation = AnimationUtils.loadAnimation(this , R.anim.anim_right)
        txt_2.animation = AnimationUtils.loadAnimation(this , R.anim.anim_left)

        Handler().postDelayed({

            startActivity(Intent(this,Home::class.java))
            finish()

        },7000)

    }
}

package com.ute.loginlayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtName = findViewById<EditText>(R.id.edtName)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPhone = findViewById<EditText>(R.id.edtPhone)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val swNotify = findViewById<SwitchMaterial>(R.id.swNotify)
        val swNewsletter = findViewById<SwitchMaterial>(R.id.swNewsletter)
        val swDark = findViewById<SwitchMaterial>(R.id.swDark)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSubmit.setOnClickListener {
            val gender = when (rgGender.checkedRadioButtonId) {
                R.id.rbMale -> "Nam"
                R.id.rbFemale -> "Nữ"
                else -> "Khác"
            }
            tvResult.text = """
                Họ tên: ${edtName.text}
                Email: ${edtEmail.text}
                SĐT: ${edtPhone.text}
                Giới tính: $gender
                Thông báo: ${if (swNotify.isChecked) "Bật" else "Tắt"}
                Bản tin: ${if (swNewsletter.isChecked) "Bật" else "Tắt"}
                Chế độ tối: ${if (swDark.isChecked) "Bật" else "Tắt"}
            """.trimIndent()
        }
    }
}
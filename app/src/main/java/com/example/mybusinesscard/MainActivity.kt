package com.example.mybusinesscard

import android.media.Image
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybusinesscard.ui.theme.MyBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF00ff61)
                ) {
                    CardLayout("Aditya Kulkarni", "Jr. Android Developer" )
                }
            }
        }
    }
}

@Composable
fun CardLayout(name: String, career: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo);
    val dial = painterResource(R.drawable.dialer_icon_8);
    val share = painterResource(R.drawable.share_png49);
    val mail = painterResource(R.drawable.email_icon_png_email_icon_2048);



        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Box(modifier = Modifier.size(150.dp))
            Box(modifier = Modifier
                .background(color = Color(0xFF11373f))
                .size(100.dp, 100.dp)
                .align(Alignment.CenterHorizontally))  {

                Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Inside

            )}
            Text(
                text = name,
                fontSize = 35.sp,
                lineHeight = 110.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = career,
                fontSize = 16.sp,
                color = Color(0xFF11373f),
                modifier = Modifier
                    //.padding(5.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )

            Box(modifier = Modifier.size(250.dp))

            DisplayText("+91 8638273828", dial, modifier = Modifier
                .padding(5.dp)
                .alpha(0.8F)
                //.align(alignment = Alignment.CenterHorizontally)
            )

            DisplayText("@aditya",share, modifier = Modifier
                .padding(5.dp)
                .alpha(0.8F)
                //.align(alignment = Alignment.CenterHorizontally)
            )

            DisplayText("aditya@email.com", mail, modifier = Modifier
                .padding(5.dp)
                .alpha(0.8F)
                //.align(alignment = Alignment.CenterHorizontally)
            )


        }

}

@Composable
fun DisplayText(content: String, icon1: Painter, modifier: Modifier = Modifier) {



        Row(horizontalArrangement = Arrangement.Center, modifier = modifier){
            Box(modifier = Modifier.size(100.dp,20.dp))
            Image(
                painter = icon1,
                contentDescription = null,
                Modifier.size(20.dp)
            )

            Text(
                text = content,
                fontSize = 12.sp,
                lineHeight = 110.sp,
                textAlign = TextAlign.Center,

                modifier = Modifier
                    .padding(20.dp,0.dp,0.dp,0.dp)
                    //.align(alignment = Alignment.CenterHorizontally)
            )
        }



}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyBusinessCardTheme {
        CardLayout("Aditya Kulkarni", "Jr. Android Developer",
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .background(color = Color(0xFF9CCC65))
        )
    }
}
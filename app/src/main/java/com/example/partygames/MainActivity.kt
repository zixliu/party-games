package com.example.partygames

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.partygames.ui.theme.PartyGamesTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Hello")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun NewStory() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(Color.Cyan)
            .width(150.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "A background",
            modifier = Modifier
                .height(200.dp)
//                .border(
//                    width = 10.dp,
//                    brush = Brush.horizontalGradient(listOf(Color.DarkGray, Color.Blue)),
//                    shape = RectangleShape
//                )
                .clip(RoundedCornerShape(5.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.preferredHeight(50.dp))
        Text(text = "Party games")
        Text(
            text = "Hehehe lol lol hkjhkj lkhih bhbh hjhj joj hguhuh gyg",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "lolololol",
            style = TextStyle(fontSize = 5.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewStory()
}
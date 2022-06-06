package com.example.mealcomposeworkshop

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.mealcomposeworkshop.data.Meal
import com.example.mealcomposeworkshop.data.SampleData
import com.example.mealcomposeworkshop.ui.theme.MealComposeWorkshopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealComposeWorkshopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MealScreen()
                }
            }
        }
    }
}

@Composable
fun MealScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(SampleData.data) { meal ->
            MealItemCard(meal = meal)
        }
    }
}

@Composable
fun MealItemCard(meal: Meal) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = rememberAsyncImagePainter(meal.image),
            contentDescription = "Meal image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(
            modifier = Modifier.width(20.dp)
        )
        Column {
            Text(
                text = meal.name,
                modifier = Modifier.padding(5.dp),
                style = MaterialTheme.typography.h6.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = meal.description,
                modifier = Modifier.padding(5.dp),
                style = MaterialTheme.typography.caption.copy(
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray.copy(
                        alpha = 0.6f
                    )
                )
            )
        }
    }
}

@Preview(
    showBackground = true,
    group = "Default",
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    MealComposeWorkshopTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MealScreen()
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES,
    group = "Default Dark",
    showSystemUi = true
)
@Composable
fun DefaultDarkPreview() {
    MealComposeWorkshopTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MealScreen()
        }
    }
}
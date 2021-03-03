/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.glide.GlideImage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Dogs Adoption"
        setContent {
            MyTheme {
                MyApp(this)
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp(context: Context) {
    Surface(color = MaterialTheme.colors.background) {
        BarkDogList(context)
    }
}

@Composable
private fun BarkDogList(context: Context) {
    Column(modifier = Modifier.background(Color.White)) {
        val barkDogs = BarkDogDataSource.fetchBarkDogDataSource()
        LazyColumn {
            items(barkDogs.size) {
                ImageListItem(barkDogs[it], context)
            }
        }
    }
}

@Composable
fun ImageListItem(dog: BarkDog, context: Context) {
    Column(Modifier.padding(10.dp)) {
        Row {
            GlideImage(
                data = dog.photo,
                contentDescription = "",
                modifier = Modifier.size(150.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.width(20.dp))
            Column {
                Text(
                    text = dog.desc,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 5,
                    style = MaterialTheme.typography.subtitle1
                )
                Spacer(Modifier.height(10.dp))
                Button(
                    onClick = {
                        val intent = Intent(context, BarkDogDetailActivity::class.java)
                        intent.putExtra("dog", dog)
                        context.startActivity(intent)
                    }
                ) {
                    Text(text = "More Detail")
                }
            }
        }
    }
}

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

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import dev.chrisbanes.accompanist.glide.GlideImage

class BarkDogDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dog: BarkDog = intent.getSerializableExtra("dog") as BarkDog

        title = dog.nickName

        setContent {
            Column(Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                GlideImage(
                    data = dog.photo,
                    contentDescription = "",
                    modifier = Modifier.size(350.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.height(20.dp))

                Row() {
                    Column {
                        Text("Name: ${dog.nickName}")
                        Text("Breed: ${dog.breed}")
                        Text("Age: ${dog.age} month")
                        Text("Gender: ${dog.gender.getString()}")
                    }

                    Spacer(Modifier.width(60.dp))

                    Button(
                        Toast.makeText(
                            applicationContext,
                            "You've adopted ${dog.nickName}!!",
                            Toast.LENGTH_SHORT
                        )::show
                    ) {
                        Text("Adopt ${dog.nickName}")
                    }
                }

                Spacer(Modifier.height(20.dp))

                Text(text = "Introduce of ${dog.nickName}:")
                Text(text = dog.desc)
            }
        }
    }
}

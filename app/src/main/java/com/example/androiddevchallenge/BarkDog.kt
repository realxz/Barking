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

import java.io.Serializable

data class BarkDog(
    val id: String,
    val nickName: String,
    val photo: String,
    val age: Int,
    val breed: String,
    val gender: Gender,
    val desc: String = ""
) : Serializable

enum class Gender {
    Female, Male
}

fun Gender.getString(): String {
    return if (this == Gender.Female) {
        "female"
    } else {
        "male"
    }
}

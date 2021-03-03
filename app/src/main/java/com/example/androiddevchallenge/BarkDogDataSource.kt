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

object BarkDogDataSource {
    fun fetchBarkDogDataSource(): List<BarkDog> {
        return listOf<BarkDog>(
            BarkDog(
                "1",
                "Jessie",
                "https://img.boqiicdn.com/Data/BK/P/imagick29091541496916.jpg",
                3,
                "Shiba Inu",
                Gender.Female,
                "The Shiba Inu (柴犬, Japanese: [ɕiba inɯ]) is a breed of hunting dog from Japan. A small-to-medium breed, it is the smallest of the six original and distinct spitz breeds of dog native to Japan.\\n\\nA small, alert and agile dog that copes very well with mountainous terrain and hiking trails, the Shiba Inu was originally bred for hunting. It looks similar to and is often mistaken for other Japanese dog breeds such as the Akita Inu or Hokkaido, but the Shiba Inu is a different breed with a distinct blood line, temperament, and smaller size than other Japanese dog breeds."
            ),
            BarkDog(
                "2",
                "Abby",
                "https://img.boqiicdn.com/Data/BK/P/img5701405934288.jpg",
                5,
                "Pharaoh Hound",
                Gender.Male,
                "The Pharaoh Hound is a Maltese breed of hunting dog. In Maltese it is called Kelb tal-Fenek, which means \\\"rabbit dog\\\"; it is traditionally used for hunting rabbit in the rocky terrain of the Maltese Islands. It is classified by the Fédération Cynologique Internationale in its \\\"Spitz and primitive\\\" group, and shows similarities to other Mediterranean breeds in that group such as the Cirneco dell'Etna, the Podenco Andaluz, the Podenco Canario, the Podenco Ibicenco and the Portuguese Podengo. It is the only Maltese dog breed with international recognition.[a]"
            ),
            BarkDog(
                "3",
                "Joyce",
                "https://img.boqiicdn.com/Data/BK/P/imagick83561541495798.jpg",
                1,
                "Labrador Retriever",
                Gender.Female,
                "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world.\\n\\nA favourite disability assistance breed in many countries, Labradors are frequently trained to aid those with blindness or autism, act as a therapy dog, or perform screening and detection work for law enforcement and other official agencies. The breed is best known for their obedience, loyalty, and playful composure. Additionally, they are prized as sporting and hunting dogs. Ancestors include a breed used in Newfoundland as fishing dogs, that would help in bringing in the fishing nets and recapture escaped fish.\\n\\nIn the 1830s, the 10th Earl of Home and his nephews the 5th Duke of Buccleuch and Lord John Scott, had imported progenitors of the breed from Newfoundland to Europe for use as gundogs. Another early advocate of these Newfoundland fishing dogs was the 2nd Earl of Malmesbury, who bred them for their expertise in waterfowling.\\n\\nDuring the 1880s, the 3rd Earl of Malmesbury, the 6th Duke of Buccleuch, and the 12th Earl of Home collaborated to develop and establish the Labrador Retriever breed. The dogs Buccleuch Avon and Buccleuch Ned, given by Malmesbury to Buccleuch, were mated with bitches carrying blood from those originally imported by the 5th Duke and the 10th Earl of Home. The offspring are the ancestors of all modern Labradors."
            ),
            BarkDog(
                "4",
                "Echo",
                "https://img.boqiicdn.com/Data/BK/P/imagick93341541495659.jpg",
                2,
                "Bichon Frisé",
                Gender.Male,
                "A Bichon Frise (/ˈbiːʃɒn ˈfriːz/ or /ˈbiːʃɒn frɪˈzeɪ/; from French: bichon à poil frisé, French pronunciation: \\u200B[biʃɔ̃ fʁize], meaning 'curly haired dog') is a small breed of dog of the bichon type."
            ),
            BarkDog(
                "5",
                "Amy",
                "https://img.boqiicdn.com/Data/BK/P/imagick20371541414110.jpg",
                6,
                "Alaskan Malamute",
                Gender.Female,
                "The Alaskan Malamute (/ˈmæləˌmjuːt/) is a large breed of dog that was originally bred for their strength and endurance to haul heavy freight as a sled dog and hound. They are similar to other arctic, husky, and spitz breeds such as the Greenland Dog, Canadian Eskimo Dog, the Siberian Husky, and the Samoyed."
            ),
            BarkDog(
                "6",
                "Kobe",
                "https://img.boqiicdn.com/Data/BK/P/imagick64591541411807.png",
                2,
                "Golden Retriever",
                Gender.Male,
                "The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl, such as ducks and upland game birds, during hunting and shooting parties. The name \\\"retriever\\\" refers to the breed's ability to retrieve shot game undamaged due to their soft mouth. Golden retrievers have an instinctive love of water, and are easy to train to basic or advanced obedience standards. They are a long-coated breed, with a dense inner coat that provides them with adequate warmth in the outdoors, and an outer coat that lies flat against their bodies and repels water. Golden retrievers are well suited to residency in suburban or country environments. They shed copiously, particularly at the change of seasons, and require fairly regular grooming. The Golden Retriever was originally bred in Scotland in the mid-19th century."
            )
        )
    }
}

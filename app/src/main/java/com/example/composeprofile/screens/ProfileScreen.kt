package com.example.composeprofile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeprofile.components.ProfileButton
import com.example.composeprofile.components.ProfileImage
import com.example.composeprofile.components.ProfileStat

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.spacedBy(18.dp),


    ) {

        Text(
            text = "My Profile",
            fontSize = 24.sp
        )

        ProfileImage()

        Text(
            text = "Sukil",
            fontSize = 22.sp
        )

        Text(
            text = "Android Developer",
            fontSize = 16.sp
        )

        Row(
            modifier = Modifier.fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceEvenly,

            verticalAlignment = Alignment.CenterVertically
        ) {

            ProfileStat(
                number = "120",
                label = "Posts"
            )

            ProfileStat(
                number = "1.2K",
                label = "Followers"
            )

            ProfileStat(
                number = "250",
                label = "Following"
            )
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),

            horizontalArrangement = Arrangement.spacedBy(30.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            ProfileButton(
                text = "Follow",
                modifier = Modifier.weight(1f),
                onClick = {}
            )

            ProfileButton(
                text = "Message",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
        }
    }
}
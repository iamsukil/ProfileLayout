package com.example.composeprofile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composeprofile.R

@Composable
fun ProfileImage() {

    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Profile Image",
        modifier = Modifier.size(120.dp)
            .clip(CircleShape)
    )
}
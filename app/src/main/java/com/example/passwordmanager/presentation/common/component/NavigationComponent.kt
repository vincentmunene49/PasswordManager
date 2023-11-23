package com.example.passwordmanager.presentation.common.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun NavigationComponent(
    navigationIcon: ImageVector,
) {
    Box(
        modifier = Modifier
            .size(20.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.onSurface,
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(20.dp)
                .padding(all = 4.dp),
            imageVector = navigationIcon,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }

}
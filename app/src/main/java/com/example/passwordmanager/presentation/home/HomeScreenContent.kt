package com.example.passwordmanager.presentation.home

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.presentation.common.component.CardComponent
import com.example.passwordmanager.presentation.common.component.NavigationComponent
import com.example.passwordmanager.ui.theme.PasswordManagerTheme


@Composable
fun HomeScreenContent(
    states: HomeStates,
    events: (HomeEvents) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        TopBarComponent()

        Spacer(modifier = Modifier.height(20.dp))

        CardComponent(
            modifier = Modifier
                .fillMaxWidth(),
            backgroundColor = MaterialTheme.colorScheme.secondary
        ) {
            Column(
                modifier = Modifier.padding(all = 10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = colorResource(id = R.color.securityBackground)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier
                            .size(25.dp)
                            .padding(all = 4.dp),
                        painter = painterResource(id = R.drawable.security),
                        contentDescription = "Security",

                        )
                }
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "New Password",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSecondary
                )
                Text(
                    text = "save your new password with ease",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSecondary
                )
                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(CircleShape)
                        .background(color = MaterialTheme.colorScheme.primary),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Add new+",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onPrimary
                    )


                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            InformationCard(
                modifier = Modifier.weight(1f),
                icon = R.drawable.key,
                iconBackgroundColor = colorResource(id = R.color.keyBackground),
                title = "Saved passwords",
                description = "32 Pass"
            )
            Spacer(modifier = Modifier.width(8.dp))
            InformationCard(
                modifier = Modifier.weight(1f),
                icon = R.drawable.site,
                iconBackgroundColor = colorResource(id = R.color.siteBackground),
                title = "Saved sites",
                description = "27 sites"
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Saved Passwords",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
            FilterComponent()
        }


    }

}

@Composable
fun TopBarComponent(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "Hello, Vincent \uD83D\uDC4B",
                style = MaterialTheme.typography.titleLarge.copy(fontSize = 15.sp),
                color = MaterialTheme.colorScheme.onPrimary
            )
            Text(
                text = "Save your password easily and securely",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier
                        .size(30.dp)
                        .padding(all = 4.dp),
                    painter = painterResource(id = R.drawable.analytics),
                    contentDescription = "Analytics",

                    )
            }
        }

    }
}

@Composable
fun InformationCard(
    modifier: Modifier = Modifier,
    boxBackgroundColor: Color = MaterialTheme.colorScheme.primary,
    iconBackgroundColor: Color = Color.White,
    @DrawableRes icon: Int,
    title: String,
    description: String,
    onClick: () -> Unit = {}
) {
    CardComponent(
        modifier = modifier,
        backgroundColor = boxBackgroundColor,
        onCLick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(color = iconBackgroundColor),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier
                            .size(25.dp)
                            .padding(all = 4.dp),
                        painter = painterResource(id = icon),
                        contentDescription = "",
                        tint = Color.White
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.titleSmall.copy(fontSize = 14.sp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
            NavigationComponent(navigationIcon = Icons.Default.ArrowForward)

        }

    }
}

@Composable
fun FilterComponent(
    onClick: () -> Unit = {}
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(

            text = "Filter",
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Icon(
            modifier = Modifier.clickable { onClick() },
            imageVector = Icons.Default.KeyboardArrowDown,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.onPrimary
        )

    }

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun PreviewTopBarComponent() {
    PasswordManagerTheme {
        HomeScreenContent(
            states = HomeStates(),
            events = {}
        )
    }
}
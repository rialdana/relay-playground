package com.example.relay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.relay.crmbbutton.CrmbButton
import com.example.relay.crmbbutton.State
import com.example.relay.crmbbutton.Type
import com.example.relay.hellocard.HelloCard
import com.example.relay.loyaltypoints.LoyaltyPoints
import com.example.relay.ui.theme.RelayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RelayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Spacer(modifier = Modifier.height(10.dp))

                        HelloCard(title = GREETING)

                        Spacer(modifier = Modifier.height(10.dp))

                        LoyaltyPoints(label = "You have 30 loyalty points!")

                        Spacer(modifier = Modifier.height(10.dp))

                        CrmbButton(
                            text = "Make a payment",
                            type = Type.Default,
                            state = State.Enabled,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RelayTheme {
        HelloCard(title = GREETING)
    }
}

private const val GREETING = "Hello user Ricardo"
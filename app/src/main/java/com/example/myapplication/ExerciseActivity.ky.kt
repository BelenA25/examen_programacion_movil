package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.InputChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AppTheme
import okhttp3.internal.http2.Header

class ExerciseActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        val context = applicationContext
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                //Exercise1()
                //Exercise2()
                //Exercise3()
                //Exercise4()
                Exercise5()
            }
        }
    }
}
@Composable
fun Exercise1() {
    var quantity by remember {
        mutableStateOf(0)
    }
    val pricePerItem = 10.0
    val totalPrice = quantity * pricePerItem
    Column(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Quantity",
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.headlineMedium,
        )
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            Button(
                onClick = { if (quantity > 0) quantity-- },
                enabled = quantity>0) {
                Text(text = "-")
            }
            Text(text = quantity.toString())
            Button(onClick = { quantity++ }) {
                Text(text = "+")
            }
        }
        Text(
            text = "Price: $${"%.2f".format(totalPrice)}",
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.labelLarge
            )
        Text(text = "")
        Button(onClick = { quantity=0}) {
            Text(text = "ORDER")
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise2() {
    var score by remember {
        mutableStateOf(0)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Court Counter", style = MaterialTheme.typography.titleMedium) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Team A", style = MaterialTheme.typography.titleLarge)
            Text(
                text = score.toString(),
                fontSize = 128.sp,)
            Button(onClick = { score += 3 },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(60.dp)) {
                Text(text = "+ 3 POINTS")
            }
            Button(onClick = { score += 2 },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text(text = "+ 2 POINTS")
            }
            Button(onClick = { score += 1  },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                ) {
                Text(text = "FREE THROW")
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise3(){
    var scoreTeamA by remember { mutableStateOf(0) }
    var scoreTeamB by remember { mutableStateOf(0) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Court Counter", style = MaterialTheme.typography.titleMedium) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Team A", style = MaterialTheme.typography.titleLarge)
                    Text(
                        text = scoreTeamA.toString(),
                        fontSize = 128.sp,)
                    Button(onClick = { scoreTeamA += 3 },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(40.dp)) {
                        Text(text = "+ 3 POINTS")
                    }
                    Button(onClick = { scoreTeamA += 2 },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(40.dp)
                    ) {
                        Text(text = "+ 2 POINTS")
                    }
                    Button(onClick = { scoreTeamA += 1  },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(40.dp)
                    ) {
                        Text(text = "FREE THROW")
                    }
                }
                Divider(
                    color = Color.Gray,
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(2.dp)
                )
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Team B", style = MaterialTheme.typography.titleLarge)
                    Text(
                        text = scoreTeamB.toString(),
                        fontSize = 128.sp,)
                    Button(onClick = { scoreTeamB += 3 },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(40.dp)) {
                        Text(text = "+ 3 POINTS")
                    }
                    Button(onClick = { scoreTeamB += 2 },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(40.dp)
                    ) {
                        Text(text = "+ 2 POINTS")
                    }
                    Button(onClick = { scoreTeamB += 1  },
                        modifier = Modifier
                            .padding(16.dp)
                            .height(40.dp)
                    ) {
                        Text(text = "FREE THROW")
                    }
                }
            }
            Button(onClick = {
                scoreTeamA=0
                scoreTeamB=0},
                modifier = Modifier
                    .padding(16.dp)
                    .height(40.dp)
            ) {
                Text(text = "RESET")
            }
        }

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise4(){
    var isChecked by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Option 1") }
    var textfield by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My Application", style = MaterialTheme.typography.titleMedium) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "This is a view")
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                value = textfield, onValueChange = {
                    textfield = it
                },
                placeholder = { Text("This is another view") })
            Button(onClick = { /*TODO*/ }) {
                Text(text = "This is another view")
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ) {
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = { isChecked = it }
                )
                Text(text = "This is another view")
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ) {
                RadioButton(
                    selected = selectedOption == "Option",
                    onClick = { selectedOption = "Option" }
                )
                Text(text = "This is another view")
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise5() {
    var userSignIn by remember { mutableStateOf("") }
    var passwordSignIn by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My Application", style = MaterialTheme.typography.titleMedium) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            TextField(value = userSignIn, onValueChange = { userSignIn = it },
                placeholder = { Text("Email addres") })
            TextField(value = passwordSignIn, onValueChange = { passwordSignIn = it },
                placeholder = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
                Text(text = "Login")
            }
        }
    }
}
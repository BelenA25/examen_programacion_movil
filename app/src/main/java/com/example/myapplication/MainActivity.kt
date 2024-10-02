package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AppTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        val context = applicationContext
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                FlowRowSimpleUsageExample3()
                //SnackbarExample()
            // Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                 //   CardExample(modifier = Modifier.padding(innerPadding), context=context)
                    //ScrollExample(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

@Composable
fun ScrollExample(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState())
    ) {
        repeat(100) {
            Text(text = "Item $it", modifier = Modifier.padding(2.dp))
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnackbarExample() {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState =  snackbarHostState)
        },
        modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            ElevatedCard(
                onClick = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            message = "Snackbar",
                            actionLabel = "Action",
                            duration = SnackbarDuration.Indefinite
                        )
                        when(result) {
                            SnackbarResult.ActionPerformed -> {
//                                openSecondActivity(context)
                            }
                            SnackbarResult.Dismissed -> {

                            }
                        }
                    }

                },
                modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Elevated",
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardExample(modifier: Modifier, context: Context) {
    Column(
        modifier = modifier
    ) {
        Card {
            Text(text = "Hello Android Compose")
        }
        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Text(text = "Card with Width and Height")
        }
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Card fill max width", modifier = Modifier.padding(16.dp), textAlign = TextAlign.Center)
        }

        ElevatedCard {
            Text(
                text = "Elevated",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center)

        }
        ElevatedCard( modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Elevated",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center)

        }

        OutlinedCard(
            onClick = {
                Toast.makeText(context, "Texto", Toast.LENGTH_LONG).show()
            },
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            ),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
        ) {
            Text(
                text = "Outlined",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun SigninPage(modifier:Modifier) {
    var userSignIn by remember { mutableStateOf("") }
    var passwordSignIn by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = stringResource(id = R.string.login_title))
        TextField(value = userSignIn, onValueChange = { userSignIn = it} )
        TextField(value = passwordSignIn, onValueChange = { passwordSignIn = it})
        Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
            Text(text = "Sign In" )
        }
    }
}

@Composable
fun MyApp(){
    var count by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Counter: $count", style= MaterialTheme.typography.bodyLarge)
        Button(onClick = { count++ }) {
            Text("Increment")
        }
        Row {
            Text(text = "Android")
            Text(text = "Kotlin")
            Text(text = "Compose")
            }
        Box(modifier = Modifier.size(100.dp),
            contentAlignment = Alignment.Center){
            Icon(modifier = Modifier.size(80.dp),
                imageVector = Icons.Outlined.Notifications,
                contentDescription = null,
                tint = Color.Green)
            Text(text = "$count")
        }
        LazyColumn ( modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)) {
            items(100){
                Text(text="Item number is $it")
            }
        }
        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
        ){
            items(30){
                Text(modifier = Modifier.padding(9.dp), text="Item row $it")
            }
        }
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(100){
                Text(modifier = Modifier.padding(8.dp),
                    text = "Item is $it")
            }
        }
    }
}
//fun openSecondActivity(context: Context) {
//    val intent = Intent(
//        context,
//        GitUiActivity::class.java)
//    intent.putExtra(
//        "name","calyr")
//    context.startActivity(intent)
//}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun FlowRowSimpleUsageExample1() {
    val rows = 3
    val columns = 3
    FlowRow(
        modifier = Modifier.padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        maxItemsInEachRow = rows
    ) {
        val itemModifier = Modifier
            .padding(4.dp)
            .height(80.dp)
            .weight(1f)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Blue)
        repeat(rows * columns) {
            Spacer(modifier = itemModifier)
        }
    }
}
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun FlowRowSimpleUsageExample2() {
    FlowRow(
        modifier = Modifier.padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        maxItemsInEachRow = 2
    ) {
        val itemModifier = Modifier
            .padding(4.dp)
            .height(80.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Red)
        repeat(6) { item ->
            // if the item is the third item, don't use weight modifier, but rather fillMaxWidth
            if ((item + 1) % 3 == 0) {
                Spacer(modifier = itemModifier.fillMaxWidth())
            } else {
                Spacer(modifier = itemModifier.weight(0.5f))
            }
        }
    }
}
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun FlowRowSimpleUsageExample3() {
    val listDesserts = listOf("Banana", "Apple", "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb",
        "Ice cream sandwich", "jellybean", "Kitkat", "Lollipop", "Marshmallow", "Nougat")
    FlowColumn(
        Modifier
            .padding(20.dp)
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        maxItemsInEachColumn = 7,
    ) {
        repeat(listDesserts.size) {
            Box(
                modifier = Modifier
                    .border(1.dp, Color.DarkGray, RoundedCornerShape(8.dp))
                    .padding(8.dp)
            ) {

                Text(
                    text = listDesserts[it],
                    fontSize = 12.sp,
                    modifier = Modifier.padding(3.dp)
                )
            }
        }
    }
}
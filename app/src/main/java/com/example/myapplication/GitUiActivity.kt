//package com.example.myapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.myapplication.ui.theme.AppTheme
//import android.content.Context
//import android.widget.ImageView
//import android.widget.Toast
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.material3.Button
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import coil.compose.AsyncImage
//import com.example.network.GithubRemoteDataSource
//import com.example.network.RetrofitBuilder
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//
//
//class GitUiActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        val context = applicationContext
////        val name = intent.extras?.getString("name")
////        Toast.makeText(context,name,Toast.LENGTH_LONG).show()
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            AppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    GitUi(
//                        modifier = Modifier.padding(innerPadding),
//                        context = context
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun GitUi(modifier: Modifier = Modifier, context: Context) {
//
//    val dataSource: GithubRemoteDataSource = GithubRemoteDataSource(
//        RetrofitBuilder
//    )
//
//    var urlImage by remember { mutableStateOf("")}
//    var userId by remember { mutableStateOf("") }
//    var name by remember { mutableStateOf("") }
//    var company by remember { mutableStateOf("") }
//    var bio by remember { mutableStateOf("") }
//
//    val list = UsersRepository().getList()
//
//    Column(
//        modifier = modifier
//            .fillMaxHeight()
//            .fillMaxWidth(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = stringResource(id = R.string.github_ui_title)
//        )
//        TextField(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(5.dp),
//            value = userId, onValueChange = {
//                userId = it
//            })
//        Button(onClick = {
//            urlImage = ""
//            name = ""
//            company = ""
//            bio = ""
//            val show = Toast.makeText(context, userId, Toast.LENGTH_LONG).show()
//            CoroutineScope(Dispatchers.IO).launch {
//                try {
//                    val response = dataSource.getAvatarInfo(userId)
//                    urlImage = response.url
//                    name = response.name ?: "N/A"
//                    company = response.company ?: "N/A"
//                    bio = response.bio ?: "N/A"
//                } catch (e: Exception) {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        Toast.makeText(context, "Error al obtener datos: ${e.message}", Toast.LENGTH_LONG).show()
//                    }
//                }
//            }
//
//        }) {
//            Text(text = stringResource(id = R.string.github_ui_button))
//        }
//        LazyRow (modifier = Modifier
//        ) {
//            items(list.size) { index ->
//                Button(
//                    onClick = {
//                        userId = list[index].user
//                    },
//                    modifier = Modifier.padding(9.dp)
//                ) {
//                    Text(text = list[index].user)
//                }
//            }
//        }
//        AsyncImage(
//            model = urlImage,
//            contentDescription = null
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//
//        if (name.isNotEmpty()) {
//            Text(
//                text = name,
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold,
//                color = MaterialTheme.colorScheme.primary
//            )
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        if (company.isNotEmpty()) {
//            Text(
//                text = company,
//                fontSize = 18.sp,
//                fontWeight = FontWeight.Medium,
//                color = MaterialTheme.colorScheme.secondary
//            )
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        if (bio.isNotEmpty()) {
//            Text(
//                text = bio,
//                fontSize = 16.sp
//            )
//        }
//    }
//}
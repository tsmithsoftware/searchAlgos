package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import core.Node

@Composable
fun BinarySearchNode(initialActivatedState : Boolean, node: Node?) {
    val activated by rememberSaveable { mutableStateOf(initialActivatedState) }

    BinarySearchNodeContent(activated = activated, 1,  onActivatedChange = { activated })
}

@Composable
fun BinarySearchNodeContent(activated: Boolean, nodeValue: Int, onActivatedChange: (String) -> Unit) {
    if (activated) {
        Box {
            Image(
                painter = painterResource("triangle.svg"),
                contentDescription = "Sample"
            )
            Text("$nodeValue")
        }
    } else {
        Box {
            Image(
                painter = painterResource("circle.svg"),
                contentDescription = "Sample",
                modifier = Modifier.fillMaxSize()
            )
            Text("$nodeValue")
        }
    }
}
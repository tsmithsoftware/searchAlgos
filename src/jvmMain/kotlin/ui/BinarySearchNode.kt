package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import core.Node

@Composable
fun BinarySearchNode(initialActivatedState : Boolean, node: Node?) {
    val activated by rememberSaveable { mutableStateOf(initialActivatedState) }

    BinarySearchNodeContent(activated = activated, 1,  onActivatedChange = { activated })
}

@Composable
fun BinarySearchNodeContent(activated: Boolean, nodeValue: Int, onActivatedChange: (String) -> Unit) {
    val painterResource: Painter = if (activated) {
        painterResource("triangle.svg")
    } else {
        painterResource("circle.svg")
    }

    Box {
        Box(Modifier.align(Alignment.Center)) {
            Image(
                painter = painterResource,
                "sample"
            )
        }
        Box(Modifier.align(Alignment.Center).absolutePadding(top = Dp(5F))) {
            Text("$nodeValue")
        }
    }
}
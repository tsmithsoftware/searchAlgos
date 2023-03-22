// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import core.Node
import ui.BinarySearchNode


@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
fun App() {
    BinarySearchNode(Math.random() > 0, Node("1", null))
    /**
    val numbers = (0..19).toList()

    LazyVerticalGrid(
        cells = GridCells.Fixed(5)
    ) {
        items(numbers.size) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                BinarySearchNode(Math.random() > 0.5, Node("1", null))
            }
        }
    }
    **/
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}

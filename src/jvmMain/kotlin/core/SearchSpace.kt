package core

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

class SearchSpace(val node: Node) {
    companion object {
        fun defaultSpace(): Node {
            return Node("1", listOf(Node("2", null), Node("3", listOf(Node("4", null)))))
        }
        fun generateSpaceFromJson(json: String): Node {
            return jacksonObjectMapper().readValue(json, Node::class.java)
        }
    }
}
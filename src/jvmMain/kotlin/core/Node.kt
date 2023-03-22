package core

data class Node (val nodeValue: String, val nodeChildren: List<Node>?) {
    override fun equals(other: Any?): Boolean {
        other?.let {
            if (this === other) return true
            if (other !is Node?) return false
            if (nodeValue != other.nodeValue) return false
            return this.nodeChildren == other.nodeChildren
        }
        return false
    }

    override fun hashCode(): Int {
        var result = nodeValue.hashCode()
        result = 31 * result + nodeChildren.hashCode()
        return result
    }

}
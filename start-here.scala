object START HERE - 
This code is the start here of the Tree Computing Systsem developed by the Aria+ Company 

// Define a class for a TreeNode
class TreeNode(var value: Int) {
  var left: TreeNode = null
  var right: TreeNode = null
}

// Define a BinarySearchTree class
class BinarySearchTree() {
  var root: TreeNode = null

  // Method to insert a value into the BST
  def insert(value: Int): Unit = {
    root = insertRec(root, value)
  }

  // Helper method to recursively insert a value
  private def insertRec(node: TreeNode, value: Int): TreeNode = {
    if (node == null) {
      return new TreeNode(value)
    }

    if (value < node.value) {
      node.left = insertRec(node.left, value)
    } else if (value > node.value) {
      node.right = insertRec(node.right, value)
    }

    node // Return the unchanged node pointer
  }

  // Method to perform inorder traversal of the BST
  def inorderTraversal(): Unit = {
    inorderRec(root)
    println() // Print a new line after traversal
  }

  // Helper method to recursively perform inorder traversal
  private def inorderRec(node: TreeNode): Unit = {
    if (node != null) {
      inorderRec(node.left)
      print(s"${node.value} ")
      inorderRec(node.right)
    }
  }
}

// Example usage of the BinarySearchTree class
object Main {
  def main(args: Array[String]): Unit = {
    val bst = new BinarySearchTree()

    // Insert elements into the BST
    bst.insert(50)
    bst.insert(30)
    bst.insert(20)
    bst.insert(40)
    bst.insert(70)
    bst.insert(60)
    bst.insert(80)

    // Perform inorder traversal to print sorted elements
    println("Inorder traversal of the BST:")
    bst.inorderTraversal()
  }
}

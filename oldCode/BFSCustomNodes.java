public class BFSCustomNodes {

	public static void main(String[] args) {

		//Testea que el arbol retorne un arreglo de string con los valores de los nodos
//		BinaryTree bt = new BinaryTree();
//		bt.root = new BinaryTreeNode();
//		bt.root.value = "Test root";
//		bt.root.leftChild = new BinaryTreeNode();
//		bt.root.leftChild.value = "Left value";
//		bt.root.rightChild = new BinaryTreeNode();
//		bt.root.rightChild.value = "Right value";
//		
//		String[] arrayOfNodeNeighbors = bt.getNeighborsFromNodeValue("Test root"); 
//		for (int i = 0; i< 2; i++) {
//			System.out.println(arrayOfNodeNeighbors[i]);
//		}
		
		//Prueba unitaria sobre el método searchNodeByValue
//		BinaryTree testTree = new BinaryTree();
//		BinaryTreeNode testRoot = new BinaryTreeNode();
//		testRoot.value = "Test";
//		testTree.root = testRoot;
//		testTree.root.leftChild = new BinaryTreeNode();
//		testTree.root.leftChild.value = "Test left child";
//		
//		testTree.root.rightChild = new BinaryTreeNode();
//		testTree.root.rightChild.value = "Test right child";
//		
//		BinaryTreeNode testFind = testTree.searchNodeByValue("Test");
//		System.out.println(testFind != null);
//		System.out.println(testFind.value);
//		
//		BinaryTreeNode testFindLeft = testTree.searchNodeByValue("Test left child");
//		System.out.println(testFindLeft != null);
//		System.out.println(testFindLeft.value);
//		
//		BinaryTreeNode testFindRight = testTree.searchNodeByValue("Test right child");
//		System.out.println(testFindRight != null);
//		System.out.println(testFindRight.value);
		
		// Prueba unitaria sobre el método getNeighBorsAsArray
		// BinaryTreeNode test = new BinaryTreeNode();
		// test.leftChild = new BinaryTreeNode();
		// test.leftChild.value = "Hijo izquierdo";
		//
		// test.rightChild = new BinaryTreeNode();
		// test.rightChild.value = "Hijo derecho";
		//
		// String[] arregloDeHijos = test.getNeighborsAsArray();
		// for (int i = 0; i < 2; i++)
		// System.out.println(arregloDeHijos[i]);
	}

}

class BinaryTreeNode {
	String value;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;

	/***
	 * Funcion que retorna un arreglo que contiene el valor de los vecinos En
	 * caso de que no tenga vecinos, retorna null De lo contrario retorna un
	 * arreglo donde en la posicion 0 se carga el hijo izquierdo (o null) 1 se
	 * carga el hijo derecho (o null)
	 * 
	 * @return
	 */
	public String[] getNeighborsAsArray() {
		if (leftChild == null && rightChild == null) {
			return null;
		} else {
			String[] neighborsArray = new String[2];
			if (leftChild != null) {
				neighborsArray[0] = leftChild.value;
			}
			if (rightChild != null) {
				neighborsArray[1] = rightChild.value;
			}
			return neighborsArray;
		}
	}
}

class NormalNode {
	String value;
	NormalNode next;
}

class BinaryTree {
	BinaryTreeNode root;

	/***
	 * Funcion que retorna los hijos de un nodo si el nodo pertenece al arbol
	 * binario
	 * 
	 * @param value
	 *            String que representa el valor a buscar
	 * @return arreglo de vecinos o null si no encuentra nada
	 */
	 public String[] getNeighborsFromNodeValue(String value) {
		 BinaryTreeNode temp = searchNodeByValue(value);
		 
		 if (temp == null) {
			 return null;
		 } else {
			 return temp.getNeighborsAsArray();
		 }
	 }

	public BinaryTreeNode searchNodeByValue(String value) {
		return searchNodeByValueHelper(root, value);
	}

	public BinaryTreeNode searchNodeByValueHelper(BinaryTreeNode actual, String valueToLookFor) {
		if (actual != null) {
			if (actual.value.equals(valueToLookFor)) {
				return actual;
			} else {
				BinaryTreeNode search = searchNodeByValueHelper(actual.leftChild, valueToLookFor);
				if (search != null) {
					return search;
				} else {
					return searchNodeByValueHelper(actual.rightChild, valueToLookFor);
				}
			}
		}
		return null;
	}
	
	public void BFS() {
		//implementar!!!	
	}
}
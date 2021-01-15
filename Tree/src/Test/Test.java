package Test;

import javax.swing.tree.TreeNode;

public class Test {


		public static void main(String args[]) {

		TreeNode root=null;

		TreeNode temp=new TreeNode();

		temp=new TreeNode("USA","Trump","Donald","Tiffany");

		insert(root,temp);

		}

		private static void insert(TreeNode root, TreeNode temp) {
			// TODO Auto-generated method stub
			
		}

		void Displaytest001(TreeNode root) {

		System.out.println("child is "+root.forename+" parent is "+root.parent);

		for(TreeNode child : root.children) {

		Displaytest001(child);

		}

		}

		void Displaytest002(TreeNode root) {

		if(root.location.equals("Dubai")) {

		System.out.println("child is "+root.forename+" parent is "+root.parent);

		}

		for(TreeNode child : root.children) {

		Displaytest002(child);

		}

		}

		}
}

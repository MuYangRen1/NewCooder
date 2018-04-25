package com.NiuKeWang;

import java.util.Stack;

/*题目：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 解题思路：按照二叉树中序遍历的来解该题，采用二叉树遍历的非递归算法，利用两个node节点来记录
 * 当前节点跟上一个节点，然后让当前节点left指向上一个节点，right指向下一个节点。
 * 
 * */
public class Text27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}

class TreeNode1{
	int val;
	TreeNode1 left =null;
	TreeNode1 right=null;
	TreeNode1(int val){
		this.val=val;
	}
}
class Solution27{
	public TreeNode1 Convert(TreeNode1 pRootOfTree) {
		Stack<TreeNode1> stack=new Stack<>();
		TreeNode1 p=pRootOfTree;
		TreeNode1 pre=null;
		boolean isT=true;
		while(p!=null||!stack.isEmpty()){
			while(p!=null){
				stack.push(p);
				p=p.left;
			}
			p=stack.pop();
			if(isT){
				pre=p;
				pRootOfTree=p;
				isT=false;
			}else{
				pre.right=p;
				p.left=pre;
				pre=p;
			}
			p=p.right;
			
		}
		return pRootOfTree;
	}
}




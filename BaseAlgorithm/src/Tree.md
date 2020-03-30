树篇：

1.求二叉树的深度
	`public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left > right ? (left+1):(right+1);
    }`
    
2.判断树是否为平衡二叉树
	`public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        int diff = left - right;
        if(diff < -1||diff > 1){
            return false;
        }else{
            return true;
        }  
    }
    public int Depth(TreeNode root){
		if(root==null){
			return 0;
		}
		int left = Depth(root.left);
		int right = Depth(root.right);
		return left > right ? (left+1):(right+1);
     }`
	 
3. 输入两棵二叉树A，B，判断B是不是A的子结构
	`public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val){
                result = isChild(root1,root2);
            }
            if(!result){
                result = HasSubtree(root1.left,root2);
            }
            if(!result){
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;
    }
    public static boolean isChild(TreeNode node1,TreeNode node2){
        if(node2==null){
            return true;
        }
        if(node1==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }
        return isChild(node1.left,node2.left)&&isChild(node1.right,node2.right);
    }`
	
4.输入某二叉树的前序遍历和中序遍历的结果，重建出该二叉树
	`public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,pre.length-1);
        return root;
    }
    private TreeNode reConstructBinaryTree(int []pre,int startPre,int endPre,int []in,int startIn,int endIn){
        if(startPre>endPre || startIn > endIn){
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++){
            if(in[i]==pre[startPre]){
                root.left = reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right = reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;   
    }`
	
5.从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行
	`ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        depth(pRoot,1,list);
        return list;
    }
    public void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list){
        if(root == null){
            return;
        }
        if(depth>list.size()){
            list.add(new ArrayList<Integer>());
        }
        list.get(depth-1).add(root.val);
        depth(root.left,depth+1,list);
        depth(root.right,depth+1,list);
    }`
	
6.序列化和反序列化二叉树 
	`private String str;
    String Serialize(TreeNode root){
        if(root == null)
            return "#";
        return root.val+","+Serialize(root.left)+","+Serialize(root.right);
    }
    TreeNode Deserialize(String str){
        this.str = str;
        return Deserialize();
    }
    TreeNode Deserialize(){
        this.str = str;
        if(str.length()==0)
            return null;
        int index = str.indexOf(",");
        String value = (index==-1)?str:str.substring(0,index);
        str = (index==-1)?"":str.substring(index+1);
        if(value.equals("#"))
            return null;
        TreeNode node = new TreeNode(Integer.valueOf(value));
        node.left = Deserialize(str);
        node.right = Deserialize(str);
        return node;
    }`
	
7.给定一棵二叉搜索树，请找出其中的第k小的结点（中序遍历：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。所以，按照中序遍历顺序找到第k个结点就是结果）
	`int index = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot !=null){
            TreeNode node1 = KthNode(pRoot.left, k);
            if(node1!=null){
                return node1;
            }
            index++;
            if(index == k){
                return pRoot;
            }
            TreeNode node2 = KthNode(pRoot.right, k);
            if(node2 != null){
                return node2;
            }
        }
        return null;
    }`

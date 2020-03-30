数组篇：

1.一个整型数组包含只出现一次或者两次的整数，查找出一次的整数
	
	public static void FindNumsAppearOnce(int []arr){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<arr.length;i++){
			if(!set.add(arr[i])){
				set.remove(arr[i]);
			}
		}
		Object []temp = set.toArray();
		for(int j = 0;j<temp.length;j++){
			System.out.println(temp[j]);
		}
	}

2.一个整型数组里除了一个数字以外，其他数字都出现了两次，找出出现一次的整数
	
	public static int findNotDouble(int a[]){
		int n = a.length;
		int result = a[0];
		int i;
		for(i=1;i<n;++i){
			result ^= a[i];
		}
		return result;
	}

3.一个整形数组里面存储随机非负整数，找出只出现一次的数字
	
	public static void FindNumsAppearOnce(int []arr){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]) + 1;
                map.put(arr[i],temp);
            }else {
                map.put(arr[i],1);
            }
        }
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> e =  (Map.Entry)it.next();
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
    }
	
4.一个整形数组里面出现次数超过一半的数字
	
	public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        if(array.length == 0){
            return 0;
        }
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int temp = map.get(array[i]);
                temp++;
                map.replace(array[i],temp);
            }else {
                map.put(array[i],1);
            }
        }
        int n = array.length;
        for(int i=0;i<array.length;i++){
            int m = map.get(array[i]);
            if(m>n/2){
                System.out.println(array[i]);
                return array[i];
            }
        }
        return 0;
    }
	
5.求整形数组最大子数组的和

	public static void MoreThanHalfNum_Solution(int [] array) {
        int maxNum = array[0];
        for(int i=0;i<array.length;i++){
            int sum = 0;
                for(int j =i;j<array.length;j++){
                    sum = sum +array[i];
                    if(sum>maxNum){
                        maxNum = sum;
                    }
                }
        }
        System.out.println(maxNum);
    }
	
6.求整形数字最大连续子数组和（动态规划法）	

（1）

    public static void FindGreatestSumOfSubArray(int [] array) {
        int maxResult  = array[0];
        int maxTemp = 0;
        for(int i=0;i<array.length;i++){
            if(maxTemp>=0){
                maxTemp += array[i];
            }else {
                maxTemp = array[i];
            }
            if(maxTemp>maxResult){
                maxResult = maxTemp;
            }
        }
        System.out.println(maxResult);
    }
	
（2）

    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
    }
    
7.求出1~n的整数中1出现的次数
	
	public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        int num = 1;
        for(int i=0;i<n;i++){
            String str = String.valueOf(num);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    count++;
                }
            }
            num++;
        }
        return count;
    }

8.查找整形数组中第一次出现重复的数字

	public static int duplicate(int []arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return arr[i];
            }else{
                map.put(arr[i],0);
            }
        }
        return 0;
    }
	
9.给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值

	public ArrayList<Integer> maxInWindows(int [] num, int size){
        if(num == null&& size<0){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> temp = null;
        if(size==0||num.length<size){
            return list;
        }else{
            for(int i=0;i<num.length-size+1;i++){
                temp = new ArrayList<Integer>();
                for(int j=i;j<size+i;j++){
                    temp.add(num[j]);
                }
                Collections.sort(temp);
                list.add(temp.get(temp.size()-1));
            }
        }
        return list;
    }

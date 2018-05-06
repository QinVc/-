# -
使用TreeSet进行两个数组间的排序，但由于Set容器会把重复元素去除掉，所以我们通过重写TreeSet的Comparator保留重复元素，从而得到合并排列后含重的TreeSet

 class mCom implements Comparator{
      @Override
      public int compare(Object o1, Object o2) {
          int resc;
         Integer i1=(Integer)o1;
         Integer i2=(Integer)o2;
         resc= i1.compareTo(i2);
         if(resc==0){
             resc=-1;
         }
          return resc;
      }

      @Override
      public boolean equals(Object obj) {
          return false;
      }
  }
  //实例化
  TreeSet<Integer> ts=new TreeSet<>(new mCom());
  

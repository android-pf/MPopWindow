# MBtnMenu

一款简单使用的自定义菜单，具体如图：

 
<!-- ![Android自定义的效果](http://okbrselg1.bkt.clouddn.com/image/android_menu.png ) -->

### 使用步骤：
## Step 1. 在Project build.gradle 文件中添加以下代码
``` java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
		}
	}

```

## Step 2. 在APP build.gradle 文件中添加以下代码
 
``` java
    dependencies {
	         compile 'com.github.android-pf:MPopWindow:v1.1'
	}
```

## Step 3. 在代码中使用
new PopWindow 时传递需要的item名称  onPopClick为具事件处理
``` java
               pw = new PopWindow(this, "老师", "学生");//具体item name
               pw.callBack(new PopWindow.CallBack() {
                   @Override
                   public void onPopClick(String flag) {
                       Log.i("WZK", "被点击的是" + flag);
                   }
               });
               
               
                 pw.show(MainAct.this);//show 方法
```


### 实现思路 
由于时间关系，具体的实现大家可以看**源码**，
其实非常的简单，有时间在回来书写思路。

有不足的地方还请多多指教。
 

  <!-- [1]: http://oddbiem8l.bkt.clouddn.com/mvp.png -->
  <!-- [2]: http://oddbiem8l.bkt.clouddn.com/project.png -->
  <!-- [3]: http://oddbiem8l.bkt.clouddn.com/mvp%E4%B8%80%E4%B8%AA%E8%AF%B7%E6%B1%82%E7%9A%84%E8%BF%87%E7%A8%8B.png -->
  <!-- [4]: http://www.jianshu.com/u/aa53f5d59037 -->
  <!-- [5]: http://www.jianshu.com/p/a7635e39c5ac -->
  <!-- [6]: http://www.jianshu.com/p/cc7ae2f96b64 -->
  <!-- [7]: http://www.jianshu.com/p/92ae9fb83e74 -->

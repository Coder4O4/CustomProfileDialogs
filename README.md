# CustomProfileDialogs
This repo provide custom dialogs for different conditions. You just have to pass alert message only. Also it provides different views.

>Step 1 :Add it in your root build.gradle at the end of repositories.
>>Version : CS.0.0.1

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

>Step 2 :  Add the dependency.

```gradle
	dependencies {
	        implementation 'com.github.Coder4O4:CustomProfileDialogs:Tag'
	}
```

> Add Following code to show dialogs.

```java

  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name ="User Name";
                String location ="User Location";
                String bio = "Hi this is user bio." ;
                String profile = "uri.toString()";
                // profile Uri or URL shoud be in string. 
                double followers = 20;
                double followings  = 12;
                boolean userLike = true;
                GetUserData getUserData = 
		new GetUserData(name , location , bio ,profile , followers, followings , userLike);
                SocialNasNeDialog.dialog(MainActivity.this , DialogData.CANCELABLE , getUserData);
            }
        });
```

>>> Different dialog for different divices according to screen size type like normal , large , Xlarge etc

![Screenshot (36)](https://user-images.githubusercontent.com/114288510/206002617-776161c1-8429-47b0-9a2c-a6973cd36b2f.png)
![Screenshot (34)](https://user-images.githubusercontent.com/114288510/206002666-5baa02de-df71-4e38-9b57-082b5879a8a0.png)
![Screenshot (35)](https://user-images.githubusercontent.com/114288510/206002728-c202e848-ce33-4c3c-b537-0c1c7908665c.png)
![Screenshot (33)](https://user-images.githubusercontent.com/114288510/206002790-0c16c3b8-9b3b-4dc8-8f76-dcae9c37b6db.png)



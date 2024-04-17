# FORK FOR NAVIGATION BUG SHOWCASE
https://issuetracker.google.com/issues/225780127

Install app:
- click Log In
- you should be redirected to new screen and then to browser
- click back on browser, or open app from task manager
- crash!

FATAL EXCEPTION: main
Process: com.example.simplenavigationcompose, PID: 12485
java.lang.RuntimeException: Unable to resume activity {com.example.simplenavigationcompose/com.example.simplenavigationcompose.MainActivity}: java.util.NoSuchElementException
at android.app.ActivityThread.performResumeActivity(ActivityThread.java:4563)
at android.app.ActivityThread.handleResumeActivity(ActivityThread.java:4595)
at android.app.servertransaction.ResumeActivityItem.execute(ResumeActivityItem.java:52)
at android.app.servertransaction.TransactionExecutor.executeLifecycleState(TransactionExecutor.java:176)
at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:97)
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2135)
at android.os.Handler.dispatchMessage(Handler.java:106)
at android.os.Looper.loop(Looper.java:236)
at android.app.ActivityThread.main(ActivityThread.java:8056)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:656)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:967)
Caused by: java.util.NoSuchElementException
at java.util.AbstractList$Itr.next(AbstractList.java:377)
at androidx.navigation.NavController.lifecycleObserver$lambda$2(NavController.kt:189)
at androidx.navigation.NavController.$r8$lambda$bZL_fnLbLD5ZZthGK_6aY8AQ2pA(Unknown Source:0)
at androidx.navigation.NavController$$ExternalSyntheticLambda0.onStateChanged(Unknown Source:2)
at androidx.lifecycle.LifecycleRegistry$ObserverWithState.dispatchEvent(LifecycleRegistry.kt:322)
at androidx.lifecycle.LifecycleRegistry.forwardPass(LifecycleRegistry.kt:258)
at androidx.lifecycle.LifecycleRegistry.sync(LifecycleRegistry.kt:294)
at androidx.lifecycle.LifecycleRegistry.moveToState(LifecycleRegistry.kt:143)
at androidx.lifecycle.LifecycleRegistry.handleLifecycleEvent(LifecycleRegistry.kt:126)
at androidx.lifecycle.ReportFragment$Companion.dispatch$lifecycle_runtime_release(ReportFragment.kt:190)
at androidx.lifecycle.ReportFragment$LifecycleCallbacks.onActivityPostResumed(ReportFragment.kt:125)
at android.app.Activity.dispatchActivityPostResumed(Activity.java:1459)
at android.app.Activity.performResume(Activity.java:8348)
at android.app.ActivityThread.performResumeActivity(ActivityThread.java:4553)
at android.app.ActivityThread.handleResumeActivity(ActivityThread.java:4595) 
at android.app.servertransaction.ResumeActivityItem.execute(ResumeActivityItem.java:52) 
at android.app.servertransaction.TransactionExecutor.executeLifecycleState(TransactionExecutor.java:176) 
at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:97) 
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2135) 
at android.os.Handler.dispatchMessage(Handler.java:106) 
at android.os.Looper.loop(Looper.java:236) 
at android.app.ActivityThread.main(ActivityThread.java:8056) 
at java.lang.reflect.Method.invoke(Native Method) 
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:656) 
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:967) 

# Simple Jetpack Compose Navigation Example
![](screenshots/Simple_Jetpack_Compose_Navigation_Example_01.gif)

## Requirements
- Android Studio Flamingo or later

## Tech Stack
- Jetpack Compose
- Navigation Compose
- Compose Destination

## Articles
- [Simple Jetpack Compose Navigation Example](https://vtsen.hashnode.dev/simple-jetpack-compose-navigation-example)
- [Compose Destinations - Navigation Library](https://vtsen.hashnode.dev/compose-destinations-navigation-library)
- [How to Add Bottom Navigation in Jetpack Compose?](https://vtsen.hashnode.dev/how-to-add-bottom-navigation-in-jetpack-compose)
- [How to Add Navigation Drawer in Jetpack Compose?](https://vtsen.hashnode.dev/how-to-add-navigation-drawer-in-jetpack-compose)
- [How to Add Deep Links in Jetpack Compose?](https://vtsen.hashnode.dev/how-to-add-deep-links-in-jetpack-compose)

## Branches
- [master](https://github.com/vinchamp77/Demo_SimpleNavigationCompose/tree/master) - Basic Compose Navigation
- [compose_destinations](https://github.com/vinchamp77/Demo_SimpleNavigationCompose/tree/compose_destinations) -  Basic Compose Navigation (Using [Compose Destinations](https://github.com/raamcosta/compose-destinations/) library)
- [bottom_nav](https://github.com/vinchamp77/Demo_SimpleNavigationCompose/tree/bottom_nav) - Bottom Navigation
- [bottom_nav_drawer](https://github.com/vinchamp77/Demo_SimpleNavigationCompose/tree/bottom_nav_drawer) - Bottom Navigation + Navigation Drawer
- [deeplink](https://github.com/vinchamp77/Demo_SimpleNavigationCompose/tree/deeplink) - Deep Link Example

## License
```
Copyright 2023 Vincent Tsen

Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

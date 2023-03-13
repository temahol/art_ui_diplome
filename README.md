## Automated tests for https://dodopizza.ru/

## Content

- [Stack of technologies](#stack-of-technologies)
- []
- []
- []
- []
- []
- []

## :bookmark_tabs: Stack of technologies

<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="media/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="media/logo/Java.svg"></code>
<code><img width="5%" title="Junit5" src="media/logo/Junit5.svg"></code>
<code><img width="5%" title="Gradle" src="media/logo/Gradle.svg"></code>
<code><img width="5%" title="Selenide" src="media/logo/Selenide.svg"></code>
<code><img width="5%" title="GitHub" src="media/logo/GitHub.svg"></code>
<code><img width="5%" title="Jenkins" src="media/logo/Jenkins_logo.svg"></code>
<code><img width="5%" title="Selenoid" src="media/logo/Selenoid.svg"></code>
<code><img width="5%" title="Allure Report" src="media/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Jira" src="media/logo/Jira.svg"></code>
<code><img width="5%" title="Telegram" src="media/logo/Telegram.svg"></code>
</p>

## E2E Tests

- City Selection Check
- Checking for wrong city selection
- Checking the choice of three pizzas
- Dessert Selection Check
- Checking the selection of snacks
- Checking pizza size selection

## :computer: Running tests from the terminal

```bash
gradle clean project_test
```
### Remote running tests

```bash
clean
project_test
-Dremote=${SELENOID_URL}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser=${BROWSER}
-Dbrowser_size=${BROWSER_SIZE}
```

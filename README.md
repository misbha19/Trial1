# Trial1
CucumberBDD FW with TestNG and Maven

# How to run the test
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@mm"

# How to merge code
- git checkout main
- git pull origin main
- git merge feature branch name goes here.
    - Example: git merge QA-1
- git push origin master

# How fix merge conflict
To write a commit message and get out of VI, follow these steps:
- press i (i for insert)
- write your merge message
- press esc (escape)
- write :wq (write & quit)
- then press enter
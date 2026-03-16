# git

- Repository (repos) : "Your project folder tracked by Git"

- Local Repository : "Project stored on your computer"

- Remote Repository : "Project stored on a server like GitHub"

- origin : "Default name of the main remote repository"

- Branch : "A version/line of development inside a repository"


###### work flow

```sh

New File -> Untracked --
                        \
                         --> Staged -> Commited -> New Version
                        /
Old File -> Modified --- 

```

###### local or remote

```sh
        push branch
        --------------------->---
        |                       |
---------------         ---------------- 
| local       |         | remote       |
---------------         ----------------
| - main      |         | - main       |
| - branch-1  |         | - version-1  |
| - branch-2  |         | - version-2  |
---------------         ----------------
    |                       |
    ---<---------------------
                pull version

```

---
## SETUP
---

install git by terminal

```sh
sudo apt install git-all

```

verify git is install

```sh
git --version
```

configration in git

```sh
git config user.name ""

git config user.email ""

```
check configration

```sh
git config user.name

git config user.email

```


---
## BASIC
---

### initialize

which local repos you make (__.git__)

```sh
git init

```
### add files to stage

new or modify file add in stage

```sh
git add folder/file

```

### add all files to stage 

every modification add in stage

```sh
git add .

```
### commit to save

committed this modification is stay with message

```sh
git commit -m "message"

```
### status check

present position of current repos

```sh
git status

```

### remove files to stage

```sh
rm folder/file

```

- add all file to stage
- commit to save

### erase file

delete file and stage automatically

```sh
git rm file

```
delete folder

```sh
git rm -r folder

```
-- commit to save

### erase git

destory all git logs in local

```sh
rm -rf .git

```

### clean

show untracked files

```sh
git clean -n

```
delete untracked files only

```sh
git clean -f

```
delete untracked files and folders

```sh
git clean -fd

```

---
## BRANCH
---

### view branch

show all branches of local

```sh
git branch -a

```
show all branches of remote

```sh
git branch -r

```

### switch branch

switch control to other branch

```sh
git checkout branch_name

```
or

```sh
git switch branch_name

```

### new branch

create new branch and switch into it

```sh
git checkout -b new_branch_name

```
or

```sh
git switch -c new_branch_name

```

### delete branch

delete branch if merged

```sh
git branch -d del_branch_name

```
delete branch by force

```sh
git branch -D del_branch_name

```
delete branch of remote origin

```sh
git push origin_name --delete branch_name

```

---
## UNDO
---

### reset

```sh
git reset HEAD~1

```
- committed removed
- Files remain in working folder

### soft reset

use when you committed by mistake

```sh
git reset --soft HEAD~1

```
- commited removed
- changes stay staged

### hard reset

use when you erase to last safe commit

```sh
git reset --hard HEAD~1

```
or

```sh
git reset --hard commit_id

```

---
## REMOTE OR LOCAL
---

### is connect to remote

view all connection to remote

```sh
git remote -v

```

### add remote by origin_name 

add new remote and alias url as origin_name

```sh
git remote add origin_name https://github.com/username/repos.git

```

### upload branch data to remote

upload local repos branch to remote origin 

```sh
git push origin_name branch_name

```

### download remote data to local 

download remote origin by local repos branch

```sh
git pull origin_name brnach_name

```
- fetch remote data
- merge with branch 

---
## COMBINE VERSION
---

### fetch

downloads remote data but doesn't modify file

```sh
git fetch origin_name

```

### merge

switch into main branch

```sh
git switch main

```
combine feature branch into main

```sh
git merge branch_name

```
### merge conflict

happens when same file part changed in both branches

```sh
<<<<<<< HEAD
your code
=======
incoming code
>>>>>>> branch_name

```
fix manually → then:

```sh
git add .
git commit

```

---
## SECONDARY PROJECT
---

### clone

Clone creates a complete local copy of a remote repo.

```sh
git clone https://github.com/username/repos.git

```

- downlaod project files
- download project log
- download project connection

### Server repos re-write by local

this push your local project branch to server by forcely and first clean server after upload your new work

```sh
git push --force origin_name brnach_name

```

### local repos re-write by server

```sh
git fetch origin_name

git reset --hard origin_name/branch_name

```
- deleted local commits
- matches remote exactly


---
### REVIEW
---

### log

view full commit history 

```sh
git log

```
- commit id
- author name
- commit date
- commit message

---

compact history view in one line

```sh
git log --oneline

```
view log by author

```sh
git log --author="username"

```
view log by commit message

```sh
git log --grep="keyword"

```
view log after specific date

```sh
git log --since="YYYY-MM-DD"

```
view log before specific date

```sh
git log --until="YYY-MM-DD"

```

### detail log

proper present commit log history

```sh
git show commit_id

```
stop more show by (PRESS - Q)


---
## GIT IGNORE FILE
---

(__.gitignore__) is git file that ignore files from TRACKING use for secreats, cache, env build files

```sh
# not require to push in remote
node_modules/
*.log
.env

```

---

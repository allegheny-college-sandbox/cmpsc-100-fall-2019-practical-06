# CMPSC 100-03 Practical Session 6

This practical will deepen your code reading skills by asking you to read and implement two `classes` managing a bank account `object` and a bill `object`.

* Assigned: Friday, 4 October 2019
* Due: Monday, 7 October 2019
* Point value: 15 points

# General guidelines for practical sessions

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Table of Contents

* [Cloning your repository](#cloning-your-repository)
* [Slack](#slack)
* [Github](#github)
* [Bills, Bills, Bills](#bills-bills-bills)
* [GatorGrader](#gatorgrader)
* [`commit` your work](#commit-your-work)

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## Bills, Bills, Bills

G. Wiz and his friends are grateful that, though they were charmed by The Boss, their game of HumanQuest is under control. However, he was so engrosssed in the game that he forgot to pay attention to what was going on in his very real gator world. He's been sent a bill by his hat store, Wiz Hats Unlimited, and it's overdue! He has to pay it right away. However, he's not so sure he'll have enough money.

Right now G. Wiz has `$184.80` in his account. Help him by writing a program that uses `GatorAccount.java` to:

* Implement the `BankAccount` class in `BankAccount`.java
* Implement the `Bill` class in `Bill.java`
* Subtract the bill amount from the bank account
* Display the result with the following fields from the bill:
    * Amount
    * Payee
    * Due date
* Display amount remaining in bank account after subtracting the bill

## Required Deliverables

`BankAccount.java`:

- [ ] Exists, untouched

`Bill.java`

- [ ] Exists
- [ ] Implements `NumberFormat.getCurrencyInstance()` (see `BankAccount.java`)

`GatorAccount.java`
- [ ] Implements the `BankAccount` `object`, with a `startingBalance`
- [ ] Implements the `Bill` `object` with a `payee`, `amount`, and `date`
- [ ] Uses the above-created `BankAccount` `object` to perform a `debit`
- [ ] Prints the following using:
* the bill `amount`
* the `payee` name
* due date using the correct method in `Bill.java`
* amount remaining in the account using the correct method in `BankAccount.java`

```
Subtracting a $149.23 bill from Wiz Hats Unlimited (payable on 9/14/19) you have: $35.57
```

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`

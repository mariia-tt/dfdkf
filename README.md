# Lab_12
## Task 1
You are probably familiar with the Change Making Problem problem.

The input to the Change Making Problem is a sequence of positive integers d1, d2, d3 ... dn and T, where di represents a coin denomination, and T is the target amount. Assuming an unlimited supply of coins of each denomination, we need to find the number of coins N required to form the given amount. An extra effort would be to find the exact coins to build up the amount.

Implement Change Making Problem (ATM) with Chain of Responsibility pattern. Greedy Algorithm vs. Chain of Responsibility pattern? How to properly implement cases when there is not enough money or not possible to provide the needed amount of money.

## Task 2
Implement Stamping API in Java. The goal is to reimplement Stamping API in Java for a simplified framework. The framework consists of:

interface Task, an interface of building unit;
class Signature that represents the smallest unit in framework and single task invocation;
class Group that represents the list of signatures, and when the group is called, the tasks will be applied one after another in the current process.
You need to implement Stamping API and Group Stamping in a similar manner as it is done in Celery. When the apply method is called for Group Stamping, there should happen an automatic stamping of the Signature with the groupId. Stamps are stored in the group header.
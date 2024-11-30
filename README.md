# Online Voting System Using Doubly Linked Lists

This project implements an **Online Voting System** in Java, showcasing the use of **Data Structures and Algorithms (DSA)** concepts, particularly **Doubly Linked Lists**. It provides a simple interface to simulate an election where voters can cast votes for their chosen candidates.

---

## Features
1. **Candidate Management:**
   - Add candidates to the election dynamically.
   - Store candidates in a doubly linked list for efficient traversal.

2. **Voter Management:**
   - Add voters dynamically to the voting system.
   - Use a doubly linked list to manage voter records and their voting status.

3. **Voting Process:**
   - Authenticate voters by validating their mobile numbers (10 digits, starting with `9`).
   - Prevent double voting by marking a voter as "has voted" after their vote is cast.
   - Votes are tallied for candidates in real-time.

4. **Results Display:**
   - Display the total votes for each candidate after voting is complete.

5. **Login Attempts:**
   - Allow up to 3 login attempts for voter authentication.
   - Restrict access after 3 invalid attempts.

---

## Data Structure Concepts

### Doubly Linked List:
1. **Candidate Nodes:**
   - Store candidate details (`name` and `votes`).
   - Each node has links to its `prev` and `next` candidates.

2. **Voter Nodes:**
   - Store voter details (`id` and `hasVoted` status).
   - Each node has links to its `prev` and `next` voters.

Doubly linked lists allow efficient addition of nodes at the end and traversal in both forward and backward directions.

---

## How It Works

### Step 1: Add Candidates
Candidates are predefined in the system (`Candidate 1`, `Candidate 2`) for this project. Additional candidates can also be added dynamically.

### Step 2: Add Voters and Authenticate
- The system prompts for voter details (`Name` and `Mobile Number`).
- The mobile number must be valid (10 digits, starting with `9`).
- After successful login, the voter is allowed to cast their vote.

### Step 3: Cast Votes
- The voter selects a candidate to vote for.
- Votes are updated in real-time, and the voter is marked as having voted.

### Step 4: Display Results
- After all voters have cast their votes, the system displays the election results.

---

## Sample Run
Welcome to Online Voting System Enter Number of voters you want to add: 2 Enter your Name: John Enter Mobile number: 9123456789 Login successful! Welcome John
<br>
Candidate 1
Candidate 2 Choose your operation: 1 Vote counted successfully.
Enter your Name: Alice Enter Mobile number: 9876543210 Invalid mobile number format. Login failed. Attempts left=2 Enter your Name: Alice Enter Mobile number: 9123456789 Login successful! Welcome Alice
<br>
Candidate 1
Candidate 2 Choose your operation: 2 Vote counted successfully.
Election Results: Candidate 1: 1 votes Candidate 2: 1 votes


---

## Prerequisites
- **Java JDK 8 or higher**
- A Java IDE or terminal for execution.

---

## How to Run

1. Clone the repository or download the project files.
2. Compile the `VotingSystem.java` file using:
   ```bash
   javac VotingSystem.java




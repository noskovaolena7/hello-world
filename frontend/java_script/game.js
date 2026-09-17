// Ask the player if they are ready until they click "OK"
let ready = confirm("Are you ready?");

while (!ready) {
    alert("The game will only start when you are ready");
    ready = confirm("Are you ready to play?");
}

let wins = 0;

// Continue playing rounds until the player wins 3 rounds
while (wins < 3) {

    // Generate a random integer between 0 and 9
    const target = Math.floor(Math.random() * 10);
    let guess = null;

    // Keep prompting until the correct number is guessed
    while (guess !== target) {
        // Show message and ask the player to guess the number between 0 and 9
        guess = parseInt(prompt("Guess a number between 0 and 9:"));

        if (isNaN(guess)) {
            alert("Please enter a number!");
            continue;
        }
        // Check if guess is lower or higher to the target
        if (guess < target) {
            alert("The number is higher than your guess");
        } else if (guess > target) {
            alert("The number is lower than your guess");
        }
    }

    // Show message that the player guessed the number correctly
    alert("🎉 You guessed the number! Win in the round!");

    wins++;

    if (wins < 3) {
        alert(`You have ${wins} win(s). Starting the next round!`);
    }
}

// Show message that the player has won the game
alert("🏆 Congratulations! You won 3 rounds and completed the game!");


var Game = function (guess, color, age, attempt, pet, guess2, answer, name, guess4, team, guess5) {
  this.guess = guess;
  this.color = color;
  this.age   = age;
  this.attempt = attempt;
  this.pet  = pet;
  this.guess2 = guess2;
  this.answer = answer;
  this.playing = true;
  this.name = name;
  this.guess4 = guess4;
  this.team = team;
  this.guess5 = guess5;
  this.randNum = Math.floor(Math.random() * 10 + 1);

  this.startGame = function(){
    this.runColor();
    this.runAge();
    this.runPet();
    this.runMath();
    this.runName();
    this.runTeam();
  }
}
  var checkAnswer = new Game ('What\'s my favorite color?',
                              'yellow',
                              '28',
                              'How old am I?',
                              '3',
                              'How many pets do I have?',
                              'I\'m thinking of a number between 1 and 10...what is it?',
                              'Rae',
                              'What is my middle name?',
                              'Seahawks',
                              'What is my favorite professional sports team?')


Game.prototype.runColor = function(){
  var asd = prompt(this.guess);

    if(asd == this.color) {
        alert('How amazing you must be a Phychic');
    } else {
        alert('That\'s ok. You\'ll get them next time!');
    }
};


Game.prototype.runAge = function(){
  var asd = prompt(this.attempt);

    if(asd == this.age) {
      alert('You got it!');
    } else {
      alert('Oh so close.');
    }
};

Game.prototype.runPet = function(){
  var asd = prompt(this.guess2);

    if(asd == this.pet) {
      alert('Incredible, you got it right!');
    } else {
      alert('Oh no. I thought you knew me. Try again.');
    }
};

Game.prototype.runMath = function(){

  while(this.playing){
    var asd = prompt(this.answer);
    var rand = this.randNum;

    console.log(rand);

     giveHint(asd, rand);

    if(asd == rand) {
      alert('You are amazing!');
    this.playing = false;
    } else {
      alert('That\'s ok, just try again.');
    }
  }
};


function giveHint(a, r){

var mathhints = document.getElementById('mathhints');
var hint = document.createElement('p');
console.dir(mathhints);
console.log(a,r);
  if(a > r){
      hint.innerHtml = 'Think smaller';
  } else {
      hint.innerHtml = 'Think bigger';
  }
  mathhints.appendChild(hint);
}

Game.prototype.runName = function(){
  var asd = prompt(this.guess4);

    if(asd == this.name) {
      alert('Great guess!');
    } else {
      alert('You almost got it!');
    }
};

Game.prototype.runTeam = function(){
  var asd = prompt(this.guess5);

    if(asd == this.team) {
      alert('You better believe it!');
    } else {
      alert('Oh man I can\'t beleive you got that wrong!');
    }
};

checkAnswer.startGame()
//var y = document.createElement('div');
//y.innerHtml = 'How anoying';
//var x = document.getElementById('mathhints');
//x.innerHtml = 'T
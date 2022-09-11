<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Vote for us!</title>
    <link rel="stylesheet" href="./candidates.css">
</head>

<body>
    <div class="container flex flex-col align-center">
    <h1>Vote for us</h1>
    <main class="flex flex-wrap align-evenly">
    <div class="card">
      <form action="/vote" method="post" class="flex flex-col align-center" href="#">
        <img src="./1.jpeg">
        <p>name surname</p>
        <input name="candidateId" type="hidden" value="candidate_id">
        <button type="submit" class="vote flex align-center">Vote</button>
      </form>
    </div>
    <div class="card">
      <form action="/vote" method="post" class="flex flex-col align-center" href="#">
        <img src="images/1.jpeg">
        <p>name surname</p>
        <input name="candidateId" type="hidden" value="candidate_id">
        <button type="submit" class="vote flex align-center">Vote</button>
      </form>
    </div>
    <div class="card">
      <form action="/vote" method="post" class="flex flex-col align-center" href="#">
        <img src="images/1.jpeg">
        <p>name surname</p>
        <input name="candidateId" type="hidden" value="candidate_id">
        <button type="submit" class="vote flex align-center">Vote</button>
      </form>
    </div>
    </main>
    
      <p>-------------------------------------------------------</p>
      <a class="back flex align-center" href="/votes">Show total votes</a>
    </div>
</body>

</html>
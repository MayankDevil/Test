/*
-   website-22 "E-Commerce"
-   Copyright by ( https://github.com/MayankDevil/ )
-   Designed | Developed by MayankDevil
-   JavaScript : ./js/script.js
*/
try
{
    // Create an audio context
const audioContext = new (window.AudioContext || window.webkitAudioContext)();

// Create an audio buffer source
const audioSource = audioContext.createBufferSource();

// Load an audio file
fetch('path/to/your/audiofile.mp3')
  .then(response => response.arrayBuffer())
  .then(data => audioContext.decodeAudioData(data))
  .then(buffer => {
    // Assign the decoded audio buffer to the source
    audioSource.buffer = buffer;

    // Connect the source to the audio context's destination (i.e., speakers)
    audioSource.connect(audioContext.destination);

    // Start playing the audio
    audioSource.start();
  })
  .catch(error => console.error('Error loading audio:', error));
}
catch(error)
{
    console.warn(error)
}

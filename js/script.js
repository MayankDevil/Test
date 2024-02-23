/*
-   website-22 "E-Commerce"
-   Copyright by ( https://github.com/MayankDevil/ )
-   Designed | Developed by MayankDevil
-   JavaScript : ./js/script.js
*/
try
{
    sangeetData = [
        {
          title : `Bad boy`,
          duration : `03:17`,
          source : `data/song/Bad boy.mp3`
        },
        {
          title : `Chrissy Constanza`,
          duration : `01:00`,
          source : `data/song/Chrissy Costanza.mp3`
        },
        {
          title : `I Am Dangerous`,
          duration : `01:00`,
          source : `data/song/I Am Dangerous.mp3`
        },
        {
          title : `I Like It Loud`,
          duration : `01:00`,
          source : `data/song/I Like It Loud.mp3`
        }
    ]
  
    let audioList = document.getElementById('audioList').firstElementChild
    
    /*
        -------------------------
        | audio Layout function |
        -------------------------
    */
  
    function audioLayout(data)
    {
        // console.log(data.source)

        return (`

            <article class="flex">

                <h5 class="songName"> ${data.title} </h5>

                <div class="flex">

                    <h6 class="time"> ${data.duration} </h6>

                    <button class="song_play_btn"> &#9205; </button>

                </div>

            </article>

        `)
    }
    
    /*
        [ fetch data in audio Layout or display ]--------------------------------
    */
    
    for (i = 0; i < sangeetData.length; i++)
    {
        audioList.insertAdjacentHTML("afterbegin",`${ audioLayout(sangeetData[i]) }`)
  
    }
    
    let audioTrack = document.getElementsByTagName('article')
    
    let audioPlayer = document.getElementById('audioPlayer').children[0]
  
    for (i = 0; i < audioTrack.length; i++)
    {
        audioTrack[i].onclick = () => {
        
            //console.log(sangeetData[i].source)
        
            audioPlayer.src = sangeetData[i].source
        }
    }

  // let audioPlayer = document.getElementById('source')

  // audioPlayer.src = sangeetData[0].source

  const audio = new Audio(sangeetData[0].source);

  audio.play();

  setTimeout(function () {
    audio.pause();
    // console.log('Audio stopped after', timeLimitInSeconds, 'seconds.');
  }, 1000);

}
catch (error)
{
  console.warn(error)
} 

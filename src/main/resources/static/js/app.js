const newbutton = document.querySelector('.newartist')
button.addEventListener('click', addArtistToPage)

const aside = document.querySelector('aside')
aside.addEventListener('click', event => {
	if (event.target.classList.contains('artistButton')) {
		getArtist(event.target)
	}
	if (event.target.classList.contains('albumButton')} {
		getAlbum(event.target);
	}
})

const button2 = document.querySelector('.button2')
button2.addEventListener('click', getLukeSkywalker)

function addArtistToPage() {
	// Creates a new AJAX request
	var xhttp = new XMLHttpRequest()
	// Sets behavior for when the AJAX request is complete
	xhttp.addEventListener('readystatechange', function() {
		// Checks the ready state and http status code
		if (isReady(xhttp)) {
			// Typical action to be performed when the document is ready:
			const sidebar = document.querySelector('aside')

			 sidebar.innerHTML += this.response

		}
	})
	
	// Opens the request and sets the type of request,
	// location of the data,
	// and whether the request is asynchronous (true or false)
	

	xhttp.open('GET', '../sidebar.html', true)
	// Sends the request to the server
	xhttp.send()
}

const studentsButton = document.querySelector('.studentsButton')
studentsButton.addEventListener('click', getStudents)

function getArtists() {
	const xhr = new XMLHttpRequest()
	xhr.addEventListener('readystatechange', function() {
		if(isReady(this)) {
			const artists = JSON.parse(this.response)
			console.log(artists)
			
			const aside = document.querySelector('aside')
			const list = document.createElement('ul')
			artists.forEach(artist => {
				list.innerHTML += `<li>${artist.name}<button class="artistButton" data-key="${artist.id}">Get Artist Info</button></li>`
			})
			aside.appendChild(list)
		}
	})
	xhr.open('GET', '/api/artists', true)
	xhr.send()
}

function getArtist(artist) {
	const id = artist.getAttribute('data-key');
	console.log(id);
	const xhr = new XMLHttpRequest();
	xhr.addEventListener('readystatechange', function() {
		if(isReady(this)) {
			const artist = JSON.parse(this.response)
			
			const aside = document.querySelector('aside')
			aside.innerHTML = `
				<h2>${artist.name}</h2>
				<img src="${artist.favLanguage}" alt="An image of ${artist.name}"></img>
			`
			const albumList = document.createElement('ul')
			artist.forEach(album =>{
				if(album.artist === artist) {
				albumList.innerHTML += `<li>${album.name}<button class="albumButton" data-key="${album.id}">Get Album Info</button></li>`	
				}
			})
			aside.appendChild(albumList);
		}
	})
	xhr.open('GET', `/api/artists/${id}`, true)
	xhr.send()
}

function isReady(request) {
	return request.readyState == 4 && request.status == 200
}
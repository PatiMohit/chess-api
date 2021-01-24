# chess-api

This is chess api: 

Notations - https://www.ichess.net/blog/chess-notation/

Rules - https://www.chesscoachonline.com/chess-articles/chess-rules 

Accptance :- 
1) When sent a post request with START , it should reset the game and return the response READY in body.
2) When sent a post request with move in payload (using chess notations) it should return valid if it is valid move or else invalid.

Api end point - http://<your_ip_address>:<port>/v1/playChess
type - post 
Request: 
{
	request:"START"
}
Response : 

{
    "value": "READY"
}

Request: 
{
	"move":"Rab8" // Move Rook from a column (as there are two rook ) to B8 position ( B column and 8th row)
}
Response:{
	"moveStatus":"Valid"
}




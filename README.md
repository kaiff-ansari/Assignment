# AI Image Generator Project (Backend - Spring Boot)

## Project Overview
This project is a backend application built using **Java Spring Boot**.  
It is intended to enhance text prompts using AI (like Google Gemini) and prepare them for image generation.  

The main workflow (planned) was:
1. Accept user input (prompt/message) via REST API.
2. Enhance the text to make it professional using AI.
3. (Future) Generate images based on the enhanced prompt.

---

## Features Implemented
- Spring Boot backend with REST API endpoints.
- `ChatService` implemented for AI prompt enhancement.
- Environment variable configuration for API keys.
- Controller and model (`PromptRequest`) for handling JSON requests.
- WebClient used to call external AI APIs.
- Error handling for API responses.
- Structured code ready for frontend integration.

---

## What Was Not Completed
Due to **API quota and token limitations**, the AI integration could not be fully completed:

- Google Gemini 2.0 free tier quota = 0  
- No valid API key available to generate AI responses  
- Image generation feature could not be tested or implemented  

<img width="1517" height="970" alt="apiError" src="https://github.com/user-attachments/assets/c31bcf21-6230-435b-8bdb-3e564078a193" />


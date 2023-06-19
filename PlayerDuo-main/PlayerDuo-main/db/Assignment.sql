DROP DATABASE DATABASE [Assignment_PRJ301]
GO 
USE [Assignment_PRJ301]
GO 
CREATE TABLE [Admin] (
	[ad_username] VARCHAR(50) PRIMARY KEY,
	[ad_password] VARCHAR(50) NOT NULL,
	[ad_name] NVARCHAR(50) NOT NULL,
	[ad_address] NVARCHAR(100) NOT NULL,
	[created_date] DATETIME Default GETDATE()
)
GO
CREATE TABLE [Account](
	[Email] varchar(50) PRIMARY KEY,
	[Password] VARCHAR(100) NOT NULL,
	[Enable] bit NOT NULL
)
GO
CREATE TABLE [UserProfile](
	[IdUser] INT PRIMARY KEY IDENTITY(1,1),
	[Email] varchar(50),
	[Avatar] IMAGE,
	[Name] VARCHAR(100) NOT NULL,	
	[Gender] bit NOT NULL,
	[DateOfBirth] DATE NOT NULL,
	[Address] VARCHAR(50) NOT NULL,
	[CreateAt] DATETIME NOT NULL,
	[UpdateAt] DATETIME	
)
GO
ALTER TABLE [UserProfile]
ADD CONSTRAINT FK_UserAccount
FOREIGN KEY ([Email]) REFERENCES Account([Email])
GO
CREATE TABLE [PlayProfile] (
	[IdPlayer] INT PRIMARY KEY IDENTITY(1,1),
	[IdUser] INT NOT NULL,
	[NickName] NVARCHAR(50),
	[RentPrice] FLOAT,
	[Introdution] NVARCHAR(1000),
	[Picture1] IMAGE,
	[Picture2] IMAGE,
	[Picture3] IMAGE,
	[GameList] VARCHAR(50),
	[UpdateAt] DATETIME	
)
GO
ALTER TABLE [PlayProfile]
ADD CONSTRAINT FK_PlayProfileUser
FOREIGN KEY ([IdUser]) REFERENCES [UserProfile]([IdUser])
GO
CREATE TABLE [Game](
	[IdGame] INT PRIMARY KEY IDENTITY(1,1),
	[GameName] VARCHAR(100) NOT NULL,
	[Type] bit NOT NULL,
)
GO
CREATE TABLE [PlayerGame] (
	[IdPlayer] INT,
	[IdGame] INT 
)
ALTER TABLE [PlayerGame]
ADD CONSTRAINT FK_GameList
FOREIGN KEY ([IdPlayer]) REFERENCES [PlayProfile]([IdPlayer])
GO
ALTER TABLE [PlayerGame]
ADD CONSTRAINT FK_PlayerGame
FOREIGN KEY ([IdGame]) REFERENCES [Game]([IdGame])
GO
CREATE TABLE [PlayerFeedback] (
	[IdFeedback] INT PRIMARY KEY IDENTITY(1,1),
	[CreateBy] INT NOT NULL,
	[CreateAt] DATETIME NOT NULL,
	[Rate] FLOAT NOT NULL,
	[Comment] NVARCHAR(300)
)
GO
ALTER TABLE [PlayerFeedback]
ADD CONSTRAINT FK_PlayerFeedbackUser
FOREIGN KEY ([CreateBy]) REFERENCES [UserProfile]([IdUser])
GO
CREATE TABLE [DuoHistory](
	[IdDuo] INT PRIMARY KEY IDENTITY(1,1),
	[Start] DATETIME NOT NULL,
	[End] DATETIME NOT NULL,
	[IdPlayer] INT NOT NULL,
	[IdUser] INT NOT NULL,
)
GO
ALTER TABLE [DuoHistory]
ADD CONSTRAINT FK_UserDuo
FOREIGN KEY ([IdUser]) REFERENCES [UserProfile]([IdUser])
GO
ALTER TABLE [DuoHistory]
ADD CONSTRAINT FK_PlayerDuo
FOREIGN KEY ([IdPlayer]) REFERENCES [UserProfile]([IdUser])
GO 
CREATE TABLE [Wallet](
	[IdWallet] INT PRIMARY KEY IDENTITY(1,1),
	[IdUser] INT NOT NULL,
	[Balance] FLOAT NOT NULL,
)
ALTER TABLE [Wallet]
ADD CONSTRAINT FK_UserWallet
FOREIGN KEY ([IdUser]) REFERENCES [UserProfile]([IdUser])
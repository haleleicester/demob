/*SQLCMD Mode required*/
:SETVAR DatabaseName "DEMOBdb"
:SETVAR UserName "username"
:SETVAR strUserName N'username'
:SETVAR strPassword N'password'
CREATE DATABASE $(DatabaseName);
GO

USE $(DatabaseName);
 GO
 CREATE LOGIN $(UserName) with password=$(strPassword),
DEFAULT_DATABASE=$(DatabaseName), CHECK_POLICY = OFF
 GO
 CREATE USER $(UserName) FOR LOGIN $(UserName)
 EXEC sp_addrolemember N'db_owner', $(strUserName)
 GO
 USE master
 GO
 GRANT CONNECT SQL TO $(UserName)

USE $(DatabaseName);
 GO

/****** Object:  Table [dbo].[Patient]    Script Date: 11/11/2015 12:40:43 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Patient](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[nhs_number] [int] NOT NULL,
	[picture] [nvarchar](255) NULL,
	[name] [nvarchar](255) NULL,
	[dob] [datetime] NULL,
	[legal_status] [int] NULL,
 CONSTRAINT [PK_Patient] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

USE $(DatabaseName);
 GO

 /****** Object:  Table [dbo].[MentalHealthObs]    Script Date: 11/11/2015 12:41:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[MentalHealthObs](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date_time] [datetime] NULL,
	[nhs_number] [int] NULL,
	[time_frequency] [int] NULL,
	[description] [nvarchar](max) NULL,
 CONSTRAINT [PK_MentalHealthObs] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

USE $(DatabaseName);
 GO

 /****** Object:  Table [dbo].[PhysicalHealthObs]    Script Date: 11/11/2015 12:42:51 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[PhysicalHealthObs](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date_time] [datetime] NULL,
	[nhs_number] [int] NULL,
	[heart_rate] [float] NULL,
	[blood_pressure_sys] [int] NULL,
	[blood_pressure_diastolic] [int] NULL,
	[resp_rate] [float] NULL,
	[sats] [float] NULL,
	[cns] [float] NULL,
	[weight] [float] NULL,
	[bood_sugar] [float] NULL,
 CONSTRAINT [PK_PhysicalHealthObs] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
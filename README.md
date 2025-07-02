This is a Kobweb template for a typical single-page service-based business website.
Ideal for businesses offering services. Easily customizable with placeholder content and modular structure

## Getting Started

First, run the development server by typing the following command in a terminal under the `site` folder:

```bash
$ cd site
$ kobweb run
```

Open [http://localhost:8080](http://localhost:8080) with your browser to see the result.

You can use any editor you want for the project, but we recommend using **IntelliJ IDEA Community Edition** downloaded
using the [Toolbox App](https://www.jetbrains.com/toolbox-app/).

Press `Q` in the terminal to gracefully stop the server.

### Live Reload

While Kobweb is running, feel free to modify the code! When you make any changes, Kobweb will notice this
automatically, and the site will indicate the status of the build and automatically reload when ready.

## Exporting the Project

When you are ready to ship, you should shutdown the development server and then export the project using:

```bash
$ kobweb export --layout static
```

When finished, you can run a Kobweb server in production mode to test it.

```bash
$ kobweb run --env prod --layout static
```

The above export generates a layout which is compatible with any static hosting provider of your choice, such as
GitHub Pages, Netlify, Firebase, etc. There is also a more powerful export option to create a fullstack server,
but as the additional power provided by that approach is not needed by most users and comes with more expensive
hosting costs, it is not demonstrated in this project.

You can read more about static layouts here: https://bitspittle.dev/blog/2022/staticdeploy

You can read more about fullstack layouts here: https://bitspittle.dev/blog/2023/clouddeploy

const path = require('path');
const webpack = require('webpack');


const config = {
    mode: "production",
    entry: './src/index.ts',
    output: {
        filename: 'solidityg4.js',
        path: path.resolve(__dirname, 'dist'),
        // the name of the exported antlr4
        library: "solidityg4",
        libraryTarget: 'window',
        clean: true
    },
resolve: {
        fallback: {
          fs: false,
          module: false,
          net: false
        }
      },
    target: "web",
    module: {
        rules: [{
            test: /\.js$/,
            exclude: /node_modules/,
            use: {
                loader: 'babel-loader',
                options: {
                    presets: [
                      ['@babel/preset-env', { "targets": ">0.3%, not dead, not op_mini all, not IE > 0, not samsung 4, not and_uc 12.12" }]
                    ]
                  }
            }
        }]
    }
};
module.exports = config
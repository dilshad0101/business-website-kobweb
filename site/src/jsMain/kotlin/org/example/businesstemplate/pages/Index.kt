package org.example.businesstemplate.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.StyleVariable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.data.add
import com.varabyte.kobweb.core.init.InitRoute
import com.varabyte.kobweb.core.init.InitRouteContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.example.businesstemplate.BlueColor
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.example.businesstemplate.WhiteColor
import org.example.businesstemplate.components.address1
import org.example.businesstemplate.components.brandName
import org.example.businesstemplate.components.email1
import org.example.businesstemplate.components.layouts.PageLayoutData
import org.example.businesstemplate.components.locationsAsList
import org.example.businesstemplate.components.locationsAsString
import org.example.businesstemplate.components.phone1
import org.example.businesstemplate.components.phone2
import org.example.businesstemplate.components.sections.Footer
import org.example.businesstemplate.toSitePalette
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.JustifyContent

@InitRoute
fun initHomePage(ctx: InitRouteContext) {
    ctx.data.add(PageLayoutData("Home"))
}


@Page
@Layout(".components.layouts.PageLayout")
@Composable
fun HomePage() {

    Column(Modifier.gap(2.cssRem)) {
        Column(
            Modifier.id("About")
        ) {
            SpanText(
                text = "Our Services",
                modifier = Modifier
                    .color(BlueColor)
                    .fontWeight(FontWeight.Bold)
                    .fontSize(2.cssRem)
                    .padding(topBottom = 3.vh)
            )

            SpanText(
                "$brandName provides reliable crane recovery and towing services for vehicles involved in accidents or breakdowns.",
                modifier = Modifier
                    .color(Colors.Black)
                    .textAlign(TextAlign.Justify)
            )

            // Paragraph 2
            SpanText(
                "Whether it’s a car, van, or heavy vehicle, we’re equipped to handle the situation safely and quickly.",
                modifier = Modifier
                    .color(Colors.Black)

                    .textAlign(TextAlign.Justify)
            )

            // Paragraph 3
            SpanText(
                "We cover $locationsAsString, and nearby areas. Our team is available when you need us, with trained staff and well-maintained recovery vehicles.",
                modifier = Modifier
                    .padding(top = 0.8.cssRem)
                    .color(Colors.Black)
                    .textAlign(TextAlign.Justify)
            )

            // Call to Action
            SpanText(
                "Call $phone1 to book a service.",
                modifier = Modifier
                    .padding(top = 1.2.cssRem)
                    .fontWeight(FontWeight.SemiBold)
                    .color(Colors.Black)
                    .color(Color.rgb(0, 0, 0))
            )

        }
        Column {
            SpanText(
                text = "We’re Available Across",
                modifier = Modifier
                    .color(BlueColor)
                    .fontWeight(FontWeight.Bold)
                    .fontSize(2.cssRem)
                    .padding(topBottom = 3.vh)
            )
            val locations = locationsAsList
            Div(
                attrs = Modifier
                    .display(DisplayStyle.Flex)
                    .flexWrap(FlexWrap.Wrap)
                    .gap(1.cssRem)
                    .justifyContent(JustifyContent.Center)
                    .padding(top = 1.5.cssRem)
                    .toAttrs()
            ) {
                locations.forEach { location ->
                    SpanText(
                        location,
                        Modifier
                            .padding(leftRight = 1.2.cssRem, topBottom = 0.7.cssRem)
                            .backgroundColor(WhiteColor)
                            .color(BlueColor)
                            .fontWeight(FontWeight.Medium)
                            .borderRadius(0.7.cssRem)
                            .cursor(Cursor.Pointer))
                }
            }
        }
        Column(
            modifier = Modifier.id("Contact")
        ){
            SpanText(
                "Contact",
                modifier = Modifier
                    .color(BlueColor)
                    .fontWeight(FontWeight.Bold)
                    .fontSize(2.cssRem)
                    .padding(topBottom = 3.vh)
            )

            Div(attrs = Modifier
                .padding(bottom = 1.vh)
                .toAttrs()
            ) {
                SpanText(
                    "Contact: ",
                    modifier = Modifier.fontWeight(FontWeight.Normal)
                )
                SpanText(
                    "$phone1, $phone2",
                    modifier = Modifier
                        .fontWeight(FontWeight.SemiBold)
                        .padding(left = 0.5.cssRem)
                )
            }


            Div(attrs = Modifier
                .padding(bottom = 1.vh)
                .toAttrs()){
                SpanText(
                    "Email: ",
                    modifier = Modifier
                        .fontWeight(FontWeight.Normal)
                        .padding(top = 1.cssRem)
                )
                SpanText(
                    email1,
                    modifier = Modifier
                        .fontWeight(FontWeight.SemiBold)
                        .padding(left = 0.5.cssRem)
                )

            }

            Div(attrs = Modifier
                .padding(bottom = 1.vh)
                .toAttrs()) {
                SpanText(
                    "Address: ",
                    modifier = Modifier
                        .fontWeight(FontWeight.Normal)
                        .padding(top = 1.cssRem)
                )
                SpanText(
                    address1,
                    modifier = Modifier
                        .fontWeight(FontWeight.SemiBold)
                        .padding(left = 0.5.cssRem)
                )
            }

        }

    }

}

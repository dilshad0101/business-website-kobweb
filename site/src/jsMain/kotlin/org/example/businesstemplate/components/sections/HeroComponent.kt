package org.example.businesstemplate.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxHeight
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.businesstemplate.BlueColor
import org.example.businesstemplate.WhiteColor
import org.example.businesstemplate.components.phone1
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw

@OptIn(DelicateApi::class)
@Composable
fun HeroComponent(){
    Box(
        Modifier
            .fillMaxWidth()
            .height(auto)
            .padding(0.px)
            .margin(0.px)
            .position(Position.Relative),
        contentAlignment = Alignment.Center
    ) {
        val bp = rememberBreakpoint()

        val imageModifier = Modifier
            .width(100.vw)
            .display(DisplayStyle.Block)
            .padding(0.px)
            .margin(0.px)
            .objectFit(ObjectFit.Cover)   // Maintain aspect ratio & cover box
            .let {
                if (bp >= Breakpoint.MD) {
                    it.maxHeight(60.vh)   // Restrict height only on desktop
                } else {
                    it.height(50.vh)       // Let it scale normally on mobile
                }
            }
        Box(
            Modifier
                .fillMaxSize()
                .backgroundColor(Color.rgba(r = 0f,b = 0f,g= 0f,a= 0.7f))
                .position(Position.Absolute)
                .top(0.px)
                .left(0.px)
        )
        Image(
            src = "/heroImageLarge.jpg",
            modifier = imageModifier
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(1.vh),
            modifier = Modifier.fillMaxWidth()
                .position(Position.Absolute)
                .padding(leftRight = 8.vw)

        ) {

            SpanText(
                text = "Heavy Duty\n Crane Recovery\n Services",
                modifier = Modifier
                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.Bold)
                    .lineHeight(1.2)
                    .color(WhiteColor)
                    .let {
                        if (bp >= Breakpoint.MD) {
                            it.fontSize(3.cssRem)
                        } else {
                            it.fontSize(1.7.cssRem)
                        }
                    }
            )
            SpanText("For Accidents, Breakdowns\n and Towing",
                modifier =  Modifier.color(WhiteColor)
                    .fontSize(1.cssRem)
                    .textAlign(TextAlign.Start)
                    .fontWeight(FontWeight.SemiBold)
            )
            Button(onClick = {  },
                modifier = Modifier.backgroundColor(BlueColor)
            ) {
                SpanText(
                    phone1,
                    modifier = Modifier.color(WhiteColor)
                )
            }
        }
    }
}
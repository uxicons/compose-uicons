package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollTorah: ImageVector? = null

val Icons.Bs.ScrollTorah: ImageVector
    get() = _ScrollTorah ?: UXIcon(name = "ScrollTorah") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                verticalLineToRelative(2f)
                lineTo(5f, 2f)
                lineTo(5f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(19f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.63f, 15.51f)
                horizontalLineToRelative(4.27f)
                lineToRelative(2.11f, 3.46f)
                lineToRelative(2.11f, -3.46f)
                horizontalLineToRelative(4.27f)
                lineToRelative(-2.13f, -3.5f)
                lineToRelative(2.13f, -3.5f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(-2.11f, -3.47f)
                lineToRelative(-2.11f, 3.47f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(2.13f, 3.5f)
                lineToRelative(-2.13f, 3.5f)
                close()
                moveTo(7.41f, 14.51f)
                lineToRelative(0.94f, -1.54f)
                lineToRelative(0.94f, 1.54f)
                horizontalLineToRelative(-1.88f)
                close()
                moveTo(12f, 17.04f)
                lineToRelative(-0.94f, -1.53f)
                horizontalLineToRelative(1.87f)
                lineToRelative(-0.94f, 1.53f)
                close()
                moveTo(16.59f, 14.51f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(0.94f, -1.54f)
                lineToRelative(0.94f, 1.54f)
                close()
                moveTo(16.59f, 9.51f)
                lineToRelative(-0.94f, 1.54f)
                lineToRelative(-0.94f, -1.54f)
                horizontalLineToRelative(1.87f)
                close()
                moveTo(12.0f, 6.96f)
                lineToRelative(0.94f, 1.54f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(0.94f, -1.54f)
                close()
                moveTo(10.45f, 9.51f)
                horizontalLineToRelative(3.1f)
                lineToRelative(1.52f, 2.5f)
                lineToRelative(-1.53f, 2.5f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(-1.53f, -2.5f)
                lineToRelative(1.52f, -2.5f)
                close()
                moveTo(7.41f, 9.51f)
                horizontalLineToRelative(1.87f)
                lineToRelative(-0.94f, 1.54f)
                lineToRelative(-0.94f, -1.54f)
                close()
            }
        }.also { _ScrollTorah = it}

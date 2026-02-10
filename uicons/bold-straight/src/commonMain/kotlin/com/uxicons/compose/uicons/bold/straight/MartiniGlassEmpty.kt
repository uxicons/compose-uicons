package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassEmpty: ImageVector? = null

val Icons.Bs.MartiniGlassEmpty: ImageVector
    get() = _MartiniGlassEmpty ?: UXIcon(name = "MartiniGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.69f, 0.71f, 3.3f, 1.96f, 4.44f)
                lineToRelative(8.54f, 8.2f)
                verticalLineToRelative(6.86f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-6.86f)
                lineToRelative(8.53f, -8.19f)
                curveToRelative(1.25f, -1.14f, 1.97f, -2.76f, 1.97f, -4.46f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(19.98f, 3.76f)
                lineToRelative(-7.98f, 7.66f)
                lineTo(4.02f, 3.76f)
                lineToRelative(-0.03f, -0.03f)
                curveToRelative(-0.24f, -0.21f, -0.43f, -0.46f, -0.59f, -0.74f)
                horizontalLineToRelative(17.2f)
                curveToRelative(-0.16f, 0.28f, -0.37f, 0.54f, -0.62f, 0.76f)
                close()
            }
        }.also { _MartiniGlassEmpty = it}

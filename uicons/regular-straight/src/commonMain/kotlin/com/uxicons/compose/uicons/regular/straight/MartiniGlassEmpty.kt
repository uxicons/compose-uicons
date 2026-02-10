package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassEmpty: ImageVector? = null

val Icons.Rs.MartiniGlassEmpty: ImageVector
    get() = _MartiniGlassEmpty ?: UXIcon(name = "MartiniGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.55f, 0.66f, 3.04f, 1.81f, 4.09f)
                lineToRelative(9.19f, 8.36f)
                verticalLineToRelative(8.56f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-8.56f)
                lineToRelative(9.19f, -8.36f)
                curveToRelative(1.15f, -1.04f, 1.81f, -2.53f, 1.81f, -4.09f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(20.85f, 3.6f)
                lineToRelative(-8.85f, 8.04f)
                lineTo(3.15f, 3.6f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.48f, -0.44f, -0.83f, -0.99f, -1.01f, -1.6f)
                horizontalLineToRelative(19.71f)
                curveToRelative(-0.18f, 0.61f, -0.53f, 1.17f, -1.01f, 1.6f)
                close()
            }
        }.also { _MartiniGlassEmpty = it}

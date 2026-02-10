package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassEmpty: ImageVector? = null

val Icons.Ts.MartiniGlassEmpty: ImageVector
    get() = _MartiniGlassEmpty ?: UXIcon(name = "MartiniGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.07f, 0.04f)
                verticalLineToRelative(0.5f)
                curveTo(0.07f, 2.01f, 0.69f, 3.42f, 1.78f, 4.41f)
                lineToRelative(9.79f, 8.9f)
                verticalLineToRelative(9.73f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-9.73f)
                lineToRelative(9.79f, -8.9f)
                curveToRelative(1.09f, -0.99f, 1.71f, -2.4f, 1.71f, -3.87f)
                lineTo(24.07f, 0.04f)
                lineTo(0.07f, 0.04f)
                close()
                moveTo(21.68f, 3.67f)
                lineToRelative(-9.62f, 8.74f)
                lineTo(2.45f, 3.67f)
                curveToRelative(-0.76f, -0.69f, -1.23f, -1.62f, -1.35f, -2.63f)
                horizontalLineToRelative(21.94f)
                curveToRelative(-0.12f, 1.0f, -0.6f, 1.94f, -1.35f, 2.63f)
                close()
            }
        }.also { _MartiniGlassEmpty = it}

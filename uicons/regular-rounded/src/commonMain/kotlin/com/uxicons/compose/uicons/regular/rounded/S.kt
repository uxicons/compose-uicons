package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _S: ImageVector? = null

val Icons.Rr.S: ImageVector
    get() = _S ?: UXIcon(name = "S") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.15f, 24f)
                horizontalLineTo(7.92f)
                curveToRelative(-3.26f, 0f, -5.92f, -2.65f, -5.92f, -5.92f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0.01f, -1.31f, 2.0f, -1.31f, 2f, 0f)
                verticalLineToRelative(1.08f)
                curveToRelative(0f, 2.16f, 1.76f, 3.92f, 3.92f, 3.92f)
                horizontalLineToRelative(8.23f)
                curveToRelative(4.44f, -0.02f, 5.28f, -6.39f, 1.01f, -7.56f)
                lineToRelative(-10.85f, -2.94f)
                curveTo(-0.2f, 9.64f, 1.08f, 0.08f, 7.85f, 0f)
                horizontalLineToRelative(8.23f)
                curveToRelative(3.26f, 0f, 5.92f, 2.65f, 5.92f, 5.92f)
                verticalLineToRelative(1.08f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -2.16f, -1.76f, -3.92f, -3.92f, -3.92f)
                horizontalLineTo(7.85f)
                curveToRelative(-4.44f, 0.02f, -5.28f, 6.39f, -1.01f, 7.56f)
                lineToRelative(10.85f, 2.94f)
                curveToRelative(6.51f, 1.85f, 5.24f, 11.41f, -1.53f, 11.49f)
                close()
            }
        }.also { _S = it}

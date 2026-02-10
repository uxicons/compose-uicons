package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareStar: ImageVector? = null

val Icons.Ts.SquareStar: ImageVector
    get() = _SquareStar ?: UXIcon(name = "SquareStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.42f, 5.66f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(-1.52f, 4.34f)
                lineTo(5.71f, 10f)
                verticalLineToRelative(0.83f)
                lineToRelative(3.13f, 2.52f)
                lineToRelative(-1.17f, 3.91f)
                lineToRelative(0.67f, 0.51f)
                lineToRelative(3.65f, -2.37f)
                lineToRelative(3.66f, 2.37f)
                lineToRelative(0.67f, -0.51f)
                lineToRelative(-1.17f, -3.91f)
                lineToRelative(3.13f, -2.52f)
                verticalLineToRelative(-0.83f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(-1.52f, -4.34f)
                close()
                moveTo(14.01f, 12.99f)
                lineToRelative(0.93f, 3.12f)
                lineToRelative(-2.94f, -1.91f)
                lineToRelative(-2.94f, 1.91f)
                lineToRelative(0.93f, -3.12f)
                lineToRelative(-2.47f, -1.99f)
                horizontalLineToRelative(3.25f)
                lineToRelative(1.24f, -3.53f)
                lineToRelative(1.24f, 3.53f)
                horizontalLineToRelative(3.25f)
                lineToRelative(-2.47f, 1.99f)
                close()
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
            }
        }.also { _SquareStar = it}

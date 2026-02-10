package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareLeft: ImageVector? = null

val Icons.Ts.ArrowAltSquareLeft: ImageVector
    get() = _ArrowAltSquareLeft ?: UXIcon(name = "ArrowAltSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5.87f)
                lineToRelative(-5.46f, 5f)
                curveToRelative(-0.34f, 0.31f, -0.54f, 0.74f, -0.54f, 1.2f)
                reflectiveCurveToRelative(0.2f, 0.9f, 0.53f, 1.2f)
                lineToRelative(5.47f, 5.0f)
                verticalLineToRelative(-5.77f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                lineTo(11f, 11.5f)
                lineTo(11f, 5.87f)
                close()
                moveTo(10f, 16.0f)
                lineToRelative(-3.79f, -3.47f)
                curveToRelative(-0.13f, -0.12f, -0.2f, -0.28f, -0.2f, -0.46f)
                reflectiveCurveToRelative(0.07f, -0.34f, 0.2f, -0.46f)
                lineToRelative(3.79f, -3.47f)
                verticalLineToRelative(7.86f)
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
        }.also { _ArrowAltSquareLeft = it}

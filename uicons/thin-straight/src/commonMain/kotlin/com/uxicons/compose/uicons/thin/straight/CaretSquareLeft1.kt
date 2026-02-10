package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareLeft1: ImageVector? = null

val Icons.Ts.CaretSquareLeft1: ImageVector
    get() = _CaretSquareLeft1 ?: UXIcon(name = "CaretSquareLeft1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19.14f)
                lineToRelative(-6.49f, -5.94f)
                curveToRelative(-0.34f, -0.3f, -0.53f, -0.74f, -0.53f, -1.2f)
                reflectiveCurveToRelative(0.2f, -0.9f, 0.54f, -1.2f)
                lineToRelative(6.48f, -5.93f)
                verticalLineToRelative(14.27f)
                close()
                moveTo(13f, 7.13f)
                lineToRelative(-4.81f, 4.4f)
                curveToRelative(-0.14f, 0.12f, -0.21f, 0.28f, -0.21f, 0.46f)
                reflectiveCurveToRelative(0.07f, 0.34f, 0.2f, 0.46f)
                lineToRelative(4.82f, 4.41f)
                lineTo(13.0f, 7.13f)
                close()
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(24f, 24f)
                close()
                moveTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 23f)
                close()
            }
        }.also { _CaretSquareLeft1 = it}

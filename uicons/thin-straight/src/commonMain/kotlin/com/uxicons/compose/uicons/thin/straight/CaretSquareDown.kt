package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareDown: ImageVector? = null

val Icons.Ts.CaretSquareDown: ImageVector
    get() = _CaretSquareDown ?: UXIcon(name = "CaretSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.8f, 16.48f)
                curveToRelative(0.31f, 0.34f, 0.74f, 0.54f, 1.2f, 0.54f)
                reflectiveCurveToRelative(0.9f, -0.2f, 1.2f, -0.53f)
                lineToRelative(5.94f, -6.49f)
                lineTo(4.86f, 10.0f)
                lineToRelative(5.93f, 6.48f)
                close()
                moveTo(12.46f, 15.82f)
                curveToRelative(-0.24f, 0.26f, -0.68f, 0.27f, -0.92f, -0.0f)
                lineToRelative(-4.4f, -4.81f)
                horizontalLineToRelative(9.73f)
                lineToRelative(-4.41f, 4.82f)
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
        }.also { _CaretSquareDown = it}

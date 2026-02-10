package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretSquareUp: ImageVector? = null

val Icons.Ts.CaretSquareUp: ImageVector
    get() = _CaretSquareUp ?: UXIcon(name = "CaretSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.14f, 15f)
                lineTo(4.86f, 15f)
                lineToRelative(5.94f, -6.49f)
                curveToRelative(0.6f, -0.68f, 1.79f, -0.68f, 2.4f, 0.0f)
                lineToRelative(5.93f, 6.48f)
                close()
                moveTo(7.13f, 14f)
                horizontalLineToRelative(9.73f)
                lineToRelative(-4.4f, -4.81f)
                curveToRelative(-0.24f, -0.27f, -0.68f, -0.27f, -0.92f, -0.0f)
                lineToRelative(-4.41f, 4.82f)
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
        }.also { _CaretSquareUp = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareDown: ImageVector? = null

val Icons.Ts.AngleSquareDown: ImageVector
    get() = _AngleSquareDown ?: UXIcon(name = "AngleSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.23f, 10.16f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.85f, 4.85f)
                curveToRelative(-0.3f, 0.3f, -0.69f, 0.45f, -1.09f, 0.45f)
                reflectiveCurveToRelative(-0.79f, -0.15f, -1.09f, -0.45f)
                lineToRelative(-4.86f, -4.86f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.86f, 4.86f)
                curveToRelative(0.2f, 0.2f, 0.56f, 0.2f, 0.76f, 0f)
                lineToRelative(4.85f, -4.85f)
                close()
                moveTo(24f, 2.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _AngleSquareDown = it}

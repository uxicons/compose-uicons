package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareDown: ImageVector? = null

val Icons.Ts.ArrowAltSquareDown: ImageVector
    get() = _ArrowAltSquareDown ?: UXIcon(name = "ArrowAltSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 5f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 13f)
                lineTo(5.73f, 13f)
                lineToRelative(5.0f, 5.46f)
                curveToRelative(0.31f, 0.34f, 0.74f, 0.54f, 1.2f, 0.54f)
                reflectiveCurveToRelative(0.9f, -0.2f, 1.2f, -0.54f)
                lineToRelative(5f, -5.46f)
                horizontalLineToRelative(-5.63f)
                lineTo(12.5f, 5f)
                close()
                moveTo(12.4f, 17.79f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.24f, 0.26f, -0.68f, 0.27f, -0.92f, -0.0f)
                lineToRelative(-3.47f, -3.79f)
                horizontalLineToRelative(7.86f)
                lineToRelative(-3.47f, 3.79f)
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
        }.also { _ArrowAltSquareDown = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareDown: ImageVector? = null

val Icons.Ts.ArrowSquareDown: ImageVector
    get() = _ArrowSquareDown ?: UXIcon(name = "ArrowSquareDown") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(17.26f, 12.01f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.81f, 4.81f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.48f, -1.16f, 0.48f)
                reflectiveCurveToRelative(-0.85f, -0.17f, -1.16f, -0.48f)
                lineToRelative(-4.81f, -4.81f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.76f, 4.76f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10.76f)
                lineToRelative(4.76f, -4.76f)
                close()
            }
        }.also { _ArrowSquareDown = it}

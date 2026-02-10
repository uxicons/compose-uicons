package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareV: ImageVector? = null

val Icons.Ts.SquareV: ImageVector
    get() = _SquareV ?: UXIcon(name = "SquareV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(18.41f, 4f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-4.97f, 14.34f)
                curveToRelative(-0.6f, 1.37f, -1.45f, 1.66f, -2.52f, 1.66f)
                reflectiveCurveToRelative(-1.92f, -0.29f, -2.52f, -1.66f)
                lineTo(4.5f, 4f)
                horizontalLineToRelative(1.09f)
                lineToRelative(4.82f, 13.98f)
                curveToRelative(0.4f, 0.87f, 0.81f, 1.02f, 1.59f, 1.02f)
                curveToRelative(0.78f, 0f, 1.19f, -0.15f, 1.59f, -1.02f)
                lineToRelative(4.82f, -13.98f)
                close()
            }
        }.also { _SquareV = it}

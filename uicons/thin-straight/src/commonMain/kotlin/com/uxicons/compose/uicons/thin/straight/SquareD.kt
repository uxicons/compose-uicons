package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareD: ImageVector? = null

val Icons.Ts.SquareD: ImageVector
    get() = _SquareD ?: UXIcon(name = "SquareD") {
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
                moveTo(12.07f, 4f)
                horizontalLineToRelative(-5.07f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5.07f)
                curveToRelative(3.82f, 0f, 6.93f, -3.11f, 6.93f, -6.93f)
                verticalLineToRelative(-2.14f)
                curveToRelative(0f, -3.82f, -3.11f, -6.93f, -6.93f, -6.93f)
                close()
                moveTo(18f, 13.07f)
                curveToRelative(0f, 3.27f, -2.66f, 5.93f, -5.93f, 5.93f)
                horizontalLineToRelative(-5.07f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(6f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.07f)
                curveToRelative(3.27f, 0f, 5.93f, 2.66f, 5.93f, 5.93f)
                verticalLineToRelative(2.14f)
                close()
            }
        }.also { _SquareD = it}

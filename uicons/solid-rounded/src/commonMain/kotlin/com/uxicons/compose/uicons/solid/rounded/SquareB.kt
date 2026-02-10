package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareB: ImageVector? = null

val Icons.Sr.SquareB: ImageVector
    get() = _SquareB ?: UXIcon(name = "SquareB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 11.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(14.05f, 13.0f)
                horizontalLineToRelative(-6.05f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.54f)
                curveToRelative(1.08f, 0f, 1.96f, -0.88f, 1.96f, -1.96f)
                curveToRelative(0f, -0.6f, -0.2f, -1.1f, -0.57f, -1.47f)
                curveToRelative(-0.37f, -0.37f, -0.86f, -0.57f, -1.38f, -0.57f)
                close()
                moveTo(24.0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(18.0f, 14.97f)
                curveToRelative(0f, -1.06f, -0.41f, -2.06f, -1.16f, -2.81f)
                curveToRelative(-0.43f, -0.43f, -0.95f, -0.76f, -1.51f, -0.95f)
                curveToRelative(0.42f, -0.63f, 0.67f, -1.4f, 0.67f, -2.21f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.54f)
                curveToRelative(2.18f, 0f, 3.96f, -1.77f, 3.96f, -4.03f)
                close()
            }
        }.also { _SquareB = it}

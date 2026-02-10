package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareB: ImageVector? = null

val Icons.Rr.SquareB: ImageVector
    get() = _SquareB ?: UXIcon(name = "SquareB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.33f, 11.21f)
                curveToRelative(0.42f, -0.63f, 0.67f, -1.4f, 0.67f, -2.21f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.54f)
                curveToRelative(2.18f, 0f, 3.96f, -1.77f, 3.96f, -4.03f)
                curveToRelative(0f, -1.06f, -0.41f, -2.06f, -1.16f, -2.81f)
                curveToRelative(-0.43f, -0.43f, -0.95f, -0.76f, -1.51f, -0.95f)
                close()
                moveTo(8f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(14.04f, 17.0f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.05f)
                curveToRelative(0.52f, 0f, 1.01f, 0.2f, 1.38f, 0.57f)
                curveToRelative(0.37f, 0.37f, 0.57f, 0.87f, 0.57f, 1.47f)
                curveToRelative(0f, 1.08f, -0.88f, 1.96f, -1.96f, 1.96f)
                close()
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _SquareB = it}

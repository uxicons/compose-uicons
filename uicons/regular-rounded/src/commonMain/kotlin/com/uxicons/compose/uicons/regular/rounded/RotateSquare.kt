package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Rr.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
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
                moveTo(19f, 6f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.93f, -1.24f, -2.4f, -2f, -3.98f, -2f)
                curveToRelative(-2.12f, 0f, -4.01f, 1.34f, -4.71f, 3.33f)
                curveToRelative(-0.15f, 0.41f, -0.53f, 0.67f, -0.94f, 0.67f)
                curveToRelative(-0.11f, 0f, -0.22f, -0.02f, -0.33f, -0.06f)
                curveToRelative(-0.52f, -0.18f, -0.79f, -0.76f, -0.61f, -1.28f)
                curveToRelative(0.99f, -2.79f, 3.64f, -4.67f, 6.6f, -4.67f)
                curveToRelative(1.91f, 0f, 3.7f, 0.8f, 5f, 2.13f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(18.6f, 14.33f)
                curveToRelative(-0.99f, 2.79f, -3.64f, 4.67f, -6.6f, 4.67f)
                curveToRelative(-1.91f, 0f, -3.7f, -0.8f, -5f, -2.13f)
                verticalLineToRelative(1.13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(0.93f, 1.24f, 2.4f, 2f, 3.98f, 2f)
                curveToRelative(2.12f, 0f, 4.01f, -1.34f, 4.71f, -3.33f)
                curveToRelative(0.18f, -0.52f, 0.76f, -0.79f, 1.28f, -0.61f)
                curveToRelative(0.52f, 0.18f, 0.79f, 0.76f, 0.61f, 1.28f)
                close()
            }
        }.also { _RotateSquare = it}

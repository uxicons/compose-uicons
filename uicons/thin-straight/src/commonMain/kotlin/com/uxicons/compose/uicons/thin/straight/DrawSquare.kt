package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawSquare: ImageVector? = null

val Icons.Ts.DrawSquare: ImageVector
    get() = _DrawSquare ?: UXIcon(name = "DrawSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 18.18f)
                lineTo(22f, 5.82f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                lineTo(5.82f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(12.37f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                horizontalLineToRelative(12.37f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(21f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(1f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(3f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(21f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _DrawSquare = it}

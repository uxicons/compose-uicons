package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawSquare: ImageVector? = null

val Icons.Rr.DrawSquare: ImageVector
    get() = _DrawSquare ?: UXIcon(name = "DrawSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 17.34f)
                lineTo(22f, 6.66f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.39f, 0f, -2.6f, 0.82f, -3.16f, 2f)
                lineTo(6.66f, 2f)
                curveToRelative(-0.56f, -1.18f, -1.77f, -2f, -3.16f, -2f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.39f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(10.68f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0f, 2.6f, -0.82f, 3.16f, -2f)
                horizontalLineToRelative(10.68f)
                curveToRelative(0.56f, 1.18f, 1.77f, 2f, 3.16f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(17.04f, 20f)
                lineTo(6.96f, 20f)
                curveToRelative(-0.22f, -1.53f, -1.43f, -2.74f, -2.96f, -2.96f)
                lineTo(4f, 6.96f)
                curveToRelative(1.53f, -0.22f, 2.74f, -1.43f, 2.96f, -2.96f)
                horizontalLineToRelative(10.07f)
                curveToRelative(0.22f, 1.53f, 1.43f, 2.74f, 2.96f, 2.96f)
                verticalLineToRelative(10.07f)
                curveToRelative(-1.53f, 0.22f, -2.74f, 1.43f, -2.96f, 2.96f)
                close()
                moveTo(20.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _DrawSquare = it}

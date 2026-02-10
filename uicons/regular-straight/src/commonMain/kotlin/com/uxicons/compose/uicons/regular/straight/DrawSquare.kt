package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawSquare: ImageVector? = null

val Icons.Rs.DrawSquare: ImageVector
    get() = _DrawSquare ?: UXIcon(name = "DrawSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 17.35f)
                lineTo(22f, 6.65f)
                curveToRelative(1.18f, -0.56f, 2f, -1.76f, 2f, -3.15f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.39f, 0f, -2.58f, 0.82f, -3.15f, 2f)
                lineTo(6.65f, 2f)
                curveToRelative(-0.56f, -1.18f, -1.76f, -2f, -3.15f, -2f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.39f, 0.82f, 2.58f, 2f, 3.15f)
                verticalLineToRelative(10.7f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0f, 2.58f, -0.82f, 3.15f, -2f)
                horizontalLineToRelative(10.7f)
                curveToRelative(0.56f, 1.18f, 1.76f, 2f, 3.15f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.58f, -2f, -3.15f)
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
                moveTo(17.05f, 20f)
                lineTo(6.95f, 20f)
                curveToRelative(-0.22f, -1.53f, -1.42f, -2.73f, -2.95f, -2.95f)
                lineTo(4f, 6.95f)
                curveToRelative(1.53f, -0.22f, 2.73f, -1.42f, 2.95f, -2.95f)
                horizontalLineToRelative(10.1f)
                curveToRelative(0.22f, 1.53f, 1.42f, 2.73f, 2.95f, 2.95f)
                verticalLineToRelative(10.1f)
                curveToRelative(-1.53f, 0.22f, -2.73f, 1.42f, -2.95f, 2.95f)
                close()
                moveTo(20.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _DrawSquare = it}

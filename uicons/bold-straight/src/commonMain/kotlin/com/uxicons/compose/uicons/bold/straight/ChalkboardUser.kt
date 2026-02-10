package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChalkboardUser: ImageVector? = null

val Icons.Bs.ChalkboardUser: ImageVector
    get() = _ChalkboardUser ?: UXIcon(name = "ChalkboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 16f)
                lineTo(3.5f, 16f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.71f)
                curveToRelative(0.48f, -0.14f, 0.98f, -0.21f, 1.5f, -0.21f)
                reflectiveCurveToRelative(1.02f, 0.08f, 1.5f, 0.21f)
                verticalLineToRelative(-1.71f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3.37f)
                curveToRelative(0.53f, 0.76f, 0.89f, 1.66f, 0.97f, 2.63f)
                horizontalLineToRelative(9.03f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _ChalkboardUser = it}

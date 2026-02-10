package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserUp: ImageVector? = null

val Icons.Tr.UserUp: ImageVector
    get() = _UserUp ?: UXIcon(name = "UserUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.98f, 23.47f)
                curveToRelative(0.02f, 0.28f, -0.19f, 0.51f, -0.47f, 0.53f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-0.26f, 0f, -0.48f, -0.2f, -0.5f, -0.47f)
                curveToRelative(-0.24f, -3.66f, -3.31f, -6.53f, -6.98f, -6.53f)
                reflectiveCurveToRelative(-6.74f, 2.87f, -6.98f, 6.53f)
                curveToRelative(-0.02f, 0.28f, -0.26f, 0.47f, -0.53f, 0.47f)
                curveToRelative(-0.28f, -0.02f, -0.48f, -0.26f, -0.47f, -0.53f)
                curveToRelative(0.28f, -4.19f, 3.78f, -7.47f, 7.98f, -7.47f)
                reflectiveCurveToRelative(7.71f, 3.28f, 7.98f, 7.47f)
                close()
                moveTo(3f, 9f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(4f, 9f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(23.89f, 3.67f)
                lineTo(20.77f, 0.55f)
                curveToRelative(-0.66f, -0.66f, -1.82f, -0.66f, -2.48f, 0f)
                lineToRelative(-3.12f, 3.12f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(3.11f, -3.11f)
                verticalLineToRelative(8.24f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8.29f)
                curveToRelative(0.02f, 0.02f, 3.18f, 3.16f, 3.18f, 3.16f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
            }
        }.also { _UserUp = it}

package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Rs.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16.26f)
                verticalLineToRelative(-2.76f)
                curveToRelative(0f, -2.89f, -1.89f, -5.34f, -4.5f, -6.18f)
                verticalLineToRelative(-2.32f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-2.51f)
                curveToRelative(-2.49f, 0f, -4.62f, 1.86f, -4.95f, 4.33f)
                lineToRelative(-2.41f, 17.68f)
                lineToRelative(-4.63f, 0.02f)
                lineToRelative(0.01f, 2f)
                lineToRelative(6.37f, -0.03f)
                lineToRelative(2.65f, -19.4f)
                curveToRelative(0.2f, -1.48f, 1.48f, -2.6f, 2.97f, -2.6f)
                horizontalLineToRelative(2.51f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.54f, 0.13f, 1.04f, 0.35f, 1.5f)
                horizontalLineToRelative(-2.35f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.71f)
                curveToRelative(0.74f, 0.21f, 1.42f, 0.57f, 2f, 1.04f)
                close()
                moveTo(19f, 20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Vacuum = it}

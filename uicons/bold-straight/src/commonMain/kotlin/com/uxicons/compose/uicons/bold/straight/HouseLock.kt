package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLock: ImageVector? = null

val Icons.Bs.HouseLock: ImageVector
    get() = _HouseLock ?: UXIcon(name = "HouseLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 10.16f)
                verticalLineToRelative(10.84f)
                lineToRelative(8f, -0.01f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 1.12f, 0.39f, 2.15f, 1.01f, 2.99f)
                lineTo(0f, 23.99f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.76f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(7.84f, 6.24f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.38f, 0f, -0.74f, 0.04f, -1.1f, 0.1f)
                lineToRelative(-5.09f, -3.98f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0f)
                lineTo(3.19f, 9.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HouseLock = it}

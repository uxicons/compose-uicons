package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrowserLockAlert: ImageVector? = null

val Icons.Ss.BrowserLockAlert: ImageVector
    get() = _BrowserLockAlert ?: UXIcon(name = "BrowserLockAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 13.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(9f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(18f, 13.71f)
                lineTo(24f, 24f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(0f, 22f)
                horizontalLineToRelative(5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.17f, 1.99f, -3.88f, 4.24f, -3.42f)
                curveToRelative(1.64f, 0.34f, 2.77f, 1.85f, 2.77f, 3.52f)
                verticalLineToRelative(0.4f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.32f)
                lineToRelative(3.68f, -6.32f)
                horizontalLineToRelative(2.63f)
                lineToRelative(4.68f, 8.03f)
                verticalLineToRelative(-11.03f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _BrowserLockAlert = it}

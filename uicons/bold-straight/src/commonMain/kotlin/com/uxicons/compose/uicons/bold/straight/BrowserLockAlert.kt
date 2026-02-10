package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrowserLockAlert: ImageVector? = null

val Icons.Bs.BrowserLockAlert: ImageVector
    get() = _BrowserLockAlert ?: UXIcon(name = "BrowserLockAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                horizontalLineToRelative(12f)
                lineToRelative(-6f, -10.29f)
                close()
                moveTo(19f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -1.67f, -1.13f, -3.19f, -2.77f, -3.52f)
                curveToRelative(-2.25f, -0.46f, -4.24f, 1.25f, -4.24f, 3.42f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4.43f)
                lineToRelative(3.56f, -6.11f)
                close()
                moveTo(11f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(20.5f, 0f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(7.89f)
                lineToRelative(3f, 5.14f)
                verticalLineToRelative(-16.53f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(4.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BrowserLockAlert = it}

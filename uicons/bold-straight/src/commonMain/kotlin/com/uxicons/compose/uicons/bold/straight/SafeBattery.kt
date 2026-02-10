package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SafeBattery: ImageVector? = null

val Icons.Bs.SafeBattery: ImageVector
    get() = _SafeBattery ?: UXIcon(name = "SafeBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-18.5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(18.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(15f, 10.7f)
                curveToRelative(0f, 2.3f, -4f, 5f, -4f, 5f)
                reflectiveCurveToRelative(-4f, -2.7f, -4f, -5f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                close()
            }
        }.also { _SafeBattery = it}

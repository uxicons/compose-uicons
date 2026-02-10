package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryExclamation: ImageVector? = null

val Icons.Ts.BatteryExclamation: ImageVector
    get() = _BatteryExclamation ?: UXIcon(name = "BatteryExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 16.09f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12.09f)
                close()
                moveTo(0f, 20f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                lineTo(1f, 19f)
                lineTo(1f, 5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                lineTo(0f, 4f)
                verticalLineToRelative(16f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(10.5f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _BatteryExclamation = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryQuarter: ImageVector? = null

val Icons.Ts.BatteryQuarter: ImageVector
    get() = _BatteryQuarter ?: UXIcon(name = "BatteryQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 20f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                lineTo(19.5f, 4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(1f, 19f)
                lineTo(19.5f, 19f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(1f, 5f)
                verticalLineToRelative(14f)
                close()
                moveTo(8f, 17f)
                lineTo(3f, 17f)
                lineTo(3f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(3f)
                lineTo(7f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _BatteryQuarter = it}

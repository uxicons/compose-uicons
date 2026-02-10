package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryQuarter: ImageVector? = null

val Icons.Ss.BatteryQuarter: ImageVector
    get() = _BatteryQuarter ?: UXIcon(name = "BatteryQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(19f, 20f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 7f)
                verticalLineToRelative(11f)
                lineTo(2f, 18f)
                lineTo(2f, 6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _BatteryQuarter = it}

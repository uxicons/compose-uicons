package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryQuarter: ImageVector? = null

val Icons.Rs.BatteryQuarter: ImageVector
    get() = _BatteryQuarter ?: UXIcon(name = "BatteryQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(19f, 20f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                close()
                moveTo(20f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(2f, 18f)
                lineTo(2f, 6f)
                lineTo(19f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                lineTo(4f, 16f)
                lineTo(4f, 8f)
                close()
            }
        }.also { _BatteryQuarter = it}

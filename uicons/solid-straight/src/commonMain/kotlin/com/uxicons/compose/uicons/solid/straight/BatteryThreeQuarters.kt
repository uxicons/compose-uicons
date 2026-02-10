package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryThreeQuarters: ImageVector? = null

val Icons.Ss.BatteryThreeQuarters: ImageVector
    get() = _BatteryThreeQuarters ?: UXIcon(name = "BatteryThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 16f)
                lineTo(4f, 16f)
                lineTo(4f, 8f)
                lineTo(13f, 8f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                lineTo(19f, 4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(12f)
                lineTo(15f, 18f)
                lineTo(15f, 6f)
                close()
            }
        }.also { _BatteryThreeQuarters = it}

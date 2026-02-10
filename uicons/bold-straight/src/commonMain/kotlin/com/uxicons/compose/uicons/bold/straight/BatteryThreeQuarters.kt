package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryThreeQuarters: ImageVector? = null

val Icons.Bs.BatteryThreeQuarters: ImageVector
    get() = _BatteryThreeQuarters ?: UXIcon(name = "BatteryThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(0f, 4f)
                lineTo(0f, 20f)
                lineTo(18.5f, 20f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                close()
                moveTo(19f, 16.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(3f, 17f)
                lineTo(3f, 7f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                close()
                moveTo(5f, 9f)
                lineTo(14f, 9f)
                verticalLineToRelative(6f)
                lineTo(5f, 15f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _BatteryThreeQuarters = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryExclamation: ImageVector? = null

val Icons.Bs.BatteryExclamation: ImageVector
    get() = _BatteryExclamation ?: UXIcon(name = "BatteryExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(3f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                close()
                moveTo(24f, 7.97f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.47f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 7.97f)
                close()
                moveTo(9.5f, 20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.5f, 15.09f)
                horizontalLineToRelative(3f)
                lineTo(12.5f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(11.09f)
                close()
            }
        }.also { _BatteryExclamation = it}

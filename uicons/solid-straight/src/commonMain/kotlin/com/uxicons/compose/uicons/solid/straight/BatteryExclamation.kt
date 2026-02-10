package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryExclamation: ImageVector? = null

val Icons.Ss.BatteryExclamation: ImageVector
    get() = _BatteryExclamation ?: UXIcon(name = "BatteryExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 16.09f)
                horizontalLineToRelative(2f)
                lineTo(12f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12.09f)
                close()
                moveTo(0f, 20f)
                horizontalLineToRelative(8f)
                lineTo(8f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(16f)
                close()
                moveTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _BatteryExclamation = it}

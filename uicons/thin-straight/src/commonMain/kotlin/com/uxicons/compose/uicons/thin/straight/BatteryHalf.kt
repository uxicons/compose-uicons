package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryHalf: ImageVector? = null

val Icons.Ts.BatteryHalf: ImageVector
    get() = _BatteryHalf ?: UXIcon(name = "BatteryHalf") {
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
                moveTo(12f, 17f)
                lineTo(3f, 17f)
                lineTo(3f, 7f)
                lineTo(12f, 7f)
                verticalLineToRelative(10f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(7f)
                lineTo(11f, 8f)
                lineTo(4f, 8f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _BatteryHalf = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryHalf: ImageVector? = null

val Icons.Sr.BatteryHalf: ImageVector
    get() = _BatteryHalf ?: UXIcon(name = "BatteryHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                lineTo(5f, 4f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 15f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(5f, 18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _BatteryHalf = it}

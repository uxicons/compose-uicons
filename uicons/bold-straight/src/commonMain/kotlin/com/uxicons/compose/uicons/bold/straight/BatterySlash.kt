package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Bs.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.04f, 18.91f)
                curveToRelative(0.6f, -0.64f, 0.96f, -1.49f, 0.96f, -2.41f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.12f, 4f)
                lineTo(1.81f, -0.31f)
                lineTo(-0.31f, 1.81f)
                lineTo(22.19f, 24.31f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.28f, -3.28f)
                close()
                moveTo(18.5f, 7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.11f, -0.04f, 0.21f, -0.09f, 0.29f)
                lineTo(9.12f, 7f)
                horizontalLineToRelative(9.38f)
                close()
                moveTo(12.05f, 17f)
                lineToRelative(3f, 3f)
                lineTo(0f, 20f)
                lineTo(0f, 4.95f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(9.05f)
                lineTo(12.05f, 17f)
                close()
            }
        }.also { _BatterySlash = it}

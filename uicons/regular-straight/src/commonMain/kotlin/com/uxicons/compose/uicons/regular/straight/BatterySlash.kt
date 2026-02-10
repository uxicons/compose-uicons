package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Rs.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5.41f, 4f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(0.72f, -0.55f, 1.19f, -1.42f, 1.19f, -2.39f)
                close()
                moveTo(7.41f, 6f)
                horizontalLineToRelative(11.59f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.43f, -0.27f, 0.79f, -0.65f, 0.94f)
                lineTo(7.41f, 6f)
                close()
                moveTo(13.76f, 18f)
                lineToRelative(2f, 2f)
                lineTo(0f, 20f)
                lineTo(0f, 4.24f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(11.76f)
                lineTo(13.76f, 18f)
                close()
            }
        }.also { _BatterySlash = it}

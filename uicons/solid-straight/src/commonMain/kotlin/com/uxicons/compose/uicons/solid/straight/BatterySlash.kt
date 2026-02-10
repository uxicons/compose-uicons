package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatterySlash: ImageVector? = null

val Icons.Ss.BatterySlash: ImageVector
    get() = _BatterySlash ?: UXIcon(name = "BatterySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.76f, 20f)
                lineTo(0f, 20f)
                lineTo(0f, 4.24f)
                lineToRelative(15.76f, 15.76f)
                close()
                moveTo(20.8f, 19.39f)
                lineToRelative(3.16f, 3.16f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.96f, 3.96f)
                horizontalLineToRelative(13.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.98f, -0.48f, 1.84f, -1.2f, 2.38f)
                close()
            }
        }.also { _BatterySlash = it}

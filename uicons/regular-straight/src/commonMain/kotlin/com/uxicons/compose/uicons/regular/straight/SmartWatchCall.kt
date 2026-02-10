package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchCall: ImageVector? = null

val Icons.Rs.SmartWatchCall: ImageVector
    get() = _SmartWatchCall ?: UXIcon(name = "SmartWatchCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3.18f)
                verticalLineToRelative(-3.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(3.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(16.34f, 8.15f)
                curveToRelative(0.45f, 0.45f, 0.66f, 1.04f, 0.66f, 1.63f)
                curveToRelative(0f, 3.26f, -4.19f, 7.22f, -7.22f, 7.22f)
                curveToRelative(-0.59f, 0f, -1.18f, -0.21f, -1.63f, -0.66f)
                lineToRelative(-1.15f, -1.15f)
                lineToRelative(2.26f, -2.26f)
                lineToRelative(1.18f, 1.18f)
                curveToRelative(1.69f, -0.65f, 2.93f, -1.84f, 3.67f, -3.67f)
                lineToRelative(-1.18f, -1.18f)
                lineToRelative(2.26f, -2.26f)
                close()
            }
        }.also { _SmartWatchCall = it}

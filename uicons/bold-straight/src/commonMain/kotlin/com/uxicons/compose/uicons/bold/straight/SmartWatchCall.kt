package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchCall: ImageVector? = null

val Icons.Bs.SmartWatchCall: ImageVector
    get() = _SmartWatchCall ?: UXIcon(name = "SmartWatchCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2.35f)
                verticalLineToRelative(-2.35f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.35f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.39f, 0.82f, 2.58f, 2f, 3.15f)
                verticalLineToRelative(2.35f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.35f)
                curveToRelative(1.18f, -0.56f, 2f, -1.76f, 2f, -3.15f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.39f, -0.82f, -2.58f, -2f, -3.15f)
                close()
                moveTo(18f, 18.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
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

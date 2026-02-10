package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchCall: ImageVector? = null

val Icons.Ss.SmartWatchCall: ImageVector
    get() = _SmartWatchCall ?: UXIcon(name = "SmartWatchCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 22f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                close()
                moveTo(17f, 2f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.1f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2.1f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.1f, 1f, -0.1f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17f, 9.78f)
                curveToRelative(0f, -0.59f, -0.21f, -1.18f, -0.66f, -1.63f)
                lineToRelative(-1.15f, -1.15f)
                lineToRelative(-2.26f, 2.26f)
                lineToRelative(1.18f, 1.18f)
                curveToRelative(-0.73f, 1.83f, -1.98f, 3.02f, -3.67f, 3.67f)
                lineToRelative(-1.18f, -1.18f)
                lineToRelative(-2.26f, 2.26f)
                lineToRelative(1.15f, 1.15f)
                curveToRelative(0.45f, 0.45f, 1.04f, 0.66f, 1.63f, 0.66f)
                curveToRelative(3.03f, 0f, 7.22f, -3.96f, 7.22f, -7.22f)
                close()
            }
        }.also { _SmartWatchCall = it}

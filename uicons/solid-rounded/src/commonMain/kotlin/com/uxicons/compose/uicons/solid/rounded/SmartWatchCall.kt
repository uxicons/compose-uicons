package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchCall: ImageVector? = null

val Icons.Sr.SmartWatchCall: ImageVector
    get() = _SmartWatchCall ?: UXIcon(name = "SmartWatchCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2f)
                curveToRelative(-1.07f, 0f, -2.09f, 0.25f, -3f, 0.69f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.69f)
                curveToRelative(-0.91f, -0.43f, -1.93f, -0.69f, -3f, -0.69f)
                close()
                moveTo(9f, 22f)
                curveToRelative(-1.07f, 0f, -2.09f, -0.25f, -3f, -0.69f)
                verticalLineToRelative(1.69f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.69f)
                curveToRelative(-0.91f, 0.43f, -1.93f, 0.69f, -3f, 0.69f)
                close()
                moveTo(20f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17f, 9.38f)
                curveToRelative(0f, -0.6f, -0.22f, -1.21f, -0.68f, -1.67f)
                lineToRelative(-0.5f, -0.43f)
                curveToRelative(-0.37f, -0.37f, -0.97f, -0.37f, -1.35f, 0f)
                lineToRelative(-0.83f, 1.08f)
                curveToRelative(-0.37f, 0.37f, -0.37f, 0.97f, 0f, 1.35f)
                lineToRelative(0.71f, 0.89f)
                curveToRelative(-0.75f, 1.87f, -2.02f, 3.09f, -3.75f, 3.75f)
                lineToRelative(-0.89f, -0.71f)
                curveToRelative(-0.37f, -0.37f, -0.97f, -0.37f, -1.35f, 0f)
                lineToRelative(-1.08f, 0.83f)
                curveToRelative(-0.37f, 0.37f, -0.37f, 0.97f, 0f, 1.35f)
                lineToRelative(0.43f, 0.5f)
                curveToRelative(0.46f, 0.46f, 1.06f, 0.68f, 1.67f, 0.68f)
                curveToRelative(3.1f, 0f, 7.62f, -4.29f, 7.62f, -7.62f)
                close()
            }
        }.also { _SmartWatchCall = it}

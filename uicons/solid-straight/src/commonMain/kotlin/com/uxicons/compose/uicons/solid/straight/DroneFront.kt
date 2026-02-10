package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DroneFront: ImageVector? = null

val Icons.Ss.DroneFront: ImageVector
    get() = _DroneFront ?: UXIcon(name = "DroneFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.52f)
                curveToRelative(-2.48f, 1.66f, -4f, 4.48f, -4f, 7.48f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.9f, 0.78f, -3.7f, 2.1f, -5f)
                horizontalLineToRelative(9.79f)
                curveToRelative(1.32f, 1.3f, 2.1f, 3.1f, 2.1f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.01f, -1.52f, -5.82f, -4f, -7.48f)
                verticalLineToRelative(-1.52f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _DroneFront = it}

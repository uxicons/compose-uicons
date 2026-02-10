package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCrackAlt: ImageVector? = null

val Icons.Ss.HouseCrackAlt: ImageVector
    get() = _HouseCrackAlt ?: UXIcon(name = "HouseCrackAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.81f, 7.63f)
                lineTo(13.91f, 0.66f)
                curveToRelative(-1.12f, -0.88f, -2.69f, -0.88f, -3.82f, 0f)
                lineTo(1.19f, 7.63f)
                curveToRelative(-0.76f, 0.59f, -1.19f, 1.48f, -1.19f, 2.44f)
                verticalLineToRelative(13.93f)
                horizontalLineToRelative(14.09f)
                lineToRelative(-5.5f, -5.5f)
                lineToRelative(4.04f, -4.04f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.96f, 4.96f)
                lineToRelative(-4.04f, 4.04f)
                lineToRelative(5.5f, 5.5f)
                horizontalLineToRelative(7.09f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, -0.43f, -1.85f, -1.19f, -2.44f)
                close()
            }
        }.also { _HouseCrackAlt = it}

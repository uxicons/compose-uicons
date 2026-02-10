package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShovelSnow: ImageVector? = null

val Icons.Rs.ShovelSnow: ImageVector
    get() = _ShovelSnow ?: UXIcon(name = "ShovelSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 6.46f)
                lineToRelative(1.41f, -1.41f)
                lineTo(18.96f, 0.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-6.76f, 6.76f)
                lineToRelative(-2.07f, -2.07f)
                curveToRelative(-1.25f, -1.25f, -3.29f, -1.25f, -4.54f, 0f)
                lineTo(0.09f, 13.83f)
                lineToRelative(10.12f, 10.12f)
                lineToRelative(5.89f, -5.89f)
                curveToRelative(1.25f, -1.25f, 1.25f, -3.29f, 0f, -4.54f)
                lineToRelative(-2.1f, -2.1f)
                lineToRelative(6.76f, -6.76f)
                lineToRelative(1.79f, 1.79f)
                close()
                moveTo(14.68f, 16.65f)
                lineToRelative(-4.47f, 4.47f)
                lineToRelative(-1.46f, -1.46f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(4.47f, -4.47f)
                curveToRelative(0.47f, -0.47f, 1.24f, -0.47f, 1.71f, 0f)
                lineToRelative(5.59f, 5.59f)
                curveToRelative(0.47f, 0.47f, 0.47f, 1.24f, 0f, 1.71f)
                close()
            }
        }.also { _ShovelSnow = it}

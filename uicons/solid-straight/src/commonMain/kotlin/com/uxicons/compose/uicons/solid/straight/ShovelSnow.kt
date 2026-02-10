package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShovelSnow: ImageVector? = null

val Icons.Ss.ShovelSnow: ImageVector
    get() = _ShovelSnow ?: UXIcon(name = "ShovelSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.96f, 0.04f)
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
                lineToRelative(1.41f, -1.41f)
                lineTo(18.96f, 0.04f)
                close()
                moveTo(2.84f, 13.75f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(5.84f, 16.75f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(10.25f, 21.16f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-3.15f, 3.15f)
                close()
            }
        }.also { _ShovelSnow = it}

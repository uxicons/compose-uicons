package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Ss.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveToRelative(-2.86f, 0f, -5.58f, 1.0f, -7.75f, 2.84f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(1.83f, -2.17f, 2.84f, -4.89f, 2.84f, -7.75f)
                close()
                moveTo(18.23f, 5.67f)
                lineToRelative(-3.25f, 7.9f)
                lineToRelative(-1.53f, -1.53f)
                lineToRelative(0.97f, -2.37f)
                lineToRelative(-2.27f, 1.07f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(7.58f, -3.57f)
                close()
                moveTo(11.56f, 15.81f)
                lineToRelative(6.53f, 6.53f)
                curveToRelative(-1.82f, 1.08f, -3.9f, 1.67f, -6.09f, 1.67f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -2.19f, 0.58f, -4.27f, 1.67f, -6.09f)
                lineToRelative(6.59f, 6.59f)
                lineToRelative(-2.49f, 5.7f)
                lineToRelative(5.8f, -2.39f)
                close()
            }
        }.also { _CompassSlash = it}

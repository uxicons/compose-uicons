package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullseye: ImageVector? = null

val Icons.Sr.Bullseye: ImageVector
    get() = _Bullseye ?: UXIcon(name = "Bullseye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0.6f, -15.9f, 23.4f, -15.89f, 24f, 0f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveToRelative(0.5f, 13.25f, 19.5f, 13.24f, 20f, 0f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0.38f, -10.59f, 15.63f, -10.59f, 16f, 0f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-7.93f, 0.25f, -7.93f, 11.75f, 0f, 12f)
                curveToRelative(7.93f, -0.25f, 7.93f, -11.75f, 0f, -12f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-5.27f, -0.14f, -5.27f, -7.86f, 0f, -8f)
                curveToRelative(5.27f, 0.14f, 5.27f, 7.86f, 0f, 8f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-2.63f, 0.05f, -2.63f, 3.95f, 0f, 4f)
                curveToRelative(2.63f, -0.05f, 2.63f, -3.95f, 0f, -4f)
                close()
            }
        }.also { _Bullseye = it}

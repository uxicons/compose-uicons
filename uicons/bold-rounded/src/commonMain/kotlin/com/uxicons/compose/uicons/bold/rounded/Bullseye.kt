package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullseye: ImageVector? = null

val Icons.Br.Bullseye: ImageVector
    get() = _Bullseye ?: UXIcon(name = "Bullseye") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            curveToRelative(0.6f, -15.9f, 23.4f, -15.89f, 24f, 0f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            curveToRelative(0.45f, 11.92f, 17.55f, 11.92f, 18f, 0f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(12f, 19f)
            curveToRelative(-9.25f, -0.29f, -9.25f, -13.71f, 0f, -14f)
            curveToRelative(9.25f, 0.29f, 9.25f, 13.71f, 0f, 14f)
            close()
            moveTo(12f, 8f)
            curveToRelative(-5.27f, 0.14f, -5.27f, 7.86f, 0f, 8f)
            curveToRelative(5.27f, -0.14f, 5.27f, -7.86f, 0f, -8f)
            close()
            moveTo(12f, 14f)
            curveToRelative(-2.63f, -0.05f, -2.63f, -3.95f, 0f, -4f)
            curveToRelative(2.63f, 0.05f, 2.63f, 3.95f, 0f, 4f)
            close()
        }
    }.also { _Bullseye = it }

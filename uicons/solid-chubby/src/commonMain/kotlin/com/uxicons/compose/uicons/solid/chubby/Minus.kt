package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Minus: ImageVector? = null

val Icons.Sc.Minus: ImageVector
    get() = _Minus ?: UXIcon(name = "Minus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.19f, 13.87f)
                curveToRelative(-0.04f, -0.01f, -3.67f, -0.77f, -9.19f, -0.77f)
                curveToRelative(-5.56f, 0f, -9.15f, 0.76f, -9.18f, 0.77f)
                curveToRelative(-0.81f, 0.17f, -1.61f, -0.34f, -1.78f, -1.15f)
                curveToRelative(-0.17f, -0.81f, 0.34f, -1.61f, 1.15f, -1.78f)
                curveToRelative(0.16f, -0.03f, 3.91f, -0.83f, 9.82f, -0.83f)
                curveToRelative(5.87f, 0f, 9.66f, 0.8f, 9.81f, 0.83f)
                curveToRelative(0.81f, 0.17f, 1.32f, 0.97f, 1.15f, 1.78f)
                curveToRelative(-0.15f, 0.7f, -0.9f, 1.35f, -1.78f, 1.15f)
                close()
            }
        }.also { _Minus = it}

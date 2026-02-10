package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Ts.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.24f, 0.76f)
                curveToRelative(-0.98f, -0.98f, -2.69f, -0.98f, -3.68f, 0f)
                lineToRelative(-11.15f, 11.18f)
                lineToRelative(-5.82f, 1.4f)
                lineTo(0.11f, 23.92f)
                lineToRelative(10.58f, -2.48f)
                lineToRelative(1.42f, -5.84f)
                lineToRelative(11.13f, -11.16f)
                curveToRelative(1.01f, -1.01f, 1.01f, -2.66f, 0f, -3.68f)
                close()
                moveTo(9.86f, 20.61f)
                lineToRelative(-7.48f, 1.75f)
                lineToRelative(4.32f, -4.32f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.32f, 4.32f)
                lineToRelative(1.75f, -7.49f)
                lineToRelative(4.75f, -1.14f)
                lineToRelative(2.84f, 2.84f)
                lineToRelative(-1.15f, 4.73f)
                close()
                moveTo(22.53f, 3.73f)
                lineToRelative(-11.11f, 11.14f)
                lineToRelative(-2.27f, -2.27f)
                lineTo(20.27f, 1.47f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.27f, 0f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.27f)
                close()
            }
        }.also { _PenFancy = it}

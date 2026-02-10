package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShovelSnow: ImageVector? = null

val Icons.Ts.ShovelSnow: ImageVector
    get() = _ShovelSnow ?: UXIcon(name = "ShovelSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.29f, 5.71f)
                lineToRelative(0.71f, -0.71f)
                lineTo(19.0f, 0f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(-7.86f, 7.86f)
                lineToRelative(-2.92f, -2.92f)
                curveToRelative(-1.06f, -1.06f, -2.77f, -1.06f, -3.83f, 0f)
                lineTo(0.04f, 13.58f)
                lineToRelative(10.38f, 10.38f)
                lineToRelative(5.79f, -5.79f)
                curveToRelative(0.51f, -0.51f, 0.79f, -1.19f, 0.79f, -1.91f)
                reflectiveCurveToRelative(-0.28f, -1.4f, -0.79f, -1.91f)
                lineToRelative(-2.92f, -2.92f)
                lineToRelative(7.86f, -7.86f)
                lineToRelative(2.15f, 2.15f)
                close()
                moveTo(16f, 16.26f)
                curveToRelative(0f, 0.46f, -0.18f, 0.89f, -0.5f, 1.21f)
                lineToRelative(-5.08f, 5.08f)
                lineToRelative(-1.63f, -1.63f)
                lineToRelative(4.06f, -4.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.06f, 4.06f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(4.06f, -4.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.06f, 4.06f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(4.06f, -4.06f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.06f, 4.06f)
                lineToRelative(-1.63f, -1.63f)
                lineToRelative(5.08f, -5.08f)
                curveToRelative(0.67f, -0.67f, 1.75f, -0.67f, 2.41f, 0f)
                lineToRelative(6.55f, 6.55f)
                curveToRelative(0.32f, 0.32f, 0.5f, 0.75f, 0.5f, 1.21f)
                close()
            }
        }.also { _ShovelSnow = it}

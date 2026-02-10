package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerWar: ImageVector? = null

val Icons.Sr.HammerWar: ImageVector
    get() = _HammerWar ?: UXIcon(name = "HammerWar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.65f, 11.15f)
                lineToRelative(-2.67f, -1.78f)
                curveToRelative(-1.04f, -0.57f, -1.77f, -1.65f, -1.95f, -2.9f)
                curveToRelative(-0.17f, -1.25f, 0.24f, -2.49f, 1.13f, -3.38f)
                lineToRelative(1.9f, -1.9f)
                curveTo(7.97f, 0.29f, 9.21f, -0.12f, 10.46f, 0.05f)
                curveToRelative(1.25f, 0.18f, 2.33f, 0.91f, 2.94f, 2.02f)
                lineToRelative(1.73f, 2.61f)
                lineToRelative(-6.48f, 6.48f)
                close()
                moveTo(12.86f, 15.36f)
                lineToRelative(1.78f, 2.67f)
                curveToRelative(0.57f, 1.04f, 1.65f, 1.77f, 2.9f, 1.95f)
                curveToRelative(1.25f, 0.17f, 2.49f, -0.24f, 3.38f, -1.13f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.9f, -0.9f, 1.31f, -2.13f, 1.13f, -3.38f)
                curveToRelative(-0.18f, -1.25f, -0.91f, -2.33f, -2.02f, -2.94f)
                lineToRelative(-2.61f, -1.73f)
                lineToRelative(-6.48f, 6.48f)
                close()
                moveTo(10.0f, 15.41f)
                curveToRelative(-0.49f, -0.49f, -0.97f, -0.97f, -1.41f, -1.42f)
                lineToRelative(-5.18f, 5.18f)
                curveToRelative(-0.28f, -0.11f, -0.59f, -0.17f, -0.91f, -0.17f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.32f, -0.06f, -0.63f, -0.17f, -0.91f)
                lineToRelative(5.18f, -5.18f)
                close()
                moveTo(17.71f, 6.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-6.29f, 6.29f)
                curveToRelative(0.4f, 0.4f, 0.87f, 0.87f, 1.41f, 1.42f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _HammerWar = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Muscle: ImageVector? = null

val Icons.Ss.Muscle: ImageVector
    get() = _Muscle ?: UXIcon(name = "Muscle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.48f)
                reflectiveCurveToRelative(-1.48f, -0.5f, -3.58f, -0.5f)
                curveToRelative(-1.3f, 0f, -2.61f, 0.74f, -3.6f, 1.48f)
                curveToRelative(0.79f, 0.57f, 1.27f, 1.1f, 1.31f, 1.15f)
                lineToRelative(-0.75f, 0.67f)
                lineToRelative(-0.74f, 0.67f)
                curveToRelative(-0.02f, -0.02f, -2.02f, -1.96f, -4.14f, -1.96f)
                curveToRelative(-2.38f, 0f, -4.81f, 1.85f, -6.21f, 3.13f)
                curveToRelative(1.39f, -3.5f, 0.34f, -8.36f, 0.9f, -9.93f)
                lineToRelative(2.84f, -0.9f)
                verticalLineToRelative(-0.98f)
                lineToRelative(1.98f, -0.79f)
                curveTo(12.01f, 1.46f, 11.1f, 0.01f, 9.01f, 0.01f)
                curveTo(7.51f, 0.01f, 6.29f, 1.08f, 6.29f, 1.08f)
                curveTo(-0.52f, 6.32f, 0.01f, 15.62f, 0.01f, 18.76f)
                curveToRelative(0f, 0f, 4.66f, 5.24f, 11.99f, 5.24f)
                reflectiveCurveToRelative(12f, -3.14f, 12f, -3.14f)
                verticalLineToRelative(-10.38f)
                close()
            }
        }.also { _Muscle = it}

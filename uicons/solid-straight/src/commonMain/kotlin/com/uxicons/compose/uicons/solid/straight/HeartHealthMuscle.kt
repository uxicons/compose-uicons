package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHealthMuscle: ImageVector? = null

val Icons.Ss.HeartHealthMuscle: ImageVector
    get() = _HeartHealthMuscle ?: UXIcon(name = "HeartHealthMuscle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                curveToRelative(0f, 2.33f, -4f, 5f, -4f, 5f)
                curveToRelative(0f, 0f, -4f, -2.67f, -4f, -5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 10.47f)
                reflectiveCurveToRelative(-1.48f, -0.5f, -3.58f, -0.5f)
                curveToRelative(-1.3f, 0f, -2.61f, 0.74f, -3.6f, 1.48f)
                curveToRelative(0.79f, 0.57f, 1.27f, 1.1f, 1.31f, 1.15f)
                lineToRelative(-1.49f, 1.33f)
                curveToRelative(-0.02f, -0.02f, -2.02f, -1.96f, -4.14f, -1.96f)
                curveToRelative(-2.38f, 0f, -4.81f, 1.85f, -6.21f, 3.13f)
                curveToRelative(1.39f, -3.5f, 0.34f, -8.36f, 0.9f, -9.93f)
                lineToRelative(2.84f, -0.9f)
                verticalLineToRelative(-0.98f)
                lineToRelative(1.98f, -0.79f)
                curveToRelative(0f, -1.05f, -0.91f, -2.5f, -3f, -2.5f)
                curveToRelative(-1.5f, 0f, -2.71f, 1.07f, -2.71f, 1.07f)
                curveTo(-0.52f, 6.31f, 0.01f, 15.61f, 0.01f, 18.75f)
                curveToRelative(0f, 0f, 4.66f, 5.24f, 11.99f, 5.24f)
                reflectiveCurveToRelative(12f, -3.14f, 12f, -3.14f)
                verticalLineToRelative(-10.38f)
                close()
            }
        }.also { _HeartHealthMuscle = it}

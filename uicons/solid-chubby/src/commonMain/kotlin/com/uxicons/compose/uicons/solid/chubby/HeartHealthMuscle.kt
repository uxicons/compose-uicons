package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHealthMuscle: ImageVector? = null

val Icons.Sc.HeartHealthMuscle: ImageVector
    get() = _HeartHealthMuscle ?: UXIcon(name = "HeartHealthMuscle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 3f)
                curveToRelative(0f, 2.21f, -2f, 4.01f, -3.17f, 4.74f)
                curveToRelative(-0.5f, 0.32f, -1.15f, 0.32f, -1.66f, 0f)
                curveToRelative(-1.17f, -0.74f, -3.17f, -2.54f, -3.17f, -4.74f)
                curveToRelative(0f, -1.11f, 0.9f, -2.02f, 2f, -2.02f)
                reflectiveCurveToRelative(2f, 0.76f, 2f, 1.87f)
                curveToRelative(0f, -1.11f, 0.9f, -1.87f, 2f, -1.87f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2.02f)
                close()
                moveTo(22.22f, 11.43f)
                curveToRelative(-2.65f, -0.6f, -4.43f, -0.67f, -6.21f, 0.38f)
                curveToRelative(0.74f, 0.71f, 1.41f, 1.62f, 1.91f, 2.77f)
                curveToRelative(0.22f, 0.51f, -0.01f, 1.1f, -0.52f, 1.32f)
                curveToRelative(-0.49f, 0.22f, -1.1f, -0.01f, -1.32f, -0.52f)
                curveToRelative(-1.15f, -2.63f, -3.11f, -3.31f, -3.93f, -3.38f)
                curveToRelative(-1.37f, -0.05f, -2.75f, 0.51f, -4.18f, 1.68f)
                curveToRelative(-0.21f, -3.8f, -1.82f, -6.33f, -0.51f, -8.19f)
                curveToRelative(0f, 0f, 0.83f, 0.04f, 1.68f, -0.19f)
                curveToRelative(0.77f, -0.21f, 0.82f, -1.31f, 0.82f, -1.31f)
                lineToRelative(0.79f, -0.5f)
                curveToRelative(0.54f, -0.99f, 0.3f, -2.5f, -1.79f, -2.5f)
                curveToRelative(-4.92f, 0.26f, -8.14f, 4.06f, -7.96f, 11.01f)
                curveToRelative(0.04f, 1.17f, 0.15f, 3.7f, 0.42f, 5.42f)
                curveToRelative(0.65f, 3.23f, 3.59f, 5.61f, 7.05f, 5.61f)
                curveToRelative(4.18f, 0.02f, 8.79f, 0.06f, 10.96f, -1.1f)
                curveToRelative(2.49f, -1.21f, 3.56f, -3.58f, 3.56f, -7.93f)
                verticalLineToRelative(-1.58f)
                curveToRelative(0f, -0.47f, -0.33f, -0.87f, -0.78f, -0.98f)
                close()
            }
        }.also { _HeartHealthMuscle = it}

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorOn: ImageVector? = null

val Icons.Sc.SensorOn: ImageVector
    get() = _SensorOn ?: UXIcon(name = "SensorOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.76f, 3.21f)
                curveToRelative(-1.43f, -1.43f, -3.4f, -2.21f, -5.56f, -2.21f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.49f, 1.51f)
                curveToRelative(0.0f, 0.83f, 0.68f, 1.49f, 1.5f, 1.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.36f, -0.01f, 2.58f, 0.46f, 3.46f, 1.33f)
                curveToRelative(0.88f, 0.88f, 1.37f, 2.15f, 1.36f, 3.56f)
                curveToRelative(-0.0f, 0.83f, 0.67f, 1.5f, 1.49f, 1.51f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.49f)
                curveToRelative(0.01f, -2.22f, -0.79f, -4.24f, -2.24f, -5.69f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.79f, 5.11f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.49f, 1.51f)
                curveToRelative(0.0f, 0.83f, 0.68f, 1.49f, 1.5f, 1.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.21f, -0.03f, 0.55f, 0.04f, 0.76f, 0.25f)
                curveToRelative(0.22f, 0.22f, 0.26f, 0.55f, 0.26f, 0.79f)
                curveToRelative(-0.0f, 0.83f, 0.67f, 1.5f, 1.49f, 1.51f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.49f)
                curveToRelative(0.01f, -1.15f, -0.4f, -2.19f, -1.14f, -2.93f)
                curveToRelative(-0.73f, -0.73f, -1.75f, -1.13f, -2.87f, -1.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.18f, 9.12f)
                curveToRelative(-0.11f, -0.03f, -2.75f, -0.77f, -5.86f, -0.77f)
                reflectiveCurveToRelative(-5.75f, 0.73f, -5.86f, 0.76f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.03f, 0.1f, -0.77f, 2.58f, -0.77f, 5.88f)
                curveToRelative(0f, 3.33f, 0.74f, 5.78f, 0.77f, 5.88f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.11f, 0.03f, 2.75f, 0.77f, 5.86f, 0.77f)
                reflectiveCurveToRelative(5.75f, -0.73f, 5.86f, -0.76f)
                curveToRelative(0.32f, -0.09f, 0.58f, -0.34f, 0.68f, -0.65f)
                curveToRelative(0.04f, -0.1f, 0.85f, -2.63f, 0.85f, -5.94f)
                curveToRelative(0f, -3.34f, -0.82f, -5.78f, -0.85f, -5.88f)
                curveToRelative(-0.1f, -0.31f, -0.36f, -0.55f, -0.68f, -0.64f)
                close()
                moveTo(5.07f, 14.42f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SensorOn = it}

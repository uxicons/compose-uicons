package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceThermometer: ImageVector? = null

val Icons.Ts.FaceThermometer: ImageVector
    get() = _FaceThermometer ?: UXIcon(name = "FaceThermometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(23.33f, 8.71f)
                curveToRelative(0.83f, 0.9f, 0.78f, 2.31f, -0.11f, 3.15f)
                lineToRelative(-6.49f, 6.1f)
                lineToRelative(-0.34f, -0.31f)
                curveToRelative(-0.02f, -0.02f, -1.86f, -1.64f, -4.38f, -1.64f)
                reflectiveCurveToRelative(-4.65f, 1.85f, -4.67f, 1.87f)
                lineToRelative(-0.67f, -0.75f)
                curveToRelative(0.1f, -0.09f, 2.41f, -2.13f, 5.33f, -2.13f)
                curveToRelative(0.39f, 0f, 0.77f, 0.03f, 1.13f, 0.09f)
                lineToRelative(7.06f, -6.5f)
                curveToRelative(0.9f, -0.83f, 2.31f, -0.78f, 3.14f, 0.12f)
                close()
                moveTo(20.87f, 9.32f)
                lineToRelative(-6.57f, 6.05f)
                curveToRelative(1.11f, 0.36f, 1.95f, 0.91f, 2.4f, 1.24f)
                lineToRelative(0.81f, -0.76f)
                lineToRelative(-0.87f, -0.97f)
                lineToRelative(0.74f, -0.67f)
                lineToRelative(0.86f, 0.95f)
                lineToRelative(1.32f, -1.24f)
                lineToRelative(-0.79f, -0.87f)
                lineToRelative(0.74f, -0.67f)
                lineToRelative(0.78f, 0.86f)
                lineToRelative(1.27f, -1.2f)
                lineToRelative(-0.77f, -0.84f)
                lineToRelative(0.74f, -0.67f)
                lineToRelative(0.75f, 0.83f)
                lineToRelative(0.26f, -0.24f)
                curveToRelative(0.5f, -0.46f, 0.53f, -1.24f, 0.07f, -1.73f)
                curveToRelative(-0.46f, -0.49f, -1.24f, -0.52f, -1.73f, -0.06f)
                close()
                moveTo(22.79f, 14.77f)
                lineToRelative(-0.2f, 0.19f)
                curveToRelative(-1.3f, 4.63f, -5.54f, 8.04f, -10.58f, 8.04f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                curveToRelative(3.89f, 0f, 7.3f, 2.03f, 9.26f, 5.09f)
                curveToRelative(0.38f, -0.07f, 0.76f, -0.08f, 1.14f, -0.04f)
                curveTo(20.33f, 2.44f, 16.45f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(6.02f, 0f, 11.0f, -4.46f, 11.86f, -10.24f)
                lineToRelative(-1.07f, 1.01f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _FaceThermometer = it}

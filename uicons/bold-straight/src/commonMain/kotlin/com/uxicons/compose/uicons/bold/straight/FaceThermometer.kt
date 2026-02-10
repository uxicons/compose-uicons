package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceThermometer: ImageVector? = null

val Icons.Bs.FaceThermometer: ImageVector
    get() = _FaceThermometer ?: UXIcon(name = "FaceThermometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.0f, 11f)
                curveToRelative(-1.1f, 0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(20.68f, 8.51f)
                lineToRelative(-5.75f, 5.07f)
                curveToRelative(-0.86f, -0.33f, -1.86f, -0.57f, -2.93f, -0.57f)
                curveToRelative(-3.3f, 0f, -5.89f, 2.28f, -6.0f, 2.38f)
                lineToRelative(1.99f, 2.24f)
                curveToRelative(0.02f, -0.02f, 1.87f, -1.62f, 4.0f, -1.62f)
                curveToRelative(2.38f, 0f, 4.24f, 1.86f, 4.26f, 1.88f)
                lineToRelative(1.9f, -1.83f)
                lineToRelative(-1.26f, -1.43f)
                lineToRelative(1.5f, -1.32f)
                lineToRelative(1.26f, 1.43f)
                lineToRelative(1.65f, -1.45f)
                lineToRelative(-1.28f, -1.45f)
                lineToRelative(1.5f, -1.32f)
                lineToRelative(1.28f, 1.45f)
                lineToRelative(0.51f, -0.45f)
                curveToRelative(0.83f, -0.73f, 0.91f, -1.99f, 0.18f, -2.82f)
                curveToRelative(-0.73f, -0.83f, -1.99f, -0.91f, -2.82f, -0.18f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                curveToRelative(3.09f, 0f, 5.82f, 1.57f, 7.44f, 3.94f)
                curveToRelative(0.85f, -0.71f, 1.92f, -1.01f, 2.96f, -0.91f)
                curveTo(20.33f, 2.44f, 16.45f, 0f, 12f, 0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveTo(5.38f, 0.0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12f)
                curveToRelative(0.0f, 0f, 0.0f, 0f, 0.0f, 0f)
                curveToRelative(6.14f, 0f, 11.21f, -4.64f, 11.91f, -10.6f)
                curveToRelative(-0.25f, 0.25f, -6.08f, 5.44f, -6.08f, 5.44f)
                curveToRelative(-1.57f, 1.34f, -3.61f, 2.16f, -5.83f, 2.16f)
                close()
            }
        }.also { _FaceThermometer = it}

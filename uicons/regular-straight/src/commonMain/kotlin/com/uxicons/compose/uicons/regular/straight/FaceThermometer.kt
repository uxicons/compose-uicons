package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceThermometer: ImageVector? = null

val Icons.Rs.FaceThermometer: ImageVector
    get() = _FaceThermometer ?: UXIcon(name = "FaceThermometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 9.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.68f, 8.51f)
                lineToRelative(-6.59f, 5.81f)
                curveToRelative(-0.64f, -0.19f, -1.35f, -0.31f, -2.09f, -0.31f)
                curveToRelative(-3.11f, 0f, -5.56f, 2.16f, -5.67f, 2.25f)
                lineToRelative(1.33f, 1.49f)
                curveToRelative(0.02f, -0.02f, 2.0f, -1.75f, 4.34f, -1.75f)
                reflectiveCurveToRelative(4.32f, 1.73f, 4.34f, 1.75f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.03f, 0.04f)
                lineToRelative(1.79f, -1.72f)
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
                moveTo(12.0f, 22f)
                horizontalLineToRelative(0f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.48f, 2f, 12.0f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(3.45f, 0f, 6.49f, 1.75f, 8.29f, 4.41f)
                curveToRelative(0.67f, -0.32f, 1.39f, -0.44f, 2.11f, -0.37f)
                curveTo(20.32f, 2.44f, 16.44f, 0f, 12.0f, 0f)
                horizontalLineToRelative(0f)
                curveTo(5.38f, 0f, -0.0f, 5.38f, -0.0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(0f)
                curveToRelative(6.04f, 0f, 11.04f, -4.49f, 11.87f, -10.3f)
                lineToRelative(-2.77f, 2.44f)
                curveToRelative(-1.58f, 3.45f, -5.05f, 5.86f, -9.09f, 5.86f)
                close()
            }
        }.also { _FaceThermometer = it}

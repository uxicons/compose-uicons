package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceThermometer: ImageVector? = null

val Icons.Ss.FaceThermometer: ImageVector
    get() = _FaceThermometer ?: UXIcon(name = "FaceThermometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.91f, 10.58f)
                curveToRelative(-0.1f, 0.34f, -0.3f, 0.67f, -0.59f, 0.92f)
                lineToRelative(-0.51f, 0.45f)
                lineToRelative(-1.28f, -1.45f)
                lineToRelative(-1.5f, 1.32f)
                lineToRelative(1.28f, 1.45f)
                lineToRelative(-1.65f, 1.45f)
                lineToRelative(-1.26f, -1.43f)
                lineToRelative(-1.5f, 1.32f)
                lineToRelative(1.26f, 1.43f)
                lineToRelative(-1.79f, 1.72f)
                lineToRelative(-0.03f, -0.04f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.02f, -0.02f, -2.0f, -1.75f, -4.34f, -1.75f)
                reflectiveCurveToRelative(-4.32f, 1.73f, -4.34f, 1.75f)
                lineToRelative(-1.33f, -1.49f)
                curveToRelative(0.1f, -0.09f, 2.56f, -2.25f, 5.67f, -2.25f)
                curveToRelative(0.74f, 0f, 1.44f, 0.13f, 2.08f, 0.32f)
                lineToRelative(6.6f, -5.81f)
                curveToRelative(0.83f, -0.73f, 2.09f, -0.65f, 2.82f, 0.18f)
                curveToRelative(0.01f, 0.02f, 0.02f, 0.04f, 0.04f, 0.05f)
                curveTo(22.12f, 3.7f, 17.5f, 0f, 12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                curveToRelative(0f, -0.48f, -0.04f, -0.95f, -0.09f, -1.42f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _FaceThermometer = it}

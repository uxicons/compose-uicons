package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scooter: ImageVector? = null

val Icons.Br.Scooter: ImageVector
    get() = _Scooter ?: UXIcon(name = "Scooter") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 21f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            curveToRelative(0f, -0.69f, 0.25f, -1.33f, 0.64f, -1.83f)
            lineToRelative(-0.63f, -2.66f)
            lineToRelative(-1.14f, 1.43f)
            curveToRelative(-1.05f, 1.31f, -2.62f, 2.06f, -4.29f, 2.06f)
            horizontalLineToRelative(-4.76f)
            curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            curveToRelative(0f, -0.35f, 0.07f, -0.69f, 0.18f, -1f)
            horizontalLineToRelative(-0.68f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11.08f)
            curveToRelative(0.76f, 0f, 1.48f, -0.34f, 1.95f, -0.94f)
            lineToRelative(2.61f, -3.26f)
            lineToRelative(-1.87f, -7.88f)
            curveToRelative(-0.27f, -1.13f, -1.27f, -1.92f, -2.43f, -1.92f)
            horizontalLineToRelative(-0.34f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.34f)
            curveToRelative(2.56f, 0f, 4.76f, 1.74f, 5.35f, 4.23f)
            lineToRelative(3.27f, 13.81f)
            curveToRelative(1.44f, 0.22f, 2.54f, 1.46f, 2.54f, 2.95f)
            close()
        }
    }.also { _Scooter = it }

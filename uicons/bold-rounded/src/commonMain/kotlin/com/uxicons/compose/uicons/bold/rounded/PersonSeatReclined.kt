package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeatReclined: ImageVector? = null

val Icons.Br.PersonSeatReclined: ImageVector
    get() = _PersonSeatReclined ?: UXIcon(name = "PersonSeatReclined") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(4f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(22.5f, 21f)
            horizontalLineToRelative(-1.55f)
            lineToRelative(-2.39f, -4.79f)
            curveToRelative(-0.68f, -1.35f, -2.06f, -2.21f, -3.58f, -2.21f)
            horizontalLineToRelative(-4.75f)
            curveToRelative(-0.24f, 0f, -0.44f, -0.17f, -0.49f, -0.4f)
            lineToRelative(-0.38f, -1.6f)
            horizontalLineToRelative(5.14f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5.75f)
            curveToRelative(-0.04f, 0f, -0.07f, 0.0f, -0.11f, 0.01f)
            lineToRelative(-0.43f, -1.81f)
            curveToRelative(-0.15f, -0.69f, -0.76f, -1.19f, -1.47f, -1.19f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.95f, 0f, -1.66f, 0.88f, -1.47f, 1.81f)
            lineToRelative(1.53f, 6.41f)
            curveToRelative(0.34f, 1.62f, 1.77f, 2.78f, 3.43f, 2.78f)
            horizontalLineToRelative(4.75f)
            curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.89f, 0.55f)
            lineToRelative(2.39f, 4.79f)
            curveToRelative(0.51f, 1.02f, 1.55f, 1.66f, 2.68f, 1.66f)
            horizontalLineToRelative(1.55f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13.43f, 19f)
            horizontalLineToRelative(-3.28f)
            curveToRelative(-2.59f, 0f, -4.83f, -1.8f, -5.38f, -4.33f)
            lineToRelative(-1.8f, -7.48f)
            curveToRelative(-0.15f, -0.69f, -0.76f, -1.18f, -1.47f, -1.18f)
            curveToRelative(-0.96f, 0f, -1.67f, 0.88f, -1.47f, 1.82f)
            lineToRelative(1.8f, 7.48f)
            curveToRelative(0.85f, 3.91f, 4.31f, 6.7f, 8.3f, 6.7f)
            horizontalLineToRelative(3.29f)
            curveToRelative(1.11f, 0f, 1.84f, -1.17f, 1.34f, -2.17f)
            curveToRelative(-0.25f, -0.51f, -0.77f, -0.83f, -1.34f, -0.83f)
            close()
        }
    }.also { _PersonSeatReclined = it }

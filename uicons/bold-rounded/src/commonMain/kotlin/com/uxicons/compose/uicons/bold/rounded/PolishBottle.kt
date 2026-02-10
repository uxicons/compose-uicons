package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Br.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.59f, 10.86f)
            curveToRelative(-0.7f, -0.79f, -1.6f, -1.35f, -2.59f, -1.64f)
            lineTo(16f, 4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            verticalLineToRelative(5.22f)
            curveToRelative(-2.54f, 0.68f, -4.3f, 3.35f, -3.93f, 5.96f)
            lineToRelative(0.72f, 5.75f)
            curveToRelative(0.22f, 1.75f, 1.71f, 3.07f, 3.47f, 3.07f)
            horizontalLineToRelative(7.47f)
            curveToRelative(1.76f, 0f, 3.25f, -1.32f, 3.47f, -3.07f)
            lineToRelative(0.72f, -5.75f)
            curveToRelative(0.2f, -1.56f, -0.29f, -3.14f, -1.33f, -4.32f)
            close()
            moveTo(11f, 4f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-2f)
            lineTo(11f, 4f)
            close()
            moveTo(16.95f, 14.81f)
            lineToRelative(-0.72f, 5.75f)
            curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
            horizontalLineToRelative(-7.47f)
            curveToRelative(-0.25f, 0f, -0.47f, -0.19f, -0.5f, -0.44f)
            lineToRelative(-0.72f, -5.75f)
            curveToRelative(-0.09f, -0.72f, 0.12f, -1.42f, 0.61f, -1.96f)
            curveToRelative(0.48f, -0.55f, 1.15f, -0.85f, 1.87f, -0.85f)
            horizontalLineToRelative(4.94f)
            curveToRelative(0.73f, 0f, 1.39f, 0.3f, 1.87f, 0.85f)
            curveToRelative(0.48f, 0.55f, 0.7f, 1.24f, 0.61f, 1.96f)
            close()
            moveTo(15f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _PolishBottle = it }

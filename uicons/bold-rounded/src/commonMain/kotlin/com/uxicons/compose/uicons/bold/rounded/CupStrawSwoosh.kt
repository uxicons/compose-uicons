package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStrawSwoosh: ImageVector? = null

val Icons.Br.CupStrawSwoosh: ImageVector
    get() = _CupStrawSwoosh ?: UXIcon(name = "CupStrawSwoosh") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 5f)
            horizontalLineToRelative(-6.95f)
            lineToRelative(0.2f, -1.56f)
            curveToRelative(0.03f, -0.25f, 0.25f, -0.43f, 0.5f, -0.43f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.75f)
            curveToRelative(-1.75f, 0f, -3.24f, 1.31f, -3.47f, 3.04f)
            lineToRelative(-0.26f, 1.96f)
            lineTo(3.51f, 5f)
            curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, 0f)
            horizontalLineToRelative(-1.47f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.17f)
            lineToRelative(1.32f, 11.14f)
            curveToRelative(0.33f, 2.77f, 2.67f, 4.86f, 5.46f, 4.86f)
            horizontalLineToRelative(6.11f)
            curveToRelative(2.79f, 0f, 5.13f, -2.09f, 5.46f, -4.86f)
            lineToRelative(1.32f, -11.14f)
            horizontalLineToRelative(0.17f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(15.06f, 21f)
            horizontalLineToRelative(-6.11f)
            curveToRelative(-1.27f, 0f, -2.33f, -0.95f, -2.48f, -2.21f)
            lineToRelative(-0.31f, -2.63f)
            curveToRelative(1.11f, -0.72f, 2.18f, -1.17f, 2.85f, -1.17f)
            curveToRelative(0.65f, 0f, 1.46f, 0.41f, 2.33f, 0.84f)
            curveToRelative(1.09f, 0.54f, 2.32f, 1.16f, 3.67f, 1.16f)
            curveToRelative(0.96f, 0f, 1.96f, -0.32f, 2.84f, -0.73f)
            lineToRelative(-0.3f, 2.52f)
            curveToRelative(-0.15f, 1.26f, -1.22f, 2.21f, -2.48f, 2.21f)
            close()
            moveTo(18.28f, 12.55f)
            curveToRelative(-0.81f, 0.58f, -2.29f, 1.45f, -3.28f, 1.45f)
            curveToRelative(-0.65f, 0f, -1.46f, -0.41f, -2.33f, -0.84f)
            curveToRelative(-1.09f, -0.54f, -2.32f, -1.16f, -3.67f, -1.16f)
            curveToRelative(-1.09f, 0f, -2.23f, 0.4f, -3.23f, 0.92f)
            lineToRelative(-0.58f, -4.92f)
            horizontalLineToRelative(13.62f)
            lineToRelative(-0.54f, 4.55f)
            close()
        }
    }.also { _CupStrawSwoosh = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Br.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 24f)
            lineTo(3.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(20.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(2.48f, 19f)
            lineTo(21.5f, 19f)
            curveToRelative(0.87f, 0.01f, 1.44f, -0.36f, 1.76f, -0.68f)
            curveToRelative(0.68f, -0.67f, 0.73f, -1.53f, 0.73f, -1.78f)
            curveToRelative(0f, -3.21f, -2.24f, -5.54f, -5.32f, -5.54f)
            horizontalLineToRelative(-3.62f)
            curveToRelative(0.29f, -1.73f, 0.94f, -5.73f, 0.94f, -7f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 1.27f, 0.65f, 5.27f, 0.94f, 7f)
            horizontalLineToRelative(-3.62f)
            curveToRelative(-3.08f, 0f, -5.32f, 2.33f, -5.32f, 5.54f)
            curveToRelative(0f, 0.25f, 0.05f, 1.11f, 0.73f, 1.78f)
            curveToRelative(0.31f, 0.31f, 0.87f, 0.68f, 1.7f, 0.68f)
            horizontalLineToRelative(0.04f)
            close()
            moveTo(9.36f, 14f)
            curveToRelative(0.78f, 0f, 1.52f, -0.34f, 2.03f, -0.94f)
            curveToRelative(0.36f, -0.43f, 0.58f, -0.96f, 0.62f, -1.51f)
            curveToRelative(0.04f, 0.55f, 0.25f, 1.08f, 0.62f, 1.51f)
            curveToRelative(0.5f, 0.6f, 1.24f, 0.94f, 2.03f, 0.94f)
            horizontalLineToRelative(4.04f)
            curveToRelative(1.26f, 0f, 2.1f, 0.75f, 2.28f, 2f)
            lineTo(3.04f, 16f)
            curveToRelative(0.19f, -1.25f, 1.02f, -2f, 2.28f, -2f)
            horizontalLineToRelative(4.04f)
            close()
            moveTo(13f, 4f)
            curveToRelative(0f, 0.62f, -0.33f, 3.19f, -0.97f, 6.9f)
            curveToRelative(-0.01f, 0.09f, -0.03f, 0.17f, -0.03f, 0.26f)
            curveToRelative(-0.01f, -0.09f, -0.02f, -0.17f, -0.03f, -0.26f)
            curveToRelative(-0.64f, -3.72f, -0.97f, -6.29f, -0.97f, -6.9f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
        }
    }.also { _Stamp = it }

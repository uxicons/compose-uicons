package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Br.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.33f, 7.55f)
            lineToRelative(-2.33f, -1.4f)
            verticalLineToRelative(-3.24f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.21f, 1f, 1.41f)
            verticalLineToRelative(3.24f)
            lineToRelative(-2.33f, 1.4f)
            curveToRelative(-1.65f, 0.99f, -2.67f, 2.79f, -2.67f, 4.72f)
            verticalLineToRelative(6.24f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.24f)
            curveToRelative(0f, -1.92f, -1.02f, -3.73f, -2.67f, -4.72f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6.24f)
            curveToRelative(0f, -0.87f, 0.47f, -1.69f, 1.21f, -2.14f)
            lineToRelative(3.06f, -1.83f)
            curveToRelative(0.45f, -0.27f, 0.73f, -0.76f, 0.73f, -1.29f)
            lineTo(11.0f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.53f, 0.28f, 1.01f, 0.73f, 1.29f)
            lineToRelative(3.06f, 1.83f)
            curveToRelative(0.75f, 0.45f, 1.21f, 1.27f, 1.21f, 2.14f)
            verticalLineToRelative(6.24f)
            close()
            moveTo(13.1f, 12.5f)
            curveToRelative(0.86f, 1.0f, 1.9f, 2.32f, 1.9f, 3.5f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            curveToRelative(0f, -1.18f, 1.04f, -2.5f, 1.9f, -3.5f)
            curveToRelative(0.58f, -0.68f, 1.62f, -0.68f, 2.2f, 0f)
            close()
        }
    }.also { _BottleDroplet = it }

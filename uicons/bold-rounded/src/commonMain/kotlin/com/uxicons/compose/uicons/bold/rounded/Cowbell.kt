package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cowbell: ImageVector? = null

val Icons.Br.Cowbell: ImageVector
    get() = _Cowbell ?: UXIcon(name = "Cowbell") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.93f, 15.71f)
            lineToRelative(-1.1f, -6.18f)
            curveToRelative(-0.44f, -2.48f, -2.49f, -4.31f, -4.96f, -4.51f)
            curveToRelative(0.09f, -0.33f, 0.13f, -0.67f, 0.13f, -1.02f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 0.35f, 0.05f, 0.69f, 0.13f, 1.02f)
            curveToRelative(-2.47f, 0.2f, -4.52f, 2.04f, -4.96f, 4.51f)
            lineToRelative(-1.1f, 6.18f)
            curveToRelative(-0.23f, 1.31f, 0.12f, 2.66f, 0.98f, 3.68f)
            curveToRelative(0.86f, 1.02f, 2.11f, 1.61f, 3.45f, 1.61f)
            horizontalLineToRelative(2.63f)
            curveToRelative(0.45f, 1.72f, 2.01f, 3f, 3.87f, 3f)
            reflectiveCurveToRelative(3.43f, -1.28f, 3.87f, -3f)
            horizontalLineToRelative(2.63f)
            curveToRelative(1.33f, 0f, 2.59f, -0.59f, 3.45f, -1.61f)
            curveToRelative(0.86f, -1.02f, 1.21f, -2.37f, 0.98f, -3.68f)
            close()
            moveTo(11f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            close()
            moveTo(19.65f, 17.46f)
            curveToRelative(-0.17f, 0.2f, -0.54f, 0.54f, -1.15f, 0.54f)
            lineTo(5.5f, 18f)
            curveToRelative(-0.61f, 0f, -0.98f, -0.34f, -1.15f, -0.54f)
            reflectiveCurveToRelative(-0.43f, -0.63f, -0.33f, -1.23f)
            lineToRelative(1.1f, -6.18f)
            curveToRelative(0.21f, -1.19f, 1.25f, -2.06f, 2.46f, -2.06f)
            horizontalLineToRelative(8.83f)
            curveToRelative(1.21f, 0f, 2.25f, 0.87f, 2.46f, 2.06f)
            lineToRelative(1.1f, 6.18f)
            curveToRelative(0.11f, 0.6f, -0.16f, 1.03f, -0.33f, 1.23f)
            close()
        }
    }.also { _Cowbell = it }

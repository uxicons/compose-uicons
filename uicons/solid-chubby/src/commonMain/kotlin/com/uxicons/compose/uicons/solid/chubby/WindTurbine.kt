package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindTurbine: ImageVector? = null

val Icons.Sc.WindTurbine: ImageVector
    get() = _WindTurbine ?: UXIcon(name = "WindTurbine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.62f, 14.95f)
                curveToRelative(-1.32f, -1.91f, -3.2f, -3.92f, -5.61f, -5.97f)
                curveToRelative(-0.89f, -3.03f, -1.96f, -5.56f, -3.17f, -7.54f)
                curveToRelative(-0.36f, -0.58f, -1.31f, -0.58f, -1.67f, 0f)
                curveToRelative(-1.21f, 1.98f, -2.28f, 4.51f, -3.17f, 7.54f)
                curveToRelative(-2.41f, 2.05f, -4.3f, 4.06f, -5.61f, 5.97f)
                curveToRelative(-0.42f, 0.57f, -0.02f, 1.46f, 0.69f, 1.53f)
                curveToRelative(2.1f, 0.25f, 4.62f, 0.18f, 7.46f, -0.17f)
                verticalLineToRelative(3.35f)
                curveToRelative(-1.18f, 0.13f, -1.83f, 0.32f, -2.31f, 0.45f)
                curveToRelative(-0.79f, 0.2f, -1.27f, 0.99f, -1.07f, 1.78f)
                curveToRelative(0.2f, 0.79f, 0.99f, 1.27f, 1.78f, 1.07f)
                curveToRelative(0.66f, -0.17f, 1.45f, -0.43f, 3.07f, -0.45f)
                curveToRelative(1.89f, 0.0f, 2.4f, 0.36f, 3.43f, 0.49f)
                curveToRelative(0.66f, 0f, 1.26f, -0.45f, 1.43f, -1.12f)
                curveToRelative(0.2f, -0.79f, -0.28f, -1.58f, -1.07f, -1.78f)
                curveToRelative(-0.48f, -0.13f, -1.14f, -0.32f, -2.31f, -0.45f)
                verticalLineToRelative(-3.33f)
                curveToRelative(1.66f, 0.21f, 3.2f, 0.31f, 4.62f, 0.31f)
                curveToRelative(1.01f, 0f, 1.96f, -0.05f, 2.84f, -0.16f)
                curveToRelative(0.71f, -0.07f, 1.11f, -0.95f, 0.69f, -1.53f)
                close()
                moveTo(12f, 12.72f)
                curveToRelative(-0.81f, 0f, -1.47f, -0.66f, -1.47f, -1.47f)
                reflectiveCurveToRelative(0.66f, -1.47f, 1.47f, -1.47f)
                reflectiveCurveToRelative(1.47f, 0.66f, 1.47f, 1.47f)
                reflectiveCurveToRelative(-0.66f, 1.47f, -1.47f, 1.47f)
                close()
            }
        }.also { _WindTurbine = it}

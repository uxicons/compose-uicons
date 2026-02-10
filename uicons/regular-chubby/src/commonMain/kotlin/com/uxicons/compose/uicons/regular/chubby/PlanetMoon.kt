package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetMoon: ImageVector? = null

val Icons.Rc.PlanetMoon: ImageVector
    get() = _PlanetMoon ?: UXIcon(name = "PlanetMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 4f)
                curveToRelative(-6.66f, 0f, -9.5f, 2.84f, -9.5f, 9.5f)
                reflectiveCurveToRelative(2.84f, 9.5f, 9.5f, 9.5f)
                reflectiveCurveToRelative(9.5f, -2.84f, 9.5f, -9.5f)
                reflectiveCurveToRelative(-2.84f, -9.5f, -9.5f, -9.5f)
                close()
                moveTo(10.5f, 21f)
                curveToRelative(-5.54f, 0f, -7.5f, -1.96f, -7.5f, -7.5f)
                curveToRelative(0f, -1.25f, 0.11f, -2.3f, 0.32f, -3.2f)
                lineToRelative(0.38f, 0.39f)
                curveToRelative(0.19f, 0.2f, 0.45f, 0.31f, 0.72f, 0.31f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.25f, 0f, 0.49f, 0.1f, 0.67f, 0.28f)
                lineToRelative(0.45f, 0.45f)
                curveToRelative(0.18f, 0.18f, 0.28f, 0.42f, 0.28f, 0.67f)
                verticalLineToRelative(0.78f)
                curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(1.14f, 1.14f)
                curveToRelative(0.18f, 0.18f, 0.28f, 0.42f, 0.28f, 0.67f)
                verticalLineToRelative(1.48f)
                curveToRelative(0f, 0.62f, 0.51f, 1.13f, 1.13f, 1.13f)
                horizontalLineToRelative(0.49f)
                curveToRelative(0.41f, 0f, 0.7f, -0.18f, 0.99f, -0.59f)
                curveToRelative(1.2f, -1.31f, 2.0f, -2.69f, 2.35f, -4.13f)
                curveToRelative(0.13f, -0.59f, -0.05f, -0.95f, -0.4f, -1.25f)
                curveToRelative(0f, 0f, -0.57f, -0.59f, -1.47f, -1.07f)
                curveToRelative(-0.99f, -0.53f, -2.4f, -0.96f, -3.09f, -0.96f)
                horizontalLineToRelative(-1.11f)
                curveToRelative(-0.25f, 0f, -0.49f, -0.1f, -0.67f, -0.28f)
                lineToRelative(-0.56f, -0.56f)
                curveToRelative(-0.37f, -0.37f, -0.37f, -0.96f, 0f, -1.33f)
                lineToRelative(0.35f, -0.35f)
                curveToRelative(0.29f, -0.29f, 0.72f, -0.36f, 1.09f, -0.18f)
                lineToRelative(0.79f, 0.39f)
                curveToRelative(0.36f, 0.18f, 0.8f, 0.11f, 1.09f, -0.18f)
                curveToRelative(0.31f, -0.31f, 0.36f, -0.78f, 0.14f, -1.15f)
                lineToRelative(-0.82f, -1.36f)
                curveToRelative(0.07f, 0f, 0.13f, -0.01f, 0.2f, -0.01f)
                curveToRelative(5.54f, 0f, 7.5f, 1.96f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-1.96f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(23f, 3f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                close()
            }
        }.also { _PlanetMoon = it}

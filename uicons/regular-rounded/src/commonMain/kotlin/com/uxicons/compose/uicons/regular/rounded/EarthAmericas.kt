package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAmericas: ImageVector? = null

val Icons.Rr.EarthAmericas: ImageVector
    get() = _EarthAmericas ?: UXIcon(name = "EarthAmericas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -1.49f, 0.33f, -2.91f, 0.92f, -4.19f)
                lineToRelative(1.67f, 1.75f)
                curveToRelative(0.27f, 0.28f, 0.63f, 0.44f, 1.02f, 0.44f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.29f, 0f, 0.56f, 0.11f, 0.77f, 0.32f)
                lineToRelative(0.37f, 0.37f)
                curveToRelative(0.2f, 0.2f, 0.31f, 0.47f, 0.31f, 0.74f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 0.39f, 0.15f, 0.75f, 0.42f, 1.02f)
                lineToRelative(1.19f, 1.19f)
                curveToRelative(0.25f, 0.25f, 0.39f, 0.58f, 0.39f, 0.93f)
                verticalLineToRelative(2.37f)
                curveToRelative(0f, 0.6f, 0.49f, 1.09f, 1.09f, 1.09f)
                horizontalLineToRelative(0.21f)
                curveToRelative(0.42f, 0f, 0.81f, -0.25f, 0.99f, -0.63f)
                lineToRelative(2.24f, -4.86f)
                curveToRelative(0.27f, -0.58f, 0.06f, -1.26f, -0.48f, -1.6f)
                lineToRelative(-2.56f, -1.6f)
                curveToRelative(-0.32f, -0.2f, -0.7f, -0.31f, -1.08f, -0.31f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(-0.31f, 0f, -0.61f, -0.12f, -0.83f, -0.34f)
                lineToRelative(-0.59f, -0.59f)
                curveToRelative(-0.31f, -0.31f, -0.31f, -0.82f, 0f, -1.13f)
                lineToRelative(0.53f, -0.53f)
                curveToRelative(0.24f, -0.24f, 0.61f, -0.3f, 0.92f, -0.15f)
                lineToRelative(0.88f, 0.44f)
                curveToRelative(0.36f, 0.18f, 0.8f, 0.11f, 1.08f, -0.18f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.3f, -0.3f, 0.36f, -0.78f, 0.14f, -1.15f)
                lineToRelative(-0.84f, -1.4f)
                curveToRelative(-0.17f, -0.29f, -0.17f, -0.65f, 0.01f, -0.94f)
                curveToRelative(0.3f, -0.46f, 0.78f, -1.2f, 1.32f, -2.02f)
                curveToRelative(3.27f, 0.2f, 6.12f, 1.98f, 7.8f, 4.59f)
                lineToRelative(-1.59f, 0.92f)
                curveToRelative(-0.49f, 0.28f, -0.73f, 0.85f, -0.59f, 1.4f)
                lineToRelative(0.63f, 2.51f)
                curveToRelative(0.09f, 0.36f, 0.33f, 0.66f, 0.67f, 0.83f)
                lineToRelative(2.37f, 1.18f)
                curveToRelative(-0.7f, 4.83f, -4.87f, 8.56f, -9.9f, 8.56f)
                close()
            }
        }.also { _EarthAmericas = it}

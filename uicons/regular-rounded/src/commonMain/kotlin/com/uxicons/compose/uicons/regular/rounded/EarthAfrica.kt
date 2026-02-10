package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Rr.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -3.47f, 1.78f, -6.54f, 4.48f, -8.33f)
                lineToRelative(1.25f, 1.09f)
                curveToRelative(0.17f, 0.15f, 0.28f, 0.38f, 0.28f, 0.61f)
                verticalLineToRelative(0.83f)
                curveToRelative(0f, 0.45f, 0.36f, 0.81f, 0.81f, 0.81f)
                horizontalLineToRelative(0.73f)
                curveToRelative(0.3f, 0f, 0.6f, -0.08f, 0.87f, -0.24f)
                lineToRelative(1.55f, -0.93f)
                curveToRelative(0.33f, -0.2f, 0.74f, -0.14f, 1.01f, 0.12f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(0.15f, 0.15f, 0.24f, 0.36f, 0.24f, 0.58f)
                verticalLineToRelative(0.83f)
                curveToRelative(0f, 0.46f, -0.37f, 0.83f, -0.83f, 0.83f)
                horizontalLineToRelative(-2.63f)
                curveToRelative(-0.35f, 0f, -0.7f, 0.1f, -0.99f, 0.3f)
                lineToRelative(-1.76f, 1.17f)
                curveToRelative(-0.5f, 0.33f, -0.8f, 0.89f, -0.8f, 1.49f)
                verticalLineToRelative(1.04f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.34f, 0f, 0.63f, 0.23f, 0.71f, 0.56f)
                lineToRelative(0.69f, 2.77f)
                curveToRelative(0.1f, 0.39f, 0.45f, 0.67f, 0.86f, 0.67f)
                horizontalLineToRelative(0.81f)
                curveToRelative(0.31f, 0f, 0.6f, -0.16f, 0.76f, -0.43f)
                lineToRelative(2.5f, -4.16f)
                curveToRelative(0.16f, -0.27f, 0.25f, -0.58f, 0.25f, -0.89f)
                verticalLineToRelative(-1.3f)
                curveToRelative(0f, -0.46f, -0.18f, -0.9f, -0.51f, -1.22f)
                lineToRelative(-0.99f, -0.99f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.8f, 0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(1.24f, -1.24f)
                curveToRelative(0.57f, 1.25f, 0.89f, 2.65f, 0.89f, 4.11f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _EarthAfrica = it}

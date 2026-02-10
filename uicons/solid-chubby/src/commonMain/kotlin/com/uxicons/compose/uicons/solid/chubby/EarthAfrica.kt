package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Sc.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(17.39f, 10f)
                horizontalLineToRelative(-1.89f)
                lineToRelative(0.99f, 0.99f)
                curveToRelative(0.33f, 0.33f, 0.51f, 0.77f, 0.51f, 1.22f)
                verticalLineToRelative(0.86f)
                curveToRelative(0f, 0.61f, -0.26f, 1.61f, -1.21f, 3.33f)
                curveToRelative(-0.83f, 1.5f, -1.77f, 2.62f, -2.79f, 2.62f)
                curveToRelative(-0.61f, 0f, -1.18f, -1.03f, -1.41f, -1.87f)
                curveToRelative(-0.23f, -0.85f, -0.45f, -1.6f, -0.45f, -1.6f)
                curveToRelative(-0.08f, -0.33f, -0.38f, -0.56f, -0.71f, -0.56f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.54f)
                curveToRelative(0f, -1.05f, 0.59f, -1.74f, 1.33f, -2.33f)
                curveToRelative(0.74f, -0.59f, 1.64f, -1.13f, 2.97f, -1.13f)
                horizontalLineToRelative(1.86f)
                curveToRelative(0.46f, 0f, 0.83f, -0.37f, 0.83f, -0.83f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0f, -0.22f, -0.09f, -0.43f, -0.24f, -0.58f)
                lineToRelative(-0.8f, -0.8f)
                curveToRelative(-0.27f, -0.27f, -0.69f, -0.32f, -1.01f, -0.12f)
                curveToRelative(0f, 0f, -0.72f, 0.35f, -1.54f, 0.76f)
                curveToRelative(-0.82f, 0.41f, -1.6f, 0.41f, -1.6f, 0.41f)
                curveToRelative(-0.45f, 0f, -0.81f, -0.36f, -0.81f, -0.81f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0f, -0.23f, -0.1f, -0.45f, -0.28f, -0.61f)
                lineToRelative(-0.94f, -0.89f)
                curveToRelative(1.33f, -0.6f, 3.04f, -0.87f, 5.21f, -0.87f)
                curveToRelative(5.21f, 0f, 7.81f, 1.54f, 8.67f, 5.46f)
                curveToRelative(-1.2f, 1.03f, -2.23f, 1.54f, -3.28f, 1.54f)
                close()
            }
        }.also { _EarthAfrica = it}

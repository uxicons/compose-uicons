package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Rc.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                curveToRelative(0f, -4.39f, 1.1f, -6.92f, 3.79f, -8.13f)
                lineToRelative(0.94f, 0.89f)
                curveToRelative(0.17f, 0.15f, 0.28f, 0.38f, 0.28f, 0.61f)
                verticalLineToRelative(0.83f)
                curveToRelative(0f, 0.45f, 0.36f, 0.81f, 0.81f, 0.81f)
                curveToRelative(0f, 0f, 0.78f, 0f, 1.6f, -0.41f)
                curveToRelative(0.82f, -0.41f, 1.54f, -0.76f, 1.54f, -0.76f)
                curveToRelative(0.33f, -0.2f, 0.74f, -0.14f, 1.01f, 0.12f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(0.15f, 0.15f, 0.24f, 0.36f, 0.24f, 0.58f)
                verticalLineToRelative(0.83f)
                curveToRelative(0f, 0.46f, -0.37f, 0.83f, -0.83f, 0.83f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(-1.33f, 0f, -2.23f, 0.54f, -2.97f, 1.13f)
                curveToRelative(-0.74f, 0.59f, -1.33f, 1.28f, -1.33f, 2.33f)
                verticalLineToRelative(0.54f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1.43f)
                curveToRelative(0.34f, 0f, 0.63f, 0.23f, 0.71f, 0.56f)
                curveToRelative(0f, 0f, 0.22f, 0.75f, 0.45f, 1.6f)
                reflectiveCurveToRelative(0.77f, 1.85f, 1.39f, 1.85f)
                curveToRelative(1.03f, 0f, 1.99f, -1.09f, 2.82f, -2.59f)
                curveToRelative(0.95f, -1.72f, 1.21f, -2.72f, 1.21f, -3.33f)
                verticalLineToRelative(-0.86f)
                curveToRelative(0f, -0.46f, -0.18f, -0.9f, -0.51f, -1.22f)
                lineToRelative(-0.99f, -0.99f)
                horizontalLineToRelative(1.89f)
                curveToRelative(1.05f, 0f, 2.09f, -0.51f, 3.28f, -1.54f)
                curveToRelative(0.22f, 1.02f, 0.33f, 2.19f, 0.33f, 3.54f)
                curveToRelative(0f, 6.56f, -2.44f, 9f, -9f, 9f)
                close()
            }
        }.also { _EarthAfrica = it}

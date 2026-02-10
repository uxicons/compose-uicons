package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Sr.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(19.88f, 9.12f)
                curveToRelative(-0.56f, 0.56f, -1.33f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-2.26f)
                lineToRelative(0.99f, 0.99f)
                curveToRelative(0.33f, 0.33f, 0.51f, 0.77f, 0.51f, 1.22f)
                verticalLineToRelative(1.3f)
                curveToRelative(0f, 0.31f, -0.09f, 0.62f, -0.25f, 0.89f)
                lineToRelative(-2.5f, 4.16f)
                curveToRelative(-0.16f, 0.27f, -0.45f, 0.43f, -0.76f, 0.43f)
                horizontalLineToRelative(-0.81f)
                curveToRelative(-0.41f, 0f, -0.76f, -0.28f, -0.86f, -0.67f)
                lineToRelative(-0.69f, -2.77f)
                curveToRelative(-0.08f, -0.33f, -0.38f, -0.56f, -0.71f, -0.56f)
                horizontalLineToRelative(-1.43f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0f, -0.6f, 0.3f, -1.15f, 0.8f, -1.49f)
                lineToRelative(1.76f, -1.17f)
                curveToRelative(0.29f, -0.2f, 0.64f, -0.3f, 0.99f, -0.3f)
                horizontalLineToRelative(2.63f)
                curveToRelative(0.46f, 0f, 0.83f, -0.37f, 0.83f, -0.83f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0f, -0.22f, -0.09f, -0.43f, -0.24f, -0.58f)
                lineToRelative(-0.8f, -0.8f)
                curveToRelative(-0.27f, -0.27f, -0.69f, -0.32f, -1.01f, -0.12f)
                lineToRelative(-1.55f, 0.93f)
                curveToRelative(-0.26f, 0.16f, -0.56f, 0.24f, -0.87f, 0.24f)
                horizontalLineToRelative(-0.73f)
                curveToRelative(-0.45f, 0f, -0.81f, -0.36f, -0.81f, -0.81f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0f, -0.23f, -0.1f, -0.45f, -0.28f, -0.61f)
                lineToRelative(-1.25f, -1.09f)
                curveToRelative(1.58f, -1.05f, 3.48f, -1.67f, 5.52f, -1.67f)
                curveToRelative(4.05f, 0f, 7.54f, 2.42f, 9.11f, 5.89f)
                lineToRelative(-1.23f, 1.23f)
                close()
            }
        }.also { _EarthAfrica = it}

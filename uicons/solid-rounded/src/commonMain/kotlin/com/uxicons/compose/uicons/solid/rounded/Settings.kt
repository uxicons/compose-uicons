package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Settings: ImageVector? = null

val Icons.Sr.Settings: ImageVector
    get() = _Settings ?: UXIcon(name = "Settings", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(34.28f, 384f)
                curveToRelative(17.65f, 30.63f, 56.78f, 41.15f, 87.4f, 23.5f)
                curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.04f)
                lineToRelative(9.49f, -5.48f)
                curveToRelative(17.92f, 15.33f, 38.52f, 27.22f, 60.76f, 35.07f)
                verticalLineTo(448f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.65f, 64f, -64f)
                verticalLineToRelative(-10.94f)
                curveToRelative(22.24f, -7.86f, 42.84f, -19.77f, 60.76f, -35.12f)
                lineToRelative(9.54f, 5.5f)
                curveToRelative(30.63f, 17.67f, 69.79f, 7.17f, 87.47f, -23.47f)
                curveToRelative(17.67f, -30.63f, 7.17f, -69.79f, -23.47f, -87.47f)
                lineToRelative(0f, 0f)
                lineToRelative(-9.47f, -5.46f)
                curveToRelative(4.26f, -23.2f, 4.26f, -46.99f, 0f, -70.19f)
                lineToRelative(9.47f, -5.46f)
                curveToRelative(30.63f, -17.67f, 41.14f, -56.83f, 23.47f, -87.47f)
                curveToRelative(-17.67f, -30.63f, -56.83f, -41.14f, -87.47f, -23.47f)
                lineToRelative(-9.49f, 5.48f)
                curveTo(362.86f, 94.64f, 342.25f, 82.77f, 320f, 74.94f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.65f, -64f, 64f)
                verticalLineToRelative(10.94f)
                curveToRelative(-22.24f, 7.86f, -42.84f, 19.77f, -60.76f, 35.12f)
                lineToRelative(-9.54f, -5.53f)
                curveTo(91.07f, 86.86f, 51.91f, 97.37f, 34.24f, 128f)
                reflectiveCurveToRelative(-7.17f, 69.79f, 23.47f, 87.47f)
                lineToRelative(0f, 0f)
                lineToRelative(9.47f, 5.46f)
                curveToRelative(-4.26f, 23.2f, -4.26f, 46.99f, 0f, 70.19f)
                lineToRelative(-9.47f, 5.46f)
                curveTo(27.16f, 314.3f, 16.69f, 353.38f, 34.28f, 384f)
                close()
                moveTo(256f, 170.67f)
                curveToRelative(47.13f, 0f, 85.33f, 38.21f, 85.33f, 85.33f)
                reflectiveCurveTo(303.13f, 341.33f, 256f, 341.33f)
                reflectiveCurveTo(170.67f, 303.13f, 170.67f, 256f)
                reflectiveCurveTo(208.87f, 170.67f, 256f, 170.67f)
                close()
            }
        }.also { _Settings = it}

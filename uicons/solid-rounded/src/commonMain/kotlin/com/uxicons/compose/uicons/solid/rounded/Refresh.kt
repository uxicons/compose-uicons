package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refresh: ImageVector? = null

val Icons.Sr.Refresh: ImageVector
    get() = _Refresh ?: UXIcon(name = "Refresh", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256.01f, 42.67f)
                curveToRelative(57.16f, 0.19f, 111.87f, 23.23f, 151.94f, 64f)
                horizontalLineToRelative(-66.6f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                reflectiveCurveToRelative(9.55f, 21.33f, 21.33f, 21.33f)
                horizontalLineToRelative(88.38f)
                curveToRelative(21.87f, -0.01f, 39.6f, -17.74f, 39.62f, -39.62f)
                verticalLineTo(21.34f)
                curveToRelative(0f, -11.78f, -9.55f, -21.33f, -21.33f, -21.33f)
                reflectiveCurveToRelative(-21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(44.33f)
                curveTo(321.78f, -28.8f, 160.17f, -20.34f, 65.7f, 84.55f)
                curveTo(28.73f, 125.6f, 6.06f, 177.52f, 1.08f, 232.54f)
                curveToRelative(-1.1f, 11.81f, 7.59f, 22.28f, 19.41f, 23.38f)
                curveToRelative(0.64f, 0.06f, 1.28f, 0.09f, 1.93f, 0.09f)
                curveToRelative(10.81f, 0.14f, 19.95f, -7.98f, 21.1f, -18.73f)
                curveTo(53.35f, 127.21f, 145.51f, 42.82f, 256.01f, 42.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(489.63f, 256.01f)
                curveToRelative(-10.81f, -0.14f, -19.95f, 7.98f, -21.1f, 18.73f)
                curveTo(458.35f, 391.95f, 355.08f, 478.72f, 237.86f, 468.54f)
                curveToRelative(-50.72f, -4.41f, -98.18f, -26.83f, -133.79f, -63.2f)
                horizontalLineToRelative(66.6f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveToRelative(0f, -11.78f, -9.55f, -21.33f, -21.33f, -21.33f)
                horizontalLineTo(82.29f)
                curveToRelative(-21.87f, -0.01f, -39.6f, 17.71f, -39.62f, 39.57f)
                curveToRelative(0f, 0.01f, 0f, 0.03f, 0f, 0.04f)
                verticalLineToRelative(88.38f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                reflectiveCurveToRelative(21.33f, -9.55f, 21.33f, -21.33f)
                verticalLineToRelative(-44.33f)
                curveToRelative(104.89f, 94.47f, 266.51f, 86.01f, 360.97f, -18.88f)
                curveToRelative(36.97f, -41.05f, 59.65f, -92.97f, 64.63f, -147.99f)
                curveToRelative(1.1f, -11.81f, -7.59f, -22.28f, -19.41f, -23.38f)
                curveTo(490.9f, 256.04f, 490.27f, 256.01f, 489.63f, 256.01f)
                close()
            }
        }.also { _Refresh = it}

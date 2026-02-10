package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aperture: ImageVector? = null

val Icons.Rr.Aperture: ImageVector
    get() = _Aperture ?: UXIcon(name = "Aperture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                close()
                moveTo(13.41f, 2.1f)
                curveToRelative(2.68f, 0.38f, 5.03f, 1.83f, 6.59f, 3.9f)
                horizontalLineToRelative(-8.96f)
                reflectiveCurveToRelative(2.38f, -3.9f, 2.38f, -3.9f)
                close()
                moveTo(14.19f, 8.0f)
                lineToRelative(2.43f, 4.0f)
                lineToRelative(-2.44f, 4.0f)
                horizontalLineToRelative(-4.45f)
                lineToRelative(-2.31f, -4.1f)
                lineToRelative(2.38f, -3.9f)
                horizontalLineToRelative(4.38f)
                close()
                moveTo(11.1f, 2.04f)
                lineToRelative(-4.79f, 7.86f)
                lineToRelative(-2.24f, -3.98f)
                curveToRelative(1.66f, -2.16f, 4.17f, -3.62f, 7.03f, -3.88f)
                close()
                moveTo(2.84f, 16f)
                curveToRelative(-0.54f, -1.23f, -0.84f, -2.58f, -0.84f, -4f)
                curveToRelative(0f, -1.46f, 0.32f, -2.86f, 0.89f, -4.11f)
                lineToRelative(4.57f, 8.11f)
                lineTo(2.84f, 16f)
                close()
                moveTo(10.59f, 21.9f)
                curveToRelative(-2.68f, -0.38f, -5.03f, -1.83f, -6.59f, -3.9f)
                horizontalLineToRelative(8.96f)
                lineToRelative(-2.38f, 3.9f)
                close()
                moveTo(12.9f, 21.96f)
                lineToRelative(4.9f, -8.03f)
                lineToRelative(2.35f, 3.87f)
                curveToRelative(-1.65f, 2.31f, -4.26f, 3.9f, -7.25f, 4.16f)
                close()
                moveTo(16.53f, 8.0f)
                horizontalLineToRelative(4.63f)
                curveToRelative(0.54f, 1.23f, 0.84f, 2.58f, 0.84f, 4.0f)
                curveToRelative(0f, 1.34f, -0.26f, 2.61f, -0.74f, 3.78f)
                lineToRelative(-4.73f, -7.78f)
                close()
            }
        }.also { _Aperture = it}

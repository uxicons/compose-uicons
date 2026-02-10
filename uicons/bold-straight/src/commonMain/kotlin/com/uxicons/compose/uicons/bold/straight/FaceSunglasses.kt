package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSunglasses: ImageVector? = null

val Icons.Bs.FaceSunglasses: ImageVector
    get() = _FaceSunglasses ?: UXIcon(name = "FaceSunglasses") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.0f, 14.38f)
                lineToRelative(1.99f, 2.24f)
                curveToRelative(-0.11f, 0.1f, -2.7f, 2.38f, -6.0f, 2.38f)
                reflectiveCurveToRelative(-5.89f, -2.28f, -6.0f, -2.38f)
                lineToRelative(1.99f, -2.24f)
                curveToRelative(0.02f, 0.02f, 1.87f, 1.62f, 4.0f, 1.62f)
                reflectiveCurveToRelative(3.99f, -1.61f, 4.0f, -1.62f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(4.52f, 7f)
                horizontalLineToRelative(5.63f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(5.69f)
                curveToRelative(-1.62f, -2.41f, -4.37f, -4f, -7.48f, -4f)
                reflectiveCurveToRelative(-5.86f, 1.59f, -7.48f, 4f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -0.18f, -0.01f, -0.35f, -0.02f, -0.53f)
                curveToRelative(-0.38f, 0.91f, -1.27f, 1.53f, -2.28f, 1.53f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-1.14f, 0f, -2.13f, -0.77f, -2.41f, -1.88f)
                lineToRelative(-0.03f, -0.12f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-0.03f, 0.12f)
                curveToRelative(-0.28f, 1.11f, -1.27f, 1.88f, -2.41f, 1.88f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.97f, 0f, -1.83f, -0.57f, -2.23f, -1.42f)
                curveToRelative(-0.01f, 0.14f, -0.01f, 0.28f, -0.01f, 0.42f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _FaceSunglasses = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GauzeBandage: ImageVector? = null

val Icons.Ss.GauzeBandage: ImageVector
    get() = _GauzeBandage ?: UXIcon(name = "GauzeBandage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 0f)
                curveTo(3.13f, 0f, 0f, 1.34f, 0f, 3f)
                reflectiveCurveToRelative(3.13f, 3f, 7f, 3f)
                reflectiveCurveToRelative(7f, -1.34f, 7f, -3f)
                reflectiveCurveTo(10.87f, 0f, 7f, 0f)
                close()
                moveTo(7f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, -0.45f, -2.5f, -1f)
                reflectiveCurveToRelative(1.12f, -1f, 2.5f, -1f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1f)
                reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
                close()
                moveTo(23.39f, 2.73f)
                curveToRelative(-0.26f, 0.32f, -0.39f, 0.7f, -0.39f, 1.1f)
                reflectiveCurveToRelative(0.14f, 0.78f, 0.39f, 1.1f)
                curveToRelative(0.81f, 1.0f, 0.81f, 2.46f, 0f, 3.46f)
                curveToRelative(-0.26f, 0.32f, -0.39f, 0.7f, -0.39f, 1.1f)
                reflectiveCurveToRelative(0.14f, 0.78f, 0.39f, 1.1f)
                curveToRelative(0.81f, 1.0f, 0.81f, 2.46f, 0f, 3.46f)
                curveToRelative(-0.26f, 0.32f, -0.39f, 0.7f, -0.39f, 1.1f)
                reflectiveCurveToRelative(0.14f, 0.78f, 0.4f, 1.1f)
                curveToRelative(0.39f, 0.48f, 0.6f, 1.1f, 0.6f, 1.73f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                lineTo(16f, 3f)
                curveToRelative(0f, -1.16f, -0.59f, -2.19f, -1.61f, -3f)
                horizontalLineToRelative(9.61f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.63f, -0.22f, 1.25f, -0.61f, 1.73f)
                close()
                moveTo(7f, 8f)
                curveToRelative(-2.95f, 0f, -5.4f, -0.64f, -7f, -1.71f)
                verticalLineToRelative(14.21f)
                curveToRelative(0f, 2.3f, 3.52f, 3.5f, 7f, 3.5f)
                reflectiveCurveToRelative(7f, -1.2f, 7f, -3.5f)
                lineTo(14f, 6.29f)
                curveToRelative(-1.6f, 1.07f, -4.05f, 1.71f, -7f, 1.71f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GauzeBandage = it}

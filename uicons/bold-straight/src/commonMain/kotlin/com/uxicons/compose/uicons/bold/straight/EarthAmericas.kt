package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAmericas: ImageVector? = null

val Icons.Bs.EarthAmericas: ImageVector
    get() = _EarthAmericas ?: UXIcon(name = "EarthAmericas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                curveToRelative(0f, -1.2f, 0.24f, -2.35f, 0.67f, -3.4f)
                lineToRelative(1.33f, 1.4f)
                horizontalLineToRelative(3f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, -6.5f)
                lineToRelative(-4f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(2f, 1f)
                lineToRelative(1f, -1f)
                lineToRelative(-1.5f, -2.5f)
                reflectiveCurveToRelative(0.41f, -0.63f, 0.97f, -1.5f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.03f, 0f)
                curveToRelative(3.16f, 0f, 5.94f, 1.64f, 7.55f, 4.11f)
                lineToRelative(-1.55f, 0.89f)
                lineToRelative(1f, 4f)
                lineToRelative(1.95f, 0.97f)
                curveToRelative(-0.48f, 4.51f, -4.31f, 8.03f, -8.95f, 8.03f)
                close()
            }
        }.also { _EarthAmericas = it}

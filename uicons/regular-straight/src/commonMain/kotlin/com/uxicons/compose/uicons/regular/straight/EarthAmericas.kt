package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAmericas: ImageVector? = null

val Icons.Rs.EarthAmericas: ImageVector
    get() = _EarthAmericas ?: UXIcon(name = "EarthAmericas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -1.49f, 0.33f, -2.91f, 0.92f, -4.19f)
                lineToRelative(2.08f, 2.19f)
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
                reflectiveCurveToRelative(0.74f, -1.15f, 1.62f, -2.48f)
                curveToRelative(3.27f, 0.2f, 6.12f, 1.98f, 7.8f, 4.59f)
                lineToRelative(-2.42f, 1.39f)
                lineToRelative(1f, 4f)
                lineToRelative(2.9f, 1.44f)
                curveToRelative(-0.7f, 4.83f, -4.87f, 8.56f, -9.9f, 8.56f)
                close()
            }
        }.also { _EarthAmericas = it}

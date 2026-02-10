package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Rs.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -3.47f, 1.78f, -6.54f, 4.48f, -8.33f)
                lineToRelative(1.52f, 1.33f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineToRelative(2.5f, -1.5f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                lineToRelative(-3f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, 4f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, -5f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.8f, 0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(1.24f, -1.24f)
                curveToRelative(0.57f, 1.25f, 0.89f, 2.65f, 0.89f, 4.11f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _EarthAfrica = it}

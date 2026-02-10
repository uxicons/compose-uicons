package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Bs.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                curveToRelative(0f, -3.22f, 1.71f, -6.06f, 4.26f, -7.65f)
                lineToRelative(0.74f, 0.65f)
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
                lineToRelative(0.47f, -0.47f)
                curveToRelative(0.42f, 1.04f, 0.65f, 2.17f, 0.65f, 3.35f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                close()
            }
        }.also { _EarthAfrica = it}

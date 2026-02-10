package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthEuropa: ImageVector? = null

val Icons.Rs.EarthEuropa: ImageVector
    get() = _EarthEuropa ?: UXIcon(name = "EarthEuropa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 7.08f)
                lineToRelative(-1.15f, 2.77f)
                lineToRelative(-1.85f, -0.77f)
                lineToRelative(1.61f, -2.58f)
                lineToRelative(1.39f, 0.58f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 22f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-2f, -0.5f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2f)
                lineToRelative(2.5f, -2f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3f, 2f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.82f, 0.21f)
                curveToRelative(0.23f, -0.44f, 0.44f, -0.89f, 0.6f, -1.37f)
                lineToRelative(-3.42f, -1.84f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-1f)
                lineToRelative(-3f, -1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1.5f, 0.5f)
                lineToRelative(0.5f, 1.5f)
                lineToRelative(-1f, 0.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-1.5f, 2f)
                horizontalLineToRelative(-1f)
                lineToRelative(-1f, -1.5f)
                lineToRelative(1.5f, -3.5f)
                lineToRelative(3.5f, -1.5f)
                verticalLineToRelative(-1f)
                lineToRelative(-3f, 0.5f)
                lineToRelative(-0.5f, -1f)
                lineToRelative(0.99f, -1.99f)
                curveTo(6.21f, 2.28f, 2f, 6.66f, 2f, 12f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
            }
        }.also { _EarthEuropa = it}

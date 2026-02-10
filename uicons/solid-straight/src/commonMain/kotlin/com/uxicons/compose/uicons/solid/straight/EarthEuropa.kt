package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthEuropa: ImageVector? = null

val Icons.Ss.EarthEuropa: ImageVector
    get() = _EarthEuropa ?: UXIcon(name = "EarthEuropa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.96f, 9f)
                horizontalLineToRelative(-3f)
                lineToRelative(1f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(6.81f, 9.85f)
                lineToRelative(1.15f, -2.77f)
                lineToRelative(-1.39f, -0.58f)
                lineToRelative(-1.61f, 2.58f)
                lineToRelative(1.85f, 0.77f)
                close()
                moveTo(20.82f, 16.71f)
                lineToRelative(-1.85f, -0.21f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-3f, -2f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-2.5f, 2f)
                verticalLineToRelative(2f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, 0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                curveToRelative(3.81f, 0f, 7.13f, -2.14f, 8.82f, -5.29f)
                close()
                moveTo(21.42f, 15.36f)
                curveToRelative(0.38f, -1.05f, 0.58f, -2.18f, 0.58f, -3.36f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-0.18f, 0f, -0.36f, 0.01f, -0.55f, 0.01f)
                lineToRelative(-0.99f, 1.99f)
                lineToRelative(0.5f, 1f)
                lineToRelative(3f, -0.5f)
                verticalLineToRelative(1f)
                lineToRelative(-3.5f, 1.5f)
                lineToRelative(-1.5f, 3.5f)
                lineToRelative(1f, 1.5f)
                horizontalLineToRelative(1f)
                lineToRelative(1.5f, -2f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1f, -0.5f)
                lineToRelative(-0.5f, -1.5f)
                lineToRelative(1.5f, -0.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(3f, 1f)
                verticalLineToRelative(1f)
                lineToRelative(-1f, 1f)
                lineToRelative(3.46f, 1.86f)
                close()
            }
        }.also { _EarthEuropa = it}

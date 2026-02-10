package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirFreshener: ImageVector? = null

val Icons.Bs.AirFreshener: ImageVector
    get() = _AirFreshener ?: UXIcon(name = "AirFreshener") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                lineTo(5f, 18f)
                verticalLineToRelative(-4f)
                close()
                moveTo(22.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17f, 14.5f)
                verticalLineToRelative(9.5f)
                lineTo(0f, 24f)
                lineTo(0f, 14.5f)
                curveToRelative(0f, -3.17f, 2.09f, -6.24f, 5f, -7.42f)
                lineTo(5f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.08f)
                curveToRelative(2.91f, 1.18f, 5f, 4.24f, 5f, 7.42f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0f, -1.86f, -1.17f, -3.71f, -2.81f, -4.5f)
                lineTo(5.82f, 10f)
                curveToRelative(-1.65f, 0.79f, -2.81f, 2.64f, -2.81f, 4.5f)
                verticalLineToRelative(6.5f)
                lineTo(14f, 21f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _AirFreshener = it}

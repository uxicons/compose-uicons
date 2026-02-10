package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationCrosshairs: ImageVector? = null

val Icons.Sc.LocationCrosshairs: ImageVector
    get() = _LocationCrosshairs ?: UXIcon(name = "LocationCrosshairs") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 10.5f)
                horizontalLineToRelative(-0.56f)
                curveToRelative(-0.52f, -5.79f, -4.13f, -7.18f, -7.43f, -7.44f)
                verticalLineToRelative(-0.56f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.57f)
                curveToRelative(-4.57f, 0.42f, -7.01f, 2.87f, -7.43f, 7.43f)
                horizontalLineToRelative(-0.57f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.52f, 5.79f, 4.13f, 7.18f, 7.43f, 7.44f)
                verticalLineToRelative(0.56f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.56f)
                curveToRelative(3.3f, -0.27f, 6.91f, -1.66f, 7.43f, -7.44f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-3.36f, 0f, -5f, -1.64f, -5f, -5f)
                curveToRelative(0f, -3.32f, 1.68f, -5f, 5f, -5f)
                curveToRelative(3.36f, 0f, 5f, 1.64f, 5f, 5f)
                reflectiveCurveToRelative(-1.64f, 5f, -5f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
            }
        }.also { _LocationCrosshairs = it}

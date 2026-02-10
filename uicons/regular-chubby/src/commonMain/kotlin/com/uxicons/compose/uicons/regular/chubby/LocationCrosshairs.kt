package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationCrosshairs: ImageVector? = null

val Icons.Rc.LocationCrosshairs: ImageVector
    get() = _LocationCrosshairs ?: UXIcon(name = "LocationCrosshairs") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 11f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-0.38f, -6.52f, -4.45f, -7.8f, -7.97f, -7.98f)
                verticalLineToRelative(-1.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.03f)
                curveToRelative(-5.06f, 0.3f, -7.67f, 2.91f, -7.97f, 7.97f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.03f)
                curveToRelative(0.38f, 6.52f, 4.45f, 7.8f, 7.97f, 7.98f)
                verticalLineToRelative(1.02f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.02f)
                curveToRelative(3.52f, -0.18f, 7.6f, -1.46f, 7.97f, -7.98f)
                horizontalLineToRelative(1.03f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-4.2f, 0f, -7f, -1.19f, -7f, -7f)
                curveToRelative(0f, -4.97f, 2.03f, -7f, 7f, -7f)
                curveToRelative(4.2f, 0f, 7f, 1.19f, 7f, 7f)
                reflectiveCurveToRelative(-2.8f, 7f, -7f, 7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                curveToRelative(-3.32f, 0f, -5f, 1.68f, -5f, 5f)
                curveToRelative(0f, 3.36f, 1.64f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.64f, 5f, -5f)
                reflectiveCurveToRelative(-1.64f, -5f, -5f, -5f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.95f, 0f, -3f, -0.48f, -3f, -3f)
                curveToRelative(0f, -2.21f, 0.79f, -3f, 3f, -3f)
                curveToRelative(1.95f, 0f, 3f, 0.48f, 3f, 3f)
                curveToRelative(0f, 2.54f, -1.01f, 3f, -3f, 3f)
                close()
            }
        }.also { _LocationCrosshairs = it}

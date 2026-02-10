package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationExclamation: ImageVector? = null

val Icons.Rc.LocationExclamation: ImageVector
    get() = _LocationExclamation ?: UXIcon(name = "LocationExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21.5f, 10.47f)
                curveToRelative(-0.1f, 6.25f, -8.82f, 12.29f, -8.91f, 12.36f)
                curveToRelative(-0.17f, 0.12f, -0.37f, 0.17f, -0.56f, 0.17f)
                curveToRelative(-0.2f, 0f, -0.39f, -0.06f, -0.56f, -0.17f)
                curveToRelative(-0.92f, -0.61f, -8.97f, -6.18f, -8.97f, -12.33f)
                curveToRelative(0f, -4.71f, 4.7f, -9.41f, 9.48f, -9.5f)
                horizontalLineToRelative(0.03f)
                curveToRelative(4.73f, 0.07f, 9.34f, 4.67f, 9.49f, 9.47f)
                close()
                moveTo(19.5f, 10.48f)
                curveToRelative(-0.11f, -3.7f, -3.82f, -7.42f, -7.5f, -7.48f)
                curveToRelative(-3.65f, 0.08f, -7.5f, 3.93f, -7.5f, 7.5f)
                curveToRelative(0f, 4.45f, 5.67f, 8.93f, 7.52f, 10.27f)
                curveToRelative(2.49f, -1.86f, 7.42f, -6.35f, 7.48f, -10.29f)
                close()
            }
        }.also { _LocationExclamation = it}

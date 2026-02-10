package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSmile: ImageVector? = null

val Icons.Rc.MapMarkerSmile: ImageVector
    get() = _MapMarkerSmile ?: UXIcon(name = "MapMarkerSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.6f, 12.2f)
                curveToRelative(-0.44f, -0.33f, -1.07f, -0.24f, -1.4f, 0.2f)
                curveToRelative(-0.55f, 0.73f, -1.37f, 1.6f, -2.2f, 1.6f)
                reflectiveCurveToRelative(-1.65f, -0.87f, -2.2f, -1.6f)
                curveToRelative(-0.33f, -0.44f, -0.96f, -0.53f, -1.4f, -0.2f)
                curveToRelative(-0.44f, 0.33f, -0.53f, 0.96f, -0.2f, 1.4f)
                curveToRelative(1.19f, 1.59f, 2.47f, 2.4f, 3.8f, 2.4f)
                reflectiveCurveToRelative(2.6f, -0.81f, 3.8f, -2.4f)
                curveToRelative(0.33f, -0.44f, 0.24f, -1.07f, -0.2f, -1.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9.0f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9.0f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.33f, 0f, -10f, 4.67f, -10f, 10f)
                curveToRelative(0f, 6.51f, 9.13f, 11.66f, 9.51f, 11.87f)
                curveToRelative(0.15f, 0.08f, 0.32f, 0.13f, 0.49f, 0.13f)
                reflectiveCurveToRelative(0.33f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.39f, -0.22f, 9.51f, -5.36f, 9.51f, -11.87f)
                curveToRelative(0f, -5.33f, -4.67f, -10f, -10f, -10f)
                close()
                moveTo(12f, 20.84f)
                curveToRelative(-1.8f, -1.11f, -8f, -5.25f, -8f, -9.84f)
                reflectiveCurveToRelative(4.22f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.42f, 8f, 8f)
                reflectiveCurveToRelative(-6.2f, 8.73f, -8f, 9.84f)
                close()
            }
        }.also { _MapMarkerSmile = it}

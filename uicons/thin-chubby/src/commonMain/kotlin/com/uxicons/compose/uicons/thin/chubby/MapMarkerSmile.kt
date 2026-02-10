package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSmile: ImageVector? = null

val Icons.Tc.MapMarkerSmile: ImageVector
    get() = _MapMarkerSmile ?: UXIcon(name = "MapMarkerSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.3f, 12.6f)
                curveToRelative(-0.22f, -0.16f, -0.53f, -0.12f, -0.7f, 0.1f)
                curveToRelative(-1.79f, 2.39f, -3.41f, 2.39f, -5.2f, 0f)
                curveToRelative(-0.17f, -0.22f, -0.48f, -0.27f, -0.7f, -0.1f)
                curveToRelative(-0.22f, 0.17f, -0.27f, 0.48f, -0.1f, 0.7f)
                curveToRelative(1.09f, 1.46f, 2.24f, 2.2f, 3.4f, 2.2f)
                reflectiveCurveToRelative(2.31f, -0.74f, 3.4f, -2.2f)
                curveToRelative(0.17f, -0.22f, 0.12f, -0.53f, -0.1f, -0.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 1f)
                curveToRelative(-5.32f, 0.07f, -9.99f, 4.74f, -9.99f, 10f)
                curveToRelative(0f, 6.52f, 9.36f, 11.72f, 9.76f, 11.94f)
                curveToRelative(0.07f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                reflectiveCurveToRelative(0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.4f, -0.22f, 9.76f, -5.42f, 9.76f, -11.94f)
                curveToRelative(0f, -5.26f, -4.67f, -9.93f, -10.01f, -10f)
                close()
                moveTo(12f, 21.92f)
                curveToRelative(-1.45f, -0.85f, -9f, -5.54f, -9f, -10.92f)
                curveToRelative(0f, -5.23f, 4.75f, -8.94f, 8.99f, -9f)
                curveToRelative(4.26f, 0.06f, 9.01f, 3.77f, 9.01f, 9f)
                curveToRelative(0f, 5.38f, -7.55f, 10.07f, -9f, 10.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _MapMarkerSmile = it}

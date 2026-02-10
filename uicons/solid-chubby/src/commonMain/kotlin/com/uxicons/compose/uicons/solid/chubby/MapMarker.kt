package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Sc.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.93f, 11.62f)
                curveToRelative(-0.05f, -0.12f, -0.25f, -0.46f, -0.37f, -0.54f)
                curveToRelative(-1.7f, 3.25f, -5.03f, 5.69f, -5.86f, 6.27f)
                curveToRelative(-0.5f, 0.35f, -1.09f, 0.53f, -1.71f, 0.53f)
                curveToRelative(-0.59f, 0f, -1.16f, -0.17f, -1.65f, -0.5f)
                curveToRelative(-0.56f, -0.37f, -4.66f, -3.17f, -6.26f, -7.01f)
                curveToRelative(-0.05f, 0.08f, -0.09f, 0.16f, -0.12f, 0.25f)
                curveToRelative(-0.03f, 0.09f, -0.73f, 2.3f, -0.73f, 5.77f)
                curveToRelative(0f, 2.97f, 0.73f, 4.69f, 0.76f, 4.76f)
                curveToRelative(0.05f, 0.12f, 0.13f, 0.23f, 0.23f, 0.32f)
                curveToRelative(0.16f, 0.16f, 1.71f, 1.53f, 5.39f, 1.53f)
                curveToRelative(2.42f, 0f, 3.91f, -0.59f, 4.7f, -1.04f)
                curveToRelative(0.51f, 0.32f, 1.28f, 0.71f, 2.17f, 0.87f)
                curveToRelative(1.25f, 0.23f, 2.63f, 0.01f, 2.69f, 0.0f)
                curveToRelative(0.36f, -0.06f, 0.67f, -0.31f, 0.79f, -0.67f)
                curveToRelative(0.03f, -0.1f, 0.8f, -2.39f, 0.8f, -5.79f)
                curveToRelative(0f, -2.82f, -0.8f, -4.68f, -0.83f, -4.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.52f)
                moveToRelative(-1.44f, 0f)
                arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.88f, 0f)
                arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.88f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.45f, 15.71f)
                curveToRelative(0.27f, 0.19f, 0.7f, 0.25f, 1.12f, -0.01f)
                curveToRelative(0.62f, -0.39f, 5.91f, -4.2f, 5.98f, -8.3f)
                curveToRelative(-0.1f, -3.31f, -3.21f, -6.36f, -6.56f, -6.4f)
                curveToRelative(-3.32f, 0.04f, -6.53f, 3.19f, -6.53f, 6.45f)
                curveToRelative(0f, 4.32f, 5.76f, 8.1f, 6.0f, 8.26f)
                close()
                moveTo(12f, 4.08f)
                curveToRelative(1.9f, 0f, 3.44f, 1.54f, 3.44f, 3.44f)
                reflectiveCurveToRelative(-1.54f, 3.44f, -3.44f, 3.44f)
                reflectiveCurveToRelative(-3.44f, -1.54f, -3.44f, -3.44f)
                reflectiveCurveToRelative(1.54f, -3.44f, 3.44f, -3.44f)
                close()
            }
        }.also { _MapMarker = it}

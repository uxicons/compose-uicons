package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMask: ImageVector? = null

val Icons.Ts.FaceMask: ImageVector
    get() = _FaceMask ?: UXIcon(name = "FaceMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.9f, 6.01f)
                lineToRelative(0.2f, 0.98f)
                curveToRelative(-1.24f, 0.25f, -2.52f, 0.91f, -3.78f, 1.97f)
                lineToRelative(-0.64f, -0.77f)
                curveToRelative(1.39f, -1.17f, 2.81f, -1.91f, 4.22f, -2.19f)
                close()
                moveTo(13.9f, 6.99f)
                curveToRelative(1.24f, 0.25f, 2.52f, 0.91f, 3.78f, 1.97f)
                lineToRelative(0.64f, -0.77f)
                curveToRelative(-1.39f, -1.17f, -2.81f, -1.91f, -4.22f, -2.19f)
                lineToRelative(-0.2f, 0.98f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -0.89f, -0.11f, -1.75f, -0.3f, -2.57f)
                lineToRelative(-2.69f, 3.25f)
                verticalLineToRelative(6.82f)
                curveToRelative(0f, 0.82f, -0.4f, 1.59f, -1.06f, 2.05f)
                curveToRelative(-1.33f, 0.92f, -3.99f, 2.45f, -6.94f, 2.45f)
                reflectiveCurveToRelative(-5.61f, -1.54f, -6.94f, -2.45f)
                curveToRelative(-0.67f, -0.46f, -1.06f, -1.23f, -1.06f, -2.05f)
                verticalLineToRelative(-6.82f)
                lineToRelative(-2.69f, -3.29f)
                curveToRelative(-0.2f, 0.84f, -0.31f, 1.71f, -0.31f, 2.61f)
                curveToRelative(0f, 1.63f, 0.36f, 3.17f, 1f, 4.56f)
                verticalLineToRelative(2.06f)
                curveToRelative(-1.26f, -1.9f, -2f, -4.17f, -2f, -6.62f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 2.45f, -0.74f, 4.72f, -2f, 6.62f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0.64f, -1.39f, 1f, -2.93f, 1f, -4.56f)
                close()
                moveTo(19f, 13f)
                lineTo(5f, 13f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.49f, 0.24f, 0.95f, 0.63f, 1.22f)
                curveToRelative(1.23f, 0.85f, 3.69f, 2.27f, 6.37f, 2.27f)
                reflectiveCurveToRelative(5.14f, -1.43f, 6.37f, -2.27f)
                curveToRelative(0.4f, -0.27f, 0.63f, -0.73f, 0.63f, -1.22f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22.35f, 8.27f)
                curveToRelative(-1.53f, -4.24f, -5.59f, -7.27f, -10.35f, -7.27f)
                reflectiveCurveTo(3.2f, 4.02f, 1.66f, 8.24f)
                lineToRelative(3.08f, 3.76f)
                horizontalLineToRelative(14.53f)
                lineToRelative(3.08f, -3.73f)
                close()
            }
        }.also { _FaceMask = it}

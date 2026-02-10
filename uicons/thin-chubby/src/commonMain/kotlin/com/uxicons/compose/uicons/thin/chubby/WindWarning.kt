package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Tc.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.36f, 7.98f)
                curveToRelative(0f, -6.19f, -3.7f, -6.98f, -6.93f, -6.98f)
                reflectiveCurveTo(1.51f, 1.79f, 1.51f, 7.98f)
                reflectiveCurveToRelative(3.7f, 6.98f, 6.93f, 6.98f)
                reflectiveCurveToRelative(6.93f, -0.79f, 6.93f, -6.98f)
                close()
                moveTo(2.51f, 7.98f)
                curveToRelative(0f, -4.25f, 1.72f, -5.98f, 5.93f, -5.98f)
                reflectiveCurveToRelative(5.93f, 1.73f, 5.93f, 5.98f)
                reflectiveCurveToRelative(-1.72f, 5.98f, -5.93f, 5.98f)
                curveToRelative(-3.56f, 0f, -5.93f, -1.02f, -5.93f, -5.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.49f, 12.28f)
                curveToRelative(-1.44f, 0f, -2.69f, 1.04f, -2.95f, 2.48f)
                curveToRelative(-0.05f, 0.27f, 0.13f, 0.53f, 0.4f, 0.58f)
                curveToRelative(0.27f, 0.05f, 0.53f, -0.13f, 0.58f, -0.4f)
                curveToRelative(0.18f, -0.96f, 1.01f, -1.66f, 1.97f, -1.66f)
                curveToRelative(1.1f, 0f, 2.0f, 0.92f, 2.0f, 2.05f)
                reflectiveCurveToRelative(-0.9f, 2.05f, -2.0f, 2.05f)
                horizontalLineTo(9.61f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.53f)
                curveToRelative(0.97f, 0f, 1.77f, 0.81f, 1.77f, 1.81f)
                reflectiveCurveToRelative(-0.79f, 1.81f, -1.77f, 1.81f)
                curveToRelative(-0.69f, 0f, -1.32f, -0.41f, -1.61f, -1.05f)
                curveToRelative(-0.11f, -0.25f, -0.41f, -0.36f, -0.66f, -0.25f)
                curveToRelative(-0.25f, 0.11f, -0.36f, 0.41f, -0.25f, 0.66f)
                curveToRelative(0.45f, 0.99f, 1.44f, 1.64f, 2.52f, 1.64f)
                curveToRelative(1.53f, 0f, 2.77f, -1.26f, 2.77f, -2.81f)
                curveToRelative(0f, -0.69f, -0.25f, -1.32f, -0.65f, -1.81f)
                horizontalLineToRelative(1.23f)
                curveToRelative(1.66f, 0f, 3.0f, -1.37f, 3.0f, -3.05f)
                reflectiveCurveToRelative(-1.35f, -3.05f, -3.0f, -3.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.44f, 9.14f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.72f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.72f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.91f, 20.64f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.44f, 10.77f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.51f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.51f, 0f)
            }
        }.also { _WindWarning = it}

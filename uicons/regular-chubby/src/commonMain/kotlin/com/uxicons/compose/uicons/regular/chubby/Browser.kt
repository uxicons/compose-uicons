package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browser: ImageVector? = null

val Icons.Rc.Browser: ImageVector
    get() = _Browser ?: UXIcon(name = "Browser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 3.63f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.26f, -1.08f, -9.1f, -1.08f)
                reflectiveCurveTo(3.08f, 2.94f, 2.9f, 2.98f)
                curveToRelative(-0.33f, 0.08f, -0.59f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.67f, -1.2f, 8.36f)
                curveToRelative(0f, 4.73f, 1.15f, 8.22f, 1.2f, 8.37f)
                curveToRelative(0.11f, 0.32f, 0.37f, 0.57f, 0.7f, 0.65f)
                curveToRelative(0.17f, 0.04f, 4.26f, 1.08f, 9.1f, 1.08f)
                reflectiveCurveToRelative(8.93f, -1.03f, 9.1f, -1.08f)
                curveToRelative(0.33f, -0.08f, 0.59f, -0.33f, 0.7f, -0.65f)
                curveToRelative(0.05f, -0.15f, 1.2f, -3.67f, 1.2f, -8.36f)
                curveToRelative(0f, -4.73f, -1.15f, -8.22f, -1.2f, -8.37f)
                close()
                moveTo(3.94f, 4.79f)
                curveToRelative(1.25f, -0.27f, 4.47f, -0.89f, 8.05f, -0.89f)
                reflectiveCurveToRelative(6.81f, 0.62f, 8.06f, 0.89f)
                curveToRelative(0.18f, 0.65f, 0.48f, 1.87f, 0.69f, 3.46f)
                lineTo(3.26f, 8.26f)
                curveToRelative(0.21f, -1.58f, 0.51f, -2.81f, 0.69f, -3.46f)
                close()
                moveTo(20.05f, 19.21f)
                curveToRelative(-1.25f, 0.27f, -4.47f, 0.89f, -8.05f, 0.89f)
                reflectiveCurveToRelative(-6.81f, -0.62f, -8.06f, -0.89f)
                curveToRelative(-0.3f, -1.1f, -0.94f, -3.82f, -0.94f, -7.21f)
                curveToRelative(0f, -0.6f, 0.02f, -1.19f, 0.06f, -1.75f)
                lineTo(20.94f, 10.26f)
                curveToRelative(0.04f, 0.56f, 0.06f, 1.14f, 0.06f, 1.75f)
                curveToRelative(0f, 3.35f, -0.64f, 6.1f, -0.94f, 7.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.95f, 12.15f)
                horizontalLineTo(7.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9.9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.98f, 15.69f)
                horizontalLineTo(7.05f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.93f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.31f, 6.25f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.64f, 6.25f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.98f, 6.25f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _Browser = it}

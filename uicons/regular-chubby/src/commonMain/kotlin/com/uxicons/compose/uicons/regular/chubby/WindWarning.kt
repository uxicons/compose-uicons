package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Rc.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.62f, 10.82f)
                moveToRelative(-0.99f, 0f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.99f, 0f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.99f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.72f, 8.18f)
                curveTo(15.72f, 1.74f, 11.66f, 1f, 8.61f, 1f)
                reflectiveCurveTo(1.51f, 1.74f, 1.51f, 8.18f)
                reflectiveCurveToRelative(4.06f, 7.17f, 7.11f, 7.17f)
                reflectiveCurveToRelative(7.11f, -0.74f, 7.11f, -7.17f)
                close()
                moveTo(3.51f, 8.18f)
                curveToRelative(0f, -4.31f, 1.95f, -5.17f, 5.11f, -5.17f)
                reflectiveCurveToRelative(5.11f, 0.86f, 5.11f, 5.17f)
                reflectiveCurveToRelative(-1.95f, 5.17f, -5.11f, 5.17f)
                reflectiveCurveToRelative(-5.11f, -0.86f, -5.11f, -5.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.11f, 11.74f)
                curveToRelative(-1.62f, 0f, -3.02f, 1.18f, -3.32f, 2.79f)
                curveToRelative(-0.1f, 0.54f, 0.26f, 1.06f, 0.8f, 1.17f)
                curveToRelative(0.54f, 0.1f, 1.06f, -0.26f, 1.17f, -0.8f)
                curveToRelative(0.12f, -0.67f, 0.69f, -1.16f, 1.35f, -1.16f)
                curveToRelative(0.76f, 0f, 1.38f, 0.64f, 1.38f, 1.43f)
                reflectiveCurveToRelative(-0.62f, 1.43f, -1.38f, 1.43f)
                horizontalLineTo(9.73f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.21f)
                curveToRelative(0.64f, 0f, 1.16f, 0.54f, 1.16f, 1.2f)
                reflectiveCurveToRelative(-0.52f, 1.2f, -1.16f, 1.2f)
                curveToRelative(-0.45f, 0f, -0.86f, -0.27f, -1.05f, -0.69f)
                curveToRelative(-0.23f, -0.5f, -0.82f, -0.73f, -1.32f, -0.5f)
                curveToRelative(-0.5f, 0.23f, -0.73f, 0.82f, -0.5f, 1.32f)
                curveToRelative(0.51f, 1.14f, 1.64f, 1.87f, 2.87f, 1.87f)
                curveToRelative(1.74f, 0f, 3.15f, -1.44f, 3.15f, -3.2f)
                curveToRelative(0f, -0.42f, -0.08f, -0.83f, -0.23f, -1.2f)
                horizontalLineToRelative(0.25f)
                curveToRelative(1.86f, 0f, 3.38f, -1.54f, 3.38f, -3.43f)
                reflectiveCurveToRelative(-1.52f, -3.43f, -3.38f, -3.43f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.61f, 8.62f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.37f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.37f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.02f, 19.7f)
                horizontalLineToRelative(-3.55f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.55f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _WindWarning = it}

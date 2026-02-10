package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Rc.GolfBall: ImageVector
    get() = _GolfBall ?: UXIcon(name = "GolfBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.6f, 6.92f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.15f, 9.37f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.7f, 11.82f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.14f, 9.92f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.69f, 12.37f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 9.22f)
                curveTo(20.2f, 1.85f, 15.52f, 1f, 12f, 1f)
                reflectiveCurveTo(3.8f, 1.85f, 3.8f, 9.22f)
                curveToRelative(0f, 4.01f, 1.34f, 6.49f, 4.08f, 7.57f)
                curveToRelative(0.28f, 1.32f, 1.01f, 2.52f, 2.09f, 3.38f)
                lineToRelative(1.03f, 0.82f)
                verticalLineToRelative(1.02f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.02f)
                lineToRelative(1.03f, -0.82f)
                curveToRelative(1.09f, -0.86f, 1.82f, -2.06f, 2.09f, -3.38f)
                curveToRelative(2.74f, -1.09f, 4.08f, -3.57f, 4.08f, -7.57f)
                close()
                moveTo(12.79f, 18.6f)
                lineToRelative(-0.79f, 0.62f)
                lineToRelative(-0.79f, -0.62f)
                curveToRelative(-0.72f, -0.57f, -1.21f, -1.37f, -1.38f, -2.26f)
                curveToRelative(1.43f, -0.29f, 2.91f, -0.29f, 4.34f, 0f)
                curveToRelative(-0.18f, 0.89f, -0.66f, 1.68f, -1.38f, 2.26f)
                close()
                moveTo(15.8f, 14.74f)
                curveToRelative(-0.08f, -0.06f, -0.18f, -0.1f, -0.28f, -0.13f)
                curveToRelative(-2.3f, -0.66f, -4.74f, -0.66f, -7.04f, 0f)
                curveToRelative(-0.1f, 0.03f, -0.2f, 0.07f, -0.28f, 0.13f)
                curveToRelative(-1.24f, -0.63f, -2.4f, -1.98f, -2.4f, -5.53f)
                curveToRelative(0f, -5.18f, 2.37f, -6.22f, 6.2f, -6.22f)
                reflectiveCurveToRelative(6.2f, 1.04f, 6.2f, 6.22f)
                curveToRelative(0f, 3.54f, -1.16f, 4.9f, -2.41f, 5.53f)
                close()
            }
        }.also { _GolfBall = it}

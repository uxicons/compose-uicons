package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlingBall: ImageVector? = null

val Icons.Tc.BowlingBall: ImageVector
    get() = _BowlingBall ?: UXIcon(name = "BowlingBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.24f, 6.72f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.33f, 9.87f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.14f, 9.87f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.08f, 0f, -9.97f, -2.9f, -9.97f, -10f)
                reflectiveCurveTo(4.92f, 2f, 12f, 2f)
                reflectiveCurveToRelative(9.97f, 2.9f, 9.97f, 10f)
                reflectiveCurveToRelative(-2.89f, 10f, -9.97f, 10f)
                close()
            }
        }.also { _BowlingBall = it}

package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Info: ImageVector? = null

val Icons.Tc.Info: ImageVector
    get() = _Info ?: UXIcon(name = "Info") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.95f, 1.04f, 1.03f, 5.2f, 1.03f, 11.99f)
                curveToRelative(0f, 6.97f, 3.82f, 10.97f, 10.98f, 11.01f)
                curveToRelative(7.15f, -0.04f, 10.84f, -3.74f, 10.97f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.95f, -10.98f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.59f, -0.04f, -9.85f, -3.31f, -9.98f, -10f)
                curveToRelative(0.12f, -6.59f, 3.48f, -9.96f, 9.97f, -10f)
                curveToRelative(4.47f, 0.03f, 9.84f, 1.79f, 9.98f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.38f, 9.97f, -9.97f, 10.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.59f, 10.79f)
                horizontalLineToRelative(-1.19f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(4.15f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.31f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
        }.also { _Info = it}

package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Tc.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12f)
                curveToRelative(0f, -3.72f, -0.94f, -6.17f, -3f, -7.56f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.38f)
                curveToRelative(-1.31f, -0.59f, -2.97f, -0.88f, -5f, -0.88f)
                reflectiveCurveToRelative(-3.69f, 0.28f, -5f, 0.88f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.94f)
                curveToRelative(-2.06f, 1.4f, -3f, 3.85f, -3f, 7.56f)
                reflectiveCurveToRelative(0.94f, 6.17f, 3f, 7.56f)
                verticalLineToRelative(2.94f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.38f)
                curveToRelative(1.31f, 0.59f, 2.97f, 0.88f, 5f, 0.88f)
                reflectiveCurveToRelative(3.69f, -0.28f, 5f, -0.88f)
                verticalLineToRelative(2.38f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.94f)
                curveToRelative(2.06f, -1.4f, 3f, -3.85f, 3f, -7.56f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-5.83f, 0f, -8f, -2.17f, -8f, -8f)
                reflectiveCurveToRelative(2.17f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.17f, 8f, 8f)
                reflectiveCurveToRelative(-2.17f, 8f, -8f, 8f)
                close()
                moveTo(14.85f, 14.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(-0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-2.5f, -2.5f)
                curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.29f)
                lineToRelative(2.35f, 2.35f)
                close()
            }
        }.also { _Watch = it}

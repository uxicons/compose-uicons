package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spa: ImageVector? = null

val Icons.Rs.Spa: ImageVector
    get() = _Spa ?: UXIcon(name = "Spa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.77f, 14.81f)
                curveToRelative(2f, -0.9f, 3.23f, -2.25f, 3.23f, -3.81f)
                curveToRelative(0f, -2.38f, -2.85f, -4.27f, -6.94f, -4.83f)
                arcToRelative(3.13f, 3.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.94f, -2.17f)
                curveToRelative(0f, -2.24f, -2.64f, -4f, -6f, -4f)
                reflectiveCurveToRelative(-6f, 1.76f, -6f, 4f)
                arcToRelative(3.71f, 3.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 3.16f)
                curveToRelative(-2.03f, 0.9f, -3.29f, 2.26f, -3.29f, 3.84f)
                curveToRelative(0f, 1.47f, 1.09f, 2.75f, 2.89f, 3.65f)
                curveToRelative(-3.38f, 0.78f, -5.89f, 2.24f, -5.89f, 4.35f)
                curveToRelative(0f, 3.28f, 6.04f, 5f, 12f, 5f)
                reflectiveCurveToRelative(12f, -1.72f, 12f, -5f)
                curveToRelative(0f, -1.98f, -2.19f, -3.38f, -5.23f, -4.19f)
                close()
                moveTo(10f, 2f)
                curveToRelative(2.29f, 0f, 4f, 1.06f, 4f, 2f)
                reflectiveCurveToRelative(-1.71f, 2f, -4f, 2f)
                reflectiveCurveToRelative(-4f, -1.06f, -4f, -2f)
                reflectiveCurveToRelative(1.71f, -2f, 4f, -2f)
                close()
                moveTo(5f, 11f)
                curveToRelative(0f, -1.25f, 2.85f, -3f, 7.5f, -3f)
                reflectiveCurveToRelative(7.5f, 1.75f, 7.5f, 3f)
                reflectiveCurveToRelative(-2.85f, 3f, -7.5f, 3f)
                reflectiveCurveToRelative(-7.5f, -1.75f, -7.5f, -3f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-6.01f, 0f, -10f, -1.81f, -10f, -3f)
                reflectiveCurveToRelative(3.99f, -3f, 10f, -3f)
                reflectiveCurveToRelative(10f, 1.81f, 10f, 3f)
                reflectiveCurveToRelative(-3.99f, 3f, -10f, 3f)
                close()
            }
        }.also { _Spa = it}

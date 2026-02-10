package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spa: ImageVector? = null

val Icons.Rr.Spa: ImageVector
    get() = _Spa ?: UXIcon(name = "Spa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.37f, 14.73f)
                arcToRelative(4.15f, 4.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, -3.73f)
                curveToRelative(0f, -2.62f, -2.5f, -4.35f, -6.8f, -4.85f)
                arcToRelative(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -2.15f)
                curveToRelative(0f, -2.43f, -2.35f, -4f, -6f, -4f)
                reflectiveCurveToRelative(-6f, 1.57f, -6f, 4f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.9f, 3.05f)
                curveToRelative(-2.28f, 1.0f, -2.9f, 2.56f, -2.9f, 3.95f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.23f, 3.61f)
                curveToRelative(-3.44f, 0.77f, -5.23f, 2.24f, -5.23f, 4.39f)
                curveToRelative(0f, 3.27f, 4.15f, 5f, 12f, 5f)
                curveToRelative(7.96f, 0f, 12f, -1.68f, 12f, -5f)
                curveToRelative(0f, -2.06f, -1.55f, -3.48f, -4.63f, -4.27f)
                close()
                moveTo(10f, 2f)
                curveToRelative(1.99f, 0f, 4f, 0.62f, 4f, 2f)
                reflectiveCurveToRelative(-2.01f, 2f, -4f, 2f)
                reflectiveCurveToRelative(-4f, -0.62f, -4f, -2f)
                reflectiveCurveToRelative(2.01f, -2f, 4f, -2f)
                close()
                moveTo(12.5f, 8f)
                curveToRelative(3.46f, 0f, 7.5f, 0.79f, 7.5f, 3f)
                reflectiveCurveToRelative(-4.04f, 3f, -7.5f, 3f)
                curveToRelative(-2.25f, 0f, -7.5f, -0.29f, -7.5f, -3f)
                reflectiveCurveToRelative(5.25f, -3f, 7.5f, -3f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-6.08f, 0f, -10f, -1.18f, -10f, -3f)
                reflectiveCurveToRelative(3.92f, -3f, 10f, -3f)
                curveToRelative(6.26f, 0f, 10f, 1.12f, 10f, 3f)
                reflectiveCurveToRelative(-3.74f, 3f, -10f, 3f)
                close()
            }
        }.also { _Spa = it}

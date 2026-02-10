package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Rr.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.99f, 2.29f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.92f, 5.54f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.79f, 7.76f)
                arcToRelative(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, 4.57f)
                verticalLineToRelative(0.16f)
                arcToRelative(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, 3.69f)
                horizontalLineToRelative(0.62f)
                arcToRelative(3.69f, 3.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, -3.69f)
                verticalLineToRelative(-0.55f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, -4f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, -13.48f)
                close()
                moveTo(12.31f, 22f)
                horizontalLineToRelative(-0.62f)
                arcToRelative(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.69f, -1.69f)
                reflectiveCurveToRelative(-0.01f, -0.26f, -0.01f, -0.31f)
                horizontalLineToRelative(4.01f)
                verticalLineToRelative(0.31f)
                arcToRelative(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.69f, 1.69f)
                close()
                moveTo(16.61f, 14.26f)
                arcToRelative(7.67f, 7.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.36f, 3.74f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-7.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.82f)
                verticalLineToRelative(7.18f)
                horizontalLineToRelative(-1.32f)
                arcToRelative(8.63f, 8.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.45f, -3.88f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.95f, -12.07f)
                arcToRelative(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, -0.05f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.65f, 1.78f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.05f, 10.48f)
                close()
            }
        }.also { _Bulb = it}

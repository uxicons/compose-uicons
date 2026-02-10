package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Rs.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 20.15f)
                verticalLineToRelative(3.85f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3.69f)
                arcToRelative(6.0f, 6.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, -4.55f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12.06f, -0.18f)
                arcToRelative(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, 4.57f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.85f)
                curveToRelative(0f, -0.05f, -0.01f, -0.1f, -0.01f, -0.15f)
                horizontalLineToRelative(4.02f)
                curveToRelative(0f, 0.1f, -0.02f, 0.21f, -0.02f, 0.32f)
                close()
                moveTo(5.06f, 8.07f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.55f, 6.18f)
                arcToRelative(7.66f, 7.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.29f, 3.74f)
                horizontalLineToRelative(-1.32f)
                verticalLineToRelative(-7.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2.82f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.82f)
                verticalLineToRelative(7.18f)
                horizontalLineToRelative(-1.32f)
                arcToRelative(8.63f, 8.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.45f, -3.88f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.17f, -6.04f)
                close()
            }
        }.also { _Bulb = it}

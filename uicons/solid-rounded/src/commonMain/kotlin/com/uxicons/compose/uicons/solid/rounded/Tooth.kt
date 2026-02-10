package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Sr.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                arcToRelative(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, 0.61f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, 0.39f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, -0.39f)
                arcToRelative(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, -0.61f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                curveToRelative(0f, 6.44f, 3.35f, 12.79f, 5.77f, 16.89f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.23f, -1.16f)
                verticalLineToRelative(-6.62f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, -2.08f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, 1.97f)
                verticalLineToRelative(6.73f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.23f, 1.16f)
                curveToRelative(2.41f, -4.1f, 5.77f, -10.44f, 5.77f, -16.89f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                close()
            }
        }.also { _Tooth = it}

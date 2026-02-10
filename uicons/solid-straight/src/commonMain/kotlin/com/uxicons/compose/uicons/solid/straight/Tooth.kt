package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Ss.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                arcToRelative(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, 0.61f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, 0.39f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.08f, -0.39f)
                arcToRelative(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, -0.61f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                curveToRelative(0f, 7.06f, 4.03f, 14f, 6.43f, 18f)
                horizontalLineToRelative(3.57f)
                verticalLineToRelative(-8.89f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, -2.08f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, 1.97f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3.57f)
                curveToRelative(2.4f, -4f, 6.43f, -10.94f, 6.43f, -18f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                close()
            }
        }.also { _Tooth = it}

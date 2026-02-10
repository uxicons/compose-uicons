package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cream: ImageVector? = null

val Icons.Bs.Cream: ImageVector
    get() = _Cream ?: UXIcon(name = "Cream") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 11.35f)
                verticalLineToRelative(-5.35f)
                horizontalLineToRelative(-3.04f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.96f, -6f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-3.07f, 0f, -4.25f, 1.69f, -4.71f, 3f)
                horizontalLineToRelative(-3.29f)
                verticalLineToRelative(5.35f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 3.15f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -3.15f)
                close()
                moveTo(19f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _Cream = it}

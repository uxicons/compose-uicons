package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Megaphone: ImageVector? = null

val Icons.Bs.Megaphone: ImageVector
    get() = _Megaphone ?: UXIcon(name = "Megaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 4f)
                horizontalLineToRelative(-7f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(4f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, 2.93f)
                lineToRelative(4.25f, 9.57f)
                horizontalLineToRelative(1.4f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, -3.87f)
                lineToRelative(-2.28f, -5.13f)
                horizontalLineToRelative(3.02f)
                curveToRelative(2.65f, 0f, 4.5f, 1.65f, 4.5f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-19f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 2.35f, -1.85f, 4f, -4.5f, 4f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, -1.33f)
                verticalLineToRelative(7.67f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, -1.33f)
                close()
                moveTo(21.06f, 12.19f)
                lineTo(23.35f, 14.47f)
                lineTo(21.23f, 16.59f)
                lineTo(18.94f, 14.31f)
                close()
                moveTo(21.1f, 6.84f)
                lineTo(18.98f, 4.72f)
                lineTo(21.23f, 2.47f)
                lineTo(23.35f, 4.59f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Megaphone = it}

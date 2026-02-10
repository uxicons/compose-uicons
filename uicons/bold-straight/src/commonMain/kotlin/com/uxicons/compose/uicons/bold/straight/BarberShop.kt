package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarberShop: ImageVector? = null

val Icons.Bs.BarberShop: ImageVector
    get() = _BarberShop ?: UXIcon(name = "BarberShop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
                moveTo(16f, 19.25f)
                arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 3.45f)
                arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.41f, -7.65f)
                lineToRelative(3.7f, -6.7f)
                lineToRelative(-2.1f, -3.8f)
                arcToRelative(9.46f, 9.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, -4.55f)
                horizontalLineToRelative(3f)
                arcToRelative(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, 3.1f)
                lineToRelative(1.18f, 2.14f)
                lineToRelative(1.18f, -2.14f)
                arcToRelative(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, -3.1f)
                horizontalLineToRelative(3f)
                arcToRelative(9.46f, 9.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, 4.55f)
                lineToRelative(-2.09f, 3.79f)
                lineToRelative(3.7f, 6.7f)
                arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.59f, 4.21f)
                close()
                moveTo(8f, 11.45f)
                lineTo(6.18f, 14.75f)
                arcToRelative(4.73f, 4.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, 1.05f)
                arcToRelative(4.73f, 4.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.82f, -1.06f)
                close()
                moveTo(6.5f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.75f, 1.75f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -1.75f)
                close()
                moveTo(13f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.75f, 1.75f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -1.75f)
                close()
            }
        }.also { _BarberShop = it}

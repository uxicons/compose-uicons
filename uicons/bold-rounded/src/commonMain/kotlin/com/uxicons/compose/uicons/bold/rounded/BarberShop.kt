package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarberShop: ImageVector? = null

val Icons.Br.BarberShop: ImageVector
    get() = _BarberShop ?: UXIcon(name = "BarberShop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 8f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            verticalLineToRelative(-18f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -4.5f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(2.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
            moveTo(16f, 19.25f)
            arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 3.45f)
            arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.8f, -7.44f)
            curveToRelative(1.15f, -1.4f, 2.71f, -3.5f, 4.01f, -5.47f)
            curveToRelative(-1.72f, -2.84f, -3.21f, -5.96f, -3.21f, -8.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            curveToRelative(0f, 1.31f, 0.83f, 3.27f, 2f, 5.37f)
            curveToRelative(1.17f, -2.1f, 2f, -4.06f, 2f, -5.37f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            curveToRelative(0f, 2.33f, -1.49f, 5.45f, -3.22f, 8.28f)
            curveToRelative(1.3f, 1.98f, 2.86f, 4.08f, 4.01f, 5.47f)
            arcToRelative(4.74f, 4.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 4.0f)
            close()
            moveTo(6.5f, 19.25f)
            arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.75f, 1.75f)
            arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -1.75f)
            close()
            moveTo(8f, 15.8f)
            arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, -1f)
            curveToRelative(-0.5f, -0.66f, -1.06f, -1.44f, -1.65f, -2.28f)
            curveToRelative(-0.59f, 0.85f, -1.15f, 1.63f, -1.65f, 2.28f)
            arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 1f)
            close()
            moveTo(13f, 19.25f)
            arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.75f, 1.75f)
            arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -1.75f)
            close()
        }
    }.also { _BarberShop = it }

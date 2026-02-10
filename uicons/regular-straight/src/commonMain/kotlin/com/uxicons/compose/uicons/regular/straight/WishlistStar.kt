package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WishlistStar: ImageVector? = null

val Icons.Rs.WishlistStar: ImageVector
    get() = _WishlistStar ?: UXIcon(name = "WishlistStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.46f)
                lineToRelative(10f, -7.22f)
                lineToRelative(10f, 7.22f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20f, 20.04f)
                lineToRelative(-8f, -5.78f)
                lineToRelative(-8f, 5.78f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17.54f)
                close()
                moveTo(13.52f, 7f)
                horizontalLineToRelative(3.48f)
                verticalLineToRelative(0.83f)
                lineToRelative(-2.54f, 1.74f)
                lineToRelative(1.06f, 3.32f)
                lineToRelative(-0.68f, 0.48f)
                lineToRelative(-2.82f, -1.95f)
                lineToRelative(-2.78f, 1.95f)
                lineToRelative(-0.66f, -0.49f)
                lineToRelative(0.98f, -3.35f)
                lineToRelative(-2.57f, -1.68f)
                verticalLineToRelative(-0.84f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.07f, -3.64f)
                horizontalLineToRelative(0.88f)
                lineToRelative(1.07f, 3.64f)
                close()
            }
        }.also { _WishlistStar = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WishlistStar: ImageVector? = null

val Icons.Bs.WishlistStar: ImageVector
    get() = _WishlistStar ?: UXIcon(name = "WishlistStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.85f, 0f, 1.5f, 1.35f, 1.5f, 3f)
                verticalLineToRelative(20.93f)
                lineToRelative(10.5f, -7.58f)
                lineToRelative(10.5f, 7.58f)
                lineTo(22.5f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19.5f, 18.07f)
                lineToRelative(-7.5f, -5.42f)
                lineToRelative(-7.5f, 5.42f)
                lineTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(15.07f)
                close()
                moveTo(10.18f, 8.85f)
                lineToRelative(-2.21f, -1.23f)
                verticalLineToRelative(-0.61f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.78f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(0.61f)
                lineToRelative(-2.2f, 1.27f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineToRelative(-2.17f, -1.68f)
                lineToRelative(-2.18f, 1.69f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.87f, -2.72f)
                close()
            }
        }.also { _WishlistStar = it}

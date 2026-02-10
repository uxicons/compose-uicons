package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WishlistHeart: ImageVector? = null

val Icons.Bs.WishlistHeart: ImageVector
    get() = _WishlistHeart ?: UXIcon(name = "WishlistHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(6.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21f, 13f)
                curveToRelative(-1.66f, 0f, -3f, 1.49f, -3f, 3.33f)
                curveToRelative(0f, -1.84f, -1.34f, -3.33f, -3f, -3.33f)
                reflectiveCurveToRelative(-3f, 1.49f, -3f, 3.33f)
                curveToRelative(0f, 3.48f, 6f, 7.67f, 6f, 7.67f)
                curveToRelative(0f, 0f, 6f, -4.19f, 6f, -7.67f)
                curveToRelative(0f, -1.84f, -1.34f, -3.33f, -3f, -3.33f)
                close()
                moveTo(10f, 13.5f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.89f, -1.5f, 2.44f, -2.5f, 4.22f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
                moveTo(11.9f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(7.96f)
                curveToRelative(0.35f, 0.17f, 0.69f, 0.36f, 1f, 0.6f)
                curveToRelative(0.58f, -0.47f, 1.26f, -0.79f, 2f, -0.95f)
                lineTo(20f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14.77f)
                curveToRelative(-0.93f, -0.81f, -1.98f, -1.84f, -2.86f, -3f)
                close()
            }
        }.also { _WishlistHeart = it}

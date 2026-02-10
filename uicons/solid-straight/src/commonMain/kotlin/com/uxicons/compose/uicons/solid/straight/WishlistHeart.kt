package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WishlistHeart: ImageVector? = null

val Icons.Ss.WishlistHeart: ImageVector
    get() = _WishlistHeart ?: UXIcon(name = "WishlistHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16.33f)
                curveToRelative(0f, 3.48f, -6f, 7.67f, -6f, 7.67f)
                curveToRelative(0f, 0f, -6f, -4.19f, -6f, -7.67f)
                curveToRelative(0f, -1.84f, 1.34f, -3.33f, 3f, -3.33f)
                reflectiveCurveToRelative(3f, 1.2f, 3f, 3.6f)
                curveToRelative(0f, -2.4f, 1.34f, -3.6f, 3f, -3.6f)
                reflectiveCurveToRelative(3f, 1.49f, 3f, 3.33f)
                close()
                moveTo(19f, 3f)
                verticalLineToRelative(8.46f)
                curveToRelative(-0.33f, 0.15f, -0.7f, 0.32f, -1f, 0.55f)
                curveToRelative(-0.6f, -0.46f, -1.29f, -0.75f, -2f, -0.9f)
                verticalLineToRelative(-1.11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.11f)
                curveToRelative(-0.94f, 0.72f, -1.63f, 1.77f, -1.93f, 3f)
                horizontalLineToRelative(-2.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.34f, 2.58f, 2.51f, 5.05f, 4.36f, 6.71f)
                curveToRelative(-0.01f, 0.14f, -0.0f, 0.24f, 0.05f, 0.29f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(6f, 11f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(16f, 5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _WishlistHeart = it}

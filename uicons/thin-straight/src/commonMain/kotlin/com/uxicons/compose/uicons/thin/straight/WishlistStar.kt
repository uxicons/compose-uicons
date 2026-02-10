package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WishlistStar: ImageVector? = null

val Icons.Ts.WishlistStar: ImageVector
    get() = _WishlistStar ?: UXIcon(name = "WishlistStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(4f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(22.01f)
                lineToRelative(10f, -6.88f)
                lineToRelative(10f, 6.88f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(21f, 21.99f)
                lineToRelative(-9f, -6.12f)
                lineToRelative(-9f, 6.12f)
                lineTo(3f, 2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19.99f)
                close()
                moveTo(12.41f, 3.62f)
                horizontalLineToRelative(-0.82f)
                lineToRelative(-1.18f, 3.38f)
                horizontalLineToRelative(-3.41f)
                verticalLineToRelative(0.81f)
                lineToRelative(2.41f, 1.95f)
                lineToRelative(-0.91f, 3.04f)
                lineToRelative(0.65f, 0.49f)
                lineToRelative(2.85f, -1.85f)
                lineToRelative(2.85f, 1.85f)
                lineToRelative(0.65f, -0.49f)
                lineToRelative(-0.91f, -3.04f)
                lineToRelative(2.41f, -1.95f)
                verticalLineToRelative(-0.81f)
                horizontalLineToRelative(-3.41f)
                lineToRelative(-1.18f, -3.38f)
                close()
                moveTo(13.44f, 9.4f)
                lineToRelative(0.66f, 2.21f)
                lineToRelative(-2.1f, -1.36f)
                lineToRelative(-2.1f, 1.36f)
                lineToRelative(0.66f, -2.21f)
                lineToRelative(-1.74f, -1.4f)
                horizontalLineToRelative(2.29f)
                lineToRelative(0.88f, -2.52f)
                lineToRelative(0.88f, 2.52f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-1.74f, 1.4f)
                close()
            }
        }.also { _WishlistStar = it}

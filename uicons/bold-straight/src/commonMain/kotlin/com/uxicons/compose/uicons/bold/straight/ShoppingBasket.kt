package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Bs.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 8f)
                curveTo(20.45f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                lineTo(0.08f, 8f)
                lineToRelative(1.91f, 13.01f)
                curveToRelative(0.25f, 1.71f, 1.74f, 2.99f, 3.46f, 2.99f)
                horizontalLineToRelative(13.11f)
                curveToRelative(1.73f, 0f, 3.21f, -1.29f, 3.46f, -2.99f)
                lineToRelative(1.91f, -13.01f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(12f, 3f)
                curveToRelative(2.97f, 0f, 5.44f, 2.17f, 5.92f, 5f)
                lineTo(6.08f, 8f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                close()
                moveTo(19.06f, 20.57f)
                curveToRelative(-0.04f, 0.24f, -0.25f, 0.43f, -0.49f, 0.43f)
                lineTo(5.46f, 21f)
                curveToRelative(-0.25f, 0f, -0.46f, -0.18f, -0.49f, -0.43f)
                lineToRelative(-1.41f, -9.57f)
                lineTo(20.47f, 11f)
                lineToRelative(-1.41f, 9.57f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
                moveTo(11f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _ShoppingBasket = it}

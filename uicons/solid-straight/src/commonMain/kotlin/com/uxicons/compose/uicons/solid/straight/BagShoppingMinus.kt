package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagShoppingMinus: ImageVector? = null

val Icons.Ss.BagShoppingMinus: ImageVector
    get() = _BagShoppingMinus ?: UXIcon(name = "BagShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(1.48f, 0f, 2.9f, 0.54f, 4f, 1.53f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(13.68f)
                curveToRelative(-1.68f, -1.11f, -2.68f, -2.99f, -2.68f, -5f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(8f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(23f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _BagShoppingMinus = it}

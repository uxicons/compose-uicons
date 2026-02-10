package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagShoppingMinus: ImageVector? = null

val Icons.Sr.BagShoppingMinus: ImageVector
    get() = _BagShoppingMinus ?: UXIcon(name = "BagShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(5.54f)
                curveToRelative(-1.06f, -0.95f, -2.46f, -1.54f, -4f, -1.54f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 2.09f, 1.07f, 3.92f, 2.69f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveTo(6f, 2.69f, 8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(16f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _BagShoppingMinus = it}

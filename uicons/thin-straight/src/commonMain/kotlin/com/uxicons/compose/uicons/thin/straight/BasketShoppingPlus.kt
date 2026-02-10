package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingPlus: ImageVector? = null

val Icons.Ts.BasketShoppingPlus: ImageVector
    get() = _BasketShoppingPlus ?: UXIcon(name = "BasketShoppingPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.46f, 8f)
                curveTo(20.2f, 3.55f, 16.51f, 0f, 11.99f, 0f)
                reflectiveCurveTo(3.78f, 3.55f, 3.52f, 8f)
                lineTo(0.02f, 8f)
                lineToRelative(2.0f, 13.6f)
                curveToRelative(0.2f, 1.37f, 1.4f, 2.4f, 2.78f, 2.4f)
                horizontalLineToRelative(14.51f)
                curveToRelative(1.38f, 0f, 2.58f, -1.03f, 2.78f, -2.4f)
                lineToRelative(1.88f, -13.6f)
                horizontalLineToRelative(-3.49f)
                close()
                moveTo(11.99f, 1f)
                curveToRelative(3.97f, 0f, 7.22f, 3.1f, 7.47f, 7f)
                lineTo(4.52f, 8f)
                curveToRelative(0.26f, -3.9f, 3.51f, -7f, 7.47f, -7f)
                close()
                moveTo(21.09f, 21.45f)
                curveToRelative(-0.13f, 0.88f, -0.9f, 1.54f, -1.79f, 1.54f)
                lineTo(4.79f, 23f)
                curveToRelative(-0.89f, 0f, -1.66f, -0.66f, -1.79f, -1.54f)
                lineTo(1.18f, 9f)
                lineTo(22.81f, 9f)
                lineToRelative(-1.72f, 12.46f)
                close()
                moveTo(12.5f, 15.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                close()
            }
        }.also { _BasketShoppingPlus = it}

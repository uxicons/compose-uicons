package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingSimple: ImageVector? = null

val Icons.Ts.BasketShoppingSimple: ImageVector
    get() = _BasketShoppingSimple ?: UXIcon(name = "BasketShoppingSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                reflectiveCurveTo(3f, 4.04f, 3f, 9f)
                lineTo(0.04f, 9f)
                lineToRelative(1.84f, 12.85f)
                curveToRelative(0.17f, 1.22f, 1.24f, 2.15f, 2.47f, 2.15f)
                horizontalLineToRelative(15.27f)
                curveToRelative(1.24f, 0f, 2.3f, -0.92f, 2.48f, -2.15f)
                lineToRelative(1.84f, -12.85f)
                horizontalLineToRelative(-2.94f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                lineTo(4f, 9f)
                curveTo(4f, 4.59f, 7.59f, 1f, 12f, 1f)
                close()
                moveTo(21.11f, 21.71f)
                curveToRelative(-0.1f, 0.73f, -0.74f, 1.29f, -1.49f, 1.29f)
                lineTo(4.35f, 23f)
                curveToRelative(-0.74f, 0f, -1.38f, -0.55f, -1.48f, -1.29f)
                lineTo(1.19f, 10f)
                lineTo(22.78f, 10f)
                lineToRelative(-1.67f, 11.71f)
                close()
            }
        }.also { _BasketShoppingSimple = it}

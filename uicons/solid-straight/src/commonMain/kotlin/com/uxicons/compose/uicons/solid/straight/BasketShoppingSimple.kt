package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingSimple: ImageVector? = null

val Icons.Ss.BasketShoppingSimple: ImageVector
    get() = _BasketShoppingSimple ?: UXIcon(name = "BasketShoppingSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 8f)
                curveTo(20.44f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                horizontalLineTo(-0.02f)
                lineToRelative(1.92f, 13.42f)
                curveToRelative(0.21f, 1.47f, 1.49f, 2.58f, 2.97f, 2.58f)
                horizontalLineToRelative(14.27f)
                curveToRelative(1.48f, 0f, 2.76f, -1.11f, 2.97f, -2.58f)
                lineToRelative(1.92f, -13.42f)
                horizontalLineToRelative(-3.08f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.52f, 0f, 6.43f, 2.61f, 6.92f, 6f)
                horizontalLineTo(5.08f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                close()
            }
        }.also { _BasketShoppingSimple = it}

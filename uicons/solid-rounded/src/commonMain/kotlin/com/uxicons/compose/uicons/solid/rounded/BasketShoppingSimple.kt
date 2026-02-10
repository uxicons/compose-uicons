package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingSimple: ImageVector? = null

val Icons.Sr.BasketShoppingSimple: ImageVector
    get() = _BasketShoppingSimple ?: UXIcon(name = "BasketShoppingSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 9.03f)
                curveToRelative(-0.57f, -0.66f, -1.4f, -1.03f, -2.27f, -1.03f)
                horizontalLineToRelative(-0.09f)
                curveTo(20.41f, 3.51f, 16.59f, 0f, 11.97f, 0f)
                reflectiveCurveTo(3.53f, 3.51f, 3.03f, 8f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.87f, 0f, -1.7f, 0.38f, -2.27f, 1.03f)
                curveTo(0.13f, 9.69f, -0.12f, 10.56f, 0f, 11.42f)
                lineToRelative(1.06f, 7.42f)
                curveToRelative(0.42f, 2.94f, 2.97f, 5.15f, 5.94f, 5.15f)
                horizontalLineToRelative(9.97f)
                curveToRelative(2.97f, 0f, 5.52f, -2.21f, 5.94f, -5.15f)
                lineToRelative(1.06f, -7.42f)
                curveToRelative(0.12f, -0.86f, -0.13f, -1.73f, -0.7f, -2.39f)
                close()
                moveTo(11.97f, 2f)
                curveToRelative(3.52f, 0f, 6.43f, 2.61f, 6.92f, 6f)
                horizontalLineTo(5.05f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                close()
            }
        }.also { _BasketShoppingSimple = it}

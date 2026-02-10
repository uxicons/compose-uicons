package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingMinus: ImageVector? = null

val Icons.Rr.BasketShoppingMinus: ImageVector
    get() = _BasketShoppingMinus ?: UXIcon(name = "BasketShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.3f, 9.04f)
                curveToRelative(-0.57f, -0.66f, -1.4f, -1.03f, -2.27f, -1.03f)
                horizontalLineToRelative(-0.09f)
                curveTo(20.44f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.87f, 0f, -1.7f, 0.38f, -2.27f, 1.03f)
                curveTo(0.16f, 9.69f, -0.09f, 10.56f, 0.03f, 11.42f)
                lineToRelative(1.06f, 7.42f)
                curveToRelative(0.42f, 2.94f, 2.97f, 5.15f, 5.94f, 5.15f)
                horizontalLineToRelative(9.97f)
                curveToRelative(2.97f, 0f, 5.52f, -2.21f, 5.94f, -5.15f)
                lineToRelative(1.06f, -7.42f)
                curveToRelative(0.12f, -0.86f, -0.13f, -1.73f, -0.7f, -2.39f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.52f, 0f, 6.43f, 2.61f, 6.92f, 6f)
                lineTo(5.08f, 8f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                close()
                moveTo(20.96f, 18.57f)
                curveToRelative(-0.28f, 1.96f, -1.98f, 3.44f, -3.96f, 3.44f)
                lineTo(7.03f, 22f)
                curveToRelative(-1.98f, 0f, -3.68f, -1.48f, -3.96f, -3.44f)
                lineToRelative(-1.06f, -7.42f)
                curveToRelative(-0.04f, -0.29f, 0.04f, -0.57f, 0.23f, -0.8f)
                curveToRelative(0.19f, -0.22f, 0.46f, -0.34f, 0.76f, -0.34f)
                lineTo(21.03f, 10f)
                curveToRelative(0.29f, 0f, 0.56f, 0.12f, 0.76f, 0.34f)
                curveToRelative(0.19f, 0.22f, 0.28f, 0.51f, 0.23f, 0.8f)
                lineToRelative(-1.06f, 7.42f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _BasketShoppingMinus = it}

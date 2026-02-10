package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingMinus: ImageVector? = null

val Icons.Tr.BasketShoppingMinus: ImageVector
    get() = _BasketShoppingMinus ?: UXIcon(name = "BasketShoppingMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 9.86f)
                curveToRelative(-0.47f, -0.55f, -1.16f, -0.86f, -1.89f, -0.86f)
                horizontalLineToRelative(-0.66f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                reflectiveCurveTo(3f, 4.04f, 3f, 9f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.31f, -1.89f, 0.86f)
                reflectiveCurveTo(-0.08f, 11.14f, 0.03f, 11.85f)
                lineToRelative(1.18f, 8.28f)
                curveToRelative(0.32f, 2.2f, 2.23f, 3.86f, 4.46f, 3.86f)
                horizontalLineToRelative(12.84f)
                curveToRelative(2.23f, 0f, 4.14f, -1.66f, 4.46f, -3.86f)
                lineToRelative(1.18f, -8.28f)
                curveToRelative(0.1f, -0.72f, -0.11f, -1.44f, -0.59f, -1.99f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                lineTo(4f, 9f)
                curveTo(4f, 4.59f, 7.59f, 1f, 12f, 1f)
                close()
                moveTo(23.15f, 11.71f)
                lineToRelative(-1.18f, 8.28f)
                curveToRelative(-0.24f, 1.71f, -1.73f, 3.0f, -3.46f, 3.0f)
                lineTo(5.66f, 23f)
                curveToRelative(-1.73f, 0f, -3.22f, -1.29f, -3.46f, -3.0f)
                lineTo(1.02f, 11.71f)
                curveToRelative(-0.06f, -0.43f, 0.07f, -0.87f, 0.35f, -1.19f)
                curveToRelative(0.28f, -0.33f, 0.7f, -0.52f, 1.13f, -0.52f)
                lineTo(21.66f, 10f)
                curveToRelative(0.43f, 0f, 0.85f, 0.19f, 1.13f, 0.52f)
                curveToRelative(0.28f, 0.33f, 0.41f, 0.76f, 0.35f, 1.2f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _BasketShoppingMinus = it}

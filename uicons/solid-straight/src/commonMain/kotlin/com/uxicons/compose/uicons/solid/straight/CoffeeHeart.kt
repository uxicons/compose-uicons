package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeHeart: ImageVector? = null

val Icons.Ss.CoffeeHeart: ImageVector
    get() = _CoffeeHeart ?: UXIcon(name = "CoffeeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.12f, 2.25f, 2.25f)
                curveToRelative(0f, -1.12f, 1.01f, -2.25f, 2.25f, -2.25f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, 2.59f, -4.5f, 5.4f, -4.5f, 5.4f)
                curveToRelative(0f, 0f, -4.5f, -2.81f, -4.5f, -5.4f)
                close()
                moveTo(24.02f, 17.14f)
                curveToRelative(0f, 2.09f, -1.83f, 3.86f, -4f, 3.86f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-1.1f, 1.64f, -2.06f, 2.62f, -2.14f, 2.71f)
                lineToRelative(-0.29f, 0.29f)
                lineTo(5.6f, 24f)
                lineToRelative(-0.29f, -0.29f)
                curveToRelative(-0.17f, -0.17f, -4.24f, -4.29f, -5.27f, -10.31f)
                curveToRelative(-0.14f, -0.82f, 0.09f, -1.66f, 0.64f, -2.31f)
                curveToRelative(0.58f, -0.69f, 1.43f, -1.09f, 2.33f, -1.09f)
                lineToRelative(14.0f, 0.0f)
                curveToRelative(0.9f, 0f, 1.75f, 0.4f, 2.33f, 1.09f)
                curveToRelative(0.55f, 0.65f, 0.78f, 1.49f, 0.64f, 2.31f)
                curveToRelative(-0.04f, 0.2f, -0.08f, 0.4f, -0.12f, 0.6f)
                horizontalLineToRelative(0.15f)
                curveToRelative(2.47f, 0f, 4f, 1.2f, 4f, 3.14f)
                close()
                moveTo(22.02f, 17.14f)
                curveToRelative(0f, -0.76f, -0.67f, -1.14f, -2f, -1.14f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.36f, 1.1f, -0.81f, 2.1f, -1.28f, 3f)
                horizontalLineToRelative(1.97f)
                curveToRelative(1.06f, 0f, 2f, -0.87f, 2f, -1.86f)
                close()
            }
        }.also { _CoffeeHeart = it}

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCart: ImageVector? = null

val Icons.Sc.ShoppingCart: ImageVector
    get() = _ShoppingCart ?: UXIcon(name = "ShoppingCart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.36f, 15.33f)
                curveToRelative(0.22f, -0.06f, 0.41f, -0.18f, 0.54f, -0.36f)
                curveToRelative(0.14f, -0.19f, 0.89f, -1.31f, 1.3f, -4.95f)
                curveToRelative(0.32f, -2.84f, -0.31f, -5.35f, -0.33f, -5.46f)
                curveToRelative(-0.1f, -0.38f, -0.4f, -0.66f, -0.78f, -0.73f)
                curveToRelative(-0.14f, -0.03f, -3.35f, -0.64f, -7.14f, -0.64f)
                curveToRelative(-2.79f, 0f, -5.8f, 0.33f, -7.24f, 0.52f)
                curveToRelative(-0.38f, -1.18f, -0.73f, -1.82f, -0.75f, -1.85f)
                curveToRelative(-0.1f, -0.19f, -0.27f, -0.33f, -0.46f, -0.42f)
                curveToRelative(-0.13f, -0.06f, -1.35f, -0.58f, -2.91f, -0.4f)
                curveToRelative(-0.55f, 0.07f, -0.94f, 0.56f, -0.88f, 1.11f)
                curveToRelative(0.07f, 0.55f, 0.55f, 0.94f, 1.11f, 0.88f)
                curveToRelative(0.64f, -0.07f, 1.2f, 0.04f, 1.53f, 0.13f)
                curveToRelative(0.15f, 0.35f, 0.4f, 0.97f, 0.64f, 1.86f)
                curveToRelative(0.0f, 0.01f, 0.41f, 2.6f, 0.69f, 5.01f)
                curveToRelative(0.34f, 3.01f, 0.65f, 4.19f, 0.78f, 4.58f)
                curveToRelative(0.42f, 2.73f, 1.02f, 3.65f, 1.14f, 3.81f)
                curveToRelative(0.14f, 0.18f, 0.33f, 0.31f, 0.55f, 0.37f)
                curveToRelative(0.1f, 0.03f, 2.59f, 0.65f, 6.41f, 0.65f)
                reflectiveCurveToRelative(6.31f, -0.62f, 6.41f, -0.65f)
                curveToRelative(0.54f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                curveToRelative(-0.14f, -0.54f, -0.68f, -0.86f, -1.22f, -0.72f)
                curveToRelative(-0.02f, 0.01f, -2.34f, 0.59f, -5.92f, 0.59f)
                curveToRelative(-2.67f, 0f, -4.65f, -0.33f, -5.49f, -0.49f)
                curveToRelative(-0.1f, -0.25f, -0.25f, -0.68f, -0.4f, -1.34f)
                curveToRelative(1.2f, 0.18f, 3.06f, 0.38f, 5.26f, 0.38f)
                curveToRelative(3.83f, 0f, 6.31f, -0.62f, 6.41f, -0.65f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.51f, 21.52f)
                moveToRelative(-1.48f, 0f)
                arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.96f, 0f)
                arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.96f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.68f, 21.52f)
                moveToRelative(-1.48f, 0f)
                arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.96f, 0f)
                arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.96f, 0f)
            }
        }.also { _ShoppingCart = it}

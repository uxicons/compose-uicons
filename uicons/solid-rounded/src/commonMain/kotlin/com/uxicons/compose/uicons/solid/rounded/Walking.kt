package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Sr.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.45f, 12.4f)
                lineToRelative(-2.84f, -1.42f)
                curveToRelative(-0.33f, -0.16f, -0.6f, -0.41f, -0.8f, -0.72f)
                lineToRelative(-1.48f, -2.35f)
                curveToRelative(-0.05f, -0.08f, -1.32f, -1.91f, -3.33f, -1.91f)
                horizontalLineToRelative(-0.88f)
                curveToRelative(-1.21f, 0f, -2.43f, 0.29f, -3.52f, 0.83f)
                lineToRelative(-2.1f, 1.05f)
                curveToRelative(-0.77f, 0.38f, -1.34f, 1.08f, -1.56f, 1.91f)
                lineToRelative(-0.78f, 2.95f)
                curveToRelative(-0.14f, 0.53f, 0.18f, 1.08f, 0.71f, 1.22f)
                curveToRelative(0.53f, 0.14f, 1.08f, -0.18f, 1.22f, -0.71f)
                lineToRelative(0.78f, -2.95f)
                curveToRelative(0.07f, -0.28f, 0.26f, -0.51f, 0.52f, -0.64f)
                lineToRelative(2.1f, -1.05f)
                curveToRelative(0.2f, -0.1f, 0.4f, -0.18f, 0.61f, -0.26f)
                lineToRelative(-1.03f, 4.38f)
                curveToRelative(-0.3f, 1.29f, 0.29f, 2.64f, 1.44f, 3.29f)
                lineToRelative(3.98f, 2.26f)
                curveToRelative(0.31f, 0.18f, 0.51f, 0.51f, 0.51f, 0.87f)
                verticalLineToRelative(3.84f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.84f)
                curveToRelative(0f, -1.08f, -0.58f, -2.08f, -1.52f, -2.61f)
                lineToRelative(-1.95f, -1.11f)
                lineToRelative(1.54f, -5.78f)
                lineToRelative(1.04f, 1.66f)
                curveToRelative(0.39f, 0.62f, 0.94f, 1.12f, 1.6f, 1.45f)
                lineToRelative(2.84f, 1.42f)
                curveToRelative(0.14f, 0.07f, 0.3f, 0.1f, 0.45f, 0.1f)
                curveToRelative(0.37f, 0f, 0.72f, -0.2f, 0.9f, -0.55f)
                curveToRelative(0.25f, -0.49f, 0.05f, -1.09f, -0.45f, -1.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.19f, 17.86f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.01f, -0.02f, -0.01f)
                curveToRelative(-0.57f, -0.34f, -1.3f, -0.03f, -1.45f, 0.62f)
                lineToRelative(-0.15f, 0.66f)
                lineToRelative(-1.61f, 3.45f)
                curveToRelative(-0.31f, 0.66f, 0.17f, 1.42f, 0.9f, 1.42f)
                curveToRelative(0.39f, 0f, 0.74f, -0.22f, 0.9f, -0.57f)
                lineToRelative(1.65f, -3.51f)
                lineToRelative(0.23f, -0.99f)
                curveToRelative(0.1f, -0.41f, -0.09f, -0.84f, -0.45f, -1.05f)
                close()
            }
        }.also { _Walking = it}

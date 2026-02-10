package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WishlistStar: ImageVector? = null

val Icons.Rr.WishlistStar: ImageVector
    get() = _WishlistStar ?: UXIcon(name = "WishlistStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0f, 1.24f, 0.74f, 2.33f, 1.89f, 2.79f)
                curveToRelative(1.15f, 0.46f, 2.44f, 0.17f, 3.32f, -0.76f)
                lineToRelative(4.79f, -5.5f)
                lineToRelative(4.82f, 5.54f)
                curveToRelative(0.58f, 0.61f, 1.37f, 0.94f, 2.17f, 0.94f)
                curveToRelative(0.37f, 0f, 0.75f, -0.07f, 1.12f, -0.22f)
                curveToRelative(1.15f, -0.46f, 1.89f, -1.55f, 1.89f, -2.79f)
                lineTo(22.0f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20f, 21.0f)
                curveToRelative(0f, 0.63f, -0.48f, 0.87f, -0.63f, 0.93f)
                curveToRelative(-0.15f, 0.06f, -0.66f, 0.21f, -1.07f, -0.21f)
                lineToRelative(-5.55f, -6.37f)
                curveToRelative(-0.19f, -0.22f, -0.47f, -0.34f, -0.75f, -0.34f)
                reflectiveCurveToRelative(-0.56f, 0.12f, -0.75f, 0.34f)
                lineToRelative(-5.52f, 6.34f)
                curveToRelative(-0.43f, 0.46f, -0.95f, 0.3f, -1.1f, 0.24f)
                curveToRelative(-0.15f, -0.06f, -0.63f, -0.3f, -0.63f, -0.93f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(16.95f, 7.54f)
                curveToRelative(0.12f, 0.33f, 0.02f, 0.7f, -0.25f, 0.92f)
                lineToRelative(-1.97f, 1.61f)
                lineToRelative(0.81f, 2.48f)
                curveToRelative(0.11f, 0.34f, -0.0f, 0.71f, -0.28f, 0.92f)
                curveToRelative(-0.28f, 0.22f, -0.67f, 0.23f, -0.96f, 0.04f)
                lineToRelative(-2.29f, -1.5f)
                lineToRelative(-2.26f, 1.51f)
                curveToRelative(-0.14f, 0.09f, -0.3f, 0.14f, -0.46f, 0.14f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.06f, -0.5f, -0.17f)
                curveToRelative(-0.28f, -0.21f, -0.4f, -0.58f, -0.29f, -0.92f)
                lineToRelative(0.78f, -2.51f)
                lineToRelative(-1.98f, -1.61f)
                curveToRelative(-0.27f, -0.23f, -0.36f, -0.59f, -0.24f, -0.92f)
                curveToRelative(0.12f, -0.33f, 0.43f, -0.55f, 0.78f, -0.55f)
                horizontalLineToRelative(2.5f)
                lineToRelative(0.89f, -2.48f)
                curveToRelative(0.12f, -0.33f, 0.43f, -0.54f, 0.78f, -0.54f)
                reflectiveCurveToRelative(0.66f, 0.22f, 0.78f, 0.54f)
                lineToRelative(0.89f, 2.48f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.35f, 0f, 0.66f, 0.22f, 0.78f, 0.55f)
                close()
            }
        }.also { _WishlistStar = it}

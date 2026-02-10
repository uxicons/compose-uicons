package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Foursquare: ImageVector? = null

val Icons.Brand.Foursquare: ImageVector
    get() = _Foursquare ?: UXIcon(name = "Foursquare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.01f, 4.34f)
            horizontalLineToRelative(4.51f)
            verticalLineToRelative(0.74f)
            horizontalLineTo(6.76f)
            verticalLineTo(7.16f)
            horizontalLineToRelative(3.35f)
            verticalLineTo(7.9f)
            horizontalLineTo(6.76f)
            verticalLineToRelative(3f)
            horizontalLineTo(6.01f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.88f, 17.3f)
            lineToRelative(0.73f, -0.17f)
            arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.78f, 1.45f)
            curveToRelative(0.92f, 0f, 1.64f, -0.43f, 1.64f, -1.12f)
            curveToRelative(0f, -0.5f, -0.37f, -0.92f, -1.79f, -1.34f)
            curveTo(6.61f, 15.66f, 6.07f, 15.06f, 6.07f, 14.19f)
            curveToRelative(0f, -1.12f, 0.91f, -1.73f, 2.22f, -1.73f)
            arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.35f, 1.78f)
            lineToRelative(-0.73f, 0.17f)
            arcToRelative(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -1.2f)
            curveToRelative(-0.84f, 0f, -1.43f, 0.31f, -1.43f, 0.92f)
            curveToRelative(0f, 0.49f, 0.38f, 0.86f, 1.71f, 1.28f)
            curveToRelative(1.58f, 0.49f, 2.26f, 1.02f, 2.26f, 2.03f)
            curveToRelative(0f, 1.25f, -1.05f, 1.91f, -2.4f, 1.91f)
            arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.88f, 17.3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.7f, 15.92f)
            arcToRelative(3.22f, 3.22f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.42f, 0f)
            arcToRelative(3.59f, 3.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, 2.41f)
            curveToRelative(0.26f, 0.26f, 0.51f, 0.52f, 0.77f, 0.8f)
            lineToRelative(-0.54f, 0.52f)
            curveToRelative(-0.26f, -0.28f, -0.53f, -0.56f, -0.8f, -0.83f)
            arcTo(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.7f, 15.92f)
            close()
            moveTo(16.12f, 18.27f)
            curveToRelative(-0.25f, -0.24f, -0.51f, -0.48f, -0.77f, -0.71f)
            lineToRelative(0.52f, -0.53f)
            curveToRelative(0.28f, 0.24f, 0.56f, 0.5f, 0.82f, 0.75f)
            arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, -1.87f)
            arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.8f, 0f)
            arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, 2.69f)
            arcTo(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.12f, 18.27f)
            close()
        }
    }.also { _Foursquare = it }

package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Sc.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.32f)
                curveToRelative(3.97f, 0f, 7.46f, 0.54f, 8.85f, 0.79f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0f, -0.44f, -0.29f, -0.83f, -0.72f, -0.96f)
                lineToRelative(-2.63f, -0.77f)
                verticalLineToRelative(-0.53f)
                curveToRelative(0f, -0.33f, -0.16f, -0.64f, -0.43f, -0.82f)
                curveToRelative(-0.07f, -0.05f, -1.84f, -1.24f, -5.07f, -1.24f)
                curveToRelative(-3.19f, 0f, -4.99f, 1.19f, -5.06f, 1.24f)
                curveToRelative(-0.28f, 0.19f, -0.44f, 0.5f, -0.44f, 0.83f)
                verticalLineToRelative(0.53f)
                lineToRelative(-2.62f, 0.77f)
                curveToRelative(-0.42f, 0.12f, -0.72f, 0.52f, -0.72f, 0.96f)
                verticalLineToRelative(2.78f)
                curveToRelative(1.38f, -0.25f, 4.88f, -0.79f, 8.85f, -0.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.81f, 14.61f)
                arcToRelative(1.19f, 1.37f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.38f, 0f)
                arcToRelative(1.19f, 1.37f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.38f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.05f, 13.61f)
                horizontalLineToRelative(4.4f)
                lineToRelative(0.44f, -3.63f)
                curveToRelative(-1.59f, -0.26f, -4.6f, -0.66f, -7.89f, -0.66f)
                reflectiveCurveToRelative(-6.3f, 0.4f, -7.89f, 0.66f)
                lineToRelative(0.44f, 3.63f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.41f, -1.37f, 1.62f, -2.37f, 3.05f, -2.37f)
                reflectiveCurveToRelative(2.64f, 1.0f, 3.05f, 2.37f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.05f, 15.61f)
                curveToRelative(-0.41f, 1.37f, -1.62f, 2.37f, -3.05f, 2.37f)
                reflectiveCurveToRelative(-2.64f, -1.0f, -3.05f, -2.37f)
                horizontalLineTo(4.8f)
                lineToRelative(0.71f, 5.84f)
                curveToRelative(0.04f, 0.36f, 0.28f, 0.67f, 0.62f, 0.81f)
                curveToRelative(0.08f, 0.03f, 1.9f, 0.75f, 5.87f, 0.75f)
                reflectiveCurveToRelative(5.79f, -0.72f, 5.87f, -0.75f)
                curveToRelative(0.34f, -0.14f, 0.57f, -0.45f, 0.62f, -0.81f)
                lineToRelative(0.71f, -5.84f)
                horizontalLineToRelative(-4.15f)
                close()
            }
        }.also { _Coffee = it}

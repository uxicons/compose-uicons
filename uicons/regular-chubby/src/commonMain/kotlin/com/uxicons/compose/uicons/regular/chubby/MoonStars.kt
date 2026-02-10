package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Rc.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.27f, 5.87f)
                lineToRelative(0.83f, 0.3f)
                curveToRelative(0.33f, 0.12f, 0.59f, 0.37f, 0.71f, 0.69f)
                lineToRelative(0.31f, 0.82f)
                curveToRelative(0.15f, 0.39f, 0.52f, 0.65f, 0.94f, 0.65f)
                horizontalLineToRelative(0f)
                curveToRelative(0.42f, 0f, 0.79f, -0.26f, 0.94f, -0.65f)
                lineToRelative(0.31f, -0.82f)
                curveToRelative(0.12f, -0.32f, 0.38f, -0.58f, 0.71f, -0.69f)
                lineToRelative(0.83f, -0.3f)
                curveToRelative(0.4f, -0.14f, 0.66f, -0.52f, 0.66f, -0.94f)
                reflectiveCurveToRelative(-0.26f, -0.8f, -0.66f, -0.94f)
                lineToRelative(-0.83f, -0.3f)
                curveToRelative(-0.33f, -0.12f, -0.59f, -0.37f, -0.71f, -0.69f)
                lineToRelative(-0.31f, -0.82f)
                curveToRelative(-0.15f, -0.39f, -0.52f, -0.65f, -0.94f, -0.65f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, 0f, -0.79f, 0.26f, -0.94f, 0.65f)
                lineToRelative(-0.31f, 0.82f)
                curveToRelative(-0.12f, 0.32f, -0.38f, 0.58f, -0.71f, 0.69f)
                lineToRelative(-0.83f, 0.3f)
                curveToRelative(-0.4f, 0.14f, -0.66f, 0.52f, -0.66f, 0.94f)
                reflectiveCurveToRelative(0.26f, 0.8f, 0.66f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.39f, 12.0f)
                curveToRelative(-0.4f, -0.17f, -0.87f, -0.06f, -1.15f, 0.28f)
                curveToRelative(-0.93f, 1.11f, -2.51f, 1.62f, -4.97f, 1.62f)
                curveToRelative(-3.81f, 0f, -6.18f, -1.03f, -6.18f, -6.16f)
                curveToRelative(0f, -2.4f, 0.53f, -4.02f, 1.63f, -4.96f)
                curveToRelative(0.33f, -0.28f, 0.44f, -0.75f, 0.27f, -1.15f)
                curveToRelative(-0.17f, -0.4f, -0.57f, -0.65f, -1.01f, -0.6f)
                curveTo(5.29f, 1.57f, 1f, 6.28f, 1f, 11.98f)
                curveToRelative(0f, 6.06f, 4.94f, 10.99f, 11.02f, 10.99f)
                curveToRelative(5.72f, 0f, 10.44f, -4.28f, 10.97f, -9.95f)
                curveToRelative(0.04f, -0.44f, -0.2f, -0.85f, -0.61f, -1.02f)
                close()
                moveTo(12.02f, 20.97f)
                curveToRelative(-4.97f, 0f, -9.02f, -4.04f, -9.02f, -8.99f)
                curveToRelative(0f, -3.83f, 2.36f, -7.11f, 5.78f, -8.4f)
                curveToRelative(-0.46f, 1.13f, -0.69f, 2.52f, -0.69f, 4.17f)
                curveToRelative(0f, 7.31f, 4.67f, 8.16f, 8.18f, 8.16f)
                curveToRelative(1.22f, 0f, 2.76f, -0.09f, 4.18f, -0.67f)
                curveToRelative(-1.31f, 3.4f, -4.59f, 5.74f, -8.42f, 5.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.49f, 11.35f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.99f, 10.77f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _MoonStars = it}

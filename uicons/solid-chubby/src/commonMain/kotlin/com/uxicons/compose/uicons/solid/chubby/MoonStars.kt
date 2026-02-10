package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Sc.MoonStars: ImageVector
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
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.49f, 11.05f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.99f, 10.46f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _MoonStars = it}

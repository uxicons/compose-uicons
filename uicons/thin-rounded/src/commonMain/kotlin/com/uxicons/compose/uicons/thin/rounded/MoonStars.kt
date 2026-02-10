package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Tr.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveToRelative(0f, -3.15f, 1.45f, -5.92f, 4.42f, -8.49f)
                curveToRelative(0.47f, -0.41f, 0.68f, -1.01f, 0.56f, -1.63f)
                curveToRelative(-0.12f, -0.61f, -0.54f, -1.1f, -1.12f, -1.3f)
                curveTo(14.22f, 0.01f, 12.01f, -0.15f, 10.08f, 0.15f)
                curveTo(4.83f, 0.99f, 0.61f, 5.43f, 0.07f, 10.72f)
                curveToRelative(-0.66f, 6.35f, 3.74f, 12.12f, 10.02f, 13.12f)
                curveToRelative(0.66f, 0.1f, 1.32f, 0.15f, 2.0f, 0.15f)
                curveToRelative(1.36f, 0f, 2.7f, -0.2f, 3.78f, -0.58f)
                curveToRelative(0.58f, -0.2f, 1.0f, -0.69f, 1.12f, -1.3f)
                curveToRelative(0.12f, -0.61f, -0.09f, -1.22f, -0.56f, -1.63f)
                curveToRelative(-2.98f, -2.57f, -4.42f, -5.35f, -4.42f, -8.49f)
                close()
                moveTo(15.53f, 22.48f)
                curveToRelative(-0.97f, 0.34f, -2.2f, 0.52f, -3.45f, 0.52f)
                curveToRelative(-0.62f, -0.01f, -1.24f, -0.04f, -1.84f, -0.14f)
                curveTo(4.49f, 21.94f, 0.46f, 16.65f, 1.06f, 10.83f)
                curveTo(1.56f, 5.98f, 5.42f, 1.9f, 10.24f, 1.14f)
                curveToRelative(0.6f, -0.1f, 1.22f, -0.14f, 1.85f, -0.14f)
                curveToRelative(1.23f, 0f, 2.46f, 0.18f, 3.45f, 0.52f)
                curveToRelative(0.24f, 0.08f, 0.42f, 0.29f, 0.47f, 0.55f)
                curveToRelative(0.05f, 0.26f, -0.04f, 0.51f, -0.23f, 0.68f)
                curveToRelative(-3.21f, 2.77f, -4.77f, 5.8f, -4.77f, 9.25f)
                reflectiveCurveToRelative(1.56f, 6.48f, 4.77f, 9.25f)
                curveToRelative(0.2f, 0.17f, 0.28f, 0.42f, 0.23f, 0.68f)
                curveToRelative(-0.05f, 0.26f, -0.22f, 0.46f, -0.47f, 0.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.66f, 8.97f)
                curveToRelative(0.2f, -0.07f, 0.34f, -0.26f, 0.34f, -0.47f)
                reflectiveCurveToRelative(-0.14f, -0.41f, -0.34f, -0.47f)
                lineToRelative(-1.26f, -0.42f)
                lineToRelative(-0.42f, -1.26f)
                curveToRelative(-0.14f, -0.41f, -0.81f, -0.41f, -0.95f, 0f)
                lineToRelative(-0.42f, 1.26f)
                lineToRelative(-1.26f, 0.39f)
                curveToRelative(-0.2f, 0.06f, -0.35f, 0.25f, -0.35f, 0.47f)
                reflectiveCurveToRelative(0.13f, 0.41f, 0.33f, 0.48f)
                lineToRelative(1.27f, 0.45f)
                lineToRelative(0.42f, 1.27f)
                curveToRelative(0.07f, 0.2f, 0.26f, 0.34f, 0.47f, 0.34f)
                reflectiveCurveToRelative(0.41f, -0.14f, 0.47f, -0.34f)
                lineToRelative(0.42f, -1.26f)
                lineToRelative(1.26f, -0.42f)
                close()
            }
        }.also { _MoonStars = it}

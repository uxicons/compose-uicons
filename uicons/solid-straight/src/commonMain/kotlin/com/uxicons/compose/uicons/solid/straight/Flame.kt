package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flame: ImageVector? = null

val Icons.Ss.Flame: ImageVector
    get() = _Flame ?: UXIcon(name = "Flame") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.48f, 18.61f)
                curveToRelative(0f, -1.28f, -0.81f, -2.03f, -2.36f, -3.34f)
                curveToRelative(-0.35f, -0.3f, -0.73f, -0.62f, -1.12f, -0.97f)
                curveToRelative(-0.45f, 0.41f, -0.87f, 0.77f, -1.26f, 1.1f)
                curveTo(9.2f, 16.7f, 8.52f, 17.34f, 8.52f, 18.61f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.41f, 4.04f)
                curveToRelative(-1.2f, -1.02f, -2.44f, -2.07f, -3.69f, -3.33f)
                lineTo(12f, 0f)
                lineTo(11.3f, 0.71f)
                curveToRelative(-2.25f, 2.26f, -3.32f, 5.74f, -3.78f, 7.82f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.78f, -1.78f)
                lineTo(6.31f, 5.11f)
                lineTo(5.08f, 6.27f)
                curveToRelative(-2.16f, 2.03f, -3.6f, 4.04f, -3.6f, 7.26f)
                arcToRelative(10.42f, 10.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.8f, 10.18f)
                arcTo(11.15f, 11.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 24f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.49f, -5.39f)
                curveToRelative(0f, -2.25f, 1.36f, -3.4f, 2.93f, -4.74f)
                curveToRelative(0.56f, -0.48f, 1.2f, -1.02f, 1.84f, -1.67f)
                lineTo(12f, 11.49f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(0.58f, 0.58f, 1.15f, 1.06f, 1.71f, 1.54f)
                curveToRelative(1.58f, 1.34f, 3.06f, 2.6f, 3.06f, 4.87f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.46f, 5.38f)
                arcTo(10.51f, 10.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.52f, 13.53f)
                curveTo(22.52f, 9.22f, 19.69f, 6.82f, 16.41f, 4.04f)
                close()
            }
        }.also { _Flame = it}

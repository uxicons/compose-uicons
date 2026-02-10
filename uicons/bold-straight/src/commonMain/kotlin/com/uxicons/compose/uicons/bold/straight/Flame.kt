package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flame: ImageVector? = null

val Icons.Bs.Flame: ImageVector
    get() = _Flame ?: UXIcon(name = "Flame") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.51f, 4.21f)
                curveToRelative(-1.12f, -0.95f, -2.28f, -1.94f, -3.45f, -3.1f)
                lineTo(12f, 0.05f)
                lineTo(10.94f, 1.11f)
                arcToRelative(14.41f, 14.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.32f, 6.1f)
                curveToRelative(-0.01f, -0.05f, -0.03f, -0.1f, -0.04f, -0.16f)
                lineTo(6.95f, 4.6f)
                lineTo(5.1f, 6.33f)
                curveTo(3.25f, 8.07f, 1.53f, 10.15f, 1.53f, 13.58f)
                arcTo(10.38f, 10.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.3f, 23.71f)
                arcToRelative(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.69f, 0.34f)
                arcTo(10.46f, 10.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.47f, 13.58f)
                curveTo(22.47f, 9.27f, 19.71f, 6.93f, 16.51f, 4.21f)
                close()
                moveTo(16.58f, 19.47f)
                curveToRelative(-0.11f, 0.08f, -0.23f, 0.15f, -0.34f, 0.23f)
                arcToRelative(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, -1.75f)
                curveToRelative(0f, -2.54f, -2.3f, -3.55f, -4.6f, -5.85f)
                curveToRelative(-2.51f, 2.51f, -4.6f, 3.31f, -4.6f, 5.85f)
                arcTo(4.57f, 4.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.8f, 19.8f)
                arcTo(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.54f, 13.58f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, -3.45f)
                curveToRelative(0.11f, 0.17f, 0.22f, 0.34f, 0.35f, 0.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.32f, 0.85f)
                arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.1f, 9.7f)
                arcToRelative(15.81f, 15.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.04f, -5.32f)
                curveToRelative(0.84f, 0.78f, 1.67f, 1.48f, 2.43f, 2.12f)
                curveToRelative(3.22f, 2.73f, 4.9f, 4.29f, 4.9f, 7.08f)
                arcTo(7.42f, 7.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.58f, 19.47f)
                close()
            }
        }.also { _Flame = it}

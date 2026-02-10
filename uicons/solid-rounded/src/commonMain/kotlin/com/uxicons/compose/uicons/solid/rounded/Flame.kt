package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flame: ImageVector? = null

val Icons.Sr.Flame: ImageVector
    get() = _Flame ?: UXIcon(name = "Flame") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.75f, 18.25f)
                curveToRelative(0f, -1.5f, -1.03f, -3.55f, -2.9f, -5.77f)
                arcTo(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12.09f)
                horizontalLineToRelative(0f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, 0.39f)
                horizontalLineToRelative(0f)
                curveTo(9.1f, 14.88f, 8.1f, 17f, 8.27f, 18.62f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 2.56f)
                arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.75f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.63f, 2.9f)
                curveToRelative(-0.79f, -0.67f, -1.61f, -1.37f, -2.45f, -2.13f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.8f, 0.03f)
                arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.03f, 1.3f)
                arcTo(20.39f, 20.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.28f, 7.78f)
                arcTo(6.23f, 6.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.8f, 6.96f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.3f, -0.47f)
                arcTo(9.07f, 9.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, 12.91f)
                arcTo(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.14f, 23.64f)
                arcToRelative(11.65f, 11.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.78f, 0.35f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, -1.23f)
                arcToRelative(5.63f, 5.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.35f, -3.93f)
                curveToRelative(-0.23f, -2.21f, 0.89f, -4.78f, 3.34f, -7.65f)
                horizontalLineToRelative(0f)
                arcTo(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10.09f)
                horizontalLineToRelative(0.01f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.37f, 1.1f)
                curveToRelative(1.54f, 1.83f, 3.37f, 4.54f, 3.37f, 7.06f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.39f, 23.98f)
                arcToRelative(11.06f, 11.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.7f, -11.06f)
                curveTo(23.09f, 8.38f, 20.09f, 5.84f, 16.63f, 2.9f)
                close()
            }
        }.also { _Flame = it}

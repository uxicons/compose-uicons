package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Rr.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0.01f)
                curveToRelative(-3.81f, 0f, -8.12f, 2.04f, -11.54f, 5.45f)
                arcToRelative(38.47f, 38.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.14f, 11.85f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 4.41f)
                lineToRelative(1.11f, 1.1f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 0.85f)
                arcToRelative(38.33f, 38.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.85f, -8.14f)
                curveToRelative(3.42f, -3.41f, 5.46f, -7.73f, 5.46f, -11.54f)
                arcToRelative(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.99f, -3.99f)
                close()
                moveTo(17.12f, 14.12f)
                arcToRelative(36.35f, 36.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.22f, 7.71f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.03f, -0.3f)
                lineToRelative(12.83f, -12.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-12.84f, 12.84f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -2.03f)
                arcToRelative(36.44f, 36.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.72f, -11.23f)
                curveToRelative(3.59f, -3.59f, 7.58f, -4.87f, 10.12f, -4.87f)
                curveToRelative(1.45f, 0f, 1.99f, 0.54f, 1.99f, 1.99f)
                curveToRelative(0f, 2.54f, -1.28f, 6.54f, -4.87f, 10.12f)
                close()
            }
        }.also { _Surfing = it}

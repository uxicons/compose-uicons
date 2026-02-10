package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sausage: ImageVector? = null

val Icons.Rr.Sausage: ImageVector
    get() = _Sausage ?: UXIcon(name = "Sausage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.83f, 3.36f)
                curveTo(21.82f, 2.73f, 22.8f, 0.21f, 21f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                curveToRelative(-1.8f, 0.21f, -0.82f, 2.72f, 0.17f, 3.36f)
                arcTo(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7.91f)
                curveToRelative(-0.06f, 2.2f, -3.62f, 5.93f, -6.08f, 6.11f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.57f, 3.15f)
                curveTo(2.72f, 16.18f, 0.21f, 15.2f, 0f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                curveToRelative(0.21f, 1.8f, 2.73f, 0.82f, 3.36f, -0.17f)
                curveToRelative(1.96f, 4.91f, 9.27f, 3.96f, 15.51f, -1.95f)
                curveTo(24.83f, 12.63f, 25.72f, 5.33f, 20.83f, 3.36f)
                close()
                moveTo(17.46f, 17.47f)
                curveTo(13.15f, 21.76f, 8.82f, 22f, 8f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.07f, -5.99f)
                curveToRelative(3.39f, -0.18f, 7.91f, -4.88f, 7.93f, -8.05f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0.07f)
                curveTo(22f, 8.85f, 21.78f, 13.16f, 17.46f, 17.47f)
                close()
            }
        }.also { _Sausage = it}

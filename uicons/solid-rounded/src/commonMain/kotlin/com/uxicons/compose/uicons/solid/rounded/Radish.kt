package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radish: ImageVector? = null

val Icons.Sr.Radish: ImageVector
    get() = _Radish ?: UXIcon(name = "Radish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.02f, 9.01f)
                curveToRelative(-0.29f, -3.7f, -2.08f, -4.64f, -2f, -6.5f)
                curveToRelative(0.31f, -3.87f, 6.37f, -2.91f, 4.72f, 0.9f)
                curveTo(13.06f, 4.71f, 12.15f, 6.45f, 11.02f, 9.01f)
                close()
                moveTo(20.64f, 10.29f)
                curveToRelative(-1.75f, 0.92f, -3.74f, 1.91f, -5.62f, 2.72f)
                curveToRelative(3.7f, 0.3f, 4.63f, 2.08f, 6.49f, 2f)
                curveTo(25.35f, 14.71f, 24.45f, 8.67f, 20.64f, 10.29f)
                close()
                moveTo(24.02f, 3.88f)
                arcTo(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.41f, 1.15f)
                curveToRelative(-0.49f, 0.49f, -3.98f, 6.72f, -5.98f, 10.33f)
                curveTo(8.42f, 8.71f, 4.45f, 7.92f, 1.47f, 10.95f)
                curveToRelative(-2f, 1.92f, -1.29f, 6.49f, -1.45f, 9.04f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.02f)
                curveToRelative(2.54f, -0.16f, 7.14f, 0.57f, 9.06f, -1.43f)
                curveToRelative(2.76f, -2.76f, 2.54f, -6.52f, -0.52f, -9.96f)
                curveToRelative(3.58f, -1.98f, 9.76f, -5.43f, 10.32f, -6f)
                arcTo(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.02f, 3.88f)
                close()
            }
        }.also { _Radish = it}

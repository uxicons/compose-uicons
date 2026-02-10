package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Steak: ImageVector? = null

val Icons.Sr.Steak: ImageVector
    get() = _Steak ?: UXIcon(name = "Steak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 0f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                curveToRelative(0f, 5.33f, 4.21f, 10f, 9f, 10f)
                arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.78f, 1.76f)
                curveToRelative(3.4f, 4.46f, 11.27f, 1.81f, 11.22f, -4.26f)
                curveTo(24f, 11.59f, 19.77f, 0f, 10f, 0f)
                close()
                moveTo(4.29f, 7.29f)
                lineToRelative(3f, -3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.71f, 5.71f)
                lineToRelative(-3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.29f, 7.29f)
                close()
                moveTo(6.71f, 13.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(7f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                close()
                moveTo(10.71f, 15.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                close()
                moveTo(14f, 18f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -1.71f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-4f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                close()
                moveTo(19.71f, 18.71f)
                curveTo(19.31f, 19.03f, 18.59f, 20.08f, 18f, 20f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -1.71f)
                lineToRelative(1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.71f, 18.71f)
                close()
            }
        }.also { _Steak = it}

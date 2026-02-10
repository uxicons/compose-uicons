package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Rr.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, 0.41f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 10.48f)
                curveTo(14f, 9.5f, 14.71f, 7.01f, 18f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8f)
                close()
                moveTo(7f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -0.02f)
                curveTo(10f, 9.5f, 9.29f, 7.01f, 6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.47f, 0.41f)
                arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 10.5f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                curveToRelative(-13.25f, 0.5f, -13.24f, 19.5f, 0f, 20f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(17.67f, 16.25f)
                arcToRelative(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.33f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, 1.49f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.67f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -1.49f)
                close()
            }
        }.also { _Angry = it}

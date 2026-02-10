package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinHearts: ImageVector? = null

val Icons.Sr.GrinHearts: ImageVector
    get() = _GrinHearts ?: UXIcon(name = "GrinHearts") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6.5f, 7f)
                arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.65f)
                curveToRelative(0.41f, -3.62f, 6.17f, -0.78f, 0.47f, 3.49f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.93f, 0f)
                curveTo(6.69f, 11.47f, 5f, 9.95f, 5f, 8.65f)
                arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 7f)
                close()
                moveTo(17.84f, 15.54f)
                arcTo(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
                arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, 15.54f)
                close()
                moveTo(16.46f, 12.14f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.93f, 0f)
                curveToRelative(-5.7f, -4.28f, 0.06f, -7.11f, 0.47f, -3.49f)
                curveTo(16.41f, 5.03f, 22.17f, 7.87f, 16.46f, 12.14f)
                close()
            }
        }.also { _GrinHearts = it}

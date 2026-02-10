package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Rr.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 1.92f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 3.3f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, -3.3f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.97f)
                curveToRelative(0f, 4.55f, 4.79f, 9.51f, 8.8f, 12.88f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 0f)
                curveTo(19.21f, 18.48f, 24f, 13.51f, 24f, 8.97f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 1.92f)
                close()
                moveTo(13.91f, 20.32f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.83f, 0f)
                curveTo(4.95f, 16.01f, 2f, 11.87f, 2f, 8.97f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -5.05f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, -5.05f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8.97f)
                curveTo(22f, 11.87f, 19.05f, 16.01f, 13.91f, 20.31f)
                close()
            }
        }.also { _Heart = it}

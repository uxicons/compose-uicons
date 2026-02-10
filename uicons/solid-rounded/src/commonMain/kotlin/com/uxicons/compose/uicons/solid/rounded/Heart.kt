package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Sr.Heart: ImageVector
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
            }
        }.also { _Heart = it}

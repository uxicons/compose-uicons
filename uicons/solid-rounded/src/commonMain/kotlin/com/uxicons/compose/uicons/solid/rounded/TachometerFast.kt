package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFast: ImageVector? = null

val Icons.Sr.TachometerFast: ImageVector
    get() = _TachometerFast ?: UXIcon(name = "TachometerFast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4.05f)
                curveTo(8.35f, -5.66f, -6.71f, 9.5f, 3.14f, 21.08f)
                arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.1f, 20.62f)
                curveToRelative(0.35f, -0.52f, 0.68f, -1.69f, 1.49f, -1.62f)
                horizontalLineToRelative(6.82f)
                curveToRelative(0.8f, -0.07f, 1.16f, 1.13f, 1.5f, 1.65f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, 0.49f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.05f)
                close()
                moveTo(17.71f, 8.71f)
                lineToRelative(-3.77f, 3.77f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(3.77f, -3.77f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.71f, 8.71f)
                close()
            }
        }.also { _TachometerFast = it}

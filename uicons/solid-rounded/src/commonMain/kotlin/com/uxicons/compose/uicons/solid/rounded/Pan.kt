package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Sr.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 0f)
                curveTo(6.67f, -0.19f, 1.6f, 8.25f, 5.14f, 14.62f)
                lineTo(0.88f, 18.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 4.24f)
                lineToRelative(4.26f, -4.26f)
                curveTo(15.75f, 22.4f, 24.19f, 17.34f, 24f, 10f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
                close()
                moveTo(14f, 17f)
                curveTo(4.75f, 16.7f, 4.75f, 3.29f, 14f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                curveToRelative(-6.61f, 0.21f, -6.61f, 9.79f, 0f, 10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                close()
            }
        }.also { _Pan = it}

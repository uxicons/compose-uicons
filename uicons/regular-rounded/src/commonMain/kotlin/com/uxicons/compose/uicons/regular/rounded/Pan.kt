package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Rr.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 0f)
                curveTo(6.66f, -0.19f, 1.6f, 8.25f, 5.14f, 14.62f)
                lineTo(0.88f, 18.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.24f, 4.24f)
                lineToRelative(4.26f, -4.26f)
                curveTo(15.75f, 22.4f, 24.19f, 17.34f, 24f, 10f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
                close()
                moveTo(3.71f, 21.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, -1.41f)
                lineToRelative(3.97f, -3.97f)
                arcToRelative(10.12f, 10.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 1.42f)
                close()
                moveTo(14f, 18f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                curveTo(6.38f, -0.59f, 21.63f, -0.59f, 22f, 10f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                close()
                moveTo(20f, 10f)
                curveToRelative(-0.25f, 7.93f, -11.75f, 7.93f, -12f, 0f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                curveToRelative(0.14f, 5.28f, 7.86f, 5.27f, 8f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                close()
            }
        }.also { _Pan = it}

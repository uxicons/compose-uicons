package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grin: ImageVector? = null

val Icons.Ss.Grin: ImageVector
    get() = _Grin ?: UXIcon(name = "Grin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(15.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 8f)
                close()
                moveTo(8.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.34f, 0f, -5.39f, -2.72f, -6.01f, -5f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveTo(17.39f, 16.28f, 15.34f, 19f, 12f, 19f)
                close()
            }
        }.also { _Grin = it}

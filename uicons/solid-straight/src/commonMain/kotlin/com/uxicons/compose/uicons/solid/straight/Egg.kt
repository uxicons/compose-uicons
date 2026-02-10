package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Egg: ImageVector? = null

val Icons.Ss.Egg: ImageVector
    get() = _Egg ?: UXIcon(name = "Egg") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(6.29f, 0f, 2f, 8.49f, 2f, 14f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                curveTo(22f, 8.49f, 17.71f, 0f, 12f, 0f)
                close()
                moveTo(13f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                close()
                moveTo(15.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 13f)
                close()
            }
        }.also { _Egg = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Egg: ImageVector? = null

val Icons.Br.Egg: ImageVector
    get() = _Egg ?: UXIcon(name = "Egg") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 13.91f)
            curveTo(2f, 8.44f, 6.29f, 0f, 12f, 0f)
            reflectiveCurveTo(22f, 8.44f, 22f, 13.91f)
            arcTo(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3f)
            curveTo(8.39f, 3f, 5f, 9.81f, 5f, 13.91f)
            arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            curveTo(19f, 9.81f, 15.61f, 3f, 12f, 3f)
            close()
            moveTo(13f, 13f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, -2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 13f)
            close()
            moveTo(12f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.5f, 6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.5f)
            close()
        }
    }.also { _Egg = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Br.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 0f)
            arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.52f, 15.27f)
            lineTo(0.67f, 20.12f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.22f)
            horizontalLineToRelative(0f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.22f, 0f)
            lineToRelative(4.85f, -4.85f)
            arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
            close()
            moveTo(14f, 17f)
            arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, -7f)
            arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
            close()
            moveTo(19f, 10f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, -5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
        }
    }.also { _Pan = it }

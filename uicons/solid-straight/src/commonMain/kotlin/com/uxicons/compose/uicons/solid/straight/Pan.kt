package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Ss.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 0f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.45f, 15.16f)
                lineTo(0f, 20.61f)
                lineTo(3.4f, 24f)
                lineToRelative(5.45f, -5.45f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
                close()
                moveTo(14f, 17f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3f)
                lineTo(14f, 5f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(2f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                close()
            }
        }.also { _Pan = it}

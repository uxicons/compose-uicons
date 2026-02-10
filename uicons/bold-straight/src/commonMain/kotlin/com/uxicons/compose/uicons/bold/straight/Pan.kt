package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pan: ImageVector? = null

val Icons.Bs.Pan: ImageVector
    get() = _Pan ?: UXIcon(name = "Pan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 0f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.45f, 15.16f)
                lineTo(0.01f, 20.61f)
                lineTo(3.41f, 24f)
                lineToRelative(5.43f, -5.45f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 0f)
                close()
                moveTo(14f, 17f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, -7f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(3f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, -5f)
                lineTo(14f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
                close()
            }
        }.also { _Pan = it}

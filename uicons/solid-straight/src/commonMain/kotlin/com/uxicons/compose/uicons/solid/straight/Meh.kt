package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meh: ImageVector? = null

val Icons.Ss.Meh: ImageVector
    get() = _Meh ?: UXIcon(name = "Meh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                lineTo(6f, 11f)
                close()
                moveTo(16f, 17f)
                lineTo(8f, 17f)
                lineTo(8f, 15f)
                horizontalLineToRelative(8f)
                close()
                moveTo(14f, 11f)
                lineTo(14f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Meh = it}

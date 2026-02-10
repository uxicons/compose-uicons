package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bed: ImageVector? = null

val Icons.Ss.Bed: ImageVector
    get() = _Bed ?: UXIcon(name = "Bed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                lineTo(24f, 14f)
                verticalLineToRelative(8f)
                lineTo(22f, 22f)
                lineTo(22f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                lineTo(0f, 2f)
                lineTo(2f, 2f)
                close()
                moveTo(5.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 12f)
                close()
                moveTo(21f, 6f)
                lineTo(12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                verticalLineToRelative(3f)
                lineTo(24f, 12f)
                lineTo(24f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                close()
            }
        }.also { _Bed = it}

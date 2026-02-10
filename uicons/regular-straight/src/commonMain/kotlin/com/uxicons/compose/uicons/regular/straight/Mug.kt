package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Rs.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                lineTo(19f, 6f)
                lineTo(19f, 3f)
                horizontalLineToRelative(1f)
                lineTo(20f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(16f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(19f, 17f)
                horizontalLineToRelative(5f)
                lineTo(24f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                close()
                moveTo(16f, 21f)
                lineTo(4f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(3f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 3f)
                lineTo(17f, 3f)
                lineTo(17f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                close()
                moveTo(22f, 15f)
                lineTo(19f, 15f)
                lineTo(19f, 8f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _Mug = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keyboard: ImageVector? = null

val Icons.Ss.Keyboard: ImageVector
    get() = _Keyboard ?: UXIcon(name = "Keyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                lineTo(13f, 6f)
                lineTo(13f, 2f)
                lineTo(11f, 2f)
                lineTo(11f, 6f)
                lineTo(3f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                lineTo(0f, 20f)
                lineTo(24f, 20f)
                lineTo(24f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                close()
                moveTo(9f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(9f, 12f)
                close()
                moveTo(6f, 16f)
                lineTo(4f, 16f)
                lineTo(4f, 14f)
                lineTo(6f, 14f)
                close()
                moveTo(7f, 12f)
                lineTo(4f, 12f)
                lineTo(4f, 10f)
                lineTo(7f, 10f)
                close()
                moveTo(16f, 16f)
                lineTo(8f, 16f)
                lineTo(8f, 14f)
                horizontalLineToRelative(8f)
                close()
                moveTo(20f, 16f)
                lineTo(18f, 16f)
                lineTo(18f, 14f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 12f)
                lineTo(14f, 12f)
                lineTo(14f, 10f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Keyboard = it}

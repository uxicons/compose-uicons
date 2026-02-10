package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LuggageRolling: ImageVector? = null

val Icons.Ss.LuggageRolling: ImageVector
    get() = _LuggageRolling ?: UXIcon(name = "LuggageRolling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(17f, 8f)
                lineTo(17f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(10f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                lineTo(7f, 8f)
                lineTo(3f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                lineTo(4f, 22f)
                lineTo(20f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(15f, 8f)
                lineTo(9f, 8f)
                close()
                moveTo(17f, 14f)
                lineTo(7f, 14f)
                lineTo(7f, 12f)
                lineTo(17f, 12f)
                close()
            }
        }.also { _LuggageRolling = it}

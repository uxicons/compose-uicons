package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendar: ImageVector? = null

val Icons.Ss.Calendar: ImageVector
    get() = _Calendar ?: UXIcon(name = "Calendar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 10f)
                close()
                moveTo(24f, 8f)
                lineTo(24f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(18f, 2f)
                lineTo(18f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 0f)
                lineTo(6f, 0f)
                lineTo(6f, 2f)
                lineTo(3f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 8f)
                close()
                moveTo(18f, 14f)
                lineTo(16f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                lineTo(11f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 14f)
                lineTo(6f, 14f)
                verticalLineToRelative(2f)
                lineTo(8f, 16f)
                close()
                moveTo(18f, 18f)
                lineTo(16f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 18f)
                lineTo(11f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 18f)
                lineTo(6f, 18f)
                verticalLineToRelative(2f)
                lineTo(8f, 20f)
                close()
            }
        }.also { _Calendar = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ticket: ImageVector? = null

val Icons.Ss.Ticket: ImageVector
    get() = _Ticket ?: UXIcon(name = "Ticket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                lineTo(21f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(14f, 0f)
                lineTo(14f, 1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                lineTo(10f, 0f)
                lineTo(6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(3f, 15f)
                lineTo(7f, 15f)
                verticalLineToRelative(2f)
                lineTo(3f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                lineTo(10f, 23f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                lineTo(21f, 17f)
                lineTo(17f, 17f)
                lineTo(17f, 15f)
                close()
                moveTo(14f, 17f)
                lineTo(10f, 17f)
                lineTo(10f, 15f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Ticket = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ticket: ImageVector? = null

val Icons.Br.Ticket: ImageVector
    get() = _Ticket ?: UXIcon(name = "Ticket") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 0f)
            horizontalLineToRelative(-0.69f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.62f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.19f, 0f)
            lineTo(8.5f, 0f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            verticalLineToRelative(15f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 24f)
            lineTo(9.19f, 24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.62f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            lineTo(17.5f, 24f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20.5f)
            lineTo(21f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
            close()
            moveTo(17.5f, 21f)
            lineTo(16.05f, 21f)
            arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.1f, 0f)
            lineTo(6.5f, 21f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
            lineTo(6f, 16f)
            horizontalLineToRelative(0.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14.5f)
            lineTo(8f, 14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 13f)
            lineTo(6f, 13f)
            lineTo(6f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.97f, 3.06f)
            arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
            lineTo(18f, 13f)
            horizontalLineToRelative(-0.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14.5f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 16f)
            lineTo(18f, 16f)
            verticalLineToRelative(4.5f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 13f)
            lineTo(12.5f, 13f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 14.5f)
            lineTo(14f, 14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 16f)
            lineTo(11.5f, 16f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 14.5f)
            lineTo(10f, 14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 13f)
            close()
        }
    }.also { _Ticket = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendar: ImageVector? = null

val Icons.Br.Calendar: ImageVector
    get() = _Calendar ?: UXIcon(name = "Calendar") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 2f)
            lineTo(18f, 2f)
            lineTo(18f, 1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 0f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 1.5f)
            lineTo(15f, 2f)
            lineTo(9f, 2f)
            lineTo(9f, 1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 0f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1.5f)
            lineTo(6f, 2f)
            lineTo(5.5f, 2f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.5f)
            verticalLineToRelative(11f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            lineTo(24f, 7.5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 2f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            lineTo(3f, 10f)
            lineTo(21f, 10f)
            verticalLineToRelative(8.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            close()
        }
    }.also { _Calendar = it }

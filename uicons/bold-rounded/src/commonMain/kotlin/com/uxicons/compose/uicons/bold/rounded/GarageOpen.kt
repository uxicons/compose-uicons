package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageOpen: ImageVector? = null

val Icons.Br.GarageOpen: ImageVector
    get() = _GarageOpen ?: UXIcon(name = "GarageOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.58f, 5.36f)
            lineTo(14.97f, 0.91f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.95f, 0f)
            lineToRelative(-6.6f, 4.45f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.92f)
            verticalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 22.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 24f)
            horizontalLineToRelative(1f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineTo(9.92f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.58f, 5.36f)
            close()
            moveTo(21f, 18.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.45f)
            verticalLineTo(12.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 9f)
            horizontalLineToRelative(-7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12.5f)
            verticalLineToRelative(8.45f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(9.92f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.1f, 7.85f)
            lineTo(10.7f, 3.4f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.59f, 0f)
            lineToRelative(6.6f, 4.46f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.92f)
            close()
        }
    }.also { _GarageOpen = it }

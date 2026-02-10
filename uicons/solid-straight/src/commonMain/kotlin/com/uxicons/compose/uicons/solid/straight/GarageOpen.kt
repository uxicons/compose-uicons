package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageOpen: ImageVector? = null

val Icons.Ss.GarageOpen: ImageVector
    get() = _GarageOpen ?: UXIcon(name = "GarageOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                lineTo(7f, 16f)
                lineTo(7f, 13f)
                lineTo(17f, 13f)
                close()
                moveTo(24f, 10.04f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, -2.36f)
                lineToRelative(-9f, -7.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, 0f)
                lineToRelative(-9f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.04f)
                lineTo(0f, 24f)
                lineTo(5f, 24f)
                lineTo(5f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(18f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(19f, 24f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _GarageOpen = it}

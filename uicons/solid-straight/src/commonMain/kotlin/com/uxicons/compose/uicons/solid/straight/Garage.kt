package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Garage: ImageVector? = null

val Icons.Ss.Garage: ImageVector
    get() = _Garage ?: UXIcon(name = "Garage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.04f)
                lineTo(24f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(7f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(4f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 7.68f)
                lineToRelative(9f, -7.04f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.04f)
                close()
                moveTo(18f, 13f)
                lineTo(18f, 24f)
                lineTo(6f, 24f)
                lineTo(6f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(17f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                close()
                moveTo(14f, 20f)
                lineTo(10f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Garage = it}

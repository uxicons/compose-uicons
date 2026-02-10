package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bus: ImageVector? = null

val Icons.Bs.Bus: ImageVector
    get() = _Bus ?: UXIcon(name = "Bus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                lineTo(22f, 4.58f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.05f, -3.13f)
                arcTo(20.21f, 20.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(20.21f, 20.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.05f, 1.45f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.58f)
                lineTo(2f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(7f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                lineTo(9f, 24f)
                lineTo(9f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineTo(20f, 22f)
                horizontalLineToRelative(2f)
                lineTo(22f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 10f)
                close()
                moveTo(13.5f, 12.01f)
                lineTo(13.5f, 6f)
                lineTo(19f, 6f)
                verticalLineToRelative(6.01f)
                close()
                moveTo(5f, 12.01f)
                lineTo(5f, 6f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.01f)
                close()
                moveTo(5f, 19f)
                lineTo(5f, 15.01f)
                lineTo(7f, 15.01f)
                lineTo(7f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 17f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 15.5f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(4f)
                lineTo(14f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 17f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15.5f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(2f)
                lineTo(19f, 19f)
                close()
            }
        }.also { _Bus = it}

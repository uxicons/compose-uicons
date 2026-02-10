package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Network: ImageVector? = null

val Icons.Rr.Network: ImageVector
    get() = _Network ?: UXIcon(name = "Network") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 20f)
                lineTo(14.82f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.18f)
                lineTo(13f, 14f)
                horizontalLineToRelative(6f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -5.22f)
                lineTo(21f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(7f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                lineTo(3f, 8.78f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.18f, 20f)
                lineTo(1f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(9.18f, 22f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                lineTo(23f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                lineTo(17f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                lineTo(19f, 8f)
                lineTo(15.41f, 8f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8.59f)
                lineTo(13.59f, 9f)
                lineTo(10.41f, 9f)
                lineTo(10f, 8.59f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.59f, 8f)
                lineTo(5f, 8f)
                close()
                moveTo(4f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(8.59f, 10f)
                lineTo(9f, 10.41f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.41f, 11f)
                horizontalLineToRelative(3.17f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.41f)
                lineTo(15.41f, 10f)
                lineTo(19f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(5f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 11f)
                close()
                moveTo(12f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _Network = it}

package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShuttleVan: ImageVector? = null

val Icons.Rs.ShuttleVan: ImageVector
    get() = _ShuttleVan ?: UXIcon(name = "ShuttleVan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12.85f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, -2.03f)
                lineTo(20.44f, 3.78f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.7f, 2f)
                lineTo(3f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(9f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(22f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18.61f, 4.59f)
                lineTo(21.02f, 10f)
                lineTo(14f, 10f)
                lineTo(14f, 4f)
                horizontalLineToRelative(3.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.61f, 4.59f)
                close()
                moveTo(8f, 10f)
                lineTo(8f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                close()
                moveTo(3f, 4f)
                lineTo(6f, 4f)
                verticalLineToRelative(6f)
                lineTo(2f, 10f)
                lineTo(2f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                close()
                moveTo(7f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(4f, 19f)
                lineTo(7f, 19f)
                close()
                moveTo(20f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(17f, 19f)
                horizontalLineToRelative(3f)
                close()
                moveTo(22f, 17f)
                lineTo(2f, 17f)
                lineTo(2f, 12f)
                lineTo(21.88f, 12f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, 0.85f)
                close()
            }
        }.also { _ShuttleVan = it}

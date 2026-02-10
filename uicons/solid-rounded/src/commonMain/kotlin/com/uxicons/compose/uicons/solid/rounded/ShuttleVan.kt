package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShuttleVan: ImageVector? = null

val Icons.Sr.ShuttleVan: ImageVector
    get() = _ShuttleVan ?: UXIcon(name = "ShuttleVan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                horizontalLineToRelative(1.4f)
                arcToRelative(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.57f, 2.97f)
                lineTo(23.2f, 10f)
                lineTo(15f, 10f)
                close()
                moveTo(8f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                lineTo(13f, 2f)
                close()
                moveTo(6f, 10f)
                lineTo(6f, 2f)
                lineTo(5f, 2f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 12f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(20f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineToRelative(-0.73f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.88f, 12f)
                close()
                moveTo(7.94f, 20f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
                moveTo(20.94f, 20f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
            }
        }.also { _ShuttleVan = it}

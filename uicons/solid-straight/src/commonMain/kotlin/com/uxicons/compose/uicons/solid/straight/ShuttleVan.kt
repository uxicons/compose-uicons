package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShuttleVan: ImageVector? = null

val Icons.Ss.ShuttleVan: ImageVector
    get() = _ShuttleVan ?: UXIcon(name = "ShuttleVan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                horizontalLineToRelative(2.7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.74f, 1.78f)
                lineTo(23.21f, 10f)
                lineTo(15f, 10f)
                close()
                moveTo(8f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                lineTo(13f, 2f)
                close()
                moveTo(6f, 10f)
                lineTo(6f, 2f)
                lineTo(3f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineToRelative(5f)
                close()
                moveTo(0f, 12f)
                verticalLineToRelative(6f)
                lineTo(24f, 18f)
                lineTo(24f, 12.85f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.91f, 12f)
                close()
                moveTo(3.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(20.94f, 20f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
            }
        }.also { _ShuttleVan = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShuttleVan: ImageVector? = null

val Icons.Bs.ShuttleVan: ImageVector
    get() = _ShuttleVan ?: UXIcon(name = "ShuttleVan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.35f)
                arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.47f, -2.23f)
                lineTo(20.4f, 4.08f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.2f, 2f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
                verticalLineTo(20f)
                horizontalLineTo(3.05f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineTo(24f)
                close()
                moveTo(17.66f, 5.3f)
                lineToRelative(2.09f, 4.7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineToRelative(2.2f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.66f, 5.3f)
                close()
                moveTo(9f, 10f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
                moveTo(3.5f, 5f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 5f)
                close()
                moveTo(21f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(20.98f)
                arcToRelative(2.53f, 2.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 0.35f)
                close()
            }
        }.also { _ShuttleVan = it}

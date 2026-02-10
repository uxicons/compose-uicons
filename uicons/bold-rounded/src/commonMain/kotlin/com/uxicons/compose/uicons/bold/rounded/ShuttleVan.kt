package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShuttleVan: ImageVector? = null

val Icons.Br.ShuttleVan: ImageVector
    get() = _ShuttleVan ?: UXIcon(name = "ShuttleVan") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.35f, 10.73f)
            lineToRelative(-2.43f, -5.46f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.9f, 2f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.5f)
            verticalLineToRelative(8f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.24f)
            verticalLineTo(20.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(20f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineToRelative(-0.76f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15.5f)
            verticalLineTo(13.77f)
            arcTo(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.35f, 10.73f)
            close()
            moveTo(18.18f, 6.49f)
            lineTo(19.75f, 10f)
            horizontalLineTo(15f)
            verticalLineTo(5f)
            horizontalLineToRelative(0.9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.18f, 6.49f)
            close()
            moveTo(9f, 10f)
            verticalLineTo(5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(5f)
            close()
            moveTo(5.5f, 5f)
            horizontalLineTo(6f)
            verticalLineToRelative(5f)
            horizontalLineTo(3f)
            verticalLineTo(7.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 5f)
            close()
            moveTo(21f, 15.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 17f)
            horizontalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.5f)
            verticalLineTo(13f)
            horizontalLineTo(20.93f)
            arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 0.77f)
            close()
        }
    }.also { _ShuttleVan = it }

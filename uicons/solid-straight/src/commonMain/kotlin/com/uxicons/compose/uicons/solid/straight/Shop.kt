package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shop: ImageVector? = null

val Icons.Ss.Shop: ImageVector
    get() = _Shop ?: UXIcon(name = "Shop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -0.81f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17f)
                horizontalLineTo(11f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -0.82f)
                arcTo(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                horizontalLineTo(4f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -0.81f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(16.19f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                horizontalLineTo(2.2f)
                lineTo(0.02f, 9.78f)
                lineTo(0f, 11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineTo(5f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.38f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                horizontalLineToRelative(2f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.36f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(10f)
                lineTo(21.8f, 0f)
                close()
            }
        }.also { _Shop = it}

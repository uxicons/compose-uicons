package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelicopterSide: ImageVector? = null

val Icons.Sr.HelicopterSide: ImageVector
    get() = _HelicopterSide ?: UXIcon(name = "HelicopterSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(19f, 21f)
                lineTo(19f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, -4f)
                lineTo(17f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(14f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                reflectiveCurveTo(0.01f, 7.18f, 0.04f, 7.26f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.9f, 10.58f)
                lineTo(7f, 11.75f)
                lineTo(7f, 13f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5.65f)
                lineTo(11f, 21f)
                lineTo(7f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(21f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(13f, 21f)
                close()
                moveTo(16f, 6f)
                lineTo(14f, 6f)
                lineTo(14f, 4f)
                lineTo(7f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(16f, 4f)
                close()
                moveTo(16f, 12f)
                lineTo(16f, 6f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.93f, 7f)
                lineTo(17f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                close()
            }
        }.also { _HelicopterSide = it}

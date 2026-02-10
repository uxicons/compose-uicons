package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelicopterSide: ImageVector? = null

val Icons.Rr.HelicopterSide: ImageVector
    get() = _HelicopterSide ?: UXIcon(name = "HelicopterSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(16f, 4f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(16f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(7f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                horizontalLineToRelative(7f)
                lineTo(14f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                reflectiveCurveTo(0.01f, 7.18f, 0.04f, 7.26f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.9f, 10.58f)
                lineTo(7f, 11.75f)
                lineTo(7f, 13f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5.66f)
                lineTo(11f, 21f)
                lineTo(7f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(21f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(19f, 21f)
                lineTo(19f, 19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14f)
                close()
                moveTo(21.92f, 13f)
                lineTo(17f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(16f, 8f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.92f, 13f)
                close()
                moveTo(9f, 13f)
                lineTo(9f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.72f, -0.96f)
                lineTo(3.45f, 8.66f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -0.66f)
                lineTo(14f, 8f)
                verticalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4.83f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 17f)
                lineTo(13f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13f)
                close()
                moveTo(17f, 21f)
                lineTo(13f, 21f)
                lineTo(13f, 19f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _HelicopterSide = it}

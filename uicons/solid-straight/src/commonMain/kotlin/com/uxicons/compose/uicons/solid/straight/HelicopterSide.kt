package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelicopterSide: ImageVector? = null

val Icons.Ss.HelicopterSide: ImageVector
    get() = _HelicopterSide ?: UXIcon(name = "HelicopterSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                lineTo(16f, 6f)
                lineTo(14f, 6f)
                lineTo(14f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 2f)
                horizontalLineToRelative(8f)
                lineTo(14f, 1f)
                horizontalLineToRelative(2f)
                lineTo(16f, 2f)
                horizontalLineToRelative(8f)
                lineTo(24f, 4f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(7.93f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                close()
                moveTo(2f, 6f)
                lineTo(14f, 6f)
                verticalLineToRelative(9f)
                lineTo(24f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(19f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(7f, 23f)
                lineTo(7f, 21f)
                horizontalLineToRelative(4f)
                lineTo(11f, 18.65f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13f)
                lineTo(7f, 11.75f)
                lineToRelative(-7f, -2f)
                lineTo(0f, 4f)
                lineTo(2f, 4f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(17f, 19f)
                close()
            }
        }.also { _HelicopterSide = it}

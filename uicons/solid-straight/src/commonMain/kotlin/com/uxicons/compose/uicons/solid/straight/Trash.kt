package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trash: ImageVector? = null

val Icons.Ss.Trash: ImageVector
    get() = _Trash ?: UXIcon(name = "Trash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                lineTo(17f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(9f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 2f)
                lineTo(7f, 4f)
                lineTo(2f, 4f)
                lineTo(2f, 6f)
                lineTo(4f, 6f)
                lineTo(4f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(17f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(20f, 6f)
                horizontalLineToRelative(2f)
                lineTo(22f, 4f)
                close()
                moveTo(11f, 17f)
                lineTo(9f, 17f)
                lineTo(9f, 11f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 17f)
                lineTo(13f, 17f)
                lineTo(13f, 11f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Trash = it}

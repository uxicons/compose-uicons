package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comment: ImageVector? = null

val Icons.Ss.Comment: ImageVector
    get() = _Comment ?: UXIcon(name = "Comment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.31f)
                lineTo(24f, 24f)
                lineTo(12.02f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 11.25f)
                close()
                moveTo(13f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 9f)
                horizontalLineToRelative(6f)
                close()
                moveTo(17f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(2f)
                lineTo(17f, 13f)
                close()
                moveTo(17f, 15f)
                lineTo(7f, 15f)
                verticalLineToRelative(2f)
                lineTo(17f, 17f)
                close()
            }
        }.also { _Comment = it}

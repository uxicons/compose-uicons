package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archive: ImageVector? = null

val Icons.Bs.Archive: ImageVector
    get() = _Archive ?: UXIcon(name = "Archive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0f)
                close()
                moveTo(19f, 3f)
                verticalLineToRelative(8f)
                lineTo(5f, 11f)
                lineTo(5f, 3f)
                close()
                moveTo(5f, 21f)
                lineTo(5f, 14f)
                lineTo(19f, 14f)
                verticalLineToRelative(7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Archive = it}

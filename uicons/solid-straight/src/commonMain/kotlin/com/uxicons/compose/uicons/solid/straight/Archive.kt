package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archive: ImageVector? = null

val Icons.Ss.Archive: ImageVector
    get() = _Archive ?: UXIcon(name = "Archive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 0f)
                close()
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 13f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 13f)
                close()
                moveTo(14f, 19f)
                lineTo(10f, 19f)
                lineTo(10f, 17f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Archive = it}

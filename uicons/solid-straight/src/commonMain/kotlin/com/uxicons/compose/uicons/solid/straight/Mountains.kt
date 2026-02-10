package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Ss.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                close()
                moveTo(11f, 24f)
                verticalLineTo(22.78f)
                lineToRelative(4.28f, -9.34f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.45f, 0f)
                lineTo(24f, 22.74f)
                verticalLineToRelative(1.22f)
                close()
                moveTo(12.25f, 6.54f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.81f, 0f)
                lineTo(0f, 22.78f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                lineToRelative(4.46f, -9.4f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, -1.34f)
                close()
            }
        }.also { _Mountains = it}

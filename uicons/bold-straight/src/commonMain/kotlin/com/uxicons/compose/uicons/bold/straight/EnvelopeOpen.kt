package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeOpen: ImageVector? = null

val Icons.Bs.EnvelopeOpen: ImageVector
    get() = _EnvelopeOpen ?: UXIcon(name = "EnvelopeOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.66f, 8.16f)
                lineToRelative(-6.89f, -6.6f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.5f, -0.02f)
                lineTo(1.35f, 8.16f)
                arcTo(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(11.31f)
                arcTo(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.66f, 8.16f)
                close()
                moveTo(10.36f, 3.68f)
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.3f, 0.02f)
                lineToRelative(5.92f, 5.67f)
                lineTo(13.64f, 15.32f)
                arcToRelative(2.38f, 2.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 0f)
                lineTo(4.42f, 9.38f)
                close()
                moveTo(3f, 21f)
                verticalLineTo(12.2f)
                lineToRelative(5.24f, 5.24f)
                arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 0f)
                lineTo(21f, 12.2f)
                verticalLineTo(21f)
                close()
            }
        }.also { _EnvelopeOpen = it}

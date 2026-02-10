package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Rs.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.77f, 9.46f)
                lineTo(4.98f, 0.02f)
                verticalLineToRelative(24f)
                lineToRelative(14.78f, -9.47f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -5.09f)
                close()
                moveTo(18.68f, 12.85f)
                lineTo(6.99f, 20.35f)
                lineTo(6.99f, 3.68f)
                lineToRelative(11.71f, 7.47f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 1.7f)
                close()
            }
        }.also { _Play = it}

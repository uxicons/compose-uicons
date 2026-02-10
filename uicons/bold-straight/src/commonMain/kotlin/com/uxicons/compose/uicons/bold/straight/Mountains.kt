package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Bs.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                close()
                moveTo(24f, 24f)
                lineTo(10f, 24f)
                lineTo(10f, 21.66f)
                lineTo(14.34f, 12.7f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.34f, 0.03f)
                lineTo(24f, 21.66f)
                close()
                moveTo(13.64f, 21f)
                lineTo(20.35f, 21f)
                lineToRelative(-3.38f, -6.99f)
                close()
                moveTo(13.24f, 7.02f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.3f, 0f)
                lineTo(0f, 22.17f)
                lineTo(0f, 24f)
                lineTo(8f, 24f)
                lineTo(8f, 21f)
                lineTo(3.81f, 21f)
                lineTo(9.66f, 8.27f)
                arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.85f, 0f)
                lineToRelative(1.83f, 3.98f)
                lineToRelative(0.16f, -0.35f)
                arcToRelative(4.92f, 4.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.97f, -2.19f)
                close()
            }
        }.also { _Mountains = it}

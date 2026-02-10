package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subtitles: ImageVector? = null

val Icons.Ss.Subtitles: ImageVector
    get() = _Subtitles ?: UXIcon(name = "Subtitles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                close()
                moveTo(4f, 10f)
                lineTo(7f, 10f)
                verticalLineToRelative(2f)
                lineTo(4f, 12f)
                close()
                moveTo(15f, 17f)
                lineTo(4f, 17f)
                lineTo(4f, 15f)
                lineTo(15f, 15f)
                close()
                moveTo(20f, 17f)
                lineTo(17f, 17f)
                lineTo(17f, 15f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 10f)
                lineTo(20f, 10f)
                close()
            }
        }.also { _Subtitles = it}

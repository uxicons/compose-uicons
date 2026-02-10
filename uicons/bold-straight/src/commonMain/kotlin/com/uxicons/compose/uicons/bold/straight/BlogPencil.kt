package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlogPencil: ImageVector? = null

val Icons.Bs.BlogPencil: ImageVector
    get() = _BlogPencil ?: UXIcon(name = "BlogPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                verticalLineToRelative(12.59f)
                lineToRelative(-3f, -3f)
                lineTo(21f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                lineTo(13.09f, 19f)
                lineToRelative(3f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(16.09f, 13f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(3.09f)
                lineToRelative(7.28f, 7.28f)
                curveToRelative(0.85f, 0.85f, 2.23f, 0.85f, 3.09f, 0f)
                reflectiveCurveToRelative(0.85f, -2.23f, 0f, -3.09f)
                lineToRelative(-7.28f, -7.28f)
                close()
            }
        }.also { _BlogPencil = it}

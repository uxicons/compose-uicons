package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Rs.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.71f, 24f)
                horizontalLineToRelative(2.16f)
                lineTo(14.86f, 1.66f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.15f, 0f, -2.17f, 0.64f, -2.71f, 1.72f)
                lineTo(0.17f, 24f)
                horizontalLineTo(2.33f)
                lineToRelative(2.92f, -7f)
                horizontalLineToRelative(13.64f)
                lineToRelative(2.82f, 7f)
                close()
                moveTo(6.09f, 15f)
                lineTo(11.28f, 2.55f)
                curveToRelative(0.17f, -0.35f, 0.51f, -0.55f, 0.89f, -0.55f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, 0f, 0.72f, 0.21f, 0.86f, 0.48f)
                lineToRelative(5.05f, 12.52f)
                horizontalLineTo(6.09f)
                close()
            }
        }.also { _A = it}

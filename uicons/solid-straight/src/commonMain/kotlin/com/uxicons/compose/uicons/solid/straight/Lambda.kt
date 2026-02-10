package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Ss.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.74f, 22f)
                curveToRelative(-0.38f, 0f, -0.72f, -0.21f, -0.9f, -0.55f)
                lineTo(9.95f, 1.66f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(-3.26f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.26f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.9f, 0.55f)
                lineToRelative(2.19f, 4.39f)
                lineTo(1.5f, 24f)
                horizontalLineToRelative(2.25f)
                lineToRelative(7.71f, -14.84f)
                lineToRelative(6.59f, 13.18f)
                curveToRelative(0.51f, 1.02f, 1.54f, 1.66f, 2.68f, 1.66f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.26f)
                close()
            }
        }.also { _Lambda = it}

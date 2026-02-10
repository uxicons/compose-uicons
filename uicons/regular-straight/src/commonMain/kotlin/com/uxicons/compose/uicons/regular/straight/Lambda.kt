package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Rs.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-1.14f, 0f, -2.17f, -0.64f, -2.68f, -1.66f)
                lineToRelative(-6.59f, -13.18f)
                lineToRelative(-7.71f, 14.84f)
                horizontalLineTo(1.5f)
                lineTo(10.35f, 6.94f)
                lineToRelative(-2.19f, -4.39f)
                curveToRelative(-0.17f, -0.34f, -0.51f, -0.55f, -0.9f, -0.55f)
                horizontalLineToRelative(-3.26f)
                verticalLineTo(0f)
                horizontalLineToRelative(3.26f)
                curveToRelative(1.14f, 0f, 2.17f, 0.64f, 2.68f, 1.66f)
                lineToRelative(9.89f, 19.79f)
                curveToRelative(0.17f, 0.34f, 0.51f, 0.55f, 0.9f, 0.55f)
                horizontalLineToRelative(3.26f)
                close()
            }
        }.also { _Lambda = it}

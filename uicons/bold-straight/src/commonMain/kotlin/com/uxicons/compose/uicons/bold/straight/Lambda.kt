package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Bs.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-1.31f, 0f, -2.5f, -0.72f, -3.1f, -1.89f)
                lineToRelative(-6.12f, -11.79f)
                lineToRelative(-7.1f, 13.68f)
                horizontalLineTo(1f)
                lineTo(9.79f, 7.07f)
                lineToRelative(-1.97f, -3.8f)
                curveToRelative(-0.09f, -0.17f, -0.26f, -0.27f, -0.44f, -0.27f)
                horizontalLineToRelative(-3.38f)
                verticalLineTo(0f)
                horizontalLineToRelative(3.38f)
                curveToRelative(1.31f, 0f, 2.5f, 0.72f, 3.11f, 1.89f)
                lineToRelative(9.79f, 18.84f)
                curveToRelative(0.09f, 0.17f, 0.26f, 0.27f, 0.44f, 0.27f)
                horizontalLineToRelative(3.29f)
                close()
            }
        }.also { _Lambda = it}

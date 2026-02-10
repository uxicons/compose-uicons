package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Ss.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 5.08f)
                curveToRelative(1.06f, -0.7f, 2.91f, -2.2f, 2.91f, -4.28f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                verticalLineTo(0.8f)
                curveToRelative(0f, 2.08f, 1.85f, 3.59f, 2.91f, 4.28f)
                curveTo(5.55f, 5.91f, 1f, 12.63f, 1f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(10f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -5.37f, -4.55f, -12.09f, -9.91f, -12.92f)
                close()
            }
        }.also { _Sack = it}

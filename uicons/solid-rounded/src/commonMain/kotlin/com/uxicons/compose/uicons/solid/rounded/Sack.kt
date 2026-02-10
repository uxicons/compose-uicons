package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Sr.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.05f, 5.08f)
                curveToRelative(0.97f, -0.91f, 2.34f, -2.36f, 2.89f, -3.74f)
                curveToRelative(0.26f, -0.64f, -0.26f, -1.33f, -0.95f, -1.33f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.69f, 0f, -1.2f, 0.69f, -0.95f, 1.33f)
                curveToRelative(0.55f, 1.38f, 1.92f, 2.83f, 2.89f, 3.74f)
                curveTo(5.57f, 5.88f, 1f, 12.62f, 1f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(10f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -5.38f, -4.57f, -12.12f, -9.95f, -12.92f)
                close()
            }
        }.also { _Sack = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _D: ImageVector? = null

val Icons.Ss.D: ImageVector
    get() = _D ?: UXIcon(name = "D") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(7f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _D = it}

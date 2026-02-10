package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _D: ImageVector? = null

val Icons.Tr.D: ImageVector
    get() = _D ?: UXIcon(name = "D") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 24f)
                horizontalLineTo(6.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(5.79f, 0f, 10.5f, 4.71f, 10.5f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 5.79f, -4.71f, 10.5f, -10.5f, 10.5f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(5.24f, 0f, 9.5f, -4.26f, 9.5f, -9.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -5.24f, -4.26f, -9.5f, -9.5f, -9.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.also { _D = it}

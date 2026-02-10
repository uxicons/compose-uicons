package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsSquare: ImageVector? = null

val Icons.Ts.BracketsSquare: ImageVector
    get() = _BracketsSquare ?: UXIcon(name = "BracketsSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 0f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(1f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _BracketsSquare = it}

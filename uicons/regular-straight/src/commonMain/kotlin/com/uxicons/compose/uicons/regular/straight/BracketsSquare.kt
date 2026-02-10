package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsSquare: ImageVector? = null

val Icons.Rs.BracketsSquare: ImageVector
    get() = _BracketsSquare ?: UXIcon(name = "BracketsSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 0f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineTo(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _BracketsSquare = it}

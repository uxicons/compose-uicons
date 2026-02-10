package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plus: ImageVector? = null

val Icons.Sr.Plus: ImageVector
    get() = _Plus ?: UXIcon(name = "Plus", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(490.67f, 234.67f)
                horizontalLineTo(277.33f)
                verticalLineTo(21.33f)
                curveTo(277.33f, 9.55f, 267.78f, 0f, 256f, 0f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(213.33f)
                horizontalLineTo(21.33f)
                curveTo(9.55f, 234.67f, 0f, 244.22f, 0f, 256f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                horizontalLineToRelative(213.33f)
                verticalLineToRelative(213.33f)
                curveToRelative(0f, 11.78f, 9.55f, 21.33f, 21.33f, 21.33f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                verticalLineTo(277.33f)
                horizontalLineToRelative(213.33f)
                curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
                curveTo(512f, 244.22f, 502.45f, 234.67f, 490.67f, 234.67f)
                close()
            }
        }.also { _Plus = it}

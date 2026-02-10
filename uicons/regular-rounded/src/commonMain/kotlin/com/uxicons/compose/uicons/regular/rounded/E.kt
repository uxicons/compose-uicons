package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _E: ImageVector? = null

val Icons.Rr.E: ImageVector
    get() = _E ?: UXIcon(name = "E") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 22f)
                horizontalLineTo(7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(13f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineTo(7f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                close()
            }
        }.also { _E = it}

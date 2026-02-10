package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _T: ImageVector? = null

val Icons.Rr.T: ImageVector
    get() = _T ?: UXIcon(name = "T") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                verticalLineTo(2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                close()
            }
        }.also { _T = it}

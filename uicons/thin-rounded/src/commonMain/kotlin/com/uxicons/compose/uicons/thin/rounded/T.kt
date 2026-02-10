package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _T: ImageVector? = null

val Icons.Tr.T: ImageVector
    get() = _T ?: UXIcon(name = "T") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.65f, -0.01f, -0.65f, 1.01f, 0f, 1f)
                horizontalLineTo(11.5f)
                verticalLineTo(23.5f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                close()
            }
        }.also { _T = it}

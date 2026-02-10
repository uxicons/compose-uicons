package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _I: ImageVector? = null

val Icons.Tr.I: ImageVector
    get() = _I ?: UXIcon(name = "I") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 23f)
                horizontalLineToRelative(-6f)
                verticalLineTo(1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.65f, -0.01f, -0.65f, 1.01f, 0f, 1f)
                horizontalLineToRelative(6f)
                verticalLineTo(23f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.65f, -0.01f, -0.65f, 1.01f, 0f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                close()
            }
        }.also { _I = it}

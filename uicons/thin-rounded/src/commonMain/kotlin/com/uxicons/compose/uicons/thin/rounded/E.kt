package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _E: ImageVector? = null

val Icons.Tr.E: ImageVector
    get() = _E ?: UXIcon(name = "E") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 23f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                horizontalLineTo(3f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                horizontalLineTo(6.5f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.65f, 0.01f, 0.65f, -1.01f, 0f, -1f)
                close()
            }
        }.also { _E = it}

package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _J: ImageVector? = null

val Icons.Tr.J: ImageVector
    get() = _J ?: UXIcon(name = "J") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 24f)
                horizontalLineTo(6.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(0.5f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                verticalLineTo(19.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _J = it}

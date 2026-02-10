package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _4: ImageVector? = null

val Icons.Bs.Four: ImageVector
    get() = _4 ?: UXIcon(name = "4") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 0f)
            verticalLineTo(12f)
            horizontalLineTo(7.5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineTo(0f)
            horizontalLineToRelative(-3f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(9.5f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(3f)
            verticalLineTo(0f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.also { _4 = it }

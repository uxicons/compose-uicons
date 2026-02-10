package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Ts.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(0f)
                verticalLineToRelative(-0.5f)
                curveTo(0f, 5.61f, 5.61f, 0f, 12.5f, 0f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(13f)
                close()
                moveTo(1.01f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(1.01f)
                curveTo(6.06f, 1.27f, 1.27f, 6.06f, 1.01f, 12f)
                close()
            }
        }.also { _CircleQuarter = it}

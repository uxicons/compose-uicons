package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Rs.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                horizontalLineToRelative(1f)
                verticalLineTo(13f)
                close()
                moveTo(2.05f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(2.05f)
                curveTo(6.28f, 2.52f, 2.52f, 6.28f, 2.05f, 11f)
                close()
            }
        }.also { _CircleQuarter = it}

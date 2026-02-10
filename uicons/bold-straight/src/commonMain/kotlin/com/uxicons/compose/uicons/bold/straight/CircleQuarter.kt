package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Bs.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1.5f)
                curveTo(0f, 5.16f, 5.16f, 0f, 11.5f, 0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(13f)
                close()
                moveTo(3.13f, 10f)
                horizontalLineToRelative(6.87f)
                verticalLineTo(3.13f)
                curveToRelative(-3.49f, 0.62f, -6.24f, 3.38f, -6.87f, 6.87f)
                close()
            }
        }.also { _CircleQuarter = it}

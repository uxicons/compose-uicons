package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUp: ImageVector? = null

val Icons.Bs.ChartLineUp: ImageVector
    get() = _ChartLineUp ?: UXIcon(name = "ChartLineUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 21f)
                horizontalLineTo(24f)
                verticalLineToRelative(3f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(16f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-4.38f, 4.38f)
                lineToRelative(-4f, -4f)
                lineToRelative(-5.56f, 5.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.44f, -3.44f)
                lineToRelative(4f, 4f)
                lineToRelative(6.5f, -6.5f)
                verticalLineToRelative(2.88f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _ChartLineUp = it}

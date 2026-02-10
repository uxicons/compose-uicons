package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Bs.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.61f, 3.29f)
                lineToRelative(-2.82f, 6.21f)
                horizontalLineToRelative(4.22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.58f)
                lineToRelative(-4.3f, 9.45f)
                curveToRelative(-0.56f, 1.25f, -1.82f, 2.05f, -3.19f, 2.05f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(5.94f)
                curveToRelative(0.2f, 0f, 0.37f, -0.12f, 0.45f, -0.29f)
                lineToRelative(3.73f, -8.21f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.49f)
                lineToRelative(3.39f, -7.45f)
                curveToRelative(0.56f, -1.25f, 1.82f, -2.05f, 3.19f, -2.05f)
                horizontalLineToRelative(5.94f)
                verticalLineTo(3f)
                horizontalLineToRelative(-5.94f)
                curveToRelative(-0.2f, 0f, -0.37f, 0.12f, -0.45f, 0.29f)
                close()
            }
        }.also { _FlorinSign = it}

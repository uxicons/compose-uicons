package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallRight: ImageVector? = null

val Icons.Ts.ArrowSmallRight: ImageVector
    get() = _ArrowSmallRight ?: UXIcon(name = "ArrowSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.54f, 10.89f)
                lineToRelative(-4.72f, -4.72f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.62f, 4.62f)
                horizontalLineTo(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12.73f)
                lineToRelative(-4.62f, 4.62f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(4.72f, -4.72f)
                curveToRelative(0.3f, -0.3f, 0.46f, -0.69f, 0.46f, -1.11f)
                reflectiveCurveToRelative(-0.16f, -0.81f, -0.46f, -1.11f)
                close()
            }
        }.also { _ArrowSmallRight = it}

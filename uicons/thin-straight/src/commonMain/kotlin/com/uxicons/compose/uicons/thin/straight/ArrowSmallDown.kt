package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallDown: ImageVector? = null

val Icons.Ts.ArrowSmallDown: ImageVector
    get() = _ArrowSmallDown ?: UXIcon(name = "ArrowSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.12f, 13.12f)
                lineToRelative(-4.62f, 4.62f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12.73f)
                lineToRelative(-4.62f, -4.62f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.72f, 4.72f)
                curveToRelative(0.29f, 0.3f, 0.69f, 0.46f, 1.11f, 0.46f)
                reflectiveCurveToRelative(0.81f, -0.16f, 1.11f, -0.46f)
                lineToRelative(4.72f, -4.72f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _ArrowSmallDown = it}

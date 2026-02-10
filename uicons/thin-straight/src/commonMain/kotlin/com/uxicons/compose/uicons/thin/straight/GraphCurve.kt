package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphCurve: ImageVector? = null

val Icons.Ts.GraphCurve: ImageVector
    get() = _GraphCurve ?: UXIcon(name = "GraphCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.53f, 23f)
                horizontalLineToRelative(22.47f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(19.69f)
                curveToRelative(1.95f, -7.63f, 9.52f, -13.69f, 18f, -13.69f)
                horizontalLineToRelative(3.72f)
                lineToRelative(-3.56f, -3.64f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(3.72f, 3.81f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.53f, -0.0f, 2.12f)
                lineToRelative(-3.74f, 3.74f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.62f, -3.62f)
                horizontalLineToRelative(-3.76f)
                curveTo(9.86f, 7f, 1.83f, 14.42f, 1.53f, 23f)
                close()
            }
        }.also { _GraphCurve = it}

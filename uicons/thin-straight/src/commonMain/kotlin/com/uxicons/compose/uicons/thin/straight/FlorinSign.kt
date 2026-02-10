package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Ts.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.12f, 1.93f)
                lineToRelative(-3.89f, 8.57f)
                horizontalLineToRelative(5.77f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6.22f)
                lineToRelative(-4.99f, 10.98f)
                curveToRelative(-0.42f, 0.92f, -1.35f, 1.52f, -2.36f, 1.52f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5.43f)
                curveToRelative(0.62f, 0f, 1.19f, -0.37f, 1.45f, -0.93f)
                lineToRelative(4.8f, -10.57f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.13f)
                lineTo(16.21f, 1.52f)
                curveToRelative(0.42f, -0.92f, 1.35f, -1.52f, 2.36f, -1.52f)
                horizontalLineToRelative(5.43f)
                verticalLineTo(1f)
                horizontalLineToRelative(-5.43f)
                curveToRelative(-0.62f, 0f, -1.19f, 0.37f, -1.45f, 0.93f)
                close()
            }
        }.also { _FlorinSign = it}

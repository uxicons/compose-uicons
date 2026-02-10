package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _S: ImageVector? = null

val Icons.Ts.S: ImageVector
    get() = _S ?: UXIcon(name = "S") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.4f, 24f)
                horizontalLineTo(7.6f)
                curveToRelative(-3.09f, 0f, -5.6f, -2.51f, -5.6f, -5.6f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 2.54f, 2.06f, 4.6f, 4.6f, 4.6f)
                horizontalLineToRelative(8.8f)
                curveToRelative(2.54f, 0f, 4.6f, -2.06f, 4.6f, -4.6f)
                curveToRelative(0f, -2.1f, -1.42f, -3.93f, -3.46f, -4.46f)
                lineToRelative(-11.34f, -2.92f)
                curveToRelative(-2.48f, -0.64f, -4.21f, -2.87f, -4.21f, -5.42f)
                curveTo(2f, 2.51f, 4.51f, 0f, 7.6f, 0f)
                horizontalLineToRelative(8.8f)
                curveToRelative(3.09f, 0f, 5.6f, 2.51f, 5.6f, 5.6f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -2.54f, -2.06f, -4.6f, -4.6f, -4.6f)
                horizontalLineTo(7.6f)
                curveTo(5.06f, 1f, 3f, 3.06f, 3f, 5.6f)
                curveToRelative(0f, 2.1f, 1.42f, 3.93f, 3.46f, 4.46f)
                lineToRelative(11.34f, 2.92f)
                curveToRelative(2.48f, 0.64f, 4.21f, 2.87f, 4.21f, 5.42f)
                curveToRelative(0f, 3.09f, -2.51f, 5.6f, -5.6f, 5.6f)
                close()
            }
        }.also { _S = it}

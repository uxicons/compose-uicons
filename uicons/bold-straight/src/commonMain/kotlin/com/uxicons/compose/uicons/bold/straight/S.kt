package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _S: ImageVector? = null

val Icons.Bs.S: ImageVector
    get() = _S ?: UXIcon(name = "S") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.9f, 24f)
                horizontalLineToRelative(-7.81f)
                curveToRelative(-3.36f, 0f, -6.1f, -2.73f, -6.1f, -6.1f)
                verticalLineToRelative(-0.9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.9f)
                curveToRelative(0f, 1.71f, 1.39f, 3.1f, 3.1f, 3.1f)
                horizontalLineToRelative(7.81f)
                curveToRelative(1.71f, 0f, 3.1f, -1.39f, 3.1f, -3.1f)
                curveToRelative(0f, -1.37f, -0.92f, -2.6f, -2.24f, -2.98f)
                lineToRelative(-10.35f, -2.98f)
                curveToRelative(-2.6f, -0.75f, -4.41f, -3.15f, -4.41f, -5.86f)
                curveTo(2f, 2.73f, 4.73f, 0f, 8.1f, 0f)
                horizontalLineToRelative(7.81f)
                curveToRelative(3.36f, 0f, 6.1f, 2.73f, 6.1f, 6.1f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -1.71f, -1.39f, -3.1f, -3.1f, -3.1f)
                horizontalLineToRelative(-7.81f)
                curveToRelative(-1.71f, 0f, -3.1f, 1.39f, -3.1f, 3.1f)
                curveToRelative(0f, 1.37f, 0.92f, 2.6f, 2.24f, 2.98f)
                lineToRelative(10.35f, 2.98f)
                curveToRelative(2.6f, 0.75f, 4.41f, 3.15f, 4.41f, 5.86f)
                curveToRelative(0f, 3.36f, -2.73f, 6.1f, -6.1f, 6.1f)
                close()
            }
        }.also { _S = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateReverse: ImageVector? = null

val Icons.Bs.RotateReverse: ImageVector
    get() = _RotateReverse ?: UXIcon(name = "RotateReverse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 17.09f)
                verticalLineToRelative(5.91f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-2.23f, 2.23f, -5.27f, 3.53f, -8.47f, 3.53f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(2.4f, 0f, 4.68f, -0.98f, 6.35f, -2.65f)
                lineToRelative(-2.35f, -2.35f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.6f, 0f, 1.09f, 0.49f, 1.09f, 1.09f)
                close()
                moveTo(2.09f, 8f)
                horizontalLineToRelative(5.91f)
                lineToRelative(-2.35f, -2.35f)
                curveToRelative(1.68f, -1.67f, 3.95f, -2.65f, 6.35f, -2.65f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                horizontalLineToRelative(3f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveToRelative(-3.2f, 0f, -6.24f, 1.3f, -8.47f, 3.53f)
                lineTo(1f, 1f)
                verticalLineToRelative(5.91f)
                curveToRelative(0f, 0.6f, 0.49f, 1.09f, 1.09f, 1.09f)
                close()
            }
        }.also { _RotateReverse = it}

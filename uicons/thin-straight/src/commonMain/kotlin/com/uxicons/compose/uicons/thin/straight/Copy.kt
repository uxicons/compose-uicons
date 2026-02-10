package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copy: ImageVector? = null

val Icons.Ts.Copy: ImageVector
    get() = _Copy ?: UXIcon(name = "Copy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21f)
                lineTo(0f, 21f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(1f, 20f)
                horizontalLineToRelative(19f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(24f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(20f)
                lineTo(3f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(21f)
                lineTo(24f, 3f)
                close()
            }
        }.also { _Copy = it}

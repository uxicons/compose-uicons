package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _S: ImageVector? = null

val Icons.Tr.S: ImageVector
    get() = _S ?: UXIcon(name = "S") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.4f, 24f)
                horizontalLineTo(7.6f)
                curveToRelative(-3.09f, 0f, -5.6f, -2.51f, -5.6f, -5.6f)
                verticalLineToRelative(-0.9f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                verticalLineToRelative(0.9f)
                curveToRelative(0f, 2.54f, 2.06f, 4.6f, 4.6f, 4.6f)
                horizontalLineToRelative(8.8f)
                curveToRelative(5.37f, -0.06f, 6.32f, -7.67f, 1.15f, -9.06f)
                lineToRelative(-11.34f, -2.92f)
                curveTo(-0.1f, 9.33f, 1.07f, 0.08f, 7.6f, 0f)
                horizontalLineToRelative(8.8f)
                curveToRelative(3.09f, 0f, 5.6f, 2.51f, 5.6f, 5.6f)
                verticalLineToRelative(0.9f)
                curveToRelative(0.01f, 0.65f, -1.01f, 0.65f, -1f, 0f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0f, -2.54f, -2.06f, -4.6f, -4.6f, -4.6f)
                horizontalLineTo(7.6f)
                curveToRelative(-5.37f, 0.06f, -6.32f, 7.67f, -1.15f, 9.06f)
                lineToRelative(11.34f, 2.92f)
                curveToRelative(6.3f, 1.7f, 5.13f, 10.95f, -1.4f, 11.03f)
                close()
            }
        }.also { _S = it}

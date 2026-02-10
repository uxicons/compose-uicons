package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browsers: ImageVector? = null

val Icons.Sr.Browsers: ImageVector
    get() = _Browsers ?: UXIcon(name = "Browsers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.1f, 6f)
                curveToRelative(0.46f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                horizontalLineToRelative(9f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                lineTo(5.1f, 6f)
                close()
                moveTo(5f, 8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                lineTo(5f, 8f)
                close()
                moveTo(10f, 20f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                lineTo(3f, 7f)
                curveToRelative(0f, -0.2f, 0.01f, -0.4f, 0.03f, -0.59f)
                curveToRelative(-1.78f, 0.77f, -3.03f, 2.54f, -3.03f, 4.59f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(14f, 22f)
                curveToRelative(1.63f, 0f, 3.06f, -0.79f, 3.97f, -2f)
                horizontalLineToRelative(-7.97f)
                close()
            }
        }.also { _Browsers = it}

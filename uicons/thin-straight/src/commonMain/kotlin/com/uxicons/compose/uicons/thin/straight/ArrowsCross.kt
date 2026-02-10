package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsCross: ImageVector? = null

val Icons.Ts.ArrowsCross: ImageVector
    get() = _ArrowsCross ?: UXIcon(name = "ArrowsCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.11f, 10.81f)
                lineTo(0.04f, 0.75f)
                lineTo(0.75f, 0.04f)
                lineTo(10.81f, 10.11f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(23f, 22.29f)
                lineTo(13.9f, 13.2f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(9.1f, 9.1f)
                horizontalLineToRelative(-6.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.29f)
                close()
                moveTo(22.5f, 0f)
                horizontalLineToRelative(-6.5f)
                lineTo(16f, 1f)
                horizontalLineToRelative(6.29f)
                lineTo(0.04f, 23.25f)
                lineToRelative(0.71f, 0.71f)
                lineTo(23f, 1.71f)
                verticalLineToRelative(6.29f)
                horizontalLineToRelative(1f)
                lineTo(24f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowsCross = it}

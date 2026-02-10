package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputPipe: ImageVector? = null

val Icons.Ts.InputPipe: ImageVector
    get() = _InputPipe ?: UXIcon(name = "InputPipe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 7f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(15.5f)
                lineTo(0f, 21f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 5.5f)
                close()
            }
        }.also { _InputPipe = it}

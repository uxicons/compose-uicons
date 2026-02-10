package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputNumeric: ImageVector? = null

val Icons.Bs.InputNumeric: ImageVector
    get() = _InputNumeric ?: UXIcon(name = "InputNumeric") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.62f)
                lineToRelative(-1.28f, 1.32f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.21f, -3.3f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(16.5f)
                lineTo(0f, 22f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 5.5f)
                close()
            }
        }.also { _InputNumeric = it}

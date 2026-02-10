package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputNumeric: ImageVector? = null

val Icons.Ss.InputNumeric: ImageVector
    get() = _InputNumeric ?: UXIcon(name = "InputNumeric") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2.5f)
                lineTo(3f, 2.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.62f)
                lineToRelative(-1.28f, 1.32f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.21f, -3.3f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _InputNumeric = it}

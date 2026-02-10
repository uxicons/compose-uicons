package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Bs.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0.06f)
                lineTo(6f, 10.19f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-10.19f)
                lineToRelative(15f, 10.13f)
                lineTo(21f, 0.06f)
                close()
                moveTo(18f, 18.29f)
                lineToRelative(-9.32f, -6.29f)
                lineToRelative(9.32f, -6.29f)
                verticalLineToRelative(12.58f)
                close()
            }
        }.also { _StepBackward = it}

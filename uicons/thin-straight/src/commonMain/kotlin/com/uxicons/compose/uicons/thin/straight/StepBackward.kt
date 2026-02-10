package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Ts.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0.07f)
                lineTo(4f, 11.4f)
                lineTo(4f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-11.4f)
                lineToRelative(17f, 11.33f)
                lineTo(21f, 0.07f)
                close()
                moveTo(20f, 22.07f)
                lineTo(4.9f, 12f)
                lineTo(20f, 1.93f)
                verticalLineToRelative(20.13f)
                close()
            }
        }.also { _StepBackward = it}

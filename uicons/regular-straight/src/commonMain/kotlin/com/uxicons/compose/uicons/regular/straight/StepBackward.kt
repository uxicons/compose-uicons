package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Rs.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, -0.01f)
                lineTo(5f, 10.79f)
                lineTo(5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10.79f)
                lineToRelative(16f, 10.8f)
                lineTo(21f, -0.01f)
                close()
                moveTo(19f, 20.25f)
                lineTo(6.79f, 12f)
                lineTo(19f, 3.75f)
                verticalLineToRelative(16.49f)
                close()
            }
        }.also { _StepBackward = it}

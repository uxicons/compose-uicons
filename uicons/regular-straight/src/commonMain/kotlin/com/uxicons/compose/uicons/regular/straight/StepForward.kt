package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Rs.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                verticalLineToRelative(10.79f)
                lineTo(3f, -0.01f)
                verticalLineToRelative(24.02f)
                lineToRelative(16f, -10.8f)
                verticalLineToRelative(10.79f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(5f, 20.25f)
                verticalLineTo(3.75f)
                lineToRelative(12.21f, 8.24f)
                lineToRelative(-12.21f, 8.24f)
                close()
            }
        }.also { _StepForward = it}

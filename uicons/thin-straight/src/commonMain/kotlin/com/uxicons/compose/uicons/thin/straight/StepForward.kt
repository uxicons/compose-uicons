package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Ts.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                verticalLineToRelative(11.4f)
                lineTo(3f, 0.07f)
                verticalLineToRelative(23.87f)
                lineToRelative(17f, -11.33f)
                verticalLineToRelative(11.4f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(4f, 22.07f)
                verticalLineTo(1.93f)
                lineToRelative(15.1f, 10.07f)
                lineToRelative(-15.1f, 10.07f)
                close()
            }
        }.also { _StepForward = it}

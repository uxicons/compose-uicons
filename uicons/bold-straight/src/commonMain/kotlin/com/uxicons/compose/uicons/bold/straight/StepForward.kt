package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Bs.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                verticalLineToRelative(10.19f)
                lineTo(3f, 0.06f)
                verticalLineToRelative(23.87f)
                lineToRelative(15f, -10.13f)
                verticalLineToRelative(10.19f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6f, 18.29f)
                verticalLineTo(5.71f)
                lineToRelative(9.32f, 6.29f)
                lineToRelative(-9.32f, 6.29f)
                close()
            }
        }.also { _StepForward = it}

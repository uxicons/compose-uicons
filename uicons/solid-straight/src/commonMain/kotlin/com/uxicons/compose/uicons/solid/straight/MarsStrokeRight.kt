package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Ss.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 10.59f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.5f, 2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.08f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6f, -6.92f, -6f)
                curveTo(3.14f, 5f, 0f, 8.14f, 0f, 12f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                curveToRelative(3.52f, 0f, 6.43f, -2.61f, 6.92f, -6f)
                horizontalLineToRelative(1.08f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _MarsStrokeRight = it}

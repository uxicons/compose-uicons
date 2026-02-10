package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Ss.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21.56f)
                verticalLineToRelative(-12.52f)
                lineToRelative(0.67f, -0.24f)
                curveToRelative(1.4f, -0.49f, 2.33f, -1.82f, 2.33f, -3.3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.48f, 0.94f, 2.81f, 2.33f, 3.3f)
                lineToRelative(0.63f, 0.22f)
                lineTo(3f, 21.56f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-12.56f)
                lineTo(3f, 24f)
                close()
            }
        }.also { _ShirtRunning = it}

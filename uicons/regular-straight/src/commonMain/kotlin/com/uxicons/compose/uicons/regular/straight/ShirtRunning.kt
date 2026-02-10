package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Rs.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.33f, 8.8f)
                curveToRelative(-1.4f, -0.49f, -2.33f, -1.82f, -2.33f, -3.3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.48f, -0.94f, 2.81f, -2.33f, 3.3f)
                lineToRelative(-0.67f, 0.24f)
                verticalLineToRelative(14.96f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-14.96f)
                lineToRelative(-0.67f, -0.24f)
                close()
                moveTo(7.45f, 7.9f)
                curveToRelative(1.1f, 1.28f, 2.73f, 2.1f, 4.55f, 2.1f)
                reflectiveCurveToRelative(3.45f, -0.81f, 4.55f, -2.1f)
                curveToRelative(0.52f, 1.06f, 1.37f, 1.95f, 2.45f, 2.5f)
                verticalLineToRelative(0.09f)
                lineToRelative(-14f, 10.06f)
                verticalLineToRelative(-10.15f)
                curveToRelative(1.08f, -0.55f, 1.93f, -1.44f, 2.45f, -2.5f)
                close()
                moveTo(6.41f, 22f)
                lineToRelative(12.59f, -9.05f)
                verticalLineToRelative(9.05f)
                lineTo(6.41f, 22f)
                close()
            }
        }.also { _ShirtRunning = it}

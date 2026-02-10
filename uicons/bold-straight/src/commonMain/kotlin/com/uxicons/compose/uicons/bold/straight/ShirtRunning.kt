package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Bs.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7.83f)
                curveToRelative(-1.2f, -0.42f, -2f, -1.56f, -2f, -2.83f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.27f, -0.8f, 2.41f, -2f, 2.83f)
                lineToRelative(-1f, 0.35f)
                verticalLineToRelative(15.82f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-15.82f)
                lineToRelative(-1f, -0.35f)
                close()
                moveTo(7.93f, 8.41f)
                curveToRelative(1.07f, 0.99f, 2.5f, 1.59f, 4.07f, 1.59f)
                reflectiveCurveToRelative(3.0f, -0.6f, 4.07f, -1.59f)
                curveToRelative(0.43f, 0.62f, 0.98f, 1.17f, 1.62f, 1.59f)
                lineToRelative(-11.69f, 8.96f)
                verticalLineToRelative(-8.76f)
                curveToRelative(0.78f, -0.45f, 1.44f, -1.06f, 1.94f, -1.79f)
                close()
                moveTo(8.27f, 21f)
                lineToRelative(9.73f, -7.46f)
                verticalLineToRelative(7.46f)
                horizontalLineToRelative(-9.73f)
                close()
            }
        }.also { _ShirtRunning = it}

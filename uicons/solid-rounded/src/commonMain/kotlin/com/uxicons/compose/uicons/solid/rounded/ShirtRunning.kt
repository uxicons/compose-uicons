package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Sr.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.69f, 21.49f)
                curveToRelative(-0.43f, -0.74f, -0.69f, -1.58f, -0.69f, -2.49f)
                verticalLineToRelative(-8.03f)
                curveToRelative(0f, -1.02f, 0.52f, -1.98f, 1.35f, -2.5f)
                curveToRelative(1.03f, -0.65f, 1.65f, -1.76f, 1.65f, -2.97f)
                lineTo(6f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.22f, 0.62f, 2.33f, 1.65f, 2.97f)
                curveToRelative(0.36f, 0.23f, 0.66f, 0.55f, 0.88f, 0.92f)
                lineTo(3.69f, 21.49f)
                close()
                moveTo(5.03f, 23.0f)
                curveToRelative(0.83f, 0.62f, 1.86f, 1.0f, 2.98f, 1.0f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-7.49f)
                lineToRelative(-15.97f, 11.48f)
                close()
            }
        }.also { _ShirtRunning = it}

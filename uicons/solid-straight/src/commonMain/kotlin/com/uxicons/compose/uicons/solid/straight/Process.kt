package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Process: ImageVector? = null

val Icons.Ss.Process: ImageVector
    get() = _Process ?: UXIcon(name = "Process") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-2.97f, 0f, -5.82f, -1.13f, -8f, -3.08f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.12f)
                curveToRelative(1.87f, 1.89f, 4.43f, 3f, 7.12f, 3f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.69f, 0f, 5.25f, 1.11f, 7.12f, 3f)
                horizontalLineToRelative(-4.12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.08f)
                curveToRelative(-2.18f, -1.95f, -5.03f, -3.08f, -8f, -3.08f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                close()
                moveTo(17.7f, 9.87f)
                lineToRelative(-1.42f, 0.82f)
                curveToRelative(0.13f, 0.42f, 0.22f, 0.85f, 0.22f, 1.31f)
                reflectiveCurveToRelative(-0.09f, 0.9f, -0.22f, 1.31f)
                lineToRelative(1.42f, 0.82f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-1.41f, -0.81f)
                curveToRelative(-0.6f, 0.65f, -1.39f, 1.12f, -2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(-0.9f, -0.2f, -1.69f, -0.68f, -2.29f, -1.33f)
                lineToRelative(-1.41f, 0.81f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(1.42f, -0.82f)
                curveToRelative(-0.13f, -0.42f, -0.22f, -0.85f, -0.22f, -1.31f)
                reflectiveCurveToRelative(0.09f, -0.9f, 0.22f, -1.31f)
                lineToRelative(-1.42f, -0.82f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.41f, 0.81f)
                curveToRelative(0.6f, -0.65f, 1.39f, -1.12f, 2.29f, -1.33f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.62f)
                curveToRelative(0.9f, 0.2f, 1.69f, 0.68f, 2.29f, 1.33f)
                lineToRelative(1.41f, -0.81f)
                lineToRelative(1.0f, 1.73f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Process = it}

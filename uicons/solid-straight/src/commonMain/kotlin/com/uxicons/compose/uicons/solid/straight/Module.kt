package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Module: ImageVector? = null

val Icons.Ss.Module: ImageVector
    get() = _Module ?: UXIcon(name = "Module") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 18f)
                curveToRelative(0f, -0.46f, -0.09f, -0.9f, -0.22f, -1.31f)
                lineToRelative(1.42f, -0.82f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.41f, 0.81f)
                curveToRelative(-0.6f, -0.65f, -1.39f, -1.12f, -2.29f, -1.33f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.62f)
                curveToRelative(-0.9f, 0.2f, -1.69f, 0.68f, -2.29f, 1.33f)
                lineToRelative(-1.41f, -0.81f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.42f, 0.82f)
                curveToRelative(-0.13f, 0.42f, -0.22f, 0.85f, -0.22f, 1.31f)
                reflectiveCurveToRelative(0.09f, 0.9f, 0.22f, 1.31f)
                lineToRelative(-1.42f, 0.82f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.41f, -0.81f)
                curveToRelative(0.6f, 0.65f, 1.39f, 1.12f, 2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0.9f, -0.2f, 1.69f, -0.68f, 2.29f, -1.33f)
                lineToRelative(1.41f, 0.81f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.42f, -0.82f)
                curveToRelative(0.13f, -0.42f, 0.22f, -0.85f, 0.22f, -1.31f)
                close()
                moveTo(18f, 19.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16f, 6.82f)
                verticalLineToRelative(3.44f)
                curveToRelative(-3.45f, 0.89f, -6f, 4.01f, -6f, 7.74f)
                curveToRelative(0f, 0.12f, 0.01f, 0.24f, 0.02f, 0.36f)
                lineToRelative(-1.02f, 0.6f)
                lineToRelative(-0.01f, -8.11f)
                lineToRelative(7.01f, -4.03f)
                close()
                moveTo(0f, 4.65f)
                verticalLineToRelative(-0.1f)
                lineTo(8f, -0.02f)
                lineToRelative(7.96f, 4.55f)
                lineToRelative(-8.05f, 4.62f)
                lineTo(0f, 4.65f)
                close()
                moveTo(6.99f, 18.97f)
                lineToRelative(-2.99f, -1.71f)
                lineTo(0f, 14.97f)
                lineTo(0f, 6.95f)
                lineToRelative(6.99f, 3.98f)
                lineToRelative(0.01f, 8.04f)
                close()
            }
        }.also { _Module = it}

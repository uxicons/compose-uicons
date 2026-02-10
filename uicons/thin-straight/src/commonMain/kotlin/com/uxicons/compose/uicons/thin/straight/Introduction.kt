package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Ts.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 13f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(8f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(15f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(0f, 16f)
                lineTo(0f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(4f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(22f, 0f)
                lineToRelative(-6.0f, 0.0f)
                curveToRelative(-1.1f, 0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(7.71f)
                curveToRelative(0.0f, 0.47f, 0.26f, 0.9f, 0.67f, 1.13f)
                curveToRelative(0.19f, 0.1f, 0.41f, 0.16f, 0.62f, 0.16f)
                curveToRelative(0.24f, 0f, 0.48f, -0.07f, 0.69f, -0.2f)
                lineToRelative(1.73f, -1.79f)
                lineToRelative(6.29f, -0.01f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(23f, 8f)
                lineToRelative(-5.71f, 0.01f)
                lineToRelative(-1.88f, 1.97f)
                curveToRelative(-0.11f, 0.05f, -0.21f, 0.01f, -0.25f, -0.01f)
                curveToRelative(-0.04f, -0.03f, -0.15f, -0.1f, -0.15f, -0.25f)
                lineTo(15.0f, 2.0f)
                curveToRelative(-0.0f, -0.55f, 0.45f, -1f, 1.0f, -1.0f)
                lineToRelative(6f, -0.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Introduction = it}

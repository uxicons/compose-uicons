package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StoreLock: ImageVector? = null

val Icons.Ss.StoreLock: ImageVector
    get() = _StoreLock ?: UXIcon(name = "StoreLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(11.04f, 24.02f)
                lineTo(4f, 24.02f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7.83f)
                curveToRelative(0.88f, 0.51f, 1.91f, 0.81f, 3f, 0.81f)
                horizontalLineToRelative(1f)
                curveToRelative(1.06f, 0f, 2.1f, -0.29f, 3f, -0.82f)
                curveToRelative(0.62f, 0.36f, 1.3f, 0.6f, 2f, 0.72f)
                verticalLineToRelative(7.1f)
                curveToRelative(0f, 1.14f, 0.4f, 2.18f, 1.04f, 3.02f)
                close()
                moveTo(0f, 8f)
                lineToRelative(0.02f, -1.22f)
                lineTo(2.2f, 0.02f)
                lineTo(7f, 0.02f)
                lineTo(7f, 5f)
                horizontalLineToRelative(2f)
                lineTo(9f, 0.02f)
                horizontalLineToRelative(6f)
                lineTo(15f, 5f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0.02f)
                horizontalLineToRelative(4.8f)
                lineToRelative(2.2f, 6.98f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.83f, -0.26f, 1.6f, -0.69f, 2.24f)
                curveToRelative(-1.0f, -1.92f, -3.0f, -3.24f, -5.31f, -3.24f)
                curveToRelative(-2.97f, 0f, -5.44f, 2.17f, -5.92f, 5f)
                horizontalLineToRelative(-1.08f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
            }
        }.also { _StoreLock = it}

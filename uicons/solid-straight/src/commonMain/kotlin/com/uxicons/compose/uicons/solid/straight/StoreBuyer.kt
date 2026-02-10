package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StoreBuyer: ImageVector? = null

val Icons.Ss.StoreBuyer: ImageVector
    get() = _StoreBuyer ?: UXIcon(name = "StoreBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(14.5f, 15.5f)
                curveToRelative(0f, -0.65f, 0.14f, -1.26f, 0.39f, -1.82f)
                curveToRelative(-0.59f, 0.2f, -1.22f, 0.32f, -1.85f, 0.32f)
                horizontalLineToRelative(-2.08f)
                curveToRelative(-1.06f, 0f, -2.08f, -0.29f, -2.98f, -0.82f)
                curveToRelative(-0.9f, 0.53f, -1.93f, 0.82f, -2.98f, 0.82f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.09f, 0f, -2.12f, -0.3f, -3f, -0.81f)
                verticalLineToRelative(7.81f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.02f, 1.21f, -3.77f, 2.94f, -4.56f)
                curveToRelative(-0.28f, -0.59f, -0.44f, -1.25f, -0.44f, -1.94f)
                close()
                moveTo(21.62f, 0f)
                horizontalLineToRelative(-4.62f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 0f)
                lineTo(2.38f, 0f)
                lineTo(0f, 6.95f)
                verticalLineToRelative(1.09f)
                curveToRelative(0f, 2.19f, 1.79f, 3.96f, 4f, 3.96f)
                horizontalLineToRelative(1f)
                curveToRelative(1.19f, 0f, 2.25f, -0.55f, 2.98f, -1.39f)
                curveToRelative(0.73f, 0.85f, 1.79f, 1.39f, 2.98f, 1.39f)
                horizontalLineToRelative(2.08f)
                curveToRelative(1.19f, 0f, 2.25f, -0.55f, 2.98f, -1.39f)
                curveToRelative(0.29f, 0.34f, 0.65f, 0.61f, 1.04f, 0.84f)
                curveToRelative(0.59f, -0.28f, 1.25f, -0.45f, 1.94f, -0.45f)
                curveToRelative(0.9f, 0f, 1.74f, 0.27f, 2.44f, 0.72f)
                curveToRelative(1.49f, -0.57f, 2.56f, -2.0f, 2.56f, -3.68f)
                verticalLineToRelative(-1.09f)
                lineToRelative(-2.38f, -6.95f)
                close()
                moveTo(16.5f, 15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _StoreBuyer = it}

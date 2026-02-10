package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Japanese: ImageVector? = null

val Icons.Ss.Japanese: ImageVector
    get() = _Japanese ?: UXIcon(name = "Japanese") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                verticalLineToRelative(15f)
                lineTo(7.91f, 19f)
                lineToRelative(-1.91f, 1.27f)
                verticalLineToRelative(0.73f)
                horizontalLineToRelative(10.7f)
                lineToRelative(3.96f, 2.64f)
                curveToRelative(1.35f, 0.97f, 3.39f, -0.13f, 3.34f, -1.79f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12.17f, 6.78f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                close()
                moveTo(16f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(14.85f)
                curveToRelative(-0.05f, 1.66f, 1.98f, 2.75f, 3.34f, 1.79f)
                lineToRelative(3.96f, -2.64f)
                horizontalLineToRelative(11.7f)
                lineTo(19.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8.5f, 9.75f)
                curveToRelative(0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f)
                reflectiveCurveToRelative(-2.25f, -1.01f, -2.25f, -2.25f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.36f, 0.29f, 0.65f, 0.65f, 0.65f)
                reflectiveCurveToRelative(0.65f, -0.29f, 0.65f, -0.65f)
                lineTo(6.9f, 5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.75f)
                close()
                moveTo(13.33f, 12f)
                lineToRelative(-0.22f, -0.99f)
                horizontalLineToRelative(-2.15f)
                lineToRelative(-0.24f, 0.99f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(1.29f, -5.61f)
                curveToRelative(0.33f, -1.8f, 2.99f, -1.81f, 3.3f, 0.04f)
                lineToRelative(1.27f, 5.57f)
                horizontalLineToRelative(-1.67f)
                close()
            }
        }.also { _Japanese = it}

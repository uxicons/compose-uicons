package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Launch: ImageVector? = null

val Icons.Ss.Launch: ImageVector
    get() = _Launch ?: UXIcon(name = "Launch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.31f, 14f)
                lineToRelative(1.96f, -1.96f)
                horizontalLineToRelative(0.72f)
                verticalLineToRelative(1.96f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.96f)
                horizontalLineToRelative(0.74f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(1.2f, -1.2f)
                curveToRelative(0.31f, -1.79f, -0.08f, -3.62f, -1.42f, -5.01f)
                curveToRelative(-0.15f, -2.51f, -1.01f, -4.79f, -2.28f, -7.01f)
                curveToRelative(-0.21f, -0.46f, -0.7f, -0.78f, -1.18f, -0.78f)
                reflectiveCurveToRelative(-1.03f, 0.31f, -1.28f, 0.78f)
                curveToRelative(-1.27f, 2.22f, -2.06f, 4.47f, -2.23f, 7.01f)
                curveToRelative(-1.34f, 1.41f, -1.71f, 3.24f, -1.4f, 5.02f)
                lineToRelative(1.19f, 1.19f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                lineToRelative(0.85f, -1f)
                close()
                moveTo(9.08f, 18f)
                horizontalLineToRelative(-7.08f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(4.71f)
                curveToRelative(-0.05f, 0.32f, -0.1f, 0.65f, -0.13f, 0.97f)
                curveToRelative(-1.32f, 1.69f, -1.83f, 3.85f, -1.44f, 6.17f)
                lineToRelative(0.11f, 0.63f)
                lineToRelative(2.23f, 2.23f)
                horizontalLineToRelative(9.05f)
                lineToRelative(2.23f, -2.23f)
                lineToRelative(0.11f, -0.63f)
                curveToRelative(0.4f, -2.31f, -0.12f, -4.48f, -1.45f, -6.17f)
                curveToRelative(-0.04f, -0.33f, -0.1f, -0.65f, -0.16f, -0.97f)
                horizontalLineToRelative(4.74f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(-0.85f, 1f)
                horizontalLineToRelative(-4.16f)
                lineToRelative(-0.85f, -1f)
                close()
            }
        }.also { _Launch = it}

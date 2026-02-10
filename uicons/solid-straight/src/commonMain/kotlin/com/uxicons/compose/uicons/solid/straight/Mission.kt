package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mission: ImageVector? = null

val Icons.Ss.Mission: ImageVector
    get() = _Mission ?: UXIcon(name = "Mission") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.75f, 12.15f)
                lineToRelative(4.25f, -5.49f)
                verticalLineToRelative(-6.66f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(1.66f)
                lineToRelative(3.66f, 4.73f)
                lineToRelative(-2.41f, 3.92f)
                lineToRelative(-1.76f, -2.42f)
                lineToRelative(-2.52f, 3.52f)
                lineToRelative(-3.23f, -4.26f)
                close()
                moveTo(1.79f, 9.79f)
                lineTo(2.79f, 8.79f)
                lineTo(2f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.59f)
                curveToRelative(1f, -1.41f, 2.5f, -2.42f, 4.38f, -2.42f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.82f, -1.64f, 4.04f, -2.91f, 6.84f, -3.92f)
                curveToRelative(0.39f, -0.19f, 0.96f, -0.09f, 1.36f, 0.29f)
                curveToRelative(0.39f, 0.37f, 0.52f, 0.93f, 0.34f, 1.42f)
                curveToRelative(-1.0f, 2.76f, -2.33f, 5.07f, -3.94f, 6.86f)
                curveToRelative(0f, 1.85f, -0.97f, 3.35f, -2.39f, 4.35f)
                horizontalLineToRelative(-1.59f)
                verticalLineToRelative(-2f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(-1f, 1f)
                close()
                moveTo(5f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21.97f, 13.08f)
                lineTo(18.39f, 18.9f)
                lineTo(16.51f, 16.31f)
                lineTo(14.02f, 19.79f)
                lineTo(9.48f, 13.79f)
                lineTo(3f, 22.16f)
                verticalLineToRelative(1.84f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-8.3f)
                lineToRelative(-2.03f, -2.62f)
                close()
            }
        }.also { _Mission = it}

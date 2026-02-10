package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCrackAlt: ImageVector? = null

val Icons.Ts.HouseCrackAlt: ImageVector
    get() = _HouseCrackAlt ?: UXIcon(name = "HouseCrackAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 7.87f)
                lineTo(13.66f, 0.57f)
                curveToRelative(-0.98f, -0.77f, -2.34f, -0.77f, -3.32f, 0f)
                lineTo(1.03f, 7.87f)
                curveToRelative(-0.66f, 0.51f, -1.03f, 1.29f, -1.03f, 2.12f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.83f, -0.38f, -1.61f, -1.03f, -2.12f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-6.79f)
                lineToRelative(-6f, -6f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-4.35f, -4.35f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(6f, 6f)
                lineTo(1f, 23.0f)
                verticalLineToRelative(-13.01f)
                curveToRelative(0f, -0.52f, 0.24f, -1.01f, 0.65f, -1.33f)
                lineTo(10.96f, 1.36f)
                curveToRelative(0.61f, -0.48f, 1.47f, -0.48f, 2.08f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.41f, 0.32f, 0.65f, 0.81f, 0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                close()
            }
        }.also { _HouseCrackAlt = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandCleaning: ImageVector? = null

val Icons.Ss.HandCleaning: ImageVector
    get() = _HandCleaning ?: UXIcon(name = "HandCleaning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 2f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                close()
                moveTo(24.0f, 13.51f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.0f, -6.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.59f, 0.0f, 4.18f, 0.01f, 6.5f)
                horizontalLineToRelative(-1.01f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.97f)
                lineToRelative(-0.51f, -0.53f)
                curveToRelative(-0.7f, -0.7f, -1.84f, -0.88f, -2.65f, -0.29f)
                curveToRelative(-1.03f, 0.74f, -1.12f, 2.19f, -0.26f, 3.05f)
                lineToRelative(1.36f, 1.3f)
                horizontalLineToRelative(13.05f)
                lineToRelative(-0.0f, -10.49f)
                close()
                moveTo(19f, 7f)
                verticalLineToRelative(1.05f)
                curveToRelative(-0.17f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f)
                curveToRelative(-1.08f, 0f, -2.04f, 0.49f, -2.69f, 1.26f)
                curveToRelative(-0.41f, -0.17f, -0.85f, -0.26f, -1.32f, -0.26f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.81f)
                curveToRelative(-0.83f, -0.02f, -1.64f, 0.23f, -2.33f, 0.72f)
                curveToRelative(-0.96f, 0.69f, -1.56f, 1.76f, -1.66f, 2.93f)
                curveToRelative(-0.06f, 0.71f, 0.1f, 1.4f, 0.4f, 2.04f)
                horizontalLineToRelative(-7.41f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(9f, 12f)
                lineTo(7f, 11f)
                lineTo(6f, 9f)
                lineTo(5f, 11f)
                lineTo(3f, 12f)
                lineTo(5f, 13f)
                lineTo(6f, 15f)
                lineTo(7f, 13f)
                close()
            }
        }.also { _HandCleaning = it}

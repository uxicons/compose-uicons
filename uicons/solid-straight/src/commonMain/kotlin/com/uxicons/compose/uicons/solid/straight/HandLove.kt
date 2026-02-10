package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLove: ImageVector? = null

val Icons.Ss.HandLove: ImageVector
    get() = _HandLove ?: UXIcon(name = "HandLove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 15f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(20f, 13.32f)
                curveToRelative(0f, 1.9f, -1.44f, 3.59f, -3.34f, 3.67f)
                curveToRelative(-0.81f, 0.04f, -1.55f, -0.2f, -2.16f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2f, 0.63f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(9f, 1.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(14.65f)
                lineToRelative(-2.6f, -2.65f)
                curveToRelative(-0.09f, -0.09f, -0.24f, -0.2f, -0.44f, -0.33f)
                curveToRelative(-0.84f, -0.47f, -1.95f, -0.28f, -2.58f, 0.56f)
                curveToRelative(-0.6f, 0.81f, -0.44f, 1.97f, 0.28f, 2.68f)
                lineToRelative(7.35f, 7.59f)
                horizontalLineToRelative(15f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _HandLove = it}

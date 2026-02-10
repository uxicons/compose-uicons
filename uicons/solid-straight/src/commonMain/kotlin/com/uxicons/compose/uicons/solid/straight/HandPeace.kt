package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPeace: ImageVector? = null

val Icons.Ss.HandPeace: ImageVector
    get() = _HandPeace ?: UXIcon(name = "HandPeace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 16.37f)
                curveToRelative(-0.61f, 0.43f, -1.36f, 0.66f, -2.16f, 0.63f)
                curveToRelative(-1.9f, -0.09f, -3.34f, -1.77f, -3.34f, -3.67f)
                verticalLineToRelative(-3.32f)
                horizontalLineToRelative(0f)
                lineTo(14.96f, 1.85f)
                curveToRelative(0.19f, -0.81f, -0.31f, -1.61f, -1.11f, -1.81f)
                curveToRelative(-0.81f, -0.19f, -1.61f, 0.31f, -1.81f, 1.11f)
                lineToRelative(-2.04f, 8.35f)
                lineTo(7.96f, 1.15f)
                curveToRelative(-0.19f, -0.81f, -1f, -1.3f, -1.81f, -1.11f)
                curveToRelative(-0.81f, 0.19f, -1.3f, 1f, -1.11f, 1.81f)
                lineToRelative(1.52f, 6.71f)
                curveToRelative(0.65f, 0.08f, 1.52f, 0.37f, 2.27f, 1.12f)
                curveToRelative(1.26f, 1.26f, 1.53f, 3.22f, 0.67f, 4.78f)
                lineToRelative(-2.85f, 3.06f)
                lineToRelative(-1.45f, -1.38f)
                lineToRelative(2.21f, -2.21f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.24f, 0.33f, -0.44f)
                curveToRelative(0.47f, -0.84f, 0.28f, -1.95f, -0.56f, -2.58f)
                curveToRelative(-0.81f, -0.6f, -1.96f, -0.44f, -2.68f, 0.28f)
                lineToRelative(-2.72f, 2.71f)
                curveToRelative(-1.03f, 1.03f, -1.03f, 2.7f, 0f, 3.73f)
                lineToRelative(6.39f, 6.39f)
                horizontalLineToRelative(13.82f)
                verticalLineToRelative(-7.34f)
                curveToRelative(-0.45f, 0.22f, -0.96f, 0.34f, -1.5f, 0.34f)
                curveToRelative(-0.74f, 0f, -1.43f, -0.23f, -2f, -0.63f)
                close()
                moveTo(20.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _HandPeace = it}

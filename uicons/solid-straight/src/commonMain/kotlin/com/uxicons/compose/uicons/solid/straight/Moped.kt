package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moped: ImageVector? = null

val Icons.Ss.Moped: ImageVector
    get() = _Moped ?: UXIcon(name = "Moped") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.5f, 11f)
                curveToRelative(-0.27f, 0f, -0.53f, 0.02f, -0.8f, 0.05f)
                lineToRelative(-1.68f, -4.31f)
                curveToRelative(0.29f, 0.16f, 0.62f, 0.26f, 0.97f, 0.26f)
                horizontalLineToRelative(1f)
                lineTo(20f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.89f, 0f, -1.63f, 0.58f, -1.89f, 1.38f)
                lineToRelative(-0.93f, -2.38f)
                horizontalLineToRelative(-5.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.82f)
                lineToRelative(2.94f, 7.57f)
                curveToRelative(-0.93f, 0.4f, -1.78f, 1.0f, -2.48f, 1.77f)
                lineToRelative(-2.24f, 2.66f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-3.2f, -8f)
                horizontalLineToRelative(-4.68f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2.04f)
                curveToRelative(-0.02f, 0.17f, -0.04f, 0.33f, -0.04f, 0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.04f, -0.5f)
                horizontalLineToRelative(5.0f)
                lineToRelative(2.82f, -3.35f)
                curveToRelative(0.95f, -1.05f, 2.3f, -1.66f, 3.72f, -1.66f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }.also { _Moped = it}

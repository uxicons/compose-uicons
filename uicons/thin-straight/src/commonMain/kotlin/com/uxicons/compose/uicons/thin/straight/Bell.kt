package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Ts.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.39f, 16.21f)
                lineToRelative(-2.41f, -9.39f)
                curveTo(19.86f, 2.8f, 16.17f, 0f, 12f, 0f)
                curveTo(7.6f, 0f, 3.85f, 3.0f, 2.9f, 7.29f)
                lineTo(0.69f, 16.36f)
                curveToRelative(-0.2f, 0.89f, 0.02f, 1.8f, 0.59f, 2.52f)
                curveToRelative(0.57f, 0.71f, 1.43f, 1.12f, 2.34f, 1.12f)
                horizontalLineToRelative(3.48f)
                curveToRelative(0.47f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                reflectiveCurveToRelative(4.43f, -1.72f, 4.9f, -4f)
                horizontalLineToRelative(3.6f)
                curveToRelative(0.95f, 0f, 1.82f, -0.43f, 2.39f, -1.19f)
                curveToRelative(0.57f, -0.75f, 0.76f, -1.71f, 0.5f, -2.61f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-1.86f, 0f, -3.41f, -1.28f, -3.86f, -3f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-0.45f, 1.72f, -2f, 3f, -3.86f, 3f)
                close()
                moveTo(22.09f, 18.21f)
                curveToRelative(-0.38f, 0.5f, -0.96f, 0.79f, -1.59f, 0.79f)
                lineTo(3.62f, 19f)
                curveToRelative(-0.61f, 0f, -1.18f, -0.27f, -1.56f, -0.75f)
                curveToRelative(-0.38f, -0.48f, -0.53f, -1.09f, -0.4f, -1.67f)
                lineTo(3.88f, 7.52f)
                curveTo(4.73f, 3.68f, 8.07f, 1f, 12f, 1f)
                curveToRelative(3.72f, 0f, 7.02f, 2.5f, 8.01f, 6.08f)
                lineToRelative(2.41f, 9.39f)
                curveToRelative(0.17f, 0.61f, 0.05f, 1.24f, -0.33f, 1.75f)
                close()
            }
        }.also { _Bell = it}

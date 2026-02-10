package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Rr.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.68f, 23.48f)
                curveToRelative(-0.18f, 0.33f, -0.52f, 0.52f, -0.88f, 0.52f)
                curveToRelative(-0.16f, 0f, -0.33f, -0.04f, -0.48f, -0.13f)
                curveTo(2.67f, 21.29f, 0f, 16.96f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(0.73f, 0f, 1.47f, 0.07f, 2.18f, 0.2f)
                curveToRelative(0.54f, 0.1f, 0.9f, 0.62f, 0.8f, 1.16f)
                curveToRelative(-0.1f, 0.54f, -0.62f, 0.91f, -1.16f, 0.8f)
                curveToRelative(-0.6f, -0.11f, -1.21f, -0.17f, -1.82f, -0.17f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveToRelative(0f, 4.21f, 2.29f, 7.9f, 6.29f, 10.13f)
                curveToRelative(0.48f, 0.27f, 0.66f, 0.88f, 0.39f, 1.36f)
                close()
                moveTo(23.8f, 9.82f)
                curveToRelative(-0.1f, -0.54f, -0.62f, -0.91f, -1.16f, -0.8f)
                curveToRelative(-0.54f, 0.1f, -0.9f, 0.62f, -0.8f, 1.16f)
                curveToRelative(0.11f, 0.59f, 0.17f, 1.21f, 0.17f, 1.82f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -0.73f, -0.07f, -1.47f, -0.2f, -2.18f)
                close()
                moveTo(13.17f, 6.59f)
                lineTo(18.88f, 0.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(-5.71f, 5.71f)
                curveToRelative(-0.76f, 0.76f, -1.76f, 1.17f, -2.83f, 1.17f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -1.07f, 0.42f, -2.07f, 1.17f, -2.83f)
                close()
                moveTo(14.0f, 10f)
                horizontalLineToRelative(0.59f)
                curveToRelative(0.53f, 0f, 1.04f, -0.21f, 1.41f, -0.59f)
                lineToRelative(5.71f, -5.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0f)
                lineToRelative(-5.71f, 5.71f)
                curveToRelative(-0.38f, 0.38f, -0.59f, 0.88f, -0.59f, 1.41f)
                verticalLineToRelative(0.59f)
                close()
            }
        }.also { _PenSwirl = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Ts.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.05f, 10.6f)
                curveToRelative(-0.59f, -0.49f, -1.35f, -0.7f, -2.1f, -0.56f)
                lineToRelative(-6.46f, 1.17f)
                curveToRelative(-1.07f, 0.2f, -1.96f, 0.85f, -2.48f, 1.74f)
                curveToRelative(-0.52f, -0.89f, -1.41f, -1.54f, -2.49f, -1.74f)
                lineToRelative(-6.46f, -1.18f)
                curveToRelative(-0.76f, -0.14f, -1.53f, 0.07f, -2.12f, 0.56f)
                curveToRelative(-0.59f, 0.49f, -0.93f, 1.22f, -0.93f, 1.99f)
                verticalLineToRelative(9.23f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24f, 12.64f)
                curveToRelative(0f, -0.79f, -0.35f, -1.53f, -0.95f, -2.03f)
                close()
                moveTo(11.5f, 22.9f)
                lineToRelative(-10.5f, -1.91f)
                lineTo(1f, 12.59f)
                curveToRelative(0f, -0.47f, 0.21f, -0.92f, 0.57f, -1.22f)
                curveToRelative(0.36f, -0.3f, 0.84f, -0.43f, 1.3f, -0.34f)
                lineToRelative(6.46f, 1.18f)
                curveToRelative(1.25f, 0.23f, 2.17f, 1.32f, 2.17f, 2.59f)
                verticalLineToRelative(8.11f)
                close()
                moveTo(23f, 20.99f)
                lineToRelative(-10.5f, 1.91f)
                lineTo(12.5f, 14.79f)
                curveToRelative(0f, -1.27f, 0.91f, -2.37f, 2.17f, -2.59f)
                lineToRelative(6.46f, -1.18f)
                curveToRelative(0.45f, -0.08f, 0.92f, 0.04f, 1.28f, 0.35f)
                curveToRelative(0.38f, 0.32f, 0.6f, 0.78f, 0.6f, 1.26f)
                verticalLineToRelative(8.35f)
                close()
                moveTo(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                reflectiveCurveTo(7f, 2.24f, 7f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(9.79f, 1f, 12f, 1f)
                close()
            }
        }.also { _BookOpenReader = it}

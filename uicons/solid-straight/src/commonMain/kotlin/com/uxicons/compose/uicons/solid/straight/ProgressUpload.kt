package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProgressUpload: ImageVector? = null

val Icons.Ss.ProgressUpload: ImageVector
    get() = _ProgressUpload ?: UXIcon(name = "ProgressUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.07f, 7.04f)
                lineToRelative(1.82f, 0.83f)
                curveToRelative(-0.39f, 0.86f, -0.66f, 1.78f, -0.79f, 2.72f)
                lineToRelative(-1.98f, -0.28f)
                curveToRelative(0.16f, -1.13f, 0.48f, -2.23f, 0.95f, -3.27f)
                close()
                moveTo(4.42f, 18.52f)
                lineToRelative(-1.52f, 1.3f)
                curveToRelative(0.74f, 0.86f, 1.6f, 1.62f, 2.56f, 2.24f)
                lineToRelative(1.09f, -1.68f)
                curveToRelative(-0.8f, -0.52f, -1.52f, -1.15f, -2.14f, -1.87f)
                close()
                moveTo(0.12f, 13.7f)
                curveToRelative(0.16f, 1.13f, 0.48f, 2.23f, 0.95f, 3.27f)
                lineToRelative(1.82f, -0.83f)
                curveToRelative(-0.39f, -0.86f, -0.66f, -1.78f, -0.79f, -2.72f)
                lineToRelative(-1.98f, 0.28f)
                close()
                moveTo(2.89f, 4.19f)
                lineToRelative(1.52f, 1.3f)
                curveToRelative(0.62f, -0.72f, 1.34f, -1.36f, 2.15f, -1.88f)
                lineToRelative(-1.09f, -1.68f)
                curveToRelative(-0.96f, 0.63f, -1.82f, 1.38f, -2.57f, 2.25f)
                close()
                moveTo(11f, 18f)
                horizontalLineToRelative(2f)
                lineTo(13f, 8.89f)
                lineToRelative(2.89f, 2.83f)
                lineToRelative(1.4f, -1.43f)
                lineToRelative(-3.72f, -3.63f)
                curveToRelative(-0.84f, -0.84f, -2.31f, -0.83f, -3.13f, -0.01f)
                lineToRelative(-3.73f, 3.64f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(2.89f, -2.83f)
                verticalLineToRelative(9.11f)
                close()
                moveTo(12f, 0f)
                curveToRelative(-1.17f, 0f, -2.32f, 0.17f, -3.43f, 0.5f)
                lineToRelative(0.57f, 1.92f)
                curveToRelative(0.92f, -0.27f, 1.89f, -0.41f, 2.86f, -0.41f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                curveToRelative(-0.97f, 0f, -1.93f, -0.14f, -2.86f, -0.41f)
                lineToRelative(-0.57f, 1.92f)
                curveToRelative(1.11f, 0.33f, 2.26f, 0.5f, 3.43f, 0.5f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ProgressUpload = it}

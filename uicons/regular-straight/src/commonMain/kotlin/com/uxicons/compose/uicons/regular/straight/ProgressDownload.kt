package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProgressDownload: ImageVector? = null

val Icons.Rs.ProgressDownload: ImageVector
    get() = _ProgressDownload ?: UXIcon(name = "ProgressDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveToRelative(-1.17f, 0f, -2.32f, -0.17f, -3.43f, -0.5f)
                lineToRelative(0.57f, -1.92f)
                curveToRelative(0.92f, 0.28f, 1.89f, 0.41f, 2.86f, 0.41f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                curveToRelative(-0.97f, 0f, -1.94f, 0.14f, -2.86f, 0.41f)
                lineToRelative(-0.57f, -1.92f)
                curveToRelative(1.11f, -0.33f, 2.26f, -0.5f, 3.43f, -0.5f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(12.0f, 18f)
                curveToRelative(0.57f, 0f, 1.13f, -0.21f, 1.56f, -0.64f)
                lineToRelative(3.73f, -3.64f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-2.89f, 2.83f)
                lineTo(13f, 6f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 15.11f)
                lineToRelative(-2.89f, -2.83f)
                lineToRelative(-1.4f, 1.43f)
                lineToRelative(3.72f, 3.63f)
                curveToRelative(0.43f, 0.43f, 1.0f, 0.65f, 1.57f, 0.65f)
                close()
                moveTo(4.41f, 18.51f)
                lineToRelative(-1.52f, 1.3f)
                curveToRelative(0.75f, 0.87f, 1.61f, 1.63f, 2.57f, 2.25f)
                lineToRelative(1.09f, -1.68f)
                curveToRelative(-0.8f, -0.52f, -1.52f, -1.15f, -2.15f, -1.88f)
                close()
                moveTo(0.12f, 13.7f)
                curveToRelative(0.16f, 1.13f, 0.48f, 2.23f, 0.95f, 3.27f)
                lineToRelative(1.82f, -0.83f)
                curveToRelative(-0.39f, -0.86f, -0.66f, -1.78f, -0.79f, -2.72f)
                lineToRelative(-1.98f, 0.28f)
                close()
                moveTo(0.12f, 10.3f)
                lineToRelative(1.98f, 0.28f)
                curveToRelative(0.13f, -0.94f, 0.4f, -1.85f, 0.79f, -2.72f)
                lineToRelative(-1.82f, -0.83f)
                curveToRelative(-0.47f, 1.04f, -0.79f, 2.14f, -0.95f, 3.27f)
                close()
                moveTo(2.9f, 4.17f)
                lineToRelative(1.52f, 1.3f)
                curveToRelative(0.62f, -0.72f, 1.34f, -1.35f, 2.14f, -1.87f)
                lineToRelative(-1.09f, -1.68f)
                curveToRelative(-0.95f, 0.62f, -1.82f, 1.38f, -2.56f, 2.24f)
                close()
            }
        }.also { _ProgressDownload = it}

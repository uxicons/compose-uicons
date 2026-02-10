package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDownloadAlt: ImageVector? = null

val Icons.Sr.CloudDownloadAlt: ImageVector
    get() = _CloudDownloadAlt ?: UXIcon(name = "CloudDownloadAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.97f, 7.15f)
                curveToRelative(-0.33f, -0.07f, -0.6f, -0.27f, -0.74f, -0.57f)
                curveToRelative(-1.55f, -3.27f, -5.14f, -5.1f, -8.73f, -4.44f)
                curveToRelative(-3.27f, 0.6f, -5.84f, 3.21f, -6.38f, 6.5f)
                curveToRelative(-0.16f, 0.97f, -0.15f, 1.94f, 0.03f, 2.89f)
                curveToRelative(0.06f, 0.31f, -0.07f, 0.65f, -0.35f, 0.9f)
                curveToRelative(-1.15f, 1.04f, -1.8f, 2.52f, -1.8f, 4.07f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -3.56f, -2.53f, -6.66f, -6.03f, -7.35f)
                close()
                moveTo(15.12f, 14.71f)
                lineToRelative(-2.71f, 2.71f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                lineToRelative(-0.01f, 0.0f)
                lineToRelative(-0.01f, -0.0f)
                curveToRelative(-0.51f, -0.0f, -1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-2.71f, -2.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.71f, 1.71f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                lineToRelative(1.71f, -1.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _CloudDownloadAlt = it}

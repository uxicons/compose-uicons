package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AudioDescriptionSlash: ImageVector? = null

val Icons.Ss.AudioDescriptionSlash: ImageVector
    get() = _AudioDescriptionSlash ?: UXIcon(name = "AudioDescriptionSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.72f, 14f)
                lineToRelative(0.95f, -3.09f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(0.65f, 2.12f)
                horizontalLineToRelative(-2.57f)
                close()
                moveTo(11.61f, 18f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-0.61f, -2f)
                horizontalLineToRelative(-3.8f)
                lineToRelative(-0.61f, 2f)
                lineTo(2.39f, 18f)
                lineToRelative(2.67f, -8.69f)
                lineTo(0.36f, 4.6f)
                curveToRelative(-0.22f, 0.42f, -0.36f, 0.89f, -0.36f, 1.4f)
                verticalLineToRelative(15f)
                lineTo(16.76f, 21f)
                lineToRelative(-6.11f, -6.11f)
                lineToRelative(0.95f, 3.11f)
                close()
                moveTo(22.42f, 21f)
                horizontalLineToRelative(1.59f)
                lineTo(24.01f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(4.41f, 3f)
                lineTo(1.41f, 0f)
                lineTo(0f, 1.41f)
                lineTo(5.73f, 7.14f)
                lineToRelative(0.05f, -0.17f)
                curveToRelative(0.19f, -0.61f, 0.67f, -1f, 1.22f, -1f)
                reflectiveCurveToRelative(1.03f, 0.39f, 1.22f, 0.99f)
                lineToRelative(1.18f, 3.83f)
                lineToRelative(3.6f, 3.6f)
                lineTo(13f, 6f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-0.41f)
                lineToRelative(6.01f, 6.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.59f, -1.59f)
                close()
                moveTo(19.01f, 14f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _AudioDescriptionSlash = it}

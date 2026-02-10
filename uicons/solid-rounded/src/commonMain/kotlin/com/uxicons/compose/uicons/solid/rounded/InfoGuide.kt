package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfoGuide: ImageVector? = null

val Icons.Sr.InfoGuide: ImageVector
    get() = _InfoGuide ?: UXIcon(name = "InfoGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                verticalLineToRelative(10.79f)
                curveToRelative(0f, 2.42f, -1.73f, 4.49f, -4.11f, 4.92f)
                lineToRelative(-6.29f, 1.14f)
                curveToRelative(-0.53f, 0.1f, -1.07f, 0.15f, -1.61f, 0.15f)
                reflectiveCurveToRelative(-1.07f, -0.05f, -1.61f, -0.15f)
                lineToRelative(-6.29f, -1.14f)
                curveToRelative(-2.38f, -0.43f, -4.11f, -2.5f, -4.11f, -4.92f)
                lineTo(0.0f, 7f)
                curveToRelative(0f, -1.49f, 0.65f, -2.89f, 1.8f, -3.84f)
                curveToRelative(0.75f, -0.63f, 1.66f, -1.01f, 2.6f, -1.12f)
                curveToRelative(-0.26f, 0.6f, -0.4f, 1.26f, -0.4f, 1.96f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.47f, 1.8f, 4.51f, 4.16f, 4.92f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(0.41f, 0.41f, 0.89f, 0.68f, 1.4f, 0.84f)
                verticalLineToRelative(5.73f)
                curveToRelative(0.66f, 0.1f, 1.34f, 0.1f, 2f, 0f)
                verticalLineToRelative(-5.69f)
                curveToRelative(0.56f, -0.15f, 1.1f, -0.44f, 1.55f, -0.88f)
                lineToRelative(1.46f, -1.46f)
                curveToRelative(2.28f, -0.47f, 4.0f, -2.48f, 4.0f, -4.9f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.69f, -0.14f, -1.35f, -0.4f, -1.95f)
                curveToRelative(0.96f, 0.11f, 1.86f, 0.49f, 2.6f, 1.12f)
                curveToRelative(1.14f, 0.95f, 1.8f, 2.35f, 1.8f, 3.84f)
                close()
                moveTo(6f, 9f)
                lineTo(6f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(0.07f)
                lineToRelative(-1.94f, 1.94f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0f)
                lineToRelative(-1.94f, -1.94f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(10.5f, 3.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _InfoGuide = it}

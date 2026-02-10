package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfoGuide: ImageVector? = null

val Icons.Ss.InfoGuide: ImageVector
    get() = _InfoGuide ?: UXIcon(name = "InfoGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                horizontalLineToRelative(1.07f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                lineToRelative(1.94f, -1.94f)
                horizontalLineToRelative(0.93f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(18.0f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 4.05f)
                verticalLineToRelative(16.83f)
                lineToRelative(-12f, 2.18f)
                lineTo(0f, 20.88f)
                lineTo(0f, 4.05f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.08f, -2.3f)
                curveToRelative(0.68f, -0.57f, 1.58f, -0.81f, 2.46f, -0.65f)
                lineToRelative(0.54f, 0.13f)
                curveToRelative(-0.05f, 0.25f, -0.08f, 0.51f, -0.08f, 0.77f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(0.24f)
                lineToRelative(1.35f, 1.35f)
                curveToRelative(0.41f, 0.41f, 0.89f, 0.68f, 1.4f, 0.84f)
                verticalLineToRelative(4.66f)
                lineToRelative(1f, 0.18f)
                lineToRelative(1f, -0.18f)
                verticalLineToRelative(-4.61f)
                curveToRelative(0.56f, -0.15f, 1.1f, -0.44f, 1.55f, -0.88f)
                lineToRelative(1.35f, -1.35f)
                horizontalLineToRelative(0.1f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(20.0f, 2f)
                curveToRelative(0f, -0.27f, -0.03f, -0.52f, -0.08f, -0.77f)
                lineToRelative(0.48f, -0.12f)
                curveToRelative(0.94f, -0.17f, 1.83f, 0.06f, 2.52f, 0.64f)
                curveToRelative(0.69f, 0.57f, 1.08f, 1.41f, 1.08f, 2.3f)
                close()
            }
        }.also { _InfoGuide = it}

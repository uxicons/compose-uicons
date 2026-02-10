package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarDeaf: ImageVector? = null

val Icons.Ss.EarDeaf: ImageVector
    get() = _EarDeaf ?: UXIcon(name = "EarDeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.29f, 12.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(1.41f, 24.01f)
                lineTo(0f, 22.59f)
                lineTo(10.29f, 12.29f)
                close()
                moveTo(19.83f, 5.57f)
                lineTo(24.01f, 1.41f)
                lineTo(22.59f, 0f)
                lineToRelative(-3.95f, 3.95f)
                curveToRelative(-1.43f, -1.57f, -3.41f, -2.64f, -5.61f, -2.88f)
                curveToRelative(-2.56f, -0.29f, -5.13f, 0.53f, -7.03f, 2.23f)
                curveToRelative(-1.91f, 1.71f, -3f, 4.15f, -3f, 6.71f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.99f, 0.85f, -3.89f, 2.34f, -5.22f)
                curveToRelative(1.51f, -1.35f, 3.45f, -1.96f, 5.48f, -1.73f)
                curveToRelative(3.17f, 0.36f, 5.74f, 2.91f, 6.13f, 6.06f)
                curveToRelative(0.25f, 2.05f, -0.36f, 4.01f, -1.71f, 5.54f)
                curveToRelative(-0.75f, 0.85f, -1.24f, 2.16f, -1.24f, 3.36f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -0.7f, 0.31f, -1.55f, 0.73f, -2.03f)
                curveToRelative(1.71f, -1.93f, 2.52f, -4.52f, 2.2f, -7.11f)
                curveToRelative(-0.14f, -1.18f, -0.53f, -2.29f, -1.09f, -3.29f)
                close()
                moveTo(15.74f, 13.3f)
                curveToRelative(0.81f, -0.91f, 1.25f, -2.09f, 1.25f, -3.31f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.73f, -0.27f, 1.44f, -0.75f, 1.98f)
                lineToRelative(1.5f, 1.32f)
                close()
            }
        }.also { _EarDeaf = it}

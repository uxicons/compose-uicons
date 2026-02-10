package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Tr.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 12f)
                curveToRelative(0f, 1.72f, -0.78f, 3.49f, -2.15f, 4.85f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(1.18f, -1.18f, 1.85f, -2.69f, 1.85f, -4.15f)
                curveToRelative(0f, -1.46f, -0.68f, -2.97f, -1.85f, -4.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                curveToRelative(1.36f, 1.36f, 2.15f, 3.13f, 2.15f, 4.85f)
                close()
                moveTo(15.0f, 1.72f)
                verticalLineToRelative(20.59f)
                curveToRelative(0f, 0.56f, -0.27f, 1.08f, -0.73f, 1.4f)
                curveToRelative(-0.29f, 0.2f, -0.63f, 0.31f, -0.97f, 0.31f)
                curveToRelative(-0.2f, 0f, -0.4f, -0.03f, -0.58f, -0.1f)
                curveToRelative(-2.16f, -0.79f, -4.59f, -2.68f, -6.04f, -4.68f)
                lineToRelative(-0.15f, -0.21f)
                lineToRelative(-2.02f, -0.0f)
                curveTo(2.02f, 19.0f, 0f, 16.98f, 0f, 14.5f)
                verticalLineToRelative(-4.99f)
                curveTo(0f, 8.3f, 0.47f, 7.17f, 1.32f, 6.32f)
                curveToRelative(0.85f, -0.85f, 1.98f, -1.31f, 3.18f, -1.31f)
                horizontalLineToRelative(0.01f)
                lineToRelative(2.02f, 0.0f)
                lineToRelative(0.15f, -0.21f)
                curveTo(8.17f, 2.73f, 10.56f, 0.88f, 12.76f, 0.1f)
                curveToRelative(0.51f, -0.18f, 1.06f, -0.1f, 1.51f, 0.21f)
                curveToRelative(0.46f, 0.32f, 0.73f, 0.85f, 0.73f, 1.4f)
                close()
                moveTo(14.0f, 1.72f)
                curveToRelative(0f, -0.23f, -0.11f, -0.45f, -0.3f, -0.58f)
                curveToRelative(-0.18f, -0.13f, -0.4f, -0.16f, -0.6f, -0.09f)
                curveToRelative(-2.02f, 0.72f, -4.22f, 2.42f, -5.61f, 4.34f)
                lineToRelative(-0.3f, 0.41f)
                curveToRelative(-0.09f, 0.13f, -0.23f, 0.19f, -0.41f, 0.21f)
                lineToRelative(-2.27f, -0.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.93f, 0f, -1.81f, 0.36f, -2.47f, 1.02f)
                curveToRelative(-0.66f, 0.66f, -1.03f, 1.54f, -1.03f, 2.48f)
                verticalLineToRelative(4.99f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.51f)
                lineToRelative(2.28f, 0.0f)
                curveToRelative(0.16f, 0f, 0.31f, 0.08f, 0.4f, 0.21f)
                lineToRelative(0.3f, 0.41f)
                curveToRelative(1.32f, 1.83f, 3.61f, 3.61f, 5.57f, 4.33f)
                curveToRelative(0.22f, 0.08f, 0.45f, 0.05f, 0.64f, -0.08f)
                curveToRelative(0.19f, -0.13f, 0.3f, -0.34f, 0.3f, -0.58f)
                lineTo(14f, 1.72f)
                close()
            }
        }.also { _VolumeDown = it}

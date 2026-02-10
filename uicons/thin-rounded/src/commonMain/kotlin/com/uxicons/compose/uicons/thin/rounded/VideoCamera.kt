package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCamera: ImageVector? = null

val Icons.Tr.VideoCamera: ImageVector
    get() = _VideoCamera ?: UXIcon(name = "VideoCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.09f, 8.68f)
                curveToRelative(-0.58f, -0.29f, -1.26f, -0.23f, -1.81f, 0.17f)
                lineToRelative(-1.33f, 1.12f)
                curveToRelative(-0.26f, -2.23f, -2.15f, -3.97f, -4.45f, -3.97f)
                horizontalLineToRelative(-0.79f)
                lineToRelative(-3.68f, -3.68f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
                lineTo(0.5f, 1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(7.84f, 2f)
                curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
                lineToRelative(2.98f, 2.98f)
                lineTo(4.5f, 6f)
                curveTo(2.02f, 6f, 0f, 8.02f, 0f, 10.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                lineTo(15.5f, 24f)
                curveToRelative(2.3f, 0f, 4.18f, -1.74f, 4.45f, -3.97f)
                lineToRelative(1.36f, 1.14f)
                curveToRelative(0.3f, 0.22f, 0.65f, 0.34f, 1.02f, 0.34f)
                curveToRelative(0.26f, 0f, 0.53f, -0.06f, 0.77f, -0.18f)
                curveToRelative(0.58f, -0.29f, 0.94f, -0.87f, 0.94f, -1.52f)
                lineTo(24.02f, 10.21f)
                curveToRelative(0f, -0.65f, -0.36f, -1.23f, -0.94f, -1.52f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(15.5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9f)
                close()
                moveTo(23.02f, 19.8f)
                curveToRelative(0f, 0.27f, -0.15f, 0.51f, -0.39f, 0.63f)
                curveToRelative(-0.23f, 0.12f, -0.54f, 0.08f, -0.71f, -0.05f)
                lineToRelative(-1.92f, -1.61f)
                verticalLineToRelative(-7.53f)
                lineToRelative(1.9f, -1.59f)
                curveToRelative(0.21f, -0.16f, 0.5f, -0.19f, 0.74f, -0.06f)
                curveToRelative(0.24f, 0.12f, 0.39f, 0.36f, 0.39f, 0.63f)
                verticalLineToRelative(9.59f)
                close()
            }
        }.also { _VideoCamera = it}

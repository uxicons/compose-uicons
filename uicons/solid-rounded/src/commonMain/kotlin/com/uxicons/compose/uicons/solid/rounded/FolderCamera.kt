package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCamera: ImageVector? = null

val Icons.Sr.FolderCamera: ImageVector
    get() = _FolderCamera ?: UXIcon(name = "FolderCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 6f)
                verticalLineToRelative(-1f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                lineTo(0f, 6.0f)
                close()
                moveTo(24f, 17.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.73f, 1.27f, -3.17f, 2.92f, -3.44f)
                lineToRelative(0.78f, -1.17f)
                curveToRelative(0.37f, -0.56f, 1.0f, -0.89f, 1.67f, -0.89f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.67f, 0f, 1.29f, 0.34f, 1.67f, 0.89f)
                lineToRelative(0.78f, 1.17f)
                curveToRelative(1.66f, 0.28f, 2.92f, 1.71f, 2.92f, 3.44f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(10f, 20.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.37f, 1.5f, -4.42f, 3.68f, -5.18f)
                lineToRelative(0.35f, -0.53f)
                curveToRelative(0.74f, -1.12f, 1.99f, -1.78f, 3.33f, -1.78f)
                horizontalLineToRelative(1.27f)
                curveToRelative(1.34f, 0f, 2.59f, 0.67f, 3.33f, 1.78f)
                lineToRelative(0.35f, 0.53f)
                curveToRelative(0.62f, 0.22f, 1.19f, 0.55f, 1.68f, 0.96f)
                verticalLineToRelative(-5.28f)
                lineTo(0f, 8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5.21f)
                curveToRelative(-0.14f, -0.48f, -0.21f, -0.98f, -0.21f, -1.5f)
                close()
            }
        }.also { _FolderCamera = it}

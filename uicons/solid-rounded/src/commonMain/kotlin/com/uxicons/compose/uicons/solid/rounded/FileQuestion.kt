package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileQuestion: ImageVector? = null

val Icons.Sr.FileQuestion: ImageVector
    get() = _FileQuestion ?: UXIcon(name = "FileQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(13f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 9f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(12.01f, 22f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.82f, 0f, -1.49f, -0.67f, -1.49f, -1.49f)
                reflectiveCurveToRelative(0.67f, -1.49f, 1.49f, -1.49f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.82f, 0f, 1.49f, 0.67f, 1.49f, 1.49f)
                reflectiveCurveToRelative(-0.67f, 1.49f, -1.49f, 1.49f)
                close()
                moveTo(13.63f, 16.6f)
                curveToRelative(-0.34f, 0.18f, -0.6f, 0.44f, -0.67f, 0.67f)
                curveToRelative(-0.12f, 0.44f, -0.53f, 0.73f, -0.96f, 0.73f)
                curveToRelative(-0.09f, 0f, -0.18f, -0.01f, -0.27f, -0.04f)
                curveToRelative(-0.53f, -0.15f, -0.84f, -0.7f, -0.7f, -1.23f)
                curveToRelative(0.21f, -0.77f, 0.82f, -1.46f, 1.66f, -1.91f)
                curveToRelative(0.5f, -0.26f, 0.93f, -0.88f, 0.77f, -1.66f)
                curveToRelative(-0.11f, -0.52f, -0.54f, -0.98f, -1.04f, -1.11f)
                curveToRelative(-0.53f, -0.14f, -0.94f, 0.01f, -1.18f, 0.17f)
                curveToRelative(-0.36f, 0.22f, -0.62f, 0.58f, -0.7f, 0.99f)
                curveToRelative(-0.12f, 0.54f, -0.65f, 0.88f, -1.19f, 0.77f)
                curveToRelative(-0.54f, -0.12f, -0.88f, -0.65f, -0.77f, -1.19f)
                curveToRelative(0.2f, -0.94f, 0.79f, -1.77f, 1.61f, -2.27f)
                curveToRelative(0.82f, -0.5f, 1.79f, -0.65f, 2.74f, -0.4f)
                curveToRelative(1.25f, 0.33f, 2.23f, 1.36f, 2.49f, 2.64f)
                curveToRelative(0.33f, 1.56f, -0.4f, 3.1f, -1.79f, 3.84f)
                close()
                moveTo(15f, 0.3f)
                curveToRelative(0.7f, 0.24f, 1.34f, 0.63f, 1.88f, 1.16f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(0.54f, 0.54f, 0.92f, 1.18f, 1.16f, 1.88f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(15.0f, 0.3f)
                close()
            }
        }.also { _FileQuestion = it}

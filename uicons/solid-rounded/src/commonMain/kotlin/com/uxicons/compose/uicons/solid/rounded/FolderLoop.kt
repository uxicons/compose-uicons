package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderLoop: ImageVector? = null

val Icons.Sr.FolderLoop: ImageVector
    get() = _FolderLoop ?: UXIcon(name = "FolderLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.4f, 17f)
                curveToRelative(-1.51f, 0f, -2.67f, 0.95f, -3.4f, 1.78f)
                curveToRelative(-0.73f, -0.84f, -1.89f, -1.78f, -3.4f, -1.78f)
                curveToRelative(-1.98f, 0f, -3.6f, 1.57f, -3.6f, 3.5f)
                reflectiveCurveToRelative(1.61f, 3.5f, 3.6f, 3.5f)
                curveToRelative(1.51f, 0f, 2.67f, -0.95f, 3.4f, -1.78f)
                curveToRelative(0.73f, 0.84f, 1.89f, 1.78f, 3.4f, 1.78f)
                curveToRelative(1.98f, 0f, 3.6f, -1.57f, 3.6f, -3.5f)
                reflectiveCurveToRelative(-1.61f, -3.5f, -3.6f, -3.5f)
                close()
                moveTo(13.6f, 22f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.67f, -1.6f, -1.5f)
                reflectiveCurveToRelative(0.72f, -1.5f, 1.6f, -1.5f)
                curveToRelative(0.93f, 0f, 1.76f, 0.86f, 2.22f, 1.5f)
                curveToRelative(-0.46f, 0.64f, -1.29f, 1.5f, -2.22f, 1.5f)
                close()
                moveTo(20.4f, 22f)
                curveToRelative(-0.93f, 0f, -1.76f, -0.86f, -2.22f, -1.5f)
                curveToRelative(0.46f, -0.64f, 1.29f, -1.5f, 2.22f, -1.5f)
                curveToRelative(0.88f, 0f, 1.6f, 0.67f, 1.6f, 1.5f)
                reflectiveCurveToRelative(-0.72f, 1.5f, -1.6f, 1.5f)
                close()
                moveTo(23.9f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(-1f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(8.29f)
                curveToRelative(-0.97f, -0.81f, -2.23f, -1.29f, -3.6f, -1.29f)
                curveToRelative(-1.36f, 0f, -2.49f, 0.48f, -3.4f, 1.11f)
                curveToRelative(-0.91f, -0.63f, -2.04f, -1.11f, -3.4f, -1.11f)
                curveToRelative(-3.09f, 0f, -5.6f, 2.47f, -5.6f, 5.5f)
                curveToRelative(0f, 0.52f, 0.08f, 1.02f, 0.22f, 1.5f)
                horizontalLineToRelative(-3.22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(-0f, 8f)
                lineTo(24f, 8f)
                close()
            }
        }.also { _FolderLoop = it}

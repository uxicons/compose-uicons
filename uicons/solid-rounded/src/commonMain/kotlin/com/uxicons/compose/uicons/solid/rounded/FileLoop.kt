package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileLoop: ImageVector? = null

val Icons.Sr.FileLoop: ImageVector
    get() = _FileLoop ?: UXIcon(name = "FileLoop") {
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
                curveToRelative(-0.46f, 0.63f, -1.29f, 1.5f, -2.22f, 1.5f)
                close()
                moveTo(20.4f, 22f)
                curveToRelative(-0.93f, 0f, -1.76f, -0.86f, -2.22f, -1.5f)
                curveToRelative(0.46f, -0.63f, 1.29f, -1.5f, 2.22f, -1.5f)
                curveToRelative(0.88f, 0f, 1.6f, 0.67f, 1.6f, 1.5f)
                reflectiveCurveToRelative(-0.72f, 1.5f, -1.6f, 1.5f)
                close()
                moveTo(8f, 20.5f)
                curveToRelative(0f, 1.33f, 0.48f, 2.55f, 1.28f, 3.5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.48f, 0.02f)
                lineTo(10f, 7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.48f)
                verticalLineToRelative(4.54f)
                curveToRelative(-1.18f, 0.08f, -2.18f, 0.52f, -3f, 1.09f)
                curveToRelative(-0.91f, -0.63f, -2.04f, -1.11f, -3.4f, -1.11f)
                curveToRelative(-3.09f, 0f, -5.6f, 2.47f, -5.6f, 5.5f)
                close()
                moveTo(12f, 7f)
                lineTo(12f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _FileLoop = it}

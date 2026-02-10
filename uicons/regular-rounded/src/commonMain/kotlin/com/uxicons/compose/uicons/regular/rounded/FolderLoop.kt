package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderLoop: ImageVector? = null

val Icons.Rr.FolderLoop: ImageVector
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
                moveTo(19f, 2f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.1f)
                lineTo(8.87f, 0.32f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.15f, 0f, 0.31f, 0.04f, 0.45f, 0.1f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.41f, 0.21f, 0.88f, 0.32f, 1.34f, 0.32f)
                horizontalLineToRelative(6.53f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                lineTo(2f, 6.0f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _FolderLoop = it}

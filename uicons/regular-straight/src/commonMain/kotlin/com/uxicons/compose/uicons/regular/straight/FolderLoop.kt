package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderLoop: ImageVector? = null

val Icons.Rs.FolderLoop: ImageVector
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
                moveTo(21f, 2f)
                lineTo(12.24f, 2f)
                lineTo(8.24f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 22f)
                lineTo(8.22f, 22f)
                curveToRelative(-0.14f, -0.48f, -0.22f, -0.98f, -0.22f, -1.5f)
                curveToRelative(0f, -0.17f, 0.01f, -0.34f, 0.03f, -0.5f)
                lineTo(2f, 20f)
                lineTo(2f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(7.23f)
                curveToRelative(0.74f, 0.22f, 1.42f, 0.58f, 2f, 1.06f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 6f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.76f, 2f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 6f)
                close()
            }
        }.also { _FolderLoop = it}

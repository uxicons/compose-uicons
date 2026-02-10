package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDirectory: ImageVector? = null

val Icons.Rr.FolderDirectory: ImageVector
    get() = _FolderDirectory ?: UXIcon(name = "FolderDirectory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.51f)
                curveToRelative(-2.11f, 1.62f, -3f, 2.82f, -3f, 4.01f)
                curveToRelative(0.01f, 0.41f, 0.19f, 2.5f, 3f, 2.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-3.96f, 0f, -5f, -2.94f, -5f, -4.5f)
                curveToRelative(0f, -2.1f, 1.43f, -3.77f, 3.66f, -5.5f)
                horizontalLineToRelative(-2.66f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(2f, 7f)
                lineTo(21.82f, 7f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.46f, 0f, -0.93f, -0.11f, -1.34f, -0.32f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.14f, -0.07f, -0.29f, -0.1f, -0.45f, -0.1f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _FolderDirectory = it}

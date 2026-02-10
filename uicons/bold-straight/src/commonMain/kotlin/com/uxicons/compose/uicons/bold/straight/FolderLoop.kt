package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderLoop: ImageVector? = null

val Icons.Bs.FolderLoop: ImageVector
    get() = _FolderLoop ?: UXIcon(name = "FolderLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.69f, 15f)
                curveToRelative(-1.6f, 0f, -2.84f, 0.92f, -3.69f, 1.86f)
                curveToRelative(-0.85f, -0.94f, -2.09f, -1.86f, -3.69f, -1.86f)
                curveToRelative(-2.38f, 0f, -4.31f, 2.02f, -4.31f, 4.5f)
                reflectiveCurveToRelative(1.94f, 4.5f, 4.31f, 4.5f)
                curveToRelative(1.6f, 0f, 2.84f, -0.92f, 3.69f, -1.86f)
                curveToRelative(0.85f, 0.94f, 2.09f, 1.86f, 3.69f, 1.86f)
                curveToRelative(2.38f, 0f, 4.31f, -2.02f, 4.31f, -4.5f)
                reflectiveCurveToRelative(-1.94f, -4.5f, -4.31f, -4.5f)
                close()
                moveTo(12.31f, 21f)
                curveToRelative(-0.72f, 0f, -1.31f, -0.67f, -1.31f, -1.5f)
                reflectiveCurveToRelative(0.59f, -1.5f, 1.31f, -1.5f)
                reflectiveCurveToRelative(1.47f, 0.8f, 1.95f, 1.5f)
                curveToRelative(-0.48f, 0.7f, -1.23f, 1.5f, -1.95f, 1.5f)
                close()
                moveTo(19.69f, 21f)
                curveToRelative(-0.72f, 0f, -1.47f, -0.8f, -1.95f, -1.5f)
                curveToRelative(0.48f, -0.7f, 1.23f, -1.5f, 1.95f, -1.5f)
                reflectiveCurveToRelative(1.31f, 0.67f, 1.31f, 1.5f)
                reflectiveCurveToRelative(-0.59f, 1.5f, -1.31f, 1.5f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 14.77f)
                curveToRelative(-0.82f, -0.8f, -1.85f, -1.37f, -3f, -1.62f)
                lineTo(21f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.01f, 0.17f, -0.03f, 0.33f, -0.03f, 0.5f)
                curveToRelative(0f, 0.89f, 0.17f, 1.73f, 0.49f, 2.5f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _FolderLoop = it}

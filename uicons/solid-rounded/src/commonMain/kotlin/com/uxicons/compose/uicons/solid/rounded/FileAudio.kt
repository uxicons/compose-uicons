package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAudio: ImageVector? = null

val Icons.Sr.FileAudio: ImageVector
    get() = _FileAudio ?: UXIcon(name = "FileAudio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 10f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.52f)
                curveToRelative(0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.48f)
                close()
                moveTo(13f, 19.94f)
                curveToRelative(0f, 0.5f, -0.07f, 1.23f, -1f, 1f)
                reflectiveCurveToRelative(-2.89f, -2f, -2.89f, -2f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.94f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.61f)
                reflectiveCurveToRelative(1.96f, -1.77f, 2.89f, -2f)
                reflectiveCurveToRelative(1f, 0.5f, 1f, 1f)
                verticalLineToRelative(5.94f)
                close()
                moveTo(15f, 19f)
                verticalLineToRelative(-4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(14f, 7f)
                lineTo(14f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _FileAudio = it}

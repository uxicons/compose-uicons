package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePowerpoint: ImageVector? = null

val Icons.Sr.FilePowerpoint: ImageVector
    get() = _FilePowerpoint ?: UXIcon(name = "FilePowerpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(15f, 8f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.35f, -0.91f, -0.88f, -1.75f, -1.59f, -2.46f)
                lineToRelative(-3.48f, -3.49f)
                curveToRelative(-0.71f, -0.71f, -1.55f, -1.24f, -2.46f, -1.59f)
                lineTo(14.01f, 7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(22f, 10.49f)
                verticalLineToRelative(8.51f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.49f, 0.02f)
                lineTo(12f, 7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.49f)
                close()
                moveTo(14.94f, 15.41f)
                curveToRelative(-0.28f, -1.42f, -1.6f, -2.4f, -3.06f, -2.4f)
                horizontalLineToRelative(-0.66f)
                curveToRelative(-1.34f, 0f, -2.23f, 0.9f, -2.23f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.85f, 0f, 3.31f, -1.68f, 2.94f, -3.6f)
                close()
            }
        }.also { _FilePowerpoint = it}

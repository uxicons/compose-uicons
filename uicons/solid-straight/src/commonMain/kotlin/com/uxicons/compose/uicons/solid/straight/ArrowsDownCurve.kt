package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsDownCurve: ImageVector? = null

val Icons.Ss.ArrowsDownCurve: ImageVector
    get() = _ArrowsDownCurve ?: UXIcon(name = "ArrowsDownCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 22f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 20.06f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                curveToRelative(7.31f, -0.0f, 11.82f, -5.25f, 12.01f, -5.47f)
                lineToRelative(-1.53f, -1.29f)
                curveToRelative(-0.04f, 0.05f, -4.09f, 4.76f, -10.48f, 4.76f)
                curveToRelative(-6.36f, 0f, -10.45f, -4.71f, -10.49f, -4.76f)
                lineTo(-0.01f, 14.59f)
                curveToRelative(0.19f, 0.22f, 4.7f, 5.47f, 12.01f, 5.47f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(0.48f, 0f, 0.94f, -0.19f, 1.27f, -0.53f)
                lineToRelative(2.68f, -2.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-0.0f, -5.92f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0.0f, 5.92f, 0.0f, 5.92f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.68f, 2.68f)
                curveToRelative(0.34f, 0.34f, 0.79f, 0.53f, 1.28f, 0.53f)
                close()
                moveTo(19f, 3.08f)
                verticalLineToRelative(5.92f)
                horizontalLineToRelative(2f)
                lineTo(21f, 3.08f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.68f, -2.68f)
                curveToRelative(-0.7f, -0.7f, -1.85f, -0.7f, -2.55f, 0f)
                lineToRelative(-2.68f, 2.68f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                close()
                moveTo(3f, 3.08f)
                verticalLineToRelative(5.92f)
                horizontalLineToRelative(2f)
                lineTo(5f, 3.08f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.28f, 0.53f)
                curveToRelative(-0.7f, -0.7f, -1.85f, -0.7f, -2.55f, 0f)
                lineTo(0.04f, 3.21f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                close()
            }
        }.also { _ArrowsDownCurve = it}

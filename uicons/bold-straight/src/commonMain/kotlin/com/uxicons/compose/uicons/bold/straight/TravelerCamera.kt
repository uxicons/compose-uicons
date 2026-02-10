package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TravelerCamera: ImageVector? = null

val Icons.Bs.TravelerCamera: ImageVector
    get() = _TravelerCamera ?: UXIcon(name = "TravelerCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(-0.81f, -1.81f)
                curveToRelative(-0.32f, -0.72f, -1.04f, -1.19f, -1.83f, -1.19f)
                horizontalLineToRelative(-5.4f)
                curveToRelative(-0.79f, 0f, -1.51f, 0.47f, -1.83f, 1.19f)
                lineToRelative(-0.81f, 1.81f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(13.5f, 21f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(21f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.5f, -1f)
                horizontalLineToRelative(-3f)
                lineToRelative(-0.5f, 1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
            }
        }.also { _TravelerCamera = it}

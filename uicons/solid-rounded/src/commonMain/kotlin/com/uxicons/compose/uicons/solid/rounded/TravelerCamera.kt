package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TravelerCamera: ImageVector? = null

val Icons.Sr.TravelerCamera: ImageVector
    get() = _TravelerCamera ?: UXIcon(name = "TravelerCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(1.1f, 0f, 2.0f, -0.9f, 2.0f, -2f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2.0f, -2f, -2.0f)
                lineToRelative(-0.17f, -0.34f)
                curveToRelative(-0.2f, -0.41f, -0.62f, -0.66f, -1.07f, -0.66f)
                horizontalLineToRelative(-1.52f)
                curveToRelative(-0.46f, 0f, -0.87f, 0.26f, -1.07f, 0.66f)
                lineToRelative(-0.17f, 0.34f)
                curveToRelative(-1.1f, 0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2.0f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(13.5f, 21f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.46f, -1.77f, -2.04f, -3f, -3.87f, -3f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-1.83f, 0f, -3.41f, 1.23f, -3.87f, 3f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(6.09f, 7f)
                curveToRelative(0.48f, 2.83f, 2.94f, 5f, 5.91f, 5f)
                reflectiveCurveToRelative(5.43f, -2.17f, 5.91f, -5f)
                close()
            }
        }.also { _TravelerCamera = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GuideAlt: ImageVector? = null

val Icons.Sr.GuideAlt: ImageVector
    get() = _GuideAlt ?: UXIcon(name = "GuideAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.4f, 16.06f)
                curveToRelative(-0.87f, 0.1f, -1.7f, 0.44f, -2.4f, 0.96f)
                lineTo(0f, 5f)
                curveTo(0f, 2.62f, 1.67f, 0.57f, 4f, 0.1f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.02f, -0.6f, 0.06f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0.69f, 0f, 1.36f, 0.1f, 2f, 0.26f)
                verticalLineToRelative(-5.26f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(6f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(4.26f)
                curveToRelative(0.89f, -3.44f, 4.02f, -6f, 7.74f, -6f)
                close()
                moveTo(10f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(9.73f)
                curveToRelative(-1.67f, -1.47f, -2.73f, -3.61f, -2.73f, -6f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.5f, 15.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _GuideAlt = it}

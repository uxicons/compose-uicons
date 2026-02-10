package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UxBrowser: ImageVector? = null

val Icons.Sr.UxBrowser: ImageVector
    get() = _UxBrowser ?: UXIcon(name = "UxBrowser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(8.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                lineTo(0f, 10f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveTo(17.86f, 18.48f)
                curveToRelative(0.28f, 0.47f, 0.13f, 1.09f, -0.34f, 1.37f)
                curveToRelative(-0.16f, 0.1f, -0.34f, 0.14f, -0.51f, 0.14f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.17f, -0.86f, -0.48f)
                lineToRelative(-0.64f, -1.07f)
                lineToRelative(-0.64f, 1.07f)
                curveToRelative(-0.19f, 0.31f, -0.52f, 0.48f, -0.86f, 0.48f)
                curveToRelative(-0.17f, 0f, -0.35f, -0.05f, -0.51f, -0.14f)
                curveToRelative(-0.47f, -0.28f, -0.63f, -0.9f, -0.34f, -1.37f)
                lineToRelative(1.19f, -1.99f)
                lineToRelative(-1.19f, -1.99f)
                curveToRelative(-0.28f, -0.47f, -0.13f, -1.09f, 0.34f, -1.37f)
                curveToRelative(0.47f, -0.28f, 1.09f, -0.13f, 1.37f, 0.34f)
                lineToRelative(0.64f, 1.07f)
                lineToRelative(0.64f, -1.07f)
                curveToRelative(0.28f, -0.47f, 0.9f, -0.63f, 1.37f, -0.34f)
                curveToRelative(0.47f, 0.28f, 0.63f, 0.9f, 0.34f, 1.37f)
                lineToRelative(-1.19f, 1.99f)
                lineToRelative(1.19f, 1.99f)
                close()
            }
        }.also { _UxBrowser = it}

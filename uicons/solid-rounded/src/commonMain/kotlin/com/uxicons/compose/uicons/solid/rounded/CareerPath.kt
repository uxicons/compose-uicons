package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CareerPath: ImageVector? = null

val Icons.Sr.CareerPath: ImageVector
    get() = _CareerPath ?: UXIcon(name = "CareerPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.66f, 0f, 0.81f, 0.13f, 1.43f, 0.38f)
                lineToRelative(3.1f, 1.26f)
                curveToRelative(0.64f, 0.4f, 0.64f, 1.33f, 0f, 1.73f)
                lineToRelative(-3.52f, 1.88f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.89f, 0.59f, -1.79f, 1.33f, -2.06f)
                curveToRelative(0.52f, -0.18f, 0.79f, -0.76f, 0.61f, -1.27f)
                curveToRelative(-0.18f, -0.52f, -0.76f, -0.79f, -1.28f, -0.61f)
                curveToRelative(-1.54f, 0.55f, -2.67f, 2.2f, -2.67f, 3.94f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(9f, 14.05f)
                curveToRelative(0f, -1.1f, -0.9f, -2.05f, -2f, -2.05f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.95f, -2f, 2.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                close()
                moveTo(6f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(0f, 20f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _CareerPath = it}

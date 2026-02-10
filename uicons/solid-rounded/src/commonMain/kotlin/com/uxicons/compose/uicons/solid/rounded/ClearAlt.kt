package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClearAlt: ImageVector? = null

val Icons.Sr.ClearAlt: ImageVector
    get() = _ClearAlt ?: UXIcon(name = "ClearAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(20.71f, 7.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(1.29f, 1.29f)
                close()
                moveTo(14.9f, 13.37f)
                lineToRelative(-0.9f, 1.01f)
                verticalLineToRelative(8.62f)
                curveToRelative(0f, 0.38f, -0.21f, 0.72f, -0.55f, 0.9f)
                curveToRelative(-0.14f, 0.07f, -0.29f, 0.1f, -0.45f, 0.1f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                lineToRelative(-4f, -3f)
                curveToRelative(-0.25f, -0.19f, -0.4f, -0.48f, -0.4f, -0.8f)
                verticalLineToRelative(-5.62f)
                lineTo(0.98f, 6.49f)
                curveToRelative(-0.64f, -0.71f, -0.98f, -1.63f, -0.98f, -2.59f)
                curveTo(0f, 1.75f, 1.75f, 0f, 3.9f, 0f)
                horizontalLineToRelative(8.83f)
                curveToRelative(-1.67f, 1.47f, -2.73f, 3.61f, -2.73f, 6f)
                curveToRelative(0f, 3.31f, 2.02f, 6.16f, 4.9f, 7.37f)
                close()
            }
        }.also { _ClearAlt = it}

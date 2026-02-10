package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Bs.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(18.5f, 7f)
                lineToRelative(-1.64f, 9.42f)
                curveToRelative(-0.16f, 0.81f, -0.79f, 1.43f, -1.61f, 1.55f)
                curveToRelative(-0.1f, 0.02f, -0.2f, 0.02f, -0.3f, 0.02f)
                curveToRelative(-0.7f, 0f, -1.36f, -0.39f, -1.7f, -1.01f)
                lineToRelative(-1.25f, -3.49f)
                lineToRelative(-1.22f, 3.41f)
                curveToRelative(-0.38f, 0.7f, -1.02f, 1.09f, -1.73f, 1.09f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.1f, 0f, -0.2f, -0.01f, -0.3f, -0.03f)
                curveToRelative(-0.82f, -0.13f, -1.45f, -0.74f, -1.61f, -1.55f)
                lineToRelative(-1.64f, -9.42f)
                horizontalLineToRelative(3.04f)
                lineToRelative(0.94f, 5.41f)
                lineToRelative(2.52f, -5.41f)
                lineToRelative(2.52f, 5.41f)
                lineToRelative(0.94f, -5.41f)
                horizontalLineToRelative(3.04f)
                close()
            }
        }.also { _CircleW = it}

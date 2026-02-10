package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Bs.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
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
                moveTo(9.66f, 10.73f)
                verticalLineToRelative(2.52f)
                curveToRelative(0f, 1.11f, 0.94f, 1.99f, 2.13f, 1.99f)
                horizontalLineToRelative(0.41f)
                curveToRelative(0.83f, 0f, 1.57f, -0.42f, 1.95f, -1.11f)
                lineToRelative(2.63f, 1.44f)
                curveToRelative(-0.9f, 1.65f, -2.65f, 2.67f, -4.58f, 2.67f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-2.83f, 0f, -5.13f, -2.24f, -5.13f, -4.99f)
                verticalLineToRelative(-2.52f)
                curveToRelative(0f, -2.75f, 2.3f, -4.99f, 5.13f, -4.99f)
                horizontalLineToRelative(0.41f)
                curveToRelative(1.97f, 0f, 3.73f, 1.05f, 4.62f, 2.74f)
                lineToRelative(-2.66f, 1.39f)
                curveToRelative(-0.36f, -0.69f, -1.13f, -1.13f, -1.96f, -1.13f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-1.2f, 0f, -2.13f, 0.87f, -2.13f, 1.99f)
                close()
            }
        }.also { _CircleC = it}

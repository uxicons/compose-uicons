package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Rc.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                reflectiveCurveTo(6.6f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveToRelative(-4.74f, 0f, -7f, 1.05f, -7f, 7f)
                reflectiveCurveToRelative(2.26f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -1.05f, 7f, -7f)
                reflectiveCurveToRelative(-2.26f, -7f, -7f, -7f)
                close()
                moveTo(16.8f, 9.43f)
                lineToRelative(-2.4f, 0.91f)
                lineToRelative(-1.41f, -1.02f)
                verticalLineToRelative(-2.3f)
                curveToRelative(2.34f, 0.08f, 3.41f, 0.52f, 3.8f, 2.42f)
                close()
                moveTo(11.33f, 13.12f)
                lineToRelative(-0.41f, -1.28f)
                lineToRelative(1.08f, -0.79f)
                lineToRelative(1.08f, 0.79f)
                lineToRelative(-0.41f, 1.28f)
                horizontalLineToRelative(-1.34f)
                close()
                moveTo(11f, 7.01f)
                verticalLineToRelative(2.3f)
                lineToRelative(-1.41f, 1.03f)
                lineToRelative(-2.39f, -0.9f)
                curveToRelative(0.4f, -1.89f, 1.46f, -2.34f, 3.81f, -2.42f)
                close()
                moveTo(7.0f, 11.5f)
                lineToRelative(1.93f, 0.73f)
                lineToRelative(0.57f, 1.77f)
                lineToRelative(-1.48f, 2.21f)
                curveToRelative(-0.77f, -0.68f, -1.03f, -1.93f, -1.03f, -4.21f)
                curveToRelative(0f, -0.17f, 0.0f, -0.34f, 0.01f, -0.5f)
                close()
                moveTo(9.96f, 16.91f)
                lineToRelative(1.2f, -1.79f)
                horizontalLineToRelative(1.68f)
                lineToRelative(1.2f, 1.79f)
                curveToRelative(-0.57f, 0.07f, -1.25f, 0.09f, -2.05f, 0.09f)
                curveToRelative(-0.79f, 0f, -1.46f, -0.02f, -2.04f, -0.09f)
                close()
                moveTo(15.98f, 16.2f)
                lineToRelative(-1.49f, -2.22f)
                lineToRelative(0.57f, -1.76f)
                lineToRelative(1.93f, -0.73f)
                curveToRelative(0.0f, 0.16f, 0.01f, 0.33f, 0.01f, 0.51f)
                curveToRelative(0f, 2.27f, -0.26f, 3.52f, -1.02f, 4.2f)
                close()
            }
        }.also { _Tire = it}

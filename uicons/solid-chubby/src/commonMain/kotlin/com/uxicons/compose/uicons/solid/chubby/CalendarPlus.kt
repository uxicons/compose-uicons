package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPlus: ImageVector? = null

val Icons.Sc.CalendarPlus: ImageVector
    get() = _CalendarPlus ?: UXIcon(name = "CalendarPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 8.67f)
                curveToRelative(-0.3f, -2.26f, -0.73f, -3.85f, -0.76f, -3.94f)
                curveToRelative(-0.1f, -0.34f, -0.38f, -0.59f, -0.72f, -0.67f)
                curveToRelative(-0.07f, -0.02f, -0.7f, -0.16f, -1.73f, -0.34f)
                verticalLineToRelative(-1.21f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.78f)
                curveToRelative(-1.35f, -0.15f, -2.89f, -0.26f, -4.5f, -0.26f)
                reflectiveCurveToRelative(-3.15f, 0.11f, -4.5f, 0.26f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.21f)
                curveToRelative(-1.02f, 0.18f, -1.66f, 0.33f, -1.73f, 0.34f)
                curveToRelative(-0.34f, 0.08f, -0.62f, 0.34f, -0.73f, 0.68f)
                curveToRelative(-0.03f, 0.09f, -0.46f, 1.69f, -0.76f, 3.94f)
                curveToRelative(1.42f, -0.41f, 5.69f, -1.44f, 10.65f, -1.44f)
                reflectiveCurveToRelative(9.36f, 1.03f, 10.78f, 1.44f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.94f, 10.77f)
                curveToRelative(-1.64f, -0.46f, -6.04f, -1.54f, -10.94f, -1.54f)
                reflectiveCurveToRelative(-9.29f, 1.08f, -10.94f, 1.54f)
                curveToRelative(-0.04f, 0.65f, -0.07f, 1.34f, -0.07f, 2.06f)
                curveToRelative(0f, 4.7f, 0.99f, 8.29f, 1.04f, 8.44f)
                curveToRelative(0.1f, 0.35f, 0.38f, 0.62f, 0.73f, 0.7f)
                curveToRelative(0.18f, 0.04f, 4.4f, 1.03f, 9.23f, 1.03f)
                reflectiveCurveToRelative(9.05f, -0.98f, 9.23f, -1.03f)
                curveToRelative(0.35f, -0.08f, 0.64f, -0.35f, 0.73f, -0.7f)
                curveToRelative(0.04f, -0.15f, 1.04f, -3.78f, 1.04f, -8.44f)
                curveToRelative(0f, -0.72f, -0.02f, -1.41f, -0.06f, -2.06f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _CalendarPlus = it}

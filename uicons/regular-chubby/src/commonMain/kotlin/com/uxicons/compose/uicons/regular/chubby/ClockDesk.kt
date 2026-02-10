package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClockDesk: ImageVector? = null

val Icons.Rc.ClockDesk: ImageVector
    get() = _ClockDesk ?: UXIcon(name = "ClockDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.0f, 10f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.69f, -9f, 9f)
                curveToRelative(-0.15f, 4.29f, 0.87f, 11.33f, 0.9f, 11.18f)
                curveToRelative(0.07f, 0.38f, 0.34f, 0.68f, 0.71f, 0.79f)
                curveToRelative(0.15f, 0.04f, 3.73f, 1.04f, 7.38f, 1.04f)
                reflectiveCurveToRelative(7.23f, -0.99f, 7.38f, -1.04f)
                curveToRelative(0.37f, -0.1f, 0.65f, -0.41f, 0.71f, -0.79f)
                curveToRelative(0.05f, 0.05f, 1.05f, -6.81f, 0.9f, -11.18f)
                close()
                moveTo(12.0f, 3f)
                curveToRelative(5.17f, 0f, 7f, 1.83f, 7f, 7f)
                reflectiveCurveToRelative(-1.83f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -1.83f, -7f, -7f)
                reflectiveCurveToRelative(1.83f, -7f, 7f, -7f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-2.52f, 0f, -5.09f, -0.54f, -6.23f, -0.81f)
                curveToRelative(-0.1f, -0.65f, -0.26f, -1.77f, -0.41f, -3.13f)
                curveToRelative(1.46f, 1.32f, 3.64f, 1.94f, 6.64f, 1.94f)
                reflectiveCurveToRelative(5.17f, -0.62f, 6.64f, -1.94f)
                curveToRelative(-0.15f, 1.36f, -0.31f, 2.48f, -0.41f, 3.13f)
                curveToRelative(-1.14f, 0.27f, -3.71f, 0.81f, -6.23f, 0.81f)
                close()
                moveTo(9.29f, 12.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
            }
        }.also { _ClockDesk = it}

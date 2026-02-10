package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Rc.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.4f)
                curveToRelative(4.75f, 0f, 6.97f, -2.69f, 6.97f, -8.45f)
                reflectiveCurveTo(16.75f, 1.5f, 12f, 1.5f)
                reflectiveCurveToRelative(-6.97f, 2.69f, -6.97f, 8.45f)
                reflectiveCurveToRelative(2.21f, 8.45f, 6.97f, 8.45f)
                close()
                moveTo(12f, 3.5f)
                curveToRelative(2.35f, 0f, 4.02f, 0.64f, 4.67f, 3.35f)
                horizontalLineToRelative(-1.73f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.02f, 0.34f, 0.03f, 0.71f, 0.03f, 1.1f)
                reflectiveCurveToRelative(-0.01f, 0.75f, -0.03f, 1.1f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.73f)
                curveToRelative(-0.65f, 2.72f, -2.32f, 3.35f, -4.67f, 3.35f)
                reflectiveCurveToRelative(-4.02f, -0.64f, -4.67f, -3.35f)
                horizontalLineToRelative(1.73f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.02f, -0.34f, -0.03f, -0.71f, -0.03f, -1.1f)
                reflectiveCurveToRelative(0.01f, -0.75f, 0.03f, -1.1f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.73f)
                curveToRelative(0.65f, -2.72f, 2.32f, -3.35f, 4.67f, -3.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.08f, 10.63f)
                curveToRelative(-0.56f, -0.04f, -1.03f, 0.37f, -1.07f, 0.92f)
                curveToRelative(-0.58f, 7.4f, -5.21f, 8.95f, -9.0f, 8.95f)
                reflectiveCurveTo(3.58f, 18.95f, 3.0f, 11.55f)
                curveToRelative(-0.04f, -0.55f, -0.51f, -0.97f, -1.07f, -0.92f)
                curveToRelative(-0.55f, 0.04f, -0.96f, 0.52f, -0.92f, 1.07f)
                curveToRelative(0.76f, 9.74f, 7.94f, 10.79f, 11.0f, 10.79f)
                reflectiveCurveToRelative(10.24f, -1.05f, 11.0f, -10.79f)
                curveToRelative(0.04f, -0.55f, -0.37f, -1.03f, -0.92f, -1.07f)
                close()
            }
        }.also { _Microphone = it}

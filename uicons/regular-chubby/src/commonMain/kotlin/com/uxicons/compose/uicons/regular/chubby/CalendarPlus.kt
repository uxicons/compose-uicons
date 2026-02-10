package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPlus: ImageVector? = null

val Icons.Rc.CalendarPlus: ImageVector
    get() = _CalendarPlus ?: UXIcon(name = "CalendarPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.95f, 4.7f)
                curveToRelative(-0.1f, -0.34f, -0.38f, -0.59f, -0.72f, -0.67f)
                curveToRelative(-0.08f, -0.02f, -0.91f, -0.21f, -2.23f, -0.43f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.31f)
                curveToRelative(-1.46f, -0.18f, -3.19f, -0.32f, -5f, -0.32f)
                reflectiveCurveToRelative(-3.54f, 0.14f, -5f, 0.32f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.6f)
                curveToRelative(-1.31f, 0.21f, -2.15f, 0.41f, -2.23f, 0.43f)
                curveToRelative(-0.34f, 0.08f, -0.62f, 0.34f, -0.73f, 0.68f)
                curveToRelative(-0.04f, 0.14f, -1.04f, 3.43f, -1.04f, 8.11f)
                curveToRelative(0f, 4.71f, 0.99f, 8.3f, 1.04f, 8.45f)
                curveToRelative(0.1f, 0.35f, 0.38f, 0.62f, 0.73f, 0.7f)
                curveToRelative(0.18f, 0.04f, 4.4f, 1.03f, 9.23f, 1.03f)
                reflectiveCurveToRelative(9.05f, -0.98f, 9.23f, -1.03f)
                curveToRelative(0.35f, -0.08f, 0.64f, -0.35f, 0.73f, -0.7f)
                curveToRelative(0.04f, -0.15f, 1.04f, -3.78f, 1.04f, -8.45f)
                curveToRelative(0f, -4.72f, -1.0f, -7.98f, -1.05f, -8.12f)
                close()
                moveTo(12f, 5f)
                curveToRelative(3.58f, 0f, 6.9f, 0.59f, 8.19f, 0.85f)
                curveToRelative(0.12f, 0.48f, 0.29f, 1.26f, 0.45f, 2.27f)
                curveToRelative(-1.77f, -0.45f, -5.02f, -1.12f, -8.64f, -1.12f)
                reflectiveCurveToRelative(-6.86f, 0.67f, -8.64f, 1.12f)
                curveToRelative(0.15f, -1.0f, 0.33f, -1.78f, 0.45f, -2.27f)
                curveToRelative(1.3f, -0.26f, 4.61f, -0.85f, 8.19f, -0.85f)
                close()
                moveTo(20.18f, 20.15f)
                curveToRelative(-1.31f, 0.26f, -4.61f, 0.85f, -8.18f, 0.85f)
                reflectiveCurveToRelative(-6.87f, -0.58f, -8.18f, -0.85f)
                curveToRelative(-0.27f, -1.17f, -0.82f, -3.97f, -0.82f, -7.33f)
                curveToRelative(0f, -0.91f, 0.04f, -1.77f, 0.11f, -2.56f)
                curveToRelative(1.33f, -0.37f, 4.92f, -1.26f, 8.89f, -1.26f)
                reflectiveCurveToRelative(7.57f, 0.89f, 8.89f, 1.26f)
                curveToRelative(0.07f, 0.79f, 0.11f, 1.65f, 0.11f, 2.56f)
                curveToRelative(0f, 3.34f, -0.55f, 6.16f, -0.82f, 7.33f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _CalendarPlus = it}

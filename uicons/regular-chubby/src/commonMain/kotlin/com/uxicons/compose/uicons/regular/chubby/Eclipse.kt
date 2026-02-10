package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Rc.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.12f, 16.5f)
                curveToRelative(-2.85f, 0f, -4.49f, -0.74f, -4.49f, -4.5f)
                reflectiveCurveToRelative(1.65f, -4.5f, 4.49f, -4.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(3.86f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.67f)
                curveToRelative(-1.06f, 0.08f, -2.18f, 0.32f, -3.13f, 0.92f)
                lineToRelative(-0.91f, -0.91f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.41f)
                lineToRelative(0.92f, 0.92f)
                curveToRelative(-0.48f, 0.77f, -0.81f, 1.79f, -0.92f, 3.12f)
                horizontalLineToRelative(-1.67f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.11f, 1.34f, 0.44f, 2.35f, 0.92f, 3.12f)
                lineToRelative(-0.92f, 0.92f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.42f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(0.91f, -0.91f)
                curveToRelative(0.94f, 0.61f, 2.06f, 0.84f, 3.13f, 0.92f)
                verticalLineToRelative(1.67f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.63f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.06f, 6.05f)
                curveToRelative(-4.0f, 0f, -5.94f, 1.95f, -5.94f, 5.95f)
                reflectiveCurveToRelative(1.94f, 5.95f, 5.94f, 5.95f)
                reflectiveCurveToRelative(5.94f, -1.95f, 5.94f, -5.95f)
                reflectiveCurveToRelative(-1.94f, -5.95f, -5.94f, -5.95f)
                close()
                moveTo(17.06f, 15.95f)
                curveToRelative(-2.5f, 0f, -3.94f, -0.65f, -3.94f, -3.95f)
                reflectiveCurveToRelative(1.45f, -3.95f, 3.94f, -3.95f)
                reflectiveCurveToRelative(3.94f, 0.65f, 3.94f, 3.95f)
                reflectiveCurveToRelative(-1.44f, 3.95f, -3.94f, 3.95f)
                close()
            }
        }.also { _Eclipse = it}

package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speaker: ImageVector? = null

val Icons.Rc.Speaker: ImageVector
    get() = _Speaker ?: UXIcon(name = "Speaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.4f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.06f)
                curveToRelative(2.41f, 0f, 2.77f, -1.74f, 2.77f, -2.77f)
                reflectiveCurveToRelative(-0.36f, -2.77f, -2.77f, -2.77f)
                reflectiveCurveToRelative(-2.77f, 1.74f, -2.77f, 2.77f)
                reflectiveCurveToRelative(0.36f, 2.77f, 2.77f, 2.77f)
                close()
                moveTo(12f, 6.51f)
                curveToRelative(0.67f, 0f, 0.77f, 0.05f, 0.77f, 0.77f)
                reflectiveCurveToRelative(-0.11f, 0.77f, -0.77f, 0.77f)
                reflectiveCurveToRelative(-0.77f, -0.05f, -0.77f, -0.77f)
                reflectiveCurveToRelative(0.11f, -0.77f, 0.77f, -0.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.39f, 2.94f)
                curveToRelative(-0.07f, -0.33f, -0.3f, -0.59f, -0.61f, -0.72f)
                curveToRelative(-0.13f, -0.05f, -3.17f, -1.22f, -6.77f, -1.22f)
                reflectiveCurveToRelative(-6.64f, 1.17f, -6.77f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.39f, -0.61f, 0.72f)
                curveToRelative(-0.04f, 0.16f, -0.86f, 3.97f, -0.86f, 9.06f)
                curveToRelative(0f, 5.13f, 0.82f, 8.91f, 0.86f, 9.06f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.59f, 0.61f, 0.72f)
                curveToRelative(0.13f, 0.05f, 3.17f, 1.22f, 6.77f, 1.22f)
                reflectiveCurveToRelative(6.64f, -1.17f, 6.77f, -1.22f)
                curveToRelative(0.31f, -0.12f, 0.54f, -0.39f, 0.61f, -0.72f)
                curveToRelative(0.04f, -0.16f, 0.86f, -3.97f, 0.86f, -9.06f)
                curveToRelative(0f, -5.13f, -0.82f, -8.91f, -0.86f, -9.06f)
                close()
                moveTo(17.54f, 20.09f)
                curveToRelative(-0.96f, 0.31f, -3.14f, 0.91f, -5.54f, 0.91f)
                reflectiveCurveToRelative(-4.58f, -0.6f, -5.54f, -0.91f)
                curveToRelative(-0.22f, -1.2f, -0.7f, -4.27f, -0.7f, -8.09f)
                curveToRelative(0f, -3.78f, 0.48f, -6.88f, 0.7f, -8.09f)
                curveToRelative(0.96f, -0.31f, 3.14f, -0.91f, 5.54f, -0.91f)
                reflectiveCurveToRelative(4.58f, 0.6f, 5.54f, 0.91f)
                curveToRelative(0.22f, 1.2f, 0.7f, 4.27f, 0.7f, 8.09f)
                curveToRelative(0f, 3.78f, -0.48f, 6.88f, -0.7f, 8.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.36f)
                curveToRelative(-2.69f, 0f, -4.05f, 1.36f, -4.05f, 4.05f)
                reflectiveCurveToRelative(1.36f, 4.05f, 4.05f, 4.05f)
                reflectiveCurveToRelative(4.05f, -1.36f, 4.05f, -4.05f)
                reflectiveCurveToRelative(-1.36f, -4.05f, -4.05f, -4.05f)
                close()
                moveTo(12f, 17.45f)
                curveToRelative(-1.42f, 0f, -2.05f, -0.29f, -2.05f, -2.05f)
                reflectiveCurveToRelative(0.63f, -2.05f, 2.05f, -2.05f)
                reflectiveCurveToRelative(2.05f, 0.29f, 2.05f, 2.05f)
                reflectiveCurveToRelative(-0.63f, 2.05f, -2.05f, 2.05f)
                close()
            }
        }.also { _Speaker = it}

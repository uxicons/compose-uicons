package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speaker: ImageVector? = null

val Icons.Tc.Speaker: ImageVector
    get() = _Speaker ?: UXIcon(name = "Speaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15.57f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.49f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.49f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9.41f)
                curveToRelative(1.59f, 0f, 2.37f, -0.77f, 2.37f, -2.36f)
                reflectiveCurveToRelative(-0.77f, -2.36f, -2.37f, -2.36f)
                reflectiveCurveToRelative(-2.37f, 0.77f, -2.37f, 2.36f)
                reflectiveCurveToRelative(0.77f, 2.36f, 2.37f, 2.36f)
                close()
                moveTo(12f, 5.69f)
                curveToRelative(0.91f, 0f, 1.37f, 0.21f, 1.37f, 1.36f)
                reflectiveCurveToRelative(-0.46f, 1.36f, -1.37f, 1.36f)
                reflectiveCurveToRelative(-1.37f, -0.21f, -1.37f, -1.36f)
                reflectiveCurveToRelative(0.46f, -1.36f, 1.37f, -1.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.24f, 2.6f)
                curveToRelative(-0.04f, -0.16f, -0.15f, -0.3f, -0.31f, -0.36f)
                curveToRelative(-0.13f, -0.05f, -3.25f, -1.24f, -6.93f, -1.24f)
                reflectiveCurveToRelative(-6.8f, 1.19f, -6.93f, 1.24f)
                curveToRelative(-0.16f, 0.06f, -0.27f, 0.2f, -0.31f, 0.36f)
                curveToRelative(-0.04f, 0.17f, -0.89f, 4.11f, -0.89f, 9.4f)
                curveToRelative(0f, 5.33f, 0.85f, 9.24f, 0.89f, 9.4f)
                curveToRelative(0.04f, 0.16f, 0.15f, 0.3f, 0.31f, 0.36f)
                curveToRelative(0.13f, 0.05f, 3.25f, 1.24f, 6.93f, 1.24f)
                reflectiveCurveToRelative(6.8f, -1.19f, 6.93f, -1.24f)
                curveToRelative(0.16f, -0.06f, 0.27f, -0.2f, 0.31f, -0.36f)
                curveToRelative(0.04f, -0.17f, 0.89f, -4.11f, 0.89f, -9.4f)
                curveToRelative(0f, -5.33f, -0.85f, -9.24f, -0.89f, -9.4f)
                close()
                moveTo(18.32f, 20.92f)
                curveToRelative(-0.8f, 0.28f, -3.4f, 1.08f, -6.32f, 1.08f)
                reflectiveCurveToRelative(-5.52f, -0.81f, -6.32f, -1.08f)
                curveToRelative(-0.19f, -0.97f, -0.81f, -4.48f, -0.81f, -8.92f)
                curveToRelative(0f, -4.41f, 0.62f, -7.94f, 0.81f, -8.92f)
                curveToRelative(0.8f, -0.28f, 3.4f, -1.08f, 6.32f, -1.08f)
                reflectiveCurveToRelative(5.52f, 0.81f, 6.32f, 1.08f)
                curveToRelative(0.19f, 0.97f, 0.81f, 4.48f, 0.81f, 8.92f)
                curveToRelative(0f, 4.41f, -0.62f, 7.94f, -0.81f, 8.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.88f)
                curveToRelative(-1.59f, 0f, -3.71f, 0.38f, -3.71f, 3.7f)
                reflectiveCurveToRelative(2.12f, 3.7f, 3.71f, 3.7f)
                reflectiveCurveToRelative(3.71f, -0.38f, 3.71f, -3.7f)
                reflectiveCurveToRelative(-2.12f, -3.7f, -3.71f, -3.7f)
                close()
                moveTo(12f, 18.27f)
                curveToRelative(-1.67f, 0f, -2.71f, -0.45f, -2.71f, -2.7f)
                reflectiveCurveToRelative(1.04f, -2.7f, 2.71f, -2.7f)
                reflectiveCurveToRelative(2.71f, 0.45f, 2.71f, 2.7f)
                reflectiveCurveToRelative(-1.04f, 2.7f, -2.71f, 2.7f)
                close()
            }
        }.also { _Speaker = it}

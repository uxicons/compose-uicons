package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerHalf: ImageVector? = null

val Icons.Tc.ThermometerHalf: ImageVector
    get() = _ThermometerHalf ?: UXIcon(name = "ThermometerHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.0f, 10.33f)
                curveToRelative(-0.01f, -1.71f, -0.04f, -5.04f, -0.09f, -5.75f)
                curveToRelative(-0.13f, -2.01f, -1.85f, -3.58f, -3.92f, -3.58f)
                reflectiveCurveToRelative(-3.79f, 1.57f, -3.92f, 3.58f)
                curveToRelative(-0.05f, 0.7f, -0.08f, 3.98f, -0.09f, 5.75f)
                curveToRelative(-1.88f, 0.98f, -2.79f, 2.93f, -2.79f, 5.94f)
                curveToRelative(0f, 5.96f, 3.63f, 6.73f, 6.79f, 6.73f)
                reflectiveCurveToRelative(6.79f, -0.77f, 6.79f, -6.73f)
                curveToRelative(0f, -3.02f, -0.91f, -4.96f, -2.79f, -5.95f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.48f, 0f, -5.79f, -0.97f, -5.79f, -5.73f)
                curveToRelative(0f, -2.77f, 0.79f, -4.41f, 2.49f, -5.17f)
                curveToRelative(0.18f, -0.08f, 0.29f, -0.26f, 0.3f, -0.45f)
                curveToRelative(0.01f, -2.03f, 0.04f, -5.35f, 0.09f, -6.0f)
                curveToRelative(0.1f, -1.48f, 1.38f, -2.65f, 2.92f, -2.65f)
                reflectiveCurveToRelative(2.82f, 1.16f, 2.92f, 2.65f)
                curveToRelative(0.04f, 0.64f, 0.08f, 3.89f, 0.09f, 6.0f)
                curveToRelative(0f, 0.2f, 0.12f, 0.37f, 0.3f, 0.45f)
                curveToRelative(1.7f, 0.76f, 2.49f, 2.4f, 2.49f, 5.17f)
                curveToRelative(0f, 4.07f, -1.68f, 5.73f, -5.79f, 5.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 13.78f)
                verticalLineToRelative(-4.17f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.17f)
                curveToRelative(-1.17f, 0.23f, -2.06f, 1.26f, -2.06f, 2.49f)
                curveToRelative(0f, 1.4f, 1.15f, 2.54f, 2.56f, 2.54f)
                reflectiveCurveToRelative(2.56f, -1.14f, 2.56f, -2.54f)
                curveToRelative(0f, -1.23f, -0.89f, -2.26f, -2.06f, -2.49f)
                close()
                moveTo(12f, 17.81f)
                curveToRelative(-0.86f, 0f, -1.56f, -0.69f, -1.56f, -1.54f)
                reflectiveCurveToRelative(0.7f, -1.54f, 1.56f, -1.54f)
                reflectiveCurveToRelative(1.56f, 0.69f, 1.56f, 1.54f)
                reflectiveCurveToRelative(-0.7f, 1.54f, -1.56f, 1.54f)
                close()
            }
        }.also { _ThermometerHalf = it}

package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputNumeric: ImageVector? = null

val Icons.Tc.InputNumeric: ImageVector
    get() = _InputNumeric ?: UXIcon(name = "InputNumeric") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.19f, 5.35f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.28f, -0.34f, -0.33f)
                curveToRelative(-0.14f, -0.04f, -3.55f, -1.02f, -9.85f, -1.02f)
                reflectiveCurveToRelative(-9.71f, 0.98f, -9.85f, 1.02f)
                curveToRelative(-0.16f, 0.05f, -0.29f, 0.17f, -0.34f, 0.33f)
                curveToRelative(-0.03f, 0.1f, -0.81f, 2.62f, -0.81f, 6.65f)
                reflectiveCurveToRelative(0.78f, 6.54f, 0.81f, 6.65f)
                curveToRelative(0.05f, 0.16f, 0.18f, 0.28f, 0.34f, 0.33f)
                curveToRelative(0.14f, 0.04f, 3.55f, 1.02f, 9.85f, 1.02f)
                reflectiveCurveToRelative(9.71f, -0.98f, 9.85f, -1.02f)
                curveToRelative(0.16f, -0.05f, 0.29f, -0.17f, 0.34f, -0.33f)
                curveToRelative(0.03f, -0.1f, 0.81f, -2.62f, 0.81f, -6.65f)
                reflectiveCurveToRelative(-0.78f, -6.54f, -0.81f, -6.65f)
                close()
                moveTo(21.31f, 18.09f)
                curveToRelative(-0.91f, 0.22f, -4.14f, 0.91f, -9.31f, 0.91f)
                reflectiveCurveToRelative(-8.4f, -0.69f, -9.31f, -0.91f)
                curveToRelative(-0.19f, -0.73f, -0.69f, -2.94f, -0.69f, -6.09f)
                reflectiveCurveToRelative(0.5f, -5.36f, 0.69f, -6.09f)
                curveToRelative(0.91f, -0.22f, 4.14f, -0.91f, 9.31f, -0.91f)
                reflectiveCurveToRelative(8.4f, 0.69f, 9.31f, 0.91f)
                curveToRelative(0.19f, 0.73f, 0.69f, 2.94f, 0.69f, 6.09f)
                reflectiveCurveToRelative(-0.5f, 5.36f, -0.69f, 6.09f)
                close()
                moveTo(7.81f, 8.11f)
                curveToRelative(0.12f, 0.1f, 0.19f, 0.24f, 0.19f, 0.39f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(-0.42f, 0.23f, -0.85f, 0.64f, -1.01f, 1.39f)
                curveToRelative(-0.06f, 0.27f, -0.33f, 0.45f, -0.59f, 0.39f)
                curveToRelative(-0.27f, -0.06f, -0.44f, -0.32f, -0.39f, -0.59f)
                curveToRelative(0.37f, -1.75f, 1.79f, -2.25f, 2.38f, -2.39f)
                curveToRelative(0.15f, -0.03f, 0.3f, 0.0f, 0.42f, 0.1f)
                close()
            }
        }.also { _InputNumeric = it}

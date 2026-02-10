package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleDown: ImageVector? = null

val Icons.Tc.SortCircleDown: ImageVector
    get() = _SortCircleDown ?: UXIcon(name = "SortCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.41f, 14.31f)
                curveToRelative(-1.33f, 1.86f, -3.01f, 3.37f, -5.15f, 4.62f)
                curveToRelative(-0.16f, 0.09f, -0.35f, 0.09f, -0.51f, 0f)
                curveToRelative(-2.14f, -1.25f, -3.83f, -2.76f, -5.16f, -4.62f)
                curveToRelative(-0.21f, -0.28f, -0.04f, -0.71f, 0.29f, -0.78f)
                curveToRelative(0.1f, -0.02f, 2.35f, -0.54f, 5.11f, -0.54f)
                reflectiveCurveToRelative(5.02f, 0.51f, 5.11f, 0.54f)
                curveToRelative(0.34f, 0.07f, 0.5f, 0.5f, 0.29f, 0.78f)
                close()
                moveTo(17.41f, 9.69f)
                curveToRelative(0.21f, 0.28f, 0.04f, 0.71f, -0.29f, 0.78f)
                curveToRelative(-0.1f, 0.02f, -2.35f, 0.54f, -5.11f, 0.54f)
                reflectiveCurveToRelative(-5.02f, -0.51f, -5.11f, -0.54f)
                curveToRelative(-0.34f, -0.07f, -0.5f, -0.5f, -0.29f, -0.78f)
                curveToRelative(1.33f, -1.85f, 3.01f, -3.37f, 5.16f, -4.62f)
                curveToRelative(0.16f, -0.09f, 0.35f, -0.09f, 0.51f, 0f)
                curveToRelative(2.14f, 1.25f, 3.82f, 2.76f, 5.15f, 4.62f)
                close()
                moveTo(16.12f, 9.64f)
                curveToRelative(-1.11f, -1.39f, -2.46f, -2.56f, -4.12f, -3.56f)
                curveToRelative(-1.65f, 1.0f, -3.01f, 2.17f, -4.12f, 3.56f)
                curveToRelative(0.88f, 0.15f, 2.41f, 0.36f, 4.12f, 0.36f)
                reflectiveCurveToRelative(3.24f, -0.21f, 4.12f, -0.36f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.81f, -3.19f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.19f, -11f, -11f)
                reflectiveCurveToRelative(3.19f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.19f, 11f, 11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -7.2f, -2.8f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.8f, -10f, 10f)
                reflectiveCurveToRelative(2.8f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -2.8f, 10f, -10f)
                close()
            }
        }.also { _SortCircleDown = it}

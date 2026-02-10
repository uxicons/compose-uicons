package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H2: ImageVector? = null

val Icons.Rr.H2: ImageVector
    get() = _H2 ?: UXIcon(name = "H2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                lineTo(2f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(0f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 18f)
                horizontalLineToRelative(-6.88f)
                curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, -0.06f)
                curveToRelative(-0.04f, -0.08f, 0.01f, -0.14f, 0.03f, -0.15f)
                curveToRelative(0.55f, -0.65f, 1.56f, -1.29f, 2.63f, -1.96f)
                curveToRelative(2.44f, -1.54f, 5.48f, -3.45f, 5.32f, -7.09f)
                curveToRelative(-0.11f, -2.65f, -2.31f, -4.73f, -4.99f, -4.73f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.59f, 0f, 2.93f, 1.26f, 3.0f, 2.81f)
                curveToRelative(0.1f, 2.49f, -2.18f, 3.93f, -4.39f, 5.32f)
                curveToRelative(-1.2f, 0.76f, -2.34f, 1.47f, -3.09f, 2.36f)
                curveToRelative(-0.55f, 0.65f, -0.67f, 1.52f, -0.31f, 2.29f)
                curveToRelative(0.35f, 0.75f, 1.08f, 1.22f, 1.92f, 1.22f)
                horizontalLineToRelative(6.88f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _H2 = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Ts.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-1.79f, 0f, -3.48f, 0.22f, -5f, 0.61f)
                verticalLineToRelative(-3.37f)
                lineToRelative(6.46f, -3.26f)
                lineTo(8.17f, 0.16f)
                curveToRelative(-0.47f, -0.23f, -1.01f, -0.21f, -1.46f, 0.07f)
                curveToRelative(-0.45f, 0.28f, -0.71f, 0.75f, -0.71f, 1.28f)
                verticalLineToRelative(9.41f)
                curveToRelative(-3.61f, 1.19f, -6f, 3.45f, -6f, 6.09f)
                curveToRelative(0f, 3.92f, 5.27f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.08f, 12f, -7f)
                reflectiveCurveToRelative(-5.27f, -7f, -12f, -7f)
                close()
                moveTo(7f, 1.5f)
                curveToRelative(0f, -0.25f, 0.17f, -0.38f, 0.24f, -0.42f)
                curveToRelative(0.05f, -0.03f, 0.17f, -0.09f, 0.29f, -0.09f)
                curveToRelative(0.04f, 0f, 4.02f, 2.84f, 4.02f, 2.84f)
                lineToRelative(-4.54f, 2.29f)
                lineTo(7.0f, 1.5f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -2.69f, -11f, -6f)
                curveToRelative(0f, -2.1f, 1.99f, -3.95f, 5f, -5.03f)
                verticalLineToRelative(5.03f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.34f)
                curveToRelative(1.5f, -0.42f, 3.2f, -0.66f, 5f, -0.66f)
                curveToRelative(6.07f, 0f, 11f, 2.69f, 11f, 6f)
                reflectiveCurveToRelative(-4.93f, 6f, -11f, 6f)
                close()
                moveTo(15f, 15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Golf = it}

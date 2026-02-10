package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golf: ImageVector? = null

val Icons.Tr.Golf: ImageVector
    get() = _Golf ?: UXIcon(name = "Golf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-1.8f, 0f, -3.48f, 0.23f, -5f, 0.62f)
                verticalLineToRelative(-3.35f)
                lineToRelative(5.26f, -2.18f)
                curveToRelative(0.47f, -0.24f, 0.78f, -0.69f, 0.82f, -1.22f)
                curveToRelative(0.04f, -0.53f, -0.19f, -1.02f, -0.67f, -1.36f)
                lineTo(8.17f, 0.16f)
                curveToRelative(-0.47f, -0.23f, -1.01f, -0.21f, -1.46f, 0.07f)
                curveToRelative(-0.45f, 0.28f, -0.71f, 0.75f, -0.71f, 1.28f)
                verticalLineToRelative(9.41f)
                curveToRelative(-3.61f, 1.19f, -6f, 3.44f, -6f, 6.08f)
                curveToRelative(0f, 3.92f, 5.27f, 7f, 12f, 7f)
                reflectiveCurveToRelative(12f, -3.08f, 12f, -7f)
                reflectiveCurveToRelative(-5.27f, -7f, -12f, -7f)
                close()
                moveTo(7f, 1.5f)
                curveToRelative(0f, -0.25f, 0.21f, -0.5f, 0.51f, -0.5f)
                curveToRelative(0.06f, 0f, 0.13f, 0.01f, 0.2f, 0.05f)
                lineToRelative(4.17f, 2.31f)
                curveToRelative(0.2f, 0.15f, 0.21f, 0.36f, 0.2f, 0.44f)
                curveToRelative(-0.01f, 0.08f, -0.05f, 0.29f, -0.24f, 0.39f)
                lineToRelative(-4.84f, 2.0f)
                lineTo(7f, 1.5f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -2.69f, -11f, -6f)
                curveToRelative(0f, -2.1f, 1.99f, -3.95f, 5f, -5.02f)
                verticalLineToRelative(4.52f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.84f)
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

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hiking: ImageVector? = null

val Icons.Ts.Hiking: ImageVector
    get() = _Hiking ?: UXIcon(name = "Hiking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(19f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-2.27f, -3.79f)
                curveToRelative(-0.45f, -0.75f, -1.27f, -1.21f, -2.15f, -1.21f)
                horizontalLineToRelative(-2.93f)
                curveToRelative(-3.15f, 0f, -6.41f, 2.06f, -6.41f, 5.5f)
                curveToRelative(0f, 2.4f, 1.54f, 3.5f, 2.97f, 3.5f)
                curveToRelative(0.92f, 0f, 1.58f, -0.36f, 2.05f, -0.83f)
                curveToRelative(0.17f, 0.39f, 0.44f, 0.73f, 0.79f, 0.99f)
                lineToRelative(4.17f, 3.09f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.25f)
                lineToRelative(-4.57f, -3.39f)
                curveToRelative(-0.46f, -0.34f, -0.69f, -0.93f, -0.58f, -1.49f)
                lineToRelative(1.14f, -5.87f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.18f, 0f, 0.36f, 0.04f, 0.53f, 0.1f)
                lineToRelative(-1.34f, 6.81f)
                lineToRelative(0.88f, 0.57f)
                lineToRelative(1.33f, -6.57f)
                lineToRelative(2.45f, 4.08f)
                horizontalLineToRelative(2.78f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(20f, 6f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(5.99f, 14f)
                curveToRelative(-0.73f, 0f, -1.97f, -0.53f, -1.97f, -2.5f)
                curveToRelative(0f, -2.65f, 2.44f, -4.3f, 4.95f, -4.48f)
                lineToRelative(-1.05f, 5.38f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.01f, 0.07f, -0.37f, 1.61f, -1.93f, 1.61f)
                close()
                moveTo(7.74f, 16.5f)
                lineToRelative(0.76f, 0.49f)
                lineToRelative(-1.22f, 7f)
                horizontalLineToRelative(-1.02f)
                lineToRelative(1.32f, -7.61f)
                curveToRelative(0.05f, 0.04f, 0.1f, 0.08f, 0.15f, 0.12f)
                close()
            }
        }.also { _Hiking = it}

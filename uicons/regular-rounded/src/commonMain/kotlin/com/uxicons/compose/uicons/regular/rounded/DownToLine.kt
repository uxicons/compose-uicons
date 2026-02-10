package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Rr.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(14.77f, 18.86f)
                reflectiveCurveToRelative(6.35f, -6.75f, 6.35f, -6.75f)
                curveToRelative(0.87f, -0.87f, 1.12f, -2.11f, 0.65f, -3.24f)
                curveToRelative(-0.47f, -1.13f, -1.52f, -1.84f, -2.75f, -1.85f)
                horizontalLineToRelative(-2.07f)
                reflectiveCurveToRelative(-0.03f, -3.05f, -0.03f, -3.05f)
                curveToRelative(0f, -2.19f, -1.78f, -3.97f, -3.97f, -3.97f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.19f, 0f, -3.97f, 1.78f, -3.97f, 3.98f)
                verticalLineToRelative(3.02f)
                reflectiveCurveToRelative(-2.05f, 0f, -2.05f, 0f)
                curveToRelative(-1.23f, 0f, -2.28f, 0.71f, -2.75f, 1.85f)
                curveToRelative(-0.47f, 1.13f, -0.22f, 2.38f, 0.63f, 3.22f)
                lineToRelative(6.33f, 6.8f)
                curveToRelative(0.77f, 0.77f, 1.79f, 1.16f, 2.81f, 1.16f)
                reflectiveCurveToRelative(2.03f, -0.39f, 2.81f, -1.16f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.71f, -0.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                lineTo(9f, 3.97f)
                curveToRelative(0f, -1.09f, 0.88f, -1.97f, 1.97f, -1.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(1.09f, 0f, 1.97f, 0.89f, 1.97f, 1.98f)
                lineToRelative(0.03f, 4.05f)
                curveToRelative(0f, 0.55f, 0.45f, 0.99f, 1f, 0.99f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.61f, 0f, 0.85f, 0.47f, 0.9f, 0.61f)
                curveToRelative(0.06f, 0.14f, 0.22f, 0.64f, -0.24f, 1.09f)
                lineToRelative(-6.33f, 6.73f)
                curveToRelative(-0.77f, 0.76f, -2.01f, 0.75f, -2.75f, 0.01f)
                lineToRelative(-6.33f, -6.8f)
                curveToRelative(-0.43f, -0.43f, -0.27f, -0.93f, -0.21f, -1.07f)
                curveToRelative(0.06f, -0.14f, 0.3f, -0.61f, 0.9f, -0.61f)
                horizontalLineToRelative(3.06f)
                close()
            }
        }.also { _DownToLine = it}

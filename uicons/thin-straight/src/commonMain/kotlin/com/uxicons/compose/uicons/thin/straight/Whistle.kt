package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Ts.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(11f, 16f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(-1f)
                lineTo(9f, 0f)
                horizontalLineToRelative(1f)
                lineTo(10f, 5f)
                close()
                moveTo(12.96f, 6.2f)
                lineToRelative(-0.88f, -0.48f)
                lineTo(14.5f, 1.34f)
                lineToRelative(0.88f, 0.48f)
                lineToRelative(-2.42f, 4.38f)
                close()
                moveTo(6.06f, 6.2f)
                lineTo(3.65f, 1.82f)
                lineToRelative(0.88f, -0.48f)
                lineToRelative(2.42f, 4.38f)
                lineToRelative(-0.88f, 0.48f)
                close()
                moveTo(8.24f, 8f)
                curveTo(3.98f, 8f, 0.37f, 11.21f, 0.03f, 15.31f)
                curveToRelative(-0.19f, 2.3f, 0.61f, 4.56f, 2.19f, 6.22f)
                curveToRelative(1.51f, 1.58f, 3.6f, 2.47f, 5.79f, 2.47f)
                curveToRelative(0.11f, 0f, 0.21f, -0.0f, 0.32f, -0.01f)
                curveToRelative(2.85f, -0.11f, 5.55f, -1.93f, 6.87f, -4.63f)
                curveToRelative(0.55f, -1.13f, 0.82f, -2.3f, 0.8f, -3.48f)
                curveToRelative(-0.01f, -0.77f, 0.5f, -1.43f, 1.23f, -1.56f)
                lineToRelative(6.78f, -1.23f)
                verticalLineToRelative(-5.1f)
                lineTo(8.24f, 8f)
                close()
                moveTo(23f, 12.26f)
                lineToRelative(-5.95f, 1.08f)
                curveToRelative(-1.21f, 0.22f, -2.07f, 1.29f, -2.05f, 2.56f)
                curveToRelative(0.02f, 1.04f, -0.21f, 2.03f, -0.7f, 3.02f)
                curveToRelative(-1.16f, 2.37f, -3.52f, 3.97f, -6.01f, 4.07f)
                curveToRelative(-2.01f, 0.09f, -3.96f, -0.7f, -5.34f, -2.15f)
                curveToRelative(-1.39f, -1.45f, -2.09f, -3.43f, -1.92f, -5.44f)
                curveToRelative(0.3f, -3.59f, 3.47f, -6.4f, 7.21f, -6.4f)
                horizontalLineToRelative(14.76f)
                verticalLineToRelative(3.26f)
                close()
            }
        }.also { _Whistle = it}

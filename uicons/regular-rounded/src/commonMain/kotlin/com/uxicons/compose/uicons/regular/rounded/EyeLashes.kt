package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeLashes: ImageVector? = null

val Icons.Rr.EyeLashes: ImageVector
    get() = _EyeLashes ?: UXIcon(name = "EyeLashes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(23.27f, 11.52f)
                curveToRelative(-0.55f, -0.87f, -1.37f, -1.95f, -2.46f, -2.98f)
                lineToRelative(1.94f, -2.43f)
                curveToRelative(0.34f, -0.43f, 0.27f, -1.06f, -0.16f, -1.41f)
                curveToRelative(-0.43f, -0.34f, -1.06f, -0.27f, -1.41f, 0.16f)
                lineToRelative(-1.92f, 2.41f)
                curveToRelative(-0.64f, -0.45f, -1.34f, -0.85f, -2.11f, -1.2f)
                lineToRelative(0.99f, -2.88f)
                curveToRelative(0.18f, -0.52f, -0.1f, -1.09f, -0.62f, -1.27f)
                curveToRelative(-0.53f, -0.18f, -1.09f, 0.1f, -1.27f, 0.62f)
                lineToRelative(-0.98f, 2.87f)
                curveToRelative(-0.71f, -0.18f, -1.46f, -0.31f, -2.27f, -0.37f)
                verticalLineToRelative(-3.04f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.04f)
                curveToRelative(-0.8f, 0.06f, -1.55f, 0.18f, -2.25f, 0.37f)
                lineToRelative(-0.98f, -2.87f)
                curveToRelative(-0.18f, -0.52f, -0.75f, -0.8f, -1.27f, -0.62f)
                reflectiveCurveToRelative(-0.8f, 0.75f, -0.62f, 1.27f)
                lineToRelative(0.99f, 2.88f)
                curveToRelative(-0.79f, 0.35f, -1.5f, 0.76f, -2.14f, 1.22f)
                lineToRelative(-1.93f, -2.41f)
                curveToRelative(-0.35f, -0.43f, -0.97f, -0.5f, -1.41f, -0.16f)
                curveToRelative(-0.43f, 0.34f, -0.5f, 0.97f, -0.16f, 1.41f)
                lineToRelative(1.94f, 2.43f)
                curveToRelative(-1.08f, 1.02f, -1.89f, 2.09f, -2.44f, 2.96f)
                curveToRelative(-0.98f, 1.53f, -0.99f, 3.44f, -0.0f, 4.97f)
                curveToRelative(1.55f, 2.43f, 5.08f, 6.52f, 11.27f, 6.52f)
                reflectiveCurveToRelative(9.72f, -4.08f, 11.27f, -6.51f)
                curveToRelative(0.98f, -1.53f, 0.99f, -3.44f, 0.0f, -4.97f)
                close()
                moveTo(21.58f, 15.41f)
                curveToRelative(-1.33f, 2.09f, -4.34f, 5.59f, -9.58f, 5.59f)
                reflectiveCurveToRelative(-8.25f, -3.5f, -9.58f, -5.59f)
                curveToRelative(-0.56f, -0.87f, -0.56f, -1.95f, 0.0f, -2.82f)
                curveToRelative(1.33f, -2.09f, 4.34f, -5.59f, 9.58f, -5.59f)
                reflectiveCurveToRelative(8.25f, 3.5f, 9.58f, 5.59f)
                curveToRelative(0.56f, 0.87f, 0.56f, 1.95f, -0.0f, 2.82f)
                close()
            }
        }.also { _EyeLashes = it}

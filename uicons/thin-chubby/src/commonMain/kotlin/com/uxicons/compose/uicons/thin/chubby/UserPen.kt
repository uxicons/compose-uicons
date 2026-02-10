package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Tc.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 12f)
                curveToRelative(3.85f, 0f, 5.5f, -1.65f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-1.65f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 1.65f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.65f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(9.5f, 2f)
                curveToRelative(3.28f, 0f, 4.5f, 1.22f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-1.22f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -1.22f, -4.5f, -4.5f)
                reflectiveCurveToRelative(1.22f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(12.87f, 15.38f)
                curveToRelative(-0.93f, -0.26f, -2.03f, -0.38f, -3.37f, -0.38f)
                curveToRelative(-5.47f, 0f, -7.5f, 2.03f, -7.5f, 7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -5.96f, 2.54f, -8.5f, 8.5f, -8.5f)
                curveToRelative(1.43f, 0f, 2.62f, 0.14f, 3.63f, 0.42f)
                curveToRelative(0.27f, 0.07f, 0.42f, 0.35f, 0.35f, 0.61f)
                curveToRelative(-0.07f, 0.27f, -0.35f, 0.42f, -0.61f, 0.35f)
                close()
                moveTo(22.27f, 12.7f)
                curveToRelative(-0.88f, -0.92f, -2.64f, -0.93f, -3.52f, -0.01f)
                lineToRelative(-5.42f, 5.42f)
                curveToRelative(-0.77f, 0.78f, -1.23f, 1.82f, -1.28f, 2.93f)
                lineToRelative(-0.06f, 1.44f)
                curveToRelative(-0.02f, 0.28f, 0.24f, 0.54f, 0.52f, 0.52f)
                lineToRelative(1.43f, -0.06f)
                curveToRelative(1.11f, -0.05f, 2.14f, -0.51f, 2.92f, -1.29f)
                lineToRelative(5.42f, -5.42f)
                curveToRelative(0.96f, -0.97f, 0.96f, -2.56f, -0.01f, -3.53f)
                close()
                moveTo(21.57f, 15.53f)
                lineTo(16.16f, 20.95f)
                curveToRelative(-0.6f, 0.6f, -1.4f, 0.95f, -2.25f, 0.99f)
                lineToRelative(-0.88f, 0.04f)
                lineToRelative(0.04f, -0.89f)
                curveToRelative(0.04f, -0.86f, 0.39f, -1.67f, 0.98f, -2.27f)
                lineToRelative(5.42f, -5.42f)
                curveToRelative(0.51f, -0.54f, 1.62f, -0.52f, 2.12f, 0.04f)
                curveToRelative(0.56f, 0.59f, 0.56f, 1.52f, -0.01f, 2.1f)
                close()
            }
        }.also { _UserPen = it}

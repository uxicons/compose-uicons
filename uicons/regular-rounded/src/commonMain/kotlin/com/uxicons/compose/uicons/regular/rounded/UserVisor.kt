package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Rr.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(5f, 6f)
                curveToRelative(0f, -0.86f, 0.54f, -1.59f, 1.3f, -1.87f)
                curveTo(7.09f, 1.73f, 9.35f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4.91f, 1.73f, 5.7f, 4.13f)
                curveToRelative(0.76f, 0.28f, 1.3f, 1.02f, 1.3f, 1.87f)
                reflectiveCurveToRelative(-0.54f, 1.59f, -1.3f, 1.87f)
                curveToRelative(-0.79f, 2.39f, -3.05f, 4.13f, -5.7f, 4.13f)
                reflectiveCurveToRelative(-4.91f, -1.73f, -5.7f, -4.13f)
                curveToRelative(-0.76f, -0.28f, -1.3f, -1.02f, -1.3f, -1.87f)
                close()
                moveTo(15.46f, 8f)
                horizontalLineToRelative(-6.93f)
                curveToRelative(0.69f, 1.2f, 1.99f, 2f, 3.46f, 2f)
                reflectiveCurveToRelative(2.77f, -0.81f, 3.46f, -2f)
                close()
                moveTo(8.54f, 4f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.69f, -1.2f, -1.99f, -2f, -3.46f, -2f)
                reflectiveCurveToRelative(-2.77f, 0.81f, -3.46f, 2f)
                close()
                moveTo(16.64f, 21.57f)
                curveToRelative(-0.27f, -0.67f, -0.66f, -1.32f, -1.13f, -1.89f)
                curveToRelative(-0.22f, -0.26f, -0.61f, -0.26f, -0.82f, 0.0f)
                curveToRelative(-0.48f, 0.58f, -0.87f, 1.27f, -1.15f, 2.08f)
                curveToRelative(-0.17f, 0.53f, -0.32f, 1.13f, -0.41f, 1.82f)
                curveToRelative(-0.05f, 0.33f, 0.34f, 0.55f, 0.59f, 0.33f)
                curveToRelative(0.53f, -0.45f, 1.25f, -0.97f, 1.73f, -0.97f)
                curveToRelative(0.36f, 0f, 0.79f, 0.2f, 1.15f, 0.46f)
                curveToRelative(0.25f, 0.17f, 0.58f, -0.05f, 0.52f, -0.34f)
                curveToRelative(-0.1f, -0.5f, -0.25f, -0.97f, -0.47f, -1.49f)
                close()
            }
        }.also { _UserVisor = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Sr.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(16.59f, 21.91f)
                curveToRelative(-0.36f, -0.26f, -0.79f, -0.46f, -1.15f, -0.46f)
                curveToRelative(-0.47f, 0f, -1.19f, 0.52f, -1.73f, 0.97f)
                curveToRelative(-0.26f, 0.22f, -0.64f, 0f, -0.59f, -0.33f)
                curveToRelative(0.1f, -0.69f, 0.24f, -1.29f, 0.41f, -1.82f)
                curveToRelative(0.27f, -0.81f, 0.67f, -1.5f, 1.15f, -2.08f)
                curveToRelative(0.22f, -0.26f, 0.61f, -0.26f, 0.82f, -0.0f)
                curveToRelative(0.47f, 0.57f, 0.86f, 1.22f, 1.13f, 1.89f)
                curveToRelative(0.22f, 0.52f, 0.37f, 0.99f, 0.47f, 1.49f)
                curveToRelative(0.06f, 0.3f, -0.27f, 0.52f, -0.52f, 0.34f)
                close()
                moveTo(17f, 8f)
                lineTo(7f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(7.54f, 2f)
                curveToRelative(1.1f, -1.22f, 2.69f, -2f, 4.46f, -2f)
                reflectiveCurveToRelative(3.36f, 0.78f, 4.46f, 2f)
                lineTo(7.54f, 2f)
                close()
                moveTo(16.46f, 10f)
                curveToRelative(-1.1f, 1.22f, -2.69f, 2f, -4.46f, 2f)
                reflectiveCurveToRelative(-3.36f, -0.78f, -4.46f, -2f)
                horizontalLineToRelative(8.92f)
                close()
            }
        }.also { _UserVisor = it}

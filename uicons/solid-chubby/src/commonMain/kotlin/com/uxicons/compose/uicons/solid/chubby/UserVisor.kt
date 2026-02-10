package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Sc.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 5f)
                curveToRelative(1.43f, 0f, 2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.43f, 0f, -2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                close()
                moveTo(16.98f, 3f)
                curveToRelative(-0.94f, -1.35f, -2.56f, -2f, -4.98f, -2f)
                reflectiveCurveToRelative(-4.04f, 0.65f, -4.98f, 2f)
                horizontalLineToRelative(9.96f)
                close()
                moveTo(7.02f, 11f)
                curveToRelative(0.94f, 1.35f, 2.56f, 2f, 4.98f, 2f)
                reflectiveCurveToRelative(4.04f, -0.65f, 4.98f, -2f)
                close()
                moveTo(20.97f, 21.95f)
                curveToRelative(0.01f, 0.27f, -0.09f, 0.54f, -0.27f, 0.74f)
                reflectiveCurveToRelative(-0.45f, 0.31f, -0.73f, 0.31f)
                horizontalLineToRelative(-15.95f)
                curveToRelative(-0.27f, 0f, -0.54f, -0.11f, -0.73f, -0.31f)
                reflectiveCurveToRelative(-0.29f, -0.47f, -0.27f, -0.74f)
                curveToRelative(0.29f, -5.5f, 3.06f, -7.95f, 8.97f, -7.95f)
                reflectiveCurveToRelative(8.68f, 2.45f, 8.97f, 7.95f)
                close()
                moveTo(17.99f, 20.56f)
                curveToRelative(-0.1f, -0.5f, -0.25f, -0.97f, -0.47f, -1.49f)
                curveToRelative(-0.27f, -0.67f, -0.66f, -1.32f, -1.13f, -1.89f)
                curveToRelative(-0.22f, -0.26f, -0.61f, -0.26f, -0.82f, 0.0f)
                curveToRelative(-0.48f, 0.58f, -0.87f, 1.27f, -1.15f, 2.08f)
                curveToRelative(-0.17f, 0.53f, -0.32f, 1.13f, -0.41f, 1.82f)
                curveToRelative(-0.05f, 0.33f, 0.34f, 0.55f, 0.59f, 0.33f)
                curveToRelative(0.53f, -0.45f, 1.25f, -0.97f, 1.73f, -0.97f)
                curveToRelative(0.36f, 0f, 0.79f, 0.2f, 1.15f, 0.46f)
                curveToRelative(0.25f, 0.17f, 0.58f, -0.05f, 0.52f, -0.34f)
                close()
            }
        }.also { _UserVisor = it}

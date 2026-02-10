package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramVenn: ImageVector? = null

val Icons.Tc.DiagramVenn: ImageVector
    get() = _DiagramVenn ?: UXIcon(name = "DiagramVenn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 4.5f)
                curveToRelative(-1.37f, 0f, -2.53f, 0.16f, -3.5f, 0.47f)
                curveToRelative(-0.97f, -0.32f, -2.13f, -0.47f, -3.5f, -0.47f)
                curveToRelative(-5.26f, 0f, -7.5f, 2.24f, -7.5f, 7.5f)
                reflectiveCurveToRelative(2.24f, 7.5f, 7.5f, 7.5f)
                curveToRelative(1.37f, 0f, 2.53f, -0.16f, 3.5f, -0.47f)
                curveToRelative(0.97f, 0.32f, 2.13f, 0.47f, 3.5f, 0.47f)
                curveToRelative(5.26f, 0f, 7.5f, -2.24f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-2.24f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(9f, 12f)
                curveToRelative(0f, -0.74f, 0.05f, -1.4f, 0.14f, -2f)
                horizontalLineToRelative(5.72f)
                curveToRelative(0.09f, 0.6f, 0.14f, 1.26f, 0.14f, 2f)
                reflectiveCurveToRelative(-0.05f, 1.4f, -0.14f, 2f)
                horizontalLineToRelative(-5.72f)
                curveToRelative(-0.09f, -0.6f, -0.14f, -1.26f, -0.14f, -2f)
                close()
                moveTo(14.65f, 9f)
                horizontalLineToRelative(-5.31f)
                curveToRelative(0.43f, -1.5f, 1.28f, -2.46f, 2.65f, -2.98f)
                curveToRelative(1.38f, 0.53f, 2.23f, 1.48f, 2.65f, 2.98f)
                close()
                moveTo(14.65f, 15f)
                curveToRelative(-0.43f, 1.5f, -1.28f, 2.46f, -2.65f, 2.98f)
                curveToRelative(-1.38f, -0.53f, -2.23f, -1.48f, -2.65f, -2.98f)
                close()
                moveTo(8.5f, 18.5f)
                curveToRelative(-4.74f, 0f, -6.5f, -1.76f, -6.5f, -6.5f)
                reflectiveCurveToRelative(1.76f, -6.5f, 6.5f, -6.5f)
                curveToRelative(0.77f, 0f, 1.45f, 0.05f, 2.07f, 0.15f)
                curveToRelative(-1.76f, 1.15f, -2.57f, 3.21f, -2.57f, 6.35f)
                reflectiveCurveToRelative(0.81f, 5.2f, 2.57f, 6.35f)
                curveToRelative(-0.62f, 0.1f, -1.3f, 0.15f, -2.07f, 0.15f)
                close()
            }
        }.also { _DiagramVenn = it}

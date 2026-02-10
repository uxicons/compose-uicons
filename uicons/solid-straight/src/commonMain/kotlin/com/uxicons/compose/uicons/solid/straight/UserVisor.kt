package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVisor: ImageVector? = null

val Icons.Ss.UserVisor: ImageVector
    get() = _UserVisor ?: UXIcon(name = "UserVisor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 14f)
                lineTo(7.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(16.33f, 21.5f)
                curveToRelative(-0.79f, 0f, -2.29f, 1.52f, -2.29f, 1.5f)
                curveToRelative(0.07f, -1.03f, 0.26f, -1.89f, 0.49f, -2.61f)
                curveToRelative(0.33f, -0.97f, 0.84f, -1.76f, 1.47f, -2.39f)
                curveToRelative(0.62f, 0.61f, 1.13f, 1.4f, 1.46f, 2.21f)
                curveToRelative(0.33f, 0.78f, 0.49f, 1.43f, 0.59f, 2.29f)
                curveToRelative(-0.35f, -0.41f, -1.12f, -1f, -1.71f, -1f)
                close()
                moveTo(18f, 8f)
                lineTo(6f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
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

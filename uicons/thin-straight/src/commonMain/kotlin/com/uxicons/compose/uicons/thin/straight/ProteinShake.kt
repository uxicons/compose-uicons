package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProteinShake: ImageVector? = null

val Icons.Ts.ProteinShake: ImageVector
    get() = _ProteinShake ?: UXIcon(name = "ProteinShake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.98f, 3.52f)
                curveToRelative(-0.4f, -0.92f, -1.3f, -1.51f, -2.3f, -1.51f)
                horizontalLineToRelative(-5.68f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-1.0f, 0f, -1.9f, 0.59f, -2.3f, 1.51f)
                lineToRelative(-1.02f, 2.38f)
                verticalLineToRelative(2.64f)
                reflectiveCurveToRelative(1.03f, 15.47f, 1.03f, 15.47f)
                horizontalLineToRelative(13.94f)
                lineToRelative(1.03f, -15.5f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-1.02f, -2.48f)
                close()
                moveTo(19f, 7f)
                verticalLineToRelative(1f)
                reflectiveCurveToRelative(-14f, 0f, -14f, 0f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(5.94f, 3.91f)
                curveToRelative(0.24f, -0.55f, 0.78f, -0.91f, 1.38f, -0.91f)
                horizontalLineToRelative(9.36f)
                curveToRelative(0.6f, 0f, 1.14f, 0.36f, 1.38f, 0.91f)
                lineToRelative(0.9f, 2.09f)
                horizontalLineToRelative(-13.91f)
                close()
                moveTo(5.97f, 23f)
                lineTo(5.77f, 20f)
                horizontalLineToRelative(3.23f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(-0.2f, -3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.57f)
                lineToRelative(-0.2f, -3f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.83f)
                lineToRelative(-0.13f, -2f)
                horizontalLineToRelative(13.93f)
                lineToRelative(-0.93f, 14f)
                horizontalLineToRelative(-12.06f)
                close()
            }
        }.also { _ProteinShake = it}

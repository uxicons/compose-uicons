package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesoSign: ImageVector? = null

val Icons.Ts.PesoSign: ImageVector
    get() = _PesoSign ?: UXIcon(name = "PesoSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                horizontalLineToRelative(-2.43f)
                curveToRelative(-1.03f, -2.91f, -3.81f, -5f, -7.07f, -5f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(2f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(2f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1f)
                lineTo(5f, 15f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.26f, 0f, 6.04f, -2.09f, 7.07f, -5f)
                horizontalLineToRelative(2.43f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.1f, -0.48f, 0.15f, -0.99f, 0.15f, -1.5f)
                reflectiveCurveToRelative(-0.05f, -1.02f, -0.15f, -1.5f)
                horizontalLineToRelative(2.15f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.7f, 0f, 5.02f, 1.65f, 6f, 4f)
                lineTo(5f, 5f)
                lineTo(5f, 2.5f)
                close()
                moveTo(12.5f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(13.5f)
                curveToRelative(-0.98f, 2.35f, -3.3f, 4f, -6f, 4f)
                close()
                moveTo(19f, 7.5f)
                curveToRelative(0f, 0.52f, -0.06f, 1.02f, -0.18f, 1.5f)
                lineTo(5f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(13.82f)
                curveToRelative(0.11f, 0.48f, 0.18f, 0.98f, 0.18f, 1.5f)
                close()
            }
        }.also { _PesoSign = it}

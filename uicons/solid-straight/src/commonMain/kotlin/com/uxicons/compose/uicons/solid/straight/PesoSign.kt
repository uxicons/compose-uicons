package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesoSign: ImageVector? = null

val Icons.Ss.PesoSign: ImageVector
    get() = _PesoSign ?: UXIcon(name = "PesoSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5f)
                horizontalLineToRelative(-2.59f)
                curveTo(18.22f, 2.07f, 15.35f, 0f, 12f, 0f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(2f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                lineTo(2f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                curveToRelative(3.35f, 0f, 6.22f, -2.07f, 7.41f, -5f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(0.04f, -0.33f, 0.07f, -0.66f, 0.07f, -1f)
                reflectiveCurveToRelative(-0.03f, -0.67f, -0.07f, -1f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(2.22f, 0f, 4.15f, 1.21f, 5.19f, 3f)
                lineTo(6f, 5f)
                lineTo(6f, 3f)
                close()
                moveTo(12f, 14f)
                lineTo(6f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.19f)
                curveToRelative(-1.04f, 1.79f, -2.97f, 3f, -5.19f, 3f)
                close()
                moveTo(18f, 8f)
                curveToRelative(0f, 0.34f, -0.04f, 0.67f, -0.09f, 1f)
                lineTo(6f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11.91f)
                curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 1f)
                close()
            }
        }.also { _PesoSign = it}

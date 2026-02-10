package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reel: ImageVector? = null

val Icons.Tr.Reel: ImageVector
    get() = _Reel ?: UXIcon(name = "Reel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(20f, 1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(0.5f, 0f)
                curveTo(0.22f, 0f, 0f, 0.22f, 0f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.5f)
                lineTo(4f, 23f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(23.5f, 24f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.5f)
                lineTo(20f, 14f)
                close()
                moveTo(19f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 16f)
                lineTo(5f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 13f)
                close()
                moveTo(19f, 1f)
                verticalLineToRelative(3f)
                lineTo(5f, 4f)
                lineTo(5f, 1f)
                horizontalLineToRelative(14f)
                close()
                moveTo(5f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                lineTo(5f, 23f)
                close()
            }
        }.also { _Reel = it}

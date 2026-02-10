package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrillHotAlt: ImageVector? = null

val Icons.Bs.GrillHotAlt: ImageVector
    get() = _GrillHotAlt ?: UXIcon(name = "GrillHotAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(19f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                lineTo(19f, 0f)
                close()
                moveTo(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                lineTo(8f, 0f)
                close()
                moveTo(18.31f, 17.27f)
                lineToRelative(3.37f, 6.73f)
                horizontalLineToRelative(-3.35f)
                lineToRelative(-0.5f, -1f)
                horizontalLineToRelative(-8.1f)
                curveToRelative(0.17f, -0.47f, 0.28f, -0.97f, 0.28f, -1.5f)
                reflectiveCurveToRelative(-0.11f, -1.03f, -0.28f, -1.5f)
                horizontalLineToRelative(6.6f)
                lineToRelative(-1f, -2f)
                horizontalLineToRelative(-6.65f)
                lineToRelative(-1.07f, 2.15f)
                curveToRelative(0.25f, 0.39f, 0.4f, 0.85f, 0.4f, 1.35f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.13f, 0.74f, -2.08f, 1.77f, -2.39f)
                lineToRelative(0.92f, -1.84f)
                curveTo(2.2f, 15.19f, 0f, 11.48f, 0f, 7.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.98f, -2.2f, 7.69f, -5.69f, 9.77f)
                close()
                moveTo(20.86f, 9f)
                lineTo(3.14f, 9f)
                curveToRelative(0.48f, 2.55f, 2.16f, 4.76f, 4.65f, 6f)
                horizontalLineToRelative(8.43f)
                curveToRelative(2.48f, -1.24f, 4.17f, -3.45f, 4.65f, -6f)
                close()
            }
        }.also { _GrillHotAlt = it}

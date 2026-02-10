package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Followcollection: ImageVector? = null

val Icons.Ss.Followcollection: ImageVector
    get() = _Followcollection ?: UXIcon(name = "Followcollection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.97f)
                curveToRelative(0f, 3.11f, -5.5f, 7.44f, -5.5f, 7.44f)
                curveToRelative(0f, 0f, -5.5f, -4.33f, -5.5f, -7.44f)
                curveToRelative(0f, -1.64f, 1.23f, -2.97f, 2.75f, -2.97f)
                reflectiveCurveToRelative(2.75f, 1.29f, 2.75f, 2.44f)
                curveToRelative(0f, -1.18f, 1.23f, -2.44f, 2.75f, -2.44f)
                reflectiveCurveToRelative(2.75f, 1.33f, 2.75f, 2.97f)
                close()
                moveTo(11f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 3f)
                close()
                moveTo(24f, 16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                close()
                moveTo(11f, 16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(11f, 24f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _Followcollection = it}

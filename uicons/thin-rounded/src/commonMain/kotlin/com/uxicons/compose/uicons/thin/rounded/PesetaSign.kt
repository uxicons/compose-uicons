package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesetaSign: ImageVector? = null

val Icons.Tr.PesetaSign: ImageVector
    get() = _PesetaSign ?: UXIcon(name = "PesetaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 7f)
                horizontalLineToRelative(-1.52f)
                curveToRelative(-0.26f, -3.9f, -3.52f, -7f, -7.48f, -7f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(5f, 15f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.97f, 0f, 7.22f, -3.1f, 7.48f, -7f)
                horizontalLineToRelative(1.52f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(5f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(3.42f, 0f, 6.22f, 2.65f, 6.48f, 6f)
                lineTo(5f, 7f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(12.5f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(13.98f)
                curveToRelative(-0.26f, 3.35f, -3.07f, 6f, -6.48f, 6f)
                close()
            }
        }.also { _PesetaSign = it}

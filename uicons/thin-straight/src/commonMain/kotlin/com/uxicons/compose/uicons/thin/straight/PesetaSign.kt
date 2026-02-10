package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesetaSign: ImageVector? = null

val Icons.Ts.PesetaSign: ImageVector
    get() = _PesetaSign ?: UXIcon(name = "PesetaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.26f, -3.9f, -3.52f, -7f, -7.48f, -7f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(4f, 7f)
                lineTo(2f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                lineTo(4f, 24f)
                horizontalLineToRelative(1f)
                lineTo(5f, 15f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.97f, 0f, 7.22f, -3.1f, 7.48f, -7f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(3.42f, 0f, 6.22f, 2.65f, 6.48f, 6f)
                lineTo(5f, 7f)
                lineTo(5f, 2.5f)
                close()
                moveTo(12.5f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(13.98f)
                curveToRelative(-0.26f, 3.35f, -3.07f, 6f, -6.48f, 6f)
                close()
            }
        }.also { _PesetaSign = it}

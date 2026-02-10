package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PesetaSign: ImageVector? = null

val Icons.Ss.PesetaSign: ImageVector
    get() = _PesetaSign ?: UXIcon(name = "PesetaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.49f, -3.94f, -3.86f, -7f, -7.93f, -7f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(4f, 7f)
                lineTo(2f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                curveToRelative(4.07f, 0f, 7.44f, -3.06f, 7.93f, -7f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(2.97f, 0f, 5.43f, 2.17f, 5.91f, 5f)
                lineTo(6f, 7f)
                lineTo(6f, 3f)
                close()
                moveTo(12f, 14f)
                lineTo(6f, 14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(11.91f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                close()
            }
        }.also { _PesetaSign = it}

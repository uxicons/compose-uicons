package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsOpen: ImageVector? = null

val Icons.Bs.BlindsOpen: ImageVector
    get() = _BlindsOpen ?: UXIcon(name = "BlindsOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(-3f)
                lineTo(17f, 6f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(3f)
                lineTo(17f, 15f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 17.34f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                lineTo(0f, 3f)
                lineTo(18.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(0f, 18f)
                verticalLineToRelative(3f)
                lineTo(15.03f, 21f)
                curveToRelative(-0.01f, -0.17f, -0.03f, -0.33f, -0.03f, -0.5f)
                curveToRelative(0f, -0.9f, 0.22f, -1.75f, 0.6f, -2.5f)
                lineTo(0f, 18f)
                close()
            }
        }.also { _BlindsOpen = it}

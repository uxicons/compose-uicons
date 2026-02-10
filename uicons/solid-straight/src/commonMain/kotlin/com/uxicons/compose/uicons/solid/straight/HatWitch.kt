package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Ss.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.68f)
                lineTo(8.03f, 3.38f)
                curveToRelative(0.69f, -2.02f, 2.59f, -3.38f, 4.73f, -3.38f)
                horizontalLineToRelative(6.13f)
                lineToRelative(4.88f, 4.55f)
                lineToRelative(-1.35f, 1.45f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-0.01f, 0.01f, -0.01f, 0.01f)
                lineToRelative(-0.01f, -0.01f)
                horizontalLineToRelative(-4.37f)
                lineToRelative(-0.8f, 1.16f)
                lineToRelative(5.1f, 14.85f)
                horizontalLineToRelative(1.68f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _HatWitch = it}

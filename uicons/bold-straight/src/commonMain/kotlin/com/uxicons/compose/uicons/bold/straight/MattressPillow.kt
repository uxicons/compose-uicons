package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MattressPillow: ImageVector? = null

val Icons.Bs.MattressPillow: ImageVector
    get() = _MattressPillow ?: UXIcon(name = "MattressPillow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 17.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-8f)
                lineTo(3f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(12f)
                lineTo(3.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(21f, 17.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-8.5f)
                lineTo(12f, 6f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _MattressPillow = it}

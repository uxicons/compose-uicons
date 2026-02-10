package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingVertical: ImageVector? = null

val Icons.Bs.DistributeSpacingVertical: ImageVector
    get() = _DistributeSpacingVertical ?: UXIcon(name = "DistributeSpacingVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 2f)
                lineTo(24f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 19f)
                lineTo(0f, 19f)
                verticalLineToRelative(3f)
                lineTo(24f, 22f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(10f)
                lineTo(20f, 17f)
                lineTo(20f, 7f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                lineTo(7f, 14f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _DistributeSpacingVertical = it}

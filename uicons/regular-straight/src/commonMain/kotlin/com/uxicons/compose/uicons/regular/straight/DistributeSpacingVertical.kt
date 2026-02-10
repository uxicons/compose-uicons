package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingVertical: ImageVector? = null

val Icons.Rs.DistributeSpacingVertical: ImageVector
    get() = _DistributeSpacingVertical ?: UXIcon(name = "DistributeSpacingVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(24f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 20f)
                lineTo(0f, 20f)
                verticalLineToRelative(2f)
                lineTo(24f, 22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(10f)
                lineTo(20f, 17f)
                lineTo(20f, 7f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(6f)
                lineTo(6f, 15f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _DistributeSpacingVertical = it}

package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingVertical: ImageVector? = null

val Icons.Ts.DistributeSpacingVertical: ImageVector
    get() = _DistributeSpacingVertical ?: UXIcon(name = "DistributeSpacingVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(0f, 3f)
                verticalLineToRelative(-1f)
                lineTo(24f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 21f)
                lineTo(0f, 21f)
                verticalLineToRelative(1f)
                lineTo(24f, 22f)
                verticalLineToRelative(-1f)
                close()
                moveTo(20f, 7f)
                lineTo(4f, 7f)
                verticalLineToRelative(10f)
                lineTo(20f, 17f)
                lineTo(20f, 7f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(8f)
                lineTo(5f, 16f)
                lineTo(5f, 8f)
                close()
            }
        }.also { _DistributeSpacingVertical = it}

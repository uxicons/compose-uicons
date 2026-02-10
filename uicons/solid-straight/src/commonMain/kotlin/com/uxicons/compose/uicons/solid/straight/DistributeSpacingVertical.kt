package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingVertical: ImageVector? = null

val Icons.Ss.DistributeSpacingVertical: ImageVector
    get() = _DistributeSpacingVertical ?: UXIcon(name = "DistributeSpacingVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(24f)
                close()
                moveTo(0f, 22f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(10f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.also { _DistributeSpacingVertical = it}

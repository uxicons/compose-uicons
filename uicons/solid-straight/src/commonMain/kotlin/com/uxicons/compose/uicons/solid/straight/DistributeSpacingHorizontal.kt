package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingHorizontal: ImageVector? = null

val Icons.Ss.DistributeSpacingHorizontal: ImageVector
    get() = _DistributeSpacingHorizontal ?: UXIcon(name = "DistributeSpacingHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 24f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                verticalLineTo(24f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                close()
            }
        }.also { _DistributeSpacingHorizontal = it}

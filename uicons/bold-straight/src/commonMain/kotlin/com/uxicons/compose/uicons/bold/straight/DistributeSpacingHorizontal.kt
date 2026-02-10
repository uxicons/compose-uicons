package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingHorizontal: ImageVector? = null

val Icons.Bs.DistributeSpacingHorizontal: ImageVector
    get() = _DistributeSpacingHorizontal ?: UXIcon(name = "DistributeSpacingHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(3f)
                lineTo(22f, 24f)
                close()
                moveTo(5f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 24f)
                horizontalLineToRelative(3f)
                lineTo(5f, 0f)
                close()
                moveTo(17f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 4f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 7f)
                close()
            }
        }.also { _DistributeSpacingHorizontal = it}

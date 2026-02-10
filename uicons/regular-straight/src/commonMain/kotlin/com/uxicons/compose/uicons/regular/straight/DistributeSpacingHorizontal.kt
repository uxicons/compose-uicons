package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingHorizontal: ImageVector? = null

val Icons.Rs.DistributeSpacingHorizontal: ImageVector
    get() = _DistributeSpacingHorizontal ?: UXIcon(name = "DistributeSpacingHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 0f)
                horizontalLineToRelative(2f)
                lineTo(22f, 24f)
                close()
                moveTo(4f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 24f)
                horizontalLineToRelative(2f)
                lineTo(4f, 0f)
                close()
                moveTo(17f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 4f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 6f)
                close()
            }
        }.also { _DistributeSpacingHorizontal = it}

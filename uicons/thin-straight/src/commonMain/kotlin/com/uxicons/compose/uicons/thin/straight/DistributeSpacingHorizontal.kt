package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingHorizontal: ImageVector? = null

val Icons.Ts.DistributeSpacingHorizontal: ImageVector
    get() = _DistributeSpacingHorizontal ?: UXIcon(name = "DistributeSpacingHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 0f)
                horizontalLineToRelative(1f)
                lineTo(22f, 24f)
                close()
                moveTo(3f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(2f, 24f)
                horizontalLineToRelative(1f)
                lineTo(3f, 0f)
                close()
                moveTo(17f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 20f)
                horizontalLineToRelative(10f)
                lineTo(17f, 4f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(14f)
                lineTo(8f, 19f)
                lineTo(8f, 5f)
                close()
            }
        }.also { _DistributeSpacingHorizontal = it}

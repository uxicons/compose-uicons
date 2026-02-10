package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MattressPillow: ImageVector? = null

val Icons.Ss.MattressPillow: ImageVector
    get() = _MattressPillow ?: UXIcon(name = "MattressPillow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(18f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                horizontalLineTo(0f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _MattressPillow = it}

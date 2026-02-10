package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaucetDrip: ImageVector? = null

val Icons.Ss.FaucetDrip: ImageVector
    get() = _FaucetDrip ?: UXIcon(name = "FaucetDrip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(11f)
                verticalLineTo(5f)
                close()
            }
        }.also { _FaucetDrip = it}

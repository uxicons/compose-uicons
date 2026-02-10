package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BangladeshiTakaSign: ImageVector? = null

val Icons.Rs.BangladeshiTakaSign: ImageVector
    get() = _BangladeshiTakaSign ?: UXIcon(name = "BangladeshiTakaSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _BangladeshiTakaSign = it}

package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unlock: ImageVector? = null

val Icons.Ss.Unlock: ImageVector
    get() = _Unlock ?: UXIcon(name = "Unlock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                lineTo(7f, 7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.38f, -2.42f)
                lineToRelative(1.75f, -0.97f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                lineTo(5f, 8f)
                lineTo(2f, 8f)
                lineTo(2f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(19f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(22f, 8f)
                close()
                moveTo(13f, 18f)
                lineTo(11f, 18f)
                lineTo(11f, 14f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Unlock = it}

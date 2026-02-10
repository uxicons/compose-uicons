package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Ss.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(17f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(20f, 18f)
                close()
                moveTo(13f, 22f)
                lineTo(11f, 22f)
                lineTo(11f, 20f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Smartphone = it}

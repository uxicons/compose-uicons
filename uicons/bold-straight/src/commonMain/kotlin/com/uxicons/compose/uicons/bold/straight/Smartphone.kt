package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Bs.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                lineTo(4f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(17f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(20f, 0f)
                close()
                moveTo(13.01f, 22.02f)
                lineTo(10.99f, 22.02f)
                lineTo(10.99f, 20f)
                horizontalLineToRelative(2.01f)
                close()
                moveTo(7f, 18f)
                lineTo(7f, 3f)
                lineTo(17f, 3f)
                lineToRelative(0f, 15f)
                close()
            }
        }.also { _Smartphone = it}

package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Road: ImageVector? = null

val Icons.Bs.Road: ImageVector
    get() = _Road ?: UXIcon(name = "Road") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.55f, 2.91f)
                lineTo(0f, 24f)
                lineTo(24.03f, 24f)
                lineTo(20.45f, 2.89f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                close()
                moveTo(3.54f, 21f)
                lineTo(6.51f, 3.41f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                lineTo(17f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.49f, 0.4f)
                lineTo(20.48f, 21f)
                close()
                moveTo(10.5f, 4f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 8f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Road = it}

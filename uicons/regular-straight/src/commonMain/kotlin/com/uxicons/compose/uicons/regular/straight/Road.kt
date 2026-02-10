package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Road: ImageVector? = null

val Icons.Rs.Road: ImageVector
    get() = _Road ?: UXIcon(name = "Road") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.32f, 0f)
                lineTo(6.68f, 0f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.73f, 2.48f)
                lineTo(-0.04f, 24f)
                horizontalLineToRelative(24.1f)
                lineTo(20.28f, 2.48f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.32f, 0f)
                close()
                moveTo(2.34f, 22f)
                lineTo(5.7f, 2.83f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.68f, 2f)
                horizontalLineToRelative(10.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.98f, 0.83f)
                lineTo(21.68f, 22f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(2f)
                lineTo(13f, 8f)
                lineTo(11f, 8f)
                close()
                moveTo(11f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineTo(11f, 14f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineTo(11f, 20f)
                close()
            }
        }.also { _Road = it}

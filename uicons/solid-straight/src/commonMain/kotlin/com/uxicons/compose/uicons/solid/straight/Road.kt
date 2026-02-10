package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Road: ImageVector? = null

val Icons.Ss.Road: ImageVector
    get() = _Road ?: UXIcon(name = "Road") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.28f, 2.48f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.32f, 0f)
                lineTo(6.68f, 0f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.73f, 2.48f)
                lineTo(-0.04f, 24f)
                horizontalLineToRelative(24.1f)
                close()
                moveTo(13f, 21f)
                lineTo(11f, 21f)
                lineTo(11f, 17f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                lineTo(11f, 14f)
                lineTo(11f, 10f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Road = it}

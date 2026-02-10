package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Sr.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15f)
                close()
                moveTo(23.67f, 3.19f)
                lineTo(20.77f, 8f)
                arcToRelative(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.87f, 3.45f)
                curveToRelative(-1.75f, 2.73f, -5.02f, 7.66f, -7.28f, 9.91f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 8.64f)
                curveTo(4.89f, 6.38f, 9.82f, 3.11f, 12.55f, 1.36f)
                arcTo(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3.24f)
                lineToRelative(4.86f, -2.9f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.53f, 0.28f)
                arcTo(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.67f, 3.19f)
                close()
                moveTo(13f, 15f)
                curveToRelative(-0.14f, -5.28f, -7.86f, -5.27f, -8f, 0f)
                curveTo(5.14f, 20.27f, 12.86f, 20.27f, 13f, 15f)
                close()
            }
        }.also { _Meteor = it}

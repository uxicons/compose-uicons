package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Ss.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15f)
                close()
                moveTo(20.29f, 8f)
                horizontalLineToRelative(2.74f)
                lineToRelative(-0.61f, 1.4f)
                curveToRelative(-0.15f, 0.36f, -3.83f, 8.74f, -7.05f, 11.96f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 8.64f)
                curveTo(5.86f, 5.42f, 14.24f, 1.74f, 14.6f, 1.58f)
                lineTo(16f, 0.97f)
                lineTo(16f, 3.81f)
                lineTo(23.75f, 0.23f)
                close()
                moveTo(13f, 15f)
                curveToRelative(-0.14f, -5.28f, -7.86f, -5.27f, -8f, 0f)
                curveTo(5.14f, 20.27f, 12.86f, 20.27f, 13f, 15f)
                close()
            }
        }.also { _Meteor = it}

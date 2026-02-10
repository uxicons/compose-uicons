package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Bs.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(16.22f, 21.22f)
                curveTo(19.54f, 17.9f, 22.3f, 10.33f, 22.41f, 10.01f)
                lineTo(23.14f, 8f)
                lineTo(20.51f, 8f)
                lineTo(23.86f, 0.1f)
                lineTo(16f, 3.57f)
                lineTo(16f, 0.86f)
                lineToRelative(-2.01f, 0.72f)
                curveTo(13.67f, 1.71f, 6.11f, 4.46f, 2.78f, 7.78f)
                arcTo(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.22f, 21.22f)
                close()
                moveTo(13f, 8.18f)
                lineTo(18.14f, 5.9f)
                lineTo(15.99f, 11f)
                horizontalLineToRelative(2.8f)
                curveTo(17.8f, 13.36f, 16f, 17.19f, 14.1f, 19.1f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, 9.9f)
                curveTo(6.81f, 8f, 10.64f, 6.2f, 13f, 5.21f)
                close()
            }
        }.also { _Meteor = it}

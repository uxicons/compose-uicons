package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Rs.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                close()
                moveTo(9f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                close()
                moveTo(9f, 24f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 8.64f)
                curveTo(5.86f, 5.42f, 14.24f, 1.74f, 14.6f, 1.58f)
                lineTo(16f, 0.97f)
                lineTo(16f, 3.81f)
                lineTo(23.75f, 0.23f)
                lineTo(20.29f, 8f)
                horizontalLineToRelative(2.74f)
                lineToRelative(-0.61f, 1.4f)
                curveToRelative(-0.15f, 0.36f, -3.83f, 8.74f, -7.05f, 11.96f)
                arcTo(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 24f)
                close()
                moveTo(14f, 4.06f)
                curveToRelative(-2.51f, 1.18f, -7.74f, 3.78f, -9.95f, 5.99f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, 9.9f)
                curveToRelative(2.21f, -2.21f, 4.81f, -7.44f, 5.99f, -9.95f)
                lineTo(17.21f, 10.0f)
                lineToRelative(2.54f, -5.72f)
                lineTo(14f, 6.94f)
                close()
            }
        }.also { _Meteor = it}

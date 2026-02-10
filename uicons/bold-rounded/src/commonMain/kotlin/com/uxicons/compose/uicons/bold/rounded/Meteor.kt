package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Br.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.14f, 24.01f)
            arcToRelative(9.07f, 9.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.46f, -2.68f)
            arcToRelative(9.16f, 9.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.93f)
            arcToRelative(66.78f, 66.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.19f, -6.97f)
            arcToRelative(2.68f, 2.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.02f, 1.51f)
            lineTo(20.18f, 0.39f)
            arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.08f, 0.35f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.6f, 3.88f)
            lineTo(21.07f, 8.11f)
            arcToRelative(2.69f, 2.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 4.02f)
            arcToRelative(66.78f, 66.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.98f, 9.2f)
            arcTo(9.07f, 9.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.14f, 24.01f)
            close()
            moveTo(13f, 4.27f)
            arcToRelative(61.95f, 61.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.2f, 6.25f)
            arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.67f, 8.69f)
            arcTo(61.99f, 61.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.73f, 11f)
            horizontalLineTo(18.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.29f, -2.27f)
            lineToRelative(2.85f, -4.79f)
            lineToRelative(-4.8f, 2.85f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5.5f)
            close()
            moveTo(9f, 12f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
            close()
        }
    }.also { _Meteor = it }

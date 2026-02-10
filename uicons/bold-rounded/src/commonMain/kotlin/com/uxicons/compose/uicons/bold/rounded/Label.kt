package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Label: ImageVector? = null

val Icons.Br.Label: ImageVector
    get() = _Label ?: UXIcon(name = "Label") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.21f, 4.39f)
            lineToRelative(-7.48f, -4.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, 0f)
            lineToRelative(-7.48f, 4.2f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7.44f)
            verticalLineTo(17.5f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
            horizontalLineToRelative(7f)
            arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17.5f)
            verticalLineTo(7.44f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.21f, 4.39f)
            close()
            moveTo(19f, 17.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 21f)
            horizontalLineToRelative(-7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17.5f)
            verticalLineTo(7.44f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.26f, -0.44f)
            lineTo(12f, 3.22f)
            lineToRelative(6.74f, 3.79f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7.44f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 9f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
    }.also { _Label = it }

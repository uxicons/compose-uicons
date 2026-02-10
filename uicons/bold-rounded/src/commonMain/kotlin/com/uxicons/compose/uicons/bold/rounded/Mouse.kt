package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mouse: ImageVector? = null

val Icons.Br.Mouse: ImageVector
    get() = _Mouse ?: UXIcon(name = "Mouse") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 3f)
            verticalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineTo(3f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.5f)
            verticalLineToRelative(4.18f)
            arcToRelative(9.21f, 9.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.38f, 9.3f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
            verticalLineTo(10.5f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3f)
            close()
            moveTo(18f, 15f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
            verticalLineTo(10.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 6f)
            horizontalLineToRelative(3f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
            close()
        }
    }.also { _Mouse = it }

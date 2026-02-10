package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowDown: ImageVector? = null

val Icons.Br.ChatArrowDown: ImageVector
    get() = _ChatArrowDown ?: UXIcon(name = "ChatArrowDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.29f, 12.7f)
            lineToRelative(-0.73f, 0.73f)
            horizontalLineToRelative(0f)
            lineTo(17.98f, 9.84f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
            lineToRelative(-0.17f, 0.17f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
            lineToRelative(-4.1f, -4.1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.93f, 8.04f)
            lineToRelative(4.1f, 4.1f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
            lineToRelative(0.17f, -0.17f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0f)
            lineToRelative(3.58f, 3.58f)
            horizontalLineToRelative(0f)
            lineToRelative(-0.73f, 0.73f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
            horizontalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            verticalLineTo(13.4f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.29f, 12.7f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(17f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _ChatArrowDown = it }

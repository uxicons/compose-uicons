package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowGrow: ImageVector? = null

val Icons.Br.ChatArrowGrow: ImageVector
    get() = _ChatArrowGrow ?: UXIcon(name = "ChatArrowGrow") {
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
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 3.98f)
            horizontalLineTo(19.41f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
            lineToRelative(0.73f, 0.73f)
            horizontalLineToRelative(0f)
            lineTo(15.85f, 10f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
            lineToRelative(-0.17f, -0.17f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
            lineToRelative(-4.1f, 4.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(4.1f, -4.1f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0f)
            lineToRelative(0.17f, 0.17f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
            lineToRelative(3.59f, -3.58f)
            horizontalLineToRelative(0f)
            lineToRelative(0.73f, 0.73f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 8.56f)
            verticalLineTo(5.48f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 3.98f)
            close()
        }
    }.also { _ChatArrowGrow = it }

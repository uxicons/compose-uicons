package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interlining: ImageVector? = null

val Icons.Br.Interlining: ImageVector
    get() = _Interlining ?: UXIcon(name = "Interlining") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.54f, 7f)
            horizontalLineToRelative(12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.54f, 11f)
            horizontalLineToRelative(-12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.54f, 18f)
            horizontalLineToRelative(-12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.13f, 7f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -1.71f)
            lineTo(3.75f, 3.21f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
            lineTo(0.25f, 5.29f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.96f, 7f)
            horizontalLineToRelative(0.59f)
            verticalLineTo(18f)
            horizontalLineTo(0.96f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
            lineTo(2.3f, 21.75f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
            lineToRelative(2.05f, -2.05f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.05f, 18f)
            horizontalLineToRelative(-0.51f)
            verticalLineTo(7f)
            close()
        }
    }.also { _Interlining = it }

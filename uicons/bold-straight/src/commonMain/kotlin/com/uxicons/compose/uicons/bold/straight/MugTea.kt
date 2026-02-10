package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugTea: ImageVector? = null

val Icons.Bs.MugTea: ImageVector
    get() = _MugTea ?: UXIcon(name = "MugTea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(17f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7f, 0f)
                lineTo(4f, 0f)
                lineTo(4f, 4f)
                lineTo(7f, 4f)
                close()
                moveTo(24f, 16f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
                lineTo(16.17f, 21.5f)
                arcToRelative(21.29f, 21.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, 1.89f)
                lineToRelative(-0.45f, 0.61f)
                lineTo(5.48f, 24f)
                lineToRelative(-0.45f, -0.6f)
                arcTo(29.83f, 29.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.02f, 9.74f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 6f)
                lineTo(16.6f, 6f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.38f, 3.74f)
                curveToRelative(-0.06f, 0.63f, -0.15f, 1.24f, -0.26f, 1.83f)
                curveTo(22.43f, 11.94f, 24f, 13.54f, 24f, 16f)
                close()
                moveTo(17f, 9.44f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -0.31f)
                arcTo(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.6f, 9f)
                lineTo(11f, 9f)
                verticalLineToRelative(3f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(4f)
                lineTo(7f, 17f)
                lineTo(7f, 13f)
                lineToRelative(1f, -1f)
                lineTo(8f, 9f)
                lineTo(3.4f, 9f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, 0.13f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.44f)
                arcTo(27.58f, 27.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.04f, 21f)
                horizontalLineToRelative(5.93f)
                arcTo(27.6f, 27.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9.44f)
                close()
                moveTo(21f, 16f)
                curveToRelative(0f, -0.41f, -0.01f, -1.33f, -1.93f, -1.48f)
                arcToRelative(31.05f, 31.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 3.98f)
                lineTo(18.5f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16f)
                close()
            }
        }.also { _MugTea = it}

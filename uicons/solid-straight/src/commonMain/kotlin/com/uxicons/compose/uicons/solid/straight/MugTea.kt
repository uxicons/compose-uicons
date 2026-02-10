package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugTea: ImageVector? = null

val Icons.Ss.MugTea: ImageVector
    get() = _MugTea ?: UXIcon(name = "MugTea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.56f, 12.16f)
                curveToRelative(0.18f, -0.91f, 0.33f, -1.85f, 0.43f, -2.83f)
                arcToRelative(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.77f, -2.35f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6f)
                lineTo(10f, 6f)
                verticalLineToRelative(4.58f)
                lineToRelative(2f, 2f)
                lineTo(12f, 18f)
                lineTo(6f, 18f)
                lineTo(6f, 12.59f)
                lineToRelative(2f, -2f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.21f, 0.98f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.02f, 9.33f)
                arcTo(31.32f, 31.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.19f, 23.59f)
                lineToRelative(0.3f, 0.41f)
                lineTo(15.51f, 24f)
                lineToRelative(0.3f, -0.41f)
                arcTo(23.42f, 23.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.38f, 21f)
                lineTo(19f, 21f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                curveTo(24f, 13.95f, 22.73f, 12.59f, 20.56f, 12.16f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-0.64f)
                arcToRelative(32.62f, 32.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.75f, -4.91f)
                curveTo(21.99f, 14.41f, 22f, 15.58f, 22f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 19f)
                close()
                moveTo(11.03f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(9.03f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15.03f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(13.03f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7.03f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(5.03f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 13.41f)
                lineToRelative(1f, -1f)
                lineToRelative(1f, 1f)
                lineTo(10f, 16f)
                lineTo(8f, 16f)
                close()
            }
        }.also { _MugTea = it}

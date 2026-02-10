package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Bs.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 21f)
                lineTo(12f, 16.69f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.88f, -0.88f)
                lineTo(6.75f, 15.82f)
                lineTo(3f, 12.07f)
                curveToRelative(0f, -0.02f, 0f, -0.05f, 0f, -0.07f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, 4.97f)
                lineToRelative(-0.35f, 0.35f)
                lineTo(13.91f, 5.32f)
                lineTo(13.91f, 9.14f)
                lineTo(11.04f, 9.14f)
                lineTo(11.04f, 12.08f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, 0.88f)
                horizontalLineToRelative(5.81f)
                lineTo(17.73f, 13.9f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.3f, 3.71f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
            }
        }.also { _World = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Sr.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 23.89f)
                arcToRelative(4.57f, 4.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.53f, -0.12f)
                lineToRelative(-2.87f, -0.9f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.6f, -4.8f)
                verticalLineTo(6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.92f, 1.39f)
                lineTo(7f, 1.43f)
                close()
                moveTo(20.68f, 1.17f)
                lineToRelative(-0.02f, -0.01f)
                lineToRelative(-2.71f, -0.9f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0.05f)
                verticalLineTo(22.32f)
                lineToRelative(2.05f, 0.59f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.02f)
                verticalLineTo(5.88f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.68f, 1.17f)
                close()
                moveTo(15f, 0.19f)
                reflectiveCurveTo(9.16f, 1.86f, 9f, 1.88f)
                verticalLineToRelative(22f)
                curveToRelative(0.1f, -0.02f, 6f, -1.64f, 6f, -1.64f)
                close()
            }
        }.also { _Map = it}

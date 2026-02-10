package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Bs.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.54f, 1.64f)
                lineTo(17.19f, 0.18f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, -0.03f)
                lineTo(8.96f, 1.98f)
                lineTo(4.85f, 0.27f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(21.63f)
                lineTo(8.5f, 24.06f)
                lineToRelative(7.05f, -2.01f)
                lineToRelative(8.47f, 2.06f)
                verticalLineTo(4.98f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.54f, 1.64f)
                close()
                moveTo(14.02f, 3.62f)
                verticalLineTo(19.37f)
                lineTo(10f, 20.51f)
                verticalLineTo(4.87f)
                curveToRelative(0.04f, -0.01f, 0.07f, -0.01f, 0.1f, -0.02f)
                close()
                moveTo(3f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.69f, -0.46f)
                lineTo(7f, 4.42f)
                verticalLineToRelative(16.1f)
                lineTo(3f, 19.37f)
                close()
                moveTo(21.02f, 20.3f)
                lineToRelative(-4f, -0.97f)
                verticalLineTo(3.29f)
                lineTo(20.66f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, 0.48f)
                close()
            }
        }.also { _Map = it}

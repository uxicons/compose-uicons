package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Br.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.47f, 1.15f)
            lineToRelative(-0.03f, -0.01f)
            lineTo(17.85f, 0.27f)
            arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.1f, -0.08f)
            lineTo(9.44f, 1.73f)
            arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.86f, 1.6f)
            lineToRelative(-0.5f, -0.23f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.28f)
            verticalLineTo(17.8f)
            arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.82f, 5.1f)
            lineToRelative(2.74f, 0.86f)
            arcTo(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.15f, 24f)
            arcToRelative(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -0.19f)
            lineTo(15.1f, 22.28f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 0.01f)
            lineToRelative(2.26f, 0.65f)
            arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.7f)
            verticalLineTo(6.15f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.47f, 1.15f)
            close()
            moveTo(14f, 3.53f)
            verticalLineTo(19.47f)
            lineToRelative(-4f, 1.1f)
            verticalLineTo(4.67f)
            close()
            moveTo(4.68f, 20.03f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17.8f)
            verticalLineTo(6.28f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.03f, 4.35f)
            arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.3f, -0.4f)
            arcToRelative(2.15f, 2.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, 0.16f)
            lineTo(7f, 4.46f)
            verticalLineTo(20.75f)
            close()
            moveTo(21f, 18.7f)
            arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, 1.34f)
            lineTo(17f, 19.37f)
            verticalLineTo(3.15f)
            lineToRelative(2.48f, 0.82f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.15f)
            close()
        }
    }.also { _Map = it }

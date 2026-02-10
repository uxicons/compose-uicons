package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDown: ImageVector? = null

val Icons.Sr.LevelDown: ImageVector
    get() = _LevelDown ?: UXIcon(name = "LevelDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.71f, 18.23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -0.01f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.11f, 0.11f, -0.26f, 0.24f, -0.41f, 0.39f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2f)
                horizontalLineTo(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(21.45f)
                curveToRelative(-0.16f, -0.15f, -0.31f, -0.28f, -0.42f, -0.4f)
                lineTo(7.7f, 18.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.4f, 1.43f)
                lineTo(9.17f, 22.47f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.49f, 0.84f, 0.78f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.98f, 0f)
                curveToRelative(0.33f, -0.29f, 0.64f, -0.57f, 0.83f, -0.77f)
                lineTo(17.7f, 19.65f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.71f, 18.23f)
                close()
            }
        }.also { _LevelDown = it}

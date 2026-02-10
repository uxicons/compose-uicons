package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDisabled: ImageVector? = null

val Icons.Sr.CloudDisabled: ImageVector
    get() = _CloudDisabled ?: UXIcon(name = "CloudDisabled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-22f, -22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(2.87f, 2.87f)
                arcToRelative(7.87f, 7.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, -2.08f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.82f, 5.54f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, 0.73f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.62f, 8.28f)
                arcToRelative(7.38f, 7.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 4.73f)
                close()
                moveTo(3.44f, 7.66f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.38f, 0.46f)
                arcToRelative(7.29f, 7.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, 0.91f)
                arcToRelative(7.42f, 7.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.94f, 3.61f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.88f, 5.65f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 4.7f)
                horizontalLineToRelative(9.1f)
                arcToRelative(11.87f, 11.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.95f, -0.16f)
                arcToRelative(0.84f, 0.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, -1.42f)
                close()
            }
        }.also { _CloudDisabled = it}

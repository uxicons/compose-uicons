package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Sr.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.85f, 23.89f)
                arcTo(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.82f, 24f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineTo(15.18f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.11f, -1.03f)
                lineToRelative(0.51f, 0.51f)
                arcTo(6.88f, 6.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.44f, 17f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -0.18f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18.5f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 4.84f)
                close()
                moveTo(23.71f, 0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(14.96f, 7.63f)
                lineTo(13.8f, 6.46f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, -0.01f)
                lineTo(1.47f, 11.65f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, 0.56f)
                lineToRelative(1.09f, 1.09f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.44f, 15f)
                arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.27f, -1.13f)
                lineToRelative(2.58f, -2.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-2.58f, 2.58f)
                arcTo(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18.5f)
                arcToRelative(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.66f, 3.38f)
                lineTo(11.8f, 23.02f)
                arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, -0.49f)
                lineToRelative(5.18f, -5.26f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.07f)
                lineTo(16.37f, 9.04f)
                lineToRelative(7.33f, -7.33f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.71f, 0.29f)
                close()
            }
        }.also { _Dreidel = it}

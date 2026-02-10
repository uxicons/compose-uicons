package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDisabled: ImageVector? = null

val Icons.Rs.CloudDisabled: ImageVector
    get() = _CloudDisabled ?: UXIcon(name = "CloudDisabled") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                arcToRelative(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.21f, -7.79f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.56f, 3.14f)
                lineToRelative(-3.1f, -3.1f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.1f, -2.1f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15f)
                close()
                moveTo(10f, 3f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.94f, 5.2f)
                lineToRelative(0.1f, 0.76f)
                lineToRelative(0.76f, 0.1f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.64f, 9.96f)
                lineTo(5.97f, 4.56f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 3f)
                close()
                moveTo(16.7f, 20.94f)
                lineTo(18.39f, 22.63f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 23f)
                lineTo(5.5f, 23f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 12.67f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.37f, -2.39f)
                lineTo(4.06f, 8.3f)
                arcTo(5.77f, 5.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, 3.56f)
                lineToRelative(0.88f, 1.19f)
                lineToRelative(-1.44f, 0.37f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
                lineTo(16f, 21f)
                arcTo(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.7f, 20.94f)
                close()
            }
        }.also { _CloudDisabled = it}

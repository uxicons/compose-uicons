package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Share: ImageVector? = null

val Icons.Bs.Share: ImageVector
    get() = _Share ?: UXIcon(name = "Share") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.82f, 1.81f)
                lineToRelative(-5.4f, -2.44f)
                arcTo(4.91f, 4.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -1.36f)
                lineToRelative(5.39f, -2.45f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 5f)
                curveToRelative(0f, 0.14f, 0.03f, 0.28f, 0.04f, 0.41f)
                lineTo(8.1f, 8.11f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.09f, -1.1f)
                lineToRelative(5.95f, 2.69f)
                curveToRelative(-0.01f, 0.14f, -0.04f, 0.27f, -0.04f, 0.41f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, -5f)
                close()
                moveTo(19f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 3f)
                close()
                moveTo(5f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 14f)
                close()
                moveTo(19f, 21f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                close()
            }
        }.also { _Share = it}

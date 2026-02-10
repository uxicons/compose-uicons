package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudCheck: ImageVector? = null

val Icons.Sr.CloudCheck: ImageVector
    get() = _CloudCheck ?: UXIcon(name = "CloudCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.36f, 7.36f)
                arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -0.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.49f, 0.84f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 5.18f)
                arcToRelative(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.89f, 5.65f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 4.7f)
                horizontalLineToRelative(9.1f)
                curveToRelative(5.07f, 0f, 8.85f, -3.03f, 9.19f, -7.36f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.62f, -8.28f)
                close()
                moveTo(19.23f, 14.71f)
                lineTo(13.81f, 20.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineToRelative(-3.39f, -3.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, -1.4f)
                lineToRelative(3.38f, 3.41f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(5.41f, -5.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, 1.41f)
                close()
            }
        }.also { _CloudCheck = it}

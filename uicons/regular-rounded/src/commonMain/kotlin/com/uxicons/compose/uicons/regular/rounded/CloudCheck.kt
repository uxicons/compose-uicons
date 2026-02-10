package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudCheck: ImageVector? = null

val Icons.Rr.CloudCheck: ImageVector
    get() = _CloudCheck ?: UXIcon(name = "CloudCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.69f, 23f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -0.88f)
                lineToRelative(-3.39f, -3.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.42f, -1.4f)
                lineToRelative(3.38f, 3.41f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(5.41f, -5.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, 1.41f)
                lineToRelative(-5.42f, 5.41f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0.87f)
                close()
                moveTo(7f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-0.32f)
                arcToRelative(3.81f, 3.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.65f, -2.98f)
                arcToRelative(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, -3.6f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, -2.69f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.06f, -4.51f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.04f, 2.05f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.21f, 6.21f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.29f, 5.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, 1.9f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, -15.1f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -0.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.49f, 0.84f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 5.18f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.89f, 5.65f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 4.7f)
                horizontalLineToRelative(0.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _CloudCheck = it}

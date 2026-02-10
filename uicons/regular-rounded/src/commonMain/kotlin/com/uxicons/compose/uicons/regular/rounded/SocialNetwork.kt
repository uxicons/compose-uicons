package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialNetwork: ImageVector? = null

val Icons.Rr.SocialNetwork: ImageVector
    get() = _SocialNetwork ?: UXIcon(name = "SocialNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 7.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                lineTo(15.01f, 6f)
                lineToRelative(0.34f, -2.04f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.63f, 2.12f)
                lineTo(7.71f, 6f)
                lineTo(5f, 6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(18.3f, 21f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -4.3f)
                lineToRelative(0.7f, -5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.77f, 7.72f)
                close()
                moveTo(2f, 16f)
                lineTo(2f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                lineTo(7f, 8f)
                lineTo(7f, 19f)
                lineTo(5f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                close()
                moveTo(21.97f, 11.42f)
                lineTo(21.27f, 16.42f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.3f, 19f)
                lineTo(9f, 19f)
                lineTo(9f, 7.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.23f, -0.29f)
                lineToRelative(2.19f, -4.43f)
                arcTo(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.14f, 2.8f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 0.84f)
                lineToRelative(-0.53f, 3.2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.83f, 8f)
                lineTo(19f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.97f, 3.42f)
                close()
            }
        }.also { _SocialNetwork = it}

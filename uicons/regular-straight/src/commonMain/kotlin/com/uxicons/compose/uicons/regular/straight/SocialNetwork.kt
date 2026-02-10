package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialNetwork: ImageVector? = null

val Icons.Rs.SocialNetwork: ImageVector
    get() = _SocialNetwork ?: UXIcon(name = "SocialNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.02f, 7f)
                lineToRelative(0.34f, -2.04f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.21f, -3.29f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.58f, 3.23f)
                lineTo(7.72f, 7f)
                lineTo(3f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(22.02f, 22f)
                lineTo(24f, 10.96f)
                lineTo(24.02f, 7f)
                close()
                moveTo(2f, 19f)
                lineTo(2f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9f)
                lineTo(7f, 9f)
                lineTo(7f, 20f)
                lineTo(3f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                close()
                moveTo(22f, 10.7f)
                lineTo(20.33f, 20f)
                lineTo(9f, 20f)
                lineTo(9f, 8.91f)
                lineToRelative(2.42f, -4.9f)
                arcTo(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.14f, 3.8f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 0.84f)
                lineTo(12.65f, 9f)
                lineTo(22f, 9f)
                close()
            }
        }.also { _SocialNetwork = it}

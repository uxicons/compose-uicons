package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialNetwork: ImageVector? = null

val Icons.Bs.SocialNetwork: ImageVector
    get() = _SocialNetwork ?: UXIcon(name = "SocialNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 7f)
                lineToRelative(0.18f, -1.07f)
                arcToRelative(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -1.46f)
                arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.23f, 3.8f)
                lineTo(7.59f, 7f)
                lineTo(3f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(22.02f, 22f)
                lineTo(24f, 11.35f)
                lineTo(24.02f, 7f)
                close()
                moveTo(3f, 10f)
                lineTo(7f, 10f)
                verticalLineToRelative(9f)
                lineTo(3f, 19f)
                close()
                moveTo(21f, 10.93f)
                lineTo(19.5f, 19f)
                lineTo(10f, 19f)
                lineTo(10f, 8.86f)
                lineTo(11.92f, 5.1f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, -0.24f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, 0.52f)
                lineTo(11.97f, 10f)
                lineTo(21f, 10f)
                close()
            }
        }.also { _SocialNetwork = it}

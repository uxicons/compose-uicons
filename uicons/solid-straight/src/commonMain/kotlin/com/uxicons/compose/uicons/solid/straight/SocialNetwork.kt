package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SocialNetwork: ImageVector? = null

val Icons.Ss.SocialNetwork: ImageVector
    get() = _SocialNetwork ?: UXIcon(name = "SocialNetwork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                lineToRelative(0.56f, -3.33f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.26f, -2.49f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, 1.04f)
                lineTo(8f, 8f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                lineToRelative(2f, -11f)
                verticalLineTo(8f)
                close()
            }
        }.also { _SocialNetwork = it}

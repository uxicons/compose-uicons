package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Ss.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                moveToRelative(-6f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.38f, 9.02f)
                lineTo(7.71f, 2.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 0f)
                lineTo(0f, 13f)
                horizontalLineTo(5.07f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.38f, 9.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                verticalLineTo(9.06f)
                arcTo(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 15f)
                horizontalLineTo(24f)
                verticalLineTo(4f)
                close()
            }
        }.also { _Resources = it}

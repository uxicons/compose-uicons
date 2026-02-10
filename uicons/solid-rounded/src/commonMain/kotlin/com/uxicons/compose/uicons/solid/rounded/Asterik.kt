package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Asterik: ImageVector? = null

val Icons.Sr.Asterik: ImageVector
    get() = _Asterik ?: UXIcon(name = "Asterik") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 14.12f)
                lineToRelative(-3.48f, -2.12f)
                lineToRelative(3.48f, -2.12f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.36f, -5.4f)
                lineToRelative(-3.14f, 2.01f)
                verticalLineToRelative(-3.49f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(3.59f)
                lineToRelative(-3.14f, -2.11f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 5.4f)
                lineToRelative(3.48f, 2.12f)
                lineToRelative(-3.48f, 2.12f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.36f, 5.4f)
                lineToRelative(3.14f, -2.04f)
                verticalLineToRelative(3.52f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineToRelative(-3.58f)
                lineToRelative(3.14f, 2.1f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.36f, -5.4f)
                close()
            }
        }.also { _Asterik = it}

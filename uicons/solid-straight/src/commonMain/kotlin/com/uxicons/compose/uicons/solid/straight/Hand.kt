package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Ss.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                lineTo(22f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                lineToRelative(2.34f, 4.68f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.48f, 1.25f)
                arcToRelative(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.76f, -2.48f)
                lineTo(14f, 17f)
                horizontalLineTo(24f)
                close()
            }
        }.also { _Hand = it}

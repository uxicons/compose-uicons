package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picture: ImageVector? = null

val Icons.Br.Picture: ImageVector
    get() = _Picture ?: UXIcon(name = "Picture") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 0f)
            horizontalLineTo(4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.5f)
            verticalLineToRelative(15f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 24f)
            horizontalLineToRelative(15f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.5f)
            verticalLineTo(4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 0f)
            close()
            moveTo(4.5f, 3f)
            horizontalLineToRelative(15f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4.5f)
            verticalLineToRelative(15f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, 1.06f)
            lineToRelative(-8.73f, -8.73f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 0f)
            lineTo(3f, 15f)
            verticalLineTo(4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 7.5f)
            moveToRelative(-2.5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
        }
    }.also { _Picture = it }

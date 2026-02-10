package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Female: ImageVector? = null

val Icons.Br.Female: ImageVector
    get() = _Female ?: UXIcon(name = "Female") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 8f)
            arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.5f, 7.85f)
            verticalLineTo(18f)
            horizontalLineTo(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(21f)
            horizontalLineTo(15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(13.5f)
            verticalLineTo(15.85f)
            arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 8f)
            close()
            moveTo(7f, 8f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 5f)
            arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
            close()
        }
    }.also { _Female = it }

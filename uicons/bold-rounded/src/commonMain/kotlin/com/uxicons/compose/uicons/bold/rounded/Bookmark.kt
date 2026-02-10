package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Br.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            horizontalLineTo(6.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5.5f)
            verticalLineTo(20.47f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.04f, 2.4f)
            lineToRelative(4.91f, -5.2f)
            lineToRelative(5.01f, 5.25f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 20.51f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
            close()
            moveTo(20f, 20.51f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, 0.34f)
            lineToRelative(-6.1f, -6.39f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.95f, 14f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, 0.47f)
            lineToRelative(-6f, 6.34f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.55f, 0.12f)
            arcTo(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20.47f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 3f)
            horizontalLineToRelative(11f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.5f)
            close()
        }
    }.also { _Bookmark = it }

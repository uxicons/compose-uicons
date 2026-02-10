package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUpload: ImageVector? = null

val Icons.Ss.CloudUpload: ImageVector
    get() = _CloudUpload ?: UXIcon(name = "CloudUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.79f, 7.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 23f)
                horizontalLineTo(14f)
                verticalLineTo(15.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(13.59f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(16f, 15.41f)
                verticalLineTo(23f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.79f, 7.21f)
                close()
            }
        }.also { _CloudUpload = it}

package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUpload: ImageVector? = null

val Icons.Sr.CloudUpload: ImageVector
    get() = _CloudUpload ?: UXIcon(name = "CloudUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.39f, 7.37f)
                arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -15.1f, 5.24f)
                arcTo(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.22f, 13.1f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 18.3f)
                arcTo(5.62f, 5.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.68f, 23f)
                horizontalLineTo(14f)
                verticalLineTo(15.41f)
                lineToRelative(-1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(1.59f, -1.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(1.59f, 1.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(16f, 15.41f)
                verticalLineToRelative(7.57f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.97f, -7.31f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.39f, 7.37f)
                close()
            }
        }.also { _CloudUpload = it}

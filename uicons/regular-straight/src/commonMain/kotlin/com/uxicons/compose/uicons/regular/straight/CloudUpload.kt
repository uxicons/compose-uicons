package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUpload: ImageVector? = null

val Icons.Rs.CloudUpload: ImageVector
    get() = _CloudUpload ?: UXIcon(name = "CloudUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.79f, 7.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 23f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(5.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -6.87f)
                lineToRelative(1.44f, -0.37f)
                lineToRelative(-0.88f, -1.19f)
                arcTo(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, -0.8f)
                lineToRelative(0.1f, 0.76f)
                lineToRelative(0.76f, 0.1f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20.65f)
                verticalLineToRelative(2.09f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -15.53f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.29f, 17.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(16.41f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14f, 15.41f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(15.41f)
                close()
            }
        }.also { _CloudUpload = it}

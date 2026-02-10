package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUpload: ImageVector? = null

val Icons.Bs.CloudUpload: ImageVector
    get() = _CloudUpload ?: UXIcon(name = "CloudUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.42f, 10f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.44f, -3.06f)
                arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.02f, 2.56f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 12.38f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.19f, 18.69f)
                arcTo(5.85f, 5.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, 23f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(5.94f)
                arcTo(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 17.96f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -3.45f)
                lineToRelative(2.15f, -0.56f)
                lineTo(5.93f, 12.17f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.38f, -8.2f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.78f, -0.06f)
                arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.12f, 1.04f)
                arcTo(5.21f, 5.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.22f, 8.4f)
                lineToRelative(0.15f, 1.14f)
                lineToRelative(1.14f, 0.15f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11.77f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 7.66f)
                verticalLineToRelative(3.22f)
                arcTo(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.42f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                lineToRelative(-3.29f, -3.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(10f, 16f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(16f)
                close()
            }
        }.also { _CloudUpload = it}

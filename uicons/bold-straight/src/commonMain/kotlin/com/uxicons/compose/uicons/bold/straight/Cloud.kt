package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Bs.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.58f, 23f)
                horizontalLineTo(5.94f)
                arcTo(5.85f, 5.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, 18.69f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 12.38f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.02f, 2.56f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.96f, 4.38f)
                arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.42f, 10f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 6.24f)
                arcTo(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.58f, 23f)
                close()
                moveTo(10.09f, 3.91f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, 0.06f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.38f, 8.2f)
                lineToRelative(1.32f, 1.79f)
                lineTo(5.1f, 14.51f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 3.45f)
                arcTo(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, 20f)
                horizontalLineTo(15.58f)
                arcToRelative(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.34f, -4.27f)
                arcTo(5.16f, 5.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 11.77f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.49f, -2.08f)
                lineToRelative(-1.14f, -0.15f)
                lineTo(15.22f, 8.4f)
                arcToRelative(5.21f, 5.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.02f, -3.45f)
                arcTo(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.09f, 3.91f)
                close()
            }
        }.also { _Cloud = it}

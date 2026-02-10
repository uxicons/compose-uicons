package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Bs.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 7f)
                lineTo(18.33f, 7f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                lineTo(17f, 2f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.21f, 4.69f)
                arcTo(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, 3.69f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                lineTo(4f, 2f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.67f, 7f)
                lineTo(3.5f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.5f)
                lineTo(0f, 15f)
                lineTo(2f, 15f)
                verticalLineToRelative(9f)
                lineTo(22f, 24f)
                lineTo(22f, 15f)
                horizontalLineToRelative(2f)
                lineTo(24f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 7f)
                close()
                moveTo(21f, 10.5f)
                lineTo(21f, 12f)
                lineTo(13.5f, 12f)
                lineTo(13.5f, 10f)
                horizontalLineToRelative(7f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.5f)
                close()
                moveTo(3f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                lineTo(3f, 12f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6f)
                lineTo(5f, 21f)
                close()
                moveTo(19f, 21f)
                lineTo(13.5f, 21f)
                lineTo(13.5f, 15f)
                lineTo(19f, 15f)
                close()
            }
        }.also { _Gift = it}

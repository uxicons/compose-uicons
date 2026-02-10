package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terrace: ImageVector? = null

val Icons.Ss.Terrace: ImageVector
    get() = _Terrace ?: UXIcon(name = "Terrace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                verticalLineToRelative(3f)
                lineTo(5f, 24f)
                lineTo(5f, 21f)
                lineTo(2f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 15f)
                lineTo(2f, 15f)
                verticalLineToRelative(4f)
                lineTo(5f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21f)
                close()
                moveTo(22f, 19f)
                lineTo(19f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineTo(19f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineTo(24f, 15f)
                lineTo(22f, 15f)
                close()
                moveTo(24f, 9.55f)
                lineTo(24f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 9.55f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 7.12f)
                horizontalLineToRelative(0f)
                lineToRelative(9f, -6.54f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.53f, 0f)
                lineToRelative(9f, 6.54f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9.55f)
                close()
                moveTo(20f, 9.71f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -1.66f)
                lineTo(12f, 0.12f)
                lineTo(4.5f, 8.05f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9.71f)
                lineTo(4f, 11f)
                lineTo(6f, 11f)
                lineTo(6f, 9.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -0.49f)
                lineTo(11f, 4.08f)
                lineTo(11f, 11f)
                horizontalLineToRelative(2f)
                lineTo(13f, 4.08f)
                lineToRelative(4.87f, 5.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 0.49f)
                lineTo(18f, 11f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Terrace = it}

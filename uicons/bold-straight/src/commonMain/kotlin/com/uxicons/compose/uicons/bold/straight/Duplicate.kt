package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duplicate: ImageVector? = null

val Icons.Bs.Duplicate: ImageVector
    get() = _Duplicate ?: UXIcon(name = "Duplicate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.9f, 0f)
                lineTo(11f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3f)
                lineTo(8f, 5f)
                lineTo(5f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                lineTo(2f, 24f)
                lineTo(17f, 24f)
                lineTo(17f, 18f)
                horizontalLineToRelative(5f)
                lineTo(22f, 3.31f)
                close()
                moveTo(14f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 8f)
                lineTo(8f, 8f)
                lineTo(8f, 18f)
                horizontalLineToRelative(6f)
                close()
                moveTo(11f, 15f)
                lineTo(11f, 3f)
                horizontalLineToRelative(5f)
                lineTo(16f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Duplicate = it}

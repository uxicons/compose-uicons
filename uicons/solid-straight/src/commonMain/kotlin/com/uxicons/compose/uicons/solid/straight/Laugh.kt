package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laugh: ImageVector? = null

val Icons.Ss.Laugh: ImageVector
    get() = _Laugh ?: UXIcon(name = "Laugh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 11f)
                lineTo(6f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                close()
                moveTo(12.01f, 19f)
                curveTo(9.03f, 19f, 7f, 16f, 7f, 14f)
                lineTo(17f, 14f)
                arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 19f)
                close()
                moveTo(14f, 11f)
                lineTo(14f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Laugh = it}

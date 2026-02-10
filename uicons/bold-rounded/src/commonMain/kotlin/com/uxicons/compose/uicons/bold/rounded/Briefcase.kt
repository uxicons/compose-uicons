package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Briefcase: ImageVector? = null

val Icons.Br.Briefcase: ImageVector
    get() = _Briefcase ?: UXIcon(name = "Briefcase") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-0.64f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
            lineTo(10f, 0f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.14f, 3f)
            lineTo(5.5f, 3f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.5f)
            verticalLineToRelative(10f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            lineTo(24f, 8.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            close()
            moveTo(5.5f, 6f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8.5f)
            lineTo(21f, 11f)
            lineTo(3f, 11f)
            lineTo(3f, 8.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 6f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            lineTo(3f, 14f)
            horizontalLineToRelative(7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
            horizontalLineToRelative(0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(4.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            close()
        }
    }.also { _Briefcase = it }

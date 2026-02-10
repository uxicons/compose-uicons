package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Briefcase: ImageVector? = null

val Icons.Bs.Briefcase: ImageVector
    get() = _Briefcase ?: UXIcon(name = "Briefcase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(18f, 3f)
                lineTo(18f, 2.45f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.55f, 0f)
                lineTo(8.46f, 0f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2.45f)
                lineTo(6f, 3f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
                moveTo(21f, 6f)
                verticalLineToRelative(5f)
                lineTo(3f, 11f)
                lineTo(3f, 6f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(14f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Briefcase = it}

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Br.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.78f, -1.56f)
            lineTo(1.56f, 15.78f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.55f)
            lineTo(8.22f, 1.56f)
            arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.55f, 0f)
            lineToRelative(6.66f, 6.66f)
            arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.55f)
            lineToRelative(-6.66f, 6.66f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(10.34f, 20.32f)
            arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.31f, 0f)
            lineToRelative(6.66f, -6.66f)
            arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.31f)
            lineTo(13.66f, 3.69f)
            arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.31f, 0f)
            lineTo(3.69f, 10.34f)
            arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.31f)
            close()
        }
    }.also { _Rhombus = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Br.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 7f)
            horizontalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 12f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 0f)
            horizontalLineToRelative(-7f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            verticalLineToRelative(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.17f, 1.34f)
            lineTo(8.45f, 22.2f)
            lineToRelative(2.8f, 1.6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, 0f)
            lineToRelative(2.8f, -1.6f)
            lineToRelative(3.28f, 1.64f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 22.5f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
            close()
            moveTo(18f, 20.07f)
            lineToRelative(-1.83f, -0.92f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0.04f)
            lineTo(12f, 20.77f)
            lineTo(9.24f, 19.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, -0.04f)
            lineTo(6f, 20.07f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
            horizontalLineToRelative(7f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
            close()
        }
    }.also { _Receipt = it }

package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FemaleCouple: ImageVector? = null

val Icons.Br.FemaleCouple: ImageVector
    get() = _FemaleCouple ?: UXIcon(name = "FemaleCouple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 7.5f)
            arcTo(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 1.51f)
            arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 14.85f)
            lineTo(6f, 18f)
            lineTo(5f, 18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(6f, 21f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(9f, 21f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(9f, 18f)
            lineTo(9f, 14.85f)
            arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, -1.36f)
            arcTo(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.85f)
            lineTo(15f, 18f)
            lineTo(14f, 18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(18f, 21f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(18f, 18f)
            lineTo(18f, 14.85f)
            arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7.5f)
            close()
            moveTo(3f, 7.5f)
            arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -3.73f)
            arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.46f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7.5f)
            close()
            moveTo(12f, 7.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 12f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.5f)
            close()
        }
    }.also { _FemaleCouple = it }
